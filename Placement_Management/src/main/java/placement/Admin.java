package placement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Admin
{
private Integer admin_id;
private String username;
private String password;
private String Emailid;
private int a_phno;


public Admin() 
{
	super();
}
public Admin(Integer admin_id, String username, String password, String emailid, int a_phno) {
	super();
	this.admin_id = admin_id;
	this.username = username;
	this.password = password;
	Emailid = emailid;
	this.a_phno = a_phno;
}

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public Integer getAdmin_id() {
	return admin_id;
}
public void setAdmin_id(Integer admin_id) {
	this.admin_id = admin_id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmailid() {
	return Emailid;
}
public void setEmailid(String emailid) {
	Emailid = emailid;
}
public int getA_phno() {
	return a_phno;
}
public void setA_phno(int a_phno) {
	this.a_phno = a_phno;
}
@Override
public String toString() {
	return "Admin [admin_id=" + admin_id + ", username=" + username + ", password=" + password + ", Emailid=" + Emailid
			+ ", a_phno=" + a_phno + "]";
}



}
