package Controller;

public class Book {
	private int id;
	private String name;
	{
		DataBase.addBook(this);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book(String name,int id) {
		this.id=id;
		this.name=name;
		
	}
	public Book() {
		
	}
	public String toString() {
		return id+" "+name+"\n";
	}
}
