package by.htp.kyzniatsova.entity;

import java.io.Serializable;

public class Prediction implements Serializable {

	private static final long serialVersionUID = 7497634881040094934L;
	private Target target;
	private int id;


	public Prediction() {
		super();
	}

	public Prediction(int id) {
		super();
		this.id = id;
		target = initTarget(this.id);
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}
	
	public Target initTarget(int id) {
		if(id == 1) {
			return Target.LOVE;
		}
		if(id == 2) {
			return Target.DIE;
		} 
		if(id == 3) {
			return Target.FAMILY;
		}
		if(id == 4) {
			return Target.CAREER;
		}
		if(id == 5) {
			return Target.FUTURE;
		}
		if(id == 1) {
			return Target.PETS;
		}
		return null;
	
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
		if (target != other.target)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Prediction - " + target;
	}


	
	
}
