package webapp.model;


import javax.persistence.*;

@Entity
@Table(name= "Accounts")
public class Accounts {

    @Id
    private String Email;
    private String Password;
    private String FirstName;
    private String LastName;
    private String Type;

    

	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}

	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstname) {
		FirstName = firstname;
	}

	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastname) {
		LastName = lastname;
	}
	
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}





}