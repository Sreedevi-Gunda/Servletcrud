package userservlet.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fName;
	private String lName;
	@Column(unique=true)
	private String email;
	private String pwd;
	private String gender;
	private long phone;
	private int age;
	
	public User(String fName, String lName, String email, String pwd, String gender, long phone, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pwd = pwd;
		this.gender = gender;
		this.phone = phone;
		this.age = age;
	}

	public User(int id, String fName, String lName, String email, String pwd, String gender, long phone, int age) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pwd = pwd;
		this.gender = gender;
		this.phone = phone;
		this.age = age;
	}
	
	//N number of controller class
	//one dto,one dao 
	//entity transaction is used to track the object
	//
	
//	500 persistence exception
//	right click on project name 
//	check configuration
//	check persistence unit name
//	deployment assembly 
//	apply
//	if mavendependencies missing
//	java buildpath 
//	browse and add
//	apply and close 
//	http://localhost:8081/userservlet/register?fName=SREE&lName=DEVI&age=23&phone=1234567890&email=sree%40gmail.com&pwd=123&gender=FEMALE	
//	
	

}
