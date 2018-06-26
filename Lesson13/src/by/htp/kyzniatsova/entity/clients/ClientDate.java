package by.htp.kyzniatsova.entity.clients;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientDate {
	private Date date = null;
	private SimpleDateFormat format = null;

	public ClientDate() {
		this.date = new Date();
		this.format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
		
	}

	@Override
	public String toString() {
		return "Date: " + format.format(date);
	}
	

}
