package Controller;

import java.util.Vector;

import Model.LibrarianModel;
import Model.StudentModel;
import Model.UserModel;

public class LibrarianController {
	private LibrarianModel librarian;
	public LibrarianController(LibrarianModel l) {
		librarian=l;
	}
	public void giveBook(StudentModel s, String bookName) {
		
	}
	public int getNumOfBooks() {
		return DataBase.getBooks().size();
	}
	public int getNumOfBooks(String name) {
		return DataBase.getBooks(name).size();
	}
	public boolean giveBook(UserModel user, String name) {
		Vector<Book> books=DataBase.getBooks(name);
		if(books.size()==0) {
			System.out.println("Нету книг с таким названием");
			return false;
		}
		else {
			for(Book book:books) {
				if(book.getOwner()==null) {
					book.setOwner(user);
					System.out.println("Успешно выдана книга "+book);
					return true;
				}
			}
			System.out.println("Не осталось книг");
			return false;
		}
	}
	public boolean returnBook(UserModel user,String name) {
		Vector<Book> books=DataBase.getBooks(name);
		if(books.size()==0) {
			System.out.println("Нету книг с таким названием");
			return false;
		}
		for(Book book: books) {
			if(book.getOwner()==user) {
				book.removeOwner();
				System.out.println("Вы успешно вернули книгу");
				return true;
			}
		}
		System.out.println("Вы не должны книгу с таким названием");
		return false;
	}
}
