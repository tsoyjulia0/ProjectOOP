package Controller;

import Model.UserModel;

public class Book {
	private int id;
	private UserModel owner=null;
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
	public void setOwner(UserModel o) {
		owner= o;
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
	public void removeOwner() {
		owner=null;
	}
	public String toString() {
		return id+" "+name+" ";
	}
	public UserModel getOwner() {
		return owner;
	}
}
