package Controller;

public abstract class ResearcherDecorator implements Researcher{
	protected final Researcher decoratedRes;
	
	public ResearcherDecorator(Researcher r) {
		this.decoratedRes = r;
	}

	@Override
	public String doResearch() {
		return this.decoratedRes.doResearch();	
	}
	
	
	
}
