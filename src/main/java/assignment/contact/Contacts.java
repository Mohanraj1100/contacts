package assignment.contact;
import java.util.*;
import java.util.logging.Logger;

public class Contacts 
{
    public static void main( String[] args )
    {
    	String contactname;
    	long phonenumber;
    	String emailaddress;
    	String searchcontact;
    	String deletecontact;
    	int choice;
    	Scanner sc = new Scanner(System.in);
    	Logger log = Logger.getLogger("hi");
    	LinkedList ll = new LinkedList();
    	
    	while(true)
    	{
    		log.info("What you want to do ? \n 1.Add contact \n 2.Display contacts \n 3.Search contact  \n 4.Delete contact \n 5.Exit");
        	choice = sc.nextInt();
    	switch(choice)
    	{
    	case 1:
    		log.info("Enter Contact Name");
        	contactname = sc.next();
        	log.info("Enter Phone Number ");
        	phonenumber = sc.nextLong();
        	log.info("Enter Email Address");
        	emailaddress = sc.next();
        	ll.addContact(contactname, phonenumber, emailaddress);
        	break;
        	
    	case 2:
    		ll.display();
    		break;
    		
    	case 3:
    		log.info("Enter Contact Name to search");
    		searchcontact = sc.next();
    		ll.searchContact(searchcontact);
    		break;
    		
    	case 4:
    		log.info("Enter Contact Name to delete");
    		deletecontact = sc.next();
    		ll.deleteContact(deletecontact);
    		break;
    		
    	case 5:
    		sc.close();
    		System.exit(0);
            break;
    		
    	default:
    		log.info("Invalid Choice");
    		break;	
    	}	
    	}
    }
}
