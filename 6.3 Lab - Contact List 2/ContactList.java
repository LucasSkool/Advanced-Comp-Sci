import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

public class ContactList extends AbstractList {
    private ArrayList<Contact> contactList;

    public ContactList() {
        this.contactList = new ArrayList<>();
    }

    public boolean add(Contact contact) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getTelephoneNumber().equals(contact.getTelephoneNumber())) { //entire contact
                System.out.println(contact.toString() + "  is already in the contact list.");
                return false;
            }
        }
        contactList.add(contact);
        return true;

    }

    public Contact get(int index) {
        return contactList.get(index);
    }

    public int size() {
        return contactList.size();
    }

    public boolean remove(Contact contact) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contact.compareTo(contactList.get(i)) == 0) { //if match found using compareTo
                contactList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void sortByFirstName() {
        Collections.sort(contactList);
        //I guess Collections.sort() invokes the Object's compareTo() method

    }

    public void sortByLastName() { //selection sorting
        for (int i = 0; i < contactList.size() - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k < contactList.size(); k++) {
                if (contactList.get(k).compareToLastFirst(contactList.get(i)) < 0) {
                    minIndex = k;
                }
            } //found minimum (hopefully)

            //switch places with the min found
            Contact temp = contactList.get(minIndex);
            contactList.set(minIndex, contactList.get(i));
            contactList.set(i, temp);
        }
        
        /*for (int i = 0; i < contactList.size(); i++) {
            Contact tempFirst = contactList.get(i);
            int tempIndex = i + 1;
            for (int k = i + 1; k < contactList.size(); k++) {
                if (contactList.get(k).compareToLastFirst(tempFirst) < 0) {
                    tempFirst = contactList.get(k);
                    tempIndex = k;
                }

            }
            contactList.remove(tempIndex);
            contactList.add(i, tempFirst);
        } */
    }

    public void sortByTelephoneNumber() { //Insertion Sort
        for (int i = 0; i < contactList.size(); i++) { // range in question
            for (int k = 0; k <= i; k++) {
                //contactList.get(i) is the contact in question
                if ((contactList.get(i).getTelephoneNumber()).compareTo(contactList.get(k).getTelephoneNumber()) < 0) { //if new contact comes before this k contact
                    Contact temp = contactList.get(i);
                    
                    //shifting range in question down to the right
                    for (int j = i; j > k; j--) {
                        contactList.set(j, contactList.get(j - 1));
                    }
                    contactList.set(k, temp);
                }
            }
            
        }
    }


    public Contact searchContacts(String telephoneNumber) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getTelephoneNumber().compareTo(Contact.validatePhoneNumber(telephoneNumber)) == 0) {
                return contactList.get(i);
            }
        }
        return null;
    }

    public String toString() {
        String result = "Contact List:\n";
        for (int i = 0; i < contactList.size(); i++) {
            result += contactList.get(i).toString() + "\n";
        }
        return result;
    }
    



}
