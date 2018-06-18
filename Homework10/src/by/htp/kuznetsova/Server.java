package by.htp.kuznetsova;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server  extends Thread {
	
	private static final int port  = 9876; // открываемый порт сервера
    private String TEMPL_MSG  = "The client send the message: \n\t"; 
	private String TEMPL_CONN = "The client  closed the connection";

	private  Socket socket;
	
	public Server() {}
	public void setSocket(int num, Socket socket)
	{
        // Определение значений
        this.socket = socket;
        // Старт потока
        start();
	}
	public void run()
	{
		try {
			// Определяем входной и выходной потоки сокета
			// для обмена данными с клиентом 
			InputStream  sin  = socket.getInputStream();
			OutputStream sout = socket.getOutputStream();

			DataInputStream  dis = new DataInputStream (sin );
			DataOutputStream dos = new DataOutputStream(sout);
			
			File f= new File("resources/sample.txt");
			if(!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			

			String line = null;
			while(true) {
// Ожидание сообщения от клиента
				line = dis.readUTF();

				System.out.println(String.format(TEMPL_MSG/*, num*/) + line);
				System.out.println("I'm sending it back...");
// Отсылаем клиенту обратно эту самую строку текста
			
				String fileText = bufferCharStreamWorker(f);
				dos.writeUTF("Server receive text : " + replaceLetter(getNumber(line), getLetter(line), fileText));
// Завершаем передачу данных
				dos.flush();
				System.out.println();
				if (line.equalsIgnoreCase("quit")) {
// завершаем соединение
					socket.close();
					System.out.println(String.format(TEMPL_CONN));
					break;
				}
			}
		} catch(Exception e) {
			System.out.println("Exception : " + e);
	    }
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public static void main(String[] args)
	{
		ServerSocket srvSocket = null;
		try {
			try {
				int i = 0; // Счётчик подключений
				// Подключение сокета к localhost
				InetAddress ia = InetAddress.getByName("localhost");
				srvSocket = new ServerSocket(port, 0, ia);
	
				System.out.println("Server started\n\n");
	
				while(true) {
					// ожидание подключения
					Socket socket = srvSocket.accept();
					System.err.println("Client accepted");
					// Стартуем обработку клиента в отдельном потоке
					new Server().setSocket(i++, socket);
				}
			} catch(Exception e) {
				System.out.println("Exception : " + e);
			}
		} finally {
			try {
				if (srvSocket != null)
					srvSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.exit(0);
	}
	
	public static String bufferCharStreamWorker(File f) {
		String str = null;
		try(BufferedReader br = new BufferedReader(new FileReader(f));){ // это краткая запись
			
			while((str = br.readLine()) != null) {
				return str;
			}
		} catch (IOException e) {
			e.printStackTrace();	
		}
		return str;	
	}
	
	public static int getNumber(String line) {
		String regex = "[,.!?]*? ";	
		String[] str = line.split(regex);
		int number = Integer.parseInt(str[0]);
		return number;
	}
	
	public static char getLetter(String line) {
		String regex = "[,.!?]*? ";	
		String[] str = line.split(regex);
		char character = str[1].charAt(0);
		return character;
	}
	
	public static String replaceLetter(int m, char ch, String text) {
		String pattern = "[,.!?]*? ";
		text = text.trim();

		String[] splitText = text.split(pattern);
		String sp = "";
		String spm = "";
		int k = m;
		for(int i = 0; i < splitText.length; i++) {
			sp = splitText[i] + "";
			char [] letters = sp.toCharArray();
			
			for(int j = 0; j < letters.length; j++){
				if(j == (k - 1)) {
					letters[j] = ch;
				}
			}
			spm += new String(letters) + " ";
		}
		return spm;
	}

}
