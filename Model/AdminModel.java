package Model;

public class AdminModel extends UserModel implements Cloneable{

	public AdminModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminModel(int id, String login,String pass, String name, String surname, Gender g) {
		super(id, login, pass, name, surname, g);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin "+super.toString();
	}
	
	
}
