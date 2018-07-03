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
	
	public static FamilyEnum getFamulyElementName(String element) {
		switch(element) {
		case "families": 
			return FAMILIES;
		case "family":
			return FAMILY;
		case "mother":
			return MOTHER;
		case "father":
			return FATHER;
		case "children":
			return CHILDREN;
		case "child":
			return CHILD;
		case "name":
			return NAME;
		case "surname":
			return SURNAME;
		case "age":
			return AGE;
		case "military":
			return MILITARY;
		case "gender":
			return GENDER;
			default:
				throw new EnumConstantNotPresentException(FamilyEnum.class, element);
		}
	}

}
