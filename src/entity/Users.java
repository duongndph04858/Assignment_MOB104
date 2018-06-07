package entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="USERS")
public class Users {
	@Id
	@Column(name="username")
	private String username;
	@OneToMany(mappedBy="username",fetch = FetchType.EAGER)
	private Collection<Purchase> purchases;
	@Column(name="password")
	private String password;
	@Column(name="fullname")
	private String fullname;
	@Column(name="gender")
	private boolean gender;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	@Column(name="birthday")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/mm/yyyy")
	private Date birthday;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Users(String username, String password, String fullname, boolean gender, String address, String email,
			String phone, Date birthday) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.birthday = birthday;
	}
		

	public Users(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Collection<Purchase> getPurchases() {
		return purchases;
	}
	public void setPurchases(Collection<Purchase> purchases) {
		this.purchases = purchases;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public boolean isMale() {
		return gender;
	}
	public void setMale(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}