package Model;

import java.util.Objects;

import Controller.UserController;


public abstract class UserModel implements Comparable<Object> {
	    private String name;
	    private String surname;
	    private String login;
	    private String password;
	    private Gender gender;
	    private Integer age;
	    protected Integer id;
	    
	    public UserModel() {
	    
	    }
	    
	    public UserModel(String login, String password) {
	    	this.login = login;
	    	this.password = password;
	    }
	    
	    protected void setName(String name) {
	        this.name = name;
	    }
	    
	    public String getName(){
	        return this.name;
	    }
	  
	    public String getSurname(){
	        return this.surname;
	    }
	  
	    protected void setSurname(String surname) {
	        this.surname = surname;
	    }
	  
	    public String getLogin() {
	        return this.login;
	    }
	 
	    protected void setLogin(String login) {
	        this.login = login;
	    }
	 
	    public String getPassword() {
	        return this.password;
	    }
	   
	    protected void setPassword(String password) {
	        this.password = password;
	    }
	    
	    public Gender getGender() {
	        return this.gender;
	    }
	 
	    protected void setGender(Gender gender) {
	        this.gender = gender;
	    }
	   
	    public Integer getAge() {
	        return this.age;
	    }
	  
	    protected void setAge(Integer age) {
	        this.age = age;
	    }
	 
	    public int getId() {
	        return this.id;
	    }
	 
	    protected void setId(Integer id) {
	        this.id = id;
	    }
	    

	    public String toString() {
	        return "Name: "+name+" "+"Surname: "+surname+" "+"Login: "+login+" "+"Passoword: "+password+" "+"Gender: "+gender+" "+"Age: "+age+" "+"ID: "+id;
	    }
	  
	    public boolean equals(Object o) {
			if(this==o) return true;
			if(o==null) return false;
			if(this.getClass()!=o.getClass()) return false;
			UserModel g=(UserModel)o;
			return this.name.equals(g.name) 
			        && g.surname.equals(this.surname)
			        && g.login.equals(this.login)
			        && g.password.equals(this.password)
			        && g.age==this.age
			        && g.id==this.id;
	    	}
	 
	    public int hashCode() {
	    	return	Objects.hash(name, surname,login,password,age,id);
	    }
	 
	    public int compareTo(Object obj) {
	    	UserModel user = (UserModel)obj;
	    	 if (user.id < this.id) {
	   	      return 1;
	   	    }
	   	    if (user.id > this.id) {
	   	      return -1;
	   	    }
	   	    return 0;
	   	  }
	    }

