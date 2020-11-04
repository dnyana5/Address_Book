import javax.swing.*;
public class PersonInfo {
	private String name;
	private String address;
	private String phoneNum;
	private String email;
	//Standard setters
	public void setName(String sname) {
		name = sname;
	}
	public void setAddress (String saddress) {
		address = saddress;
	}
	public void setPhoneNum (String sphoneNum) {
		phoneNum = sphoneNum;
	}
	public void setEmail(String semail) {
		email = semail;
	//Standard getter
	public String getName() {
		return name;
	}
	public void getAddress() {
		return address;
	}
	public void getPhoneNum() {
		return phoneNum;
	}public void getEmail() {
		return email;
	}
	//parameterized constructor
	public PersonInfo(String n, String a, String p, String e) {
		setName(n);
		setAddress(a);
		setPhoneNum(p);
		setEmail(e);
	}
	//method for displaying person record on gui
	public void print() {
		JOptionPane.showMessageDialog(null, "Name:"+name +"Address"+address +"Phone Number"+phoneNum +"Email"+email);
	}

}
