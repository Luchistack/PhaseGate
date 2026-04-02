import java.util.ArrayList;
public class PhoneBook{

public static void main(String [] args){


    ArrayList <String> contactList = new ArrayList<String>();


    ArrayList <String> phoneBook = new ArrayList<String>();

    phoneBook.add(contactList.toString());

    System.out.println(addContacts(contactList));

    System.out.println(removeContacts(contactList phoneBook));

}
    public static ArrayList <String> addContacts(ArrayList <String> contactList ){

    contactList.add("firstname");

    contactList.add("surname");

    contactList.add("phonebook");

    return contactList;


}

    public static ArrayList <String> removeContacts(ArrayList <String> contactList,  ArrayList <String> phoneBook){

    int counter = 0;

    for(int count = 0; count <= phoneBook.size(); count ++){

        System.out.println("Enter phone number to delete contact");
        String phone = input.nextLine();

        if(contactList.conain(phone)){

            contactList.remove(phone);

            System.out.println("Contact Removed");

}       else{
            System.out.println("Contact not found");

}
            return contactList;

        }


}


}

}






