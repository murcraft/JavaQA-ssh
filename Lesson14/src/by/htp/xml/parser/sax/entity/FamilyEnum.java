package by.htp.xml.parser.sax.entity;

public enum FamilyEnum {
	FAMILIES("families"),
	FAMILY("family"),
	MOTHER("mother"),
	FATHER("father"),
	CHILDREN("children"),
	CHILD("child"),
	NAME("name"),
	SURNAME("surname"),
	AGE("age"),
	MILITARY("military"),
	GENDER("gender");
	
	private String value;
	
	private FamilyEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
