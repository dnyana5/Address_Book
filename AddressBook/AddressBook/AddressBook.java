import java.util.*;

import javax.swing.JOptionPane;
class AddressBook {
ArrayList<PersonInfo> persons;

//constructor

public AddressBook() {
	persons = new ArrayList<PersonInfo>();
}
//add new person record to arraylist after taking input
public void addPerson() {
	String name = JOptionPane.showInputDialog("Enter Name");
	String add = JOptionPane.showInputDialog("Enter Address");
	String pNum = JOptionPane.showInputDialog("Enter Phone Number");
	String mail = JOptionPane.showInputDialog("Enter Email");
	PersonInfo p = new PersonInfo(name, add, pNum, mail);
	//add the aboove personingo object to arraylist
	persons.add(p);
	}
public void searchPerson (String n) {
	for(int i=0; i<persons.size(); i++) {
		PersonInfo p =(PersonInfo)persons.get(i);
	if(n.equals(p.getName())) {
		p.print();
	}
	}
}// end searchperson
//delete person record by name by iterating over arraylist
public void deletePerson (String n) {
	for(int i=0; i<persons.size(); i++) {
	PersonInfo p = (PersonInfo)persons.get(i);
	if(n.equals(p.getName()))
	{
		p.print();
		persons.remove(i);
	}	
}
}
}
