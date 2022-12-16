package Model;

import java.util.HashMap;
import java.util.Vector;

import Controller.Book;

public class LibrarianModel extends EmployeeModel{
	private static HashMap<StudentModel,Vector<Book>> debtor= new HashMap<StudentModel,Vector<Book>> ();
	public LibrarianModel(int id, String login,String pass, String name, String surname, Gender g) {
		super(id, login, pass, name, surname, g);
	}
	public static HashMap<StudentModel,Vector<Book>> getDebtor() {
		return debtor;
	}
}
