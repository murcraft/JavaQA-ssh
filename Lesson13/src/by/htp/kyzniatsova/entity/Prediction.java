package by.htp.kyzniatsova.entity;

import java.io.Serializable;

public class Prediction implements Serializable {

	private static final long serialVersionUID = 7497634881040094934L;
	private String target;


	public Prediction() {
		super();
	}

	public Prediction(String target) {
		
		this.target = target;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((target == null) ? 0 : target.hashCode());
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
		Prediction other = (Prediction) obj;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Prediction: " + target;
	}


	
	
	
	
}
