package htp.kyzniatsova.run;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import by.htp.kyzniatsova.entity.User;

public class Client {
	public static void main(String[] args) {
		System.out.println("Client started");
		
		try {
			Socket clientSocket = new Socket("localhost", 9696);
			ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
//			FileInputStream fis = new FileInputStream("/Users/pavel/Eclipse/Lesson11/resources/object.txt");
			
//			User.id = 150;
			User user = (User)ois.readObject(); // читаем их файла данные объекта, приводя к классу
	
//			System.out.println(ois.readObject());
			System.out.println(user);
//			System.out.println(user.id);
			
		}catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
