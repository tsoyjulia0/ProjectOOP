package Controller;

public class SimpleResearcher implements Researcher{
	private String researchName;
	private String researchType;
	
	public SimpleResearcher() {
		
	}
	
	public SimpleResearcher(String name, String type) {
		this.researchName = name;
		this.researchType = type;
	}
	@Override
	public String doResearch() {
		return this.researchName + " " + this.researchType;
	}

}
