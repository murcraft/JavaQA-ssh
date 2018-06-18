package by.htp.kuznetsova;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	private  static final int    serverPort = 9876;
	private  static final String localhost = "localhost";
	
	public static void main(String[] args)
	{
		Socket socket = null;
        try{
	        try {
	        	System.out.println("Welcome to Client side\n" +
	       		                   "Connecting to the port " + serverPort + ")");
	       		InetAddress ipAddress = InetAddress.getByName(localhost);
				socket = new Socket(ipAddress, serverPort);
	       		System.out.println("The connection is established.");

	       		System.out.println("\tLocalPort = " + socket.getLocalPort() + 
	       				"\n\tInetAddress.HostAddress = " + socket.getInetAddress().getHostAddress() +
	       				"\n\tReceiveBufferSize (SO_RCVBUF) = " + socket.getReceiveBufferSize());
	
	       		// Получаем входной и выходной потоки сокета для обмена сообщениями с сервером 
	       		InputStream  sin  = socket.getInputStream();
	       		OutputStream sout = socket.getOutputStream();
	
	       		DataInputStream  in  = new DataInputStream (sin );
	       		DataOutputStream out = new DataOutputStream(sout);
	
	       		// Создаем поток для чтения с клавиатуры.
	       		InputStreamReader isr = new InputStreamReader(System.in);
	       		BufferedReader keyboard = new BufferedReader(isr);
	       		
	    		File f1 = new File("resources/sample1.txt");
       			if(!f1.exists()) {
       				try {
       					f1.createNewFile();
       				} catch (IOException e) {
       					e.printStackTrace();
       				}
       			}

	       		String line = null;
	       		System.out.println("Type in number and symbol: \"1 , X\"");
	       		System.out.println();
	       		while (true) {
	       		                  // Пользователь должен ввести строку и нажать Enter
	       			line = keyboard.readLine();
	       			out.writeUTF(line);         // Отсылаем введенную строку серверу
	       			out.flush();                // Завершаем поток
	       			line = in.readUTF();        // Ждем ответа от сервера
	       			String fileText = line;
	       			
	       			if (line.endsWith("quit"))
	       				break;
	       			else {
	       				byteStringWorker(f1, fileText);
	       				System.out.println("The server sent me this line");
	       				System.out.println(line);
	       				System.out.println();
	       			}
	       		}
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
		} finally {
			try {
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void byteStringWorker(File f1, String text) {
		try(InputStream is = new FileInputStream(f1);
			OutputStream os = new FileOutputStream(f1, true);) /* true будет дописывать в конец файла) */{	
			// запись в файл
			byte[] data = text.getBytes();
			os.write(data);
			String textForm = new String(data, "UTF-8");
			} catch (IOException e) {
				e.printStackTrace();
		}
	}

}
