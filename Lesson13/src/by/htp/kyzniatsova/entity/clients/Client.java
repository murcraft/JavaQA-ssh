package by.htp.kyzniatsova.entity.clients;

import java.io.Serializable;
import java.util.Date;
import java.util.TreeMap;

import by.htp.kyzniatsova.entity.prediction.PredictionResult;

public class Client implements Serializable, Comparable<Client> {
	
	private static final long serialVersionUID = 2034764743257592692L;
	private String name;
	private ClientDate dateOfThreat = null;
	private int id;
	
	private TreeMap <Date, PredictionResult> clientHistory;
	
	public Client() {
	}

	public Client(int id, String name) {
		this.id = id++;
		this.name = name;
		this.dateOfThreat = new ClientDate();
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

	public ClientDate getDateOfThreat() {
		return dateOfThreat;
	}

	public void setDateOfThreat(ClientDate dateOfThreat) {
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
		return "Client № " + id + ", " + name + ", " + dateOfThreat;
	}

	public int compareTo(Client client) {
		
		int result = this.name.compareTo(client.getName());
		if(result == 0){
			return this.id - client.getId();
		}
		return 0;
	}

}
