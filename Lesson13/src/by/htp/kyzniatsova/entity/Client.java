package by.htp.kyzniatsova.entity;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TreeMap;

public class Client implements Comparable<Client>{
	private String name;
	private Date dateOfThreat = null;
	private PredictionResult pr;
	private int id;
	
	private TreeMap <Date, PredictionResult> clientHistory;
	
	
	public Client() {
	}

	public Client(int id, String name) {
		this.id = id;
		this.name = name;
		this.dateOfThreat = new Date(); //dateOfThreat;
		
		
	}

	public int getId() {
		return id++;
	}

	public void setId(int id) {
		this.id = id + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfThreat() {
		return dateOfThreat;
	}

	public void setDateOfThreat(Date dateOfThreat) {
		this.dateOfThreat = dateOfThreat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfThreat == null) ? 0 : dateOfThreat.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (dateOfThreat == null) {
			if (other.dateOfThreat != null)
				return false;
		} else if (!dateOfThreat.equals(other.dateOfThreat))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", dateOfThreat=" + dateOfThreat + "]";
	}

	@Override
	public int compareTo(Client client) {
		
		int res = this.dateOfThreat.compareTo(client.dateOfThreat);
		if(res == 0) {
			return this.name.compareToIgnoreCase(client.name);
		}
		return res;
	}

}
