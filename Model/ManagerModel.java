package Model;

import java.util.Objects;
import java.util.Vector;

import Controller.DataBase;

public class ManagerModel extends EmployeeModel implements Cloneable{
	private ManagerType type;
	private String news;
	Vector<String> News= new Vector<>();

	public ManagerModel() {

	}

	public ManagerModel(int id, String login,String pass, String name, String surname, Gender g, ManagerType type) {
		super(id, login, pass, name, surname, g);
		this.type = type;
	}

	{
		News = new Vector<String>();
		DataBase.addManager(this);
	}

	private void setNews(String news) {
		this.news = news;
	}

	public String getNews() {
		return this.news;
	}

	public String toString() {
		return "Name :" + this.getName() + " ID: " + this.getId() + " News: " + this.getNews();
	}

	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		ManagerModel m = (ManagerModel)o;
		return news == m.news;
    }

    public int hashCode() {
    	return	Objects.hash(news);
    }

    public Object clone() throws CloneNotSupportedException{
    	ManagerModel m = (ManagerModel)super.clone();
    	return m;
    }

    public int compareTo(ManagerModel m) {
   	 	if(m.id > this.id) return -1;
   	 	else if(m.id < this.id) return 1;
   	 	else return 0;
   }


}
