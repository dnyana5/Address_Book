import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		AddressBook ab = new AddressBook();
		String input, s;
		int cs;
		while(true) {
			input = JOptionPane.showInputDialog("Enter 1 to Add record " +"\n Enter 2 to Search record \n Enter 3 to Delete Record" +"\n Enter 4 to Exit");
			cs = Integer.parseInt(input);
			switch(cs) {
			case 1:
				ab.addPerson();
			break;
			case 2:
				s = JOptionPane.showInputDialop("Enter name to search ");
				ab.searchPerson(s);
			break;
			case 3:
				s = JOptionPane.showInputDialop("Enter name to Delete ");
				ab.deletePerson(s);
			break;
			case 4:System.exit(0);
			}
		}
	}
}
