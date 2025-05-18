package ntou.cs.java2025;
public class GasStationBrand {
	private String abbreviation;
	private String name;
	
	public GasStationBrand(String abbreviation, String name) {
		this.abbreviation = abbreviation;
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
