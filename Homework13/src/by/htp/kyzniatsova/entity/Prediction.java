package by.htp.kyzniatsova.entity;

public class Prediction {
	private int id;
	private String target;
	
	public Prediction() {
	}

	public Prediction(String target) {
//		this.setId(target.ordinal());
		this.target = target;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (target != other.target)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return target;
	}
	
//		public int compareTo(String str) {
//		int res = this.target.compare(str);
//		if(res == 0) {
//			return this.target - str;
//		}
//			return res ;
//	}

	

}
