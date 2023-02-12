package assignment.contact;

public class Node {
	String contactname;
	double phonenumber;
	String emailaddress;
	Node next;
	Node(String contactname,double phonenumber,String emailaddress)
	{
		this.contactname=contactname;
		this.phonenumber=phonenumber;
		this.emailaddress=emailaddress;
		next=null;
	}

}
