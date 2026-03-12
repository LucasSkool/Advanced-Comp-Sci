import java.util.ArrayList;
import java.util.AbstractList;

public class ContactList extends AbstractList {

    // instance variable
    private ArrayList<String> contactList;

    // constructor
    // to-do: initializes an empty contact list
    public ContactList() {
        this.contactList = new ArrayList<>();
    }

    // methods

    // to-do: findInsertLocation(String name)
    /**
     * returns the location in the contact list where the name should go to keep the
     * list
     * alphabetized
     */
    private int findInsertLocation(String name) {
        name = name.toLowerCase();
        for (int i = 0; i < contactList.size(); i++) {
            if (name.compareTo(contactList.get(i).toLowerCase()) < 0) { //basically if name is before that index's String
                // name before that index
                return i;
            } else if (name.compareTo(contactList.get(i).toLowerCase()) == 0) { //if they are the same
                return -1;
            } 
        }
        return contactList.size();
    }



    // to-do: add(String name)
    /**
     * adds a name to the contact list so that the list remains alphabetized, it
     * prints out which
     * name is being added, also the method prevents duplicate names from being
     * added
     */
    public boolean add(String name) {
        System.out.println("+ Adding " + name);
        if (findInsertLocation(name) == -1) {
            System.out.println("Duplicate contacts detected, cannot add " + name + ".");
            return false;
        } else if (findInsertLocation(name) == contactList.size()) {
            contactList.add(name);
            return true;
        } 
        contactList.add(findInsertLocation(name), name);
        return true;

    }

    // to-do: add(ArrayList<String> names)
    /* this method adds a list of names to the contact list */
    public void add(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            add(names.get(i));
        }
    }

    // to-do: remove(String name)
    /** removes name from the contact list and keeps list alphabetized */
    public boolean remove(String name) {
        System.out.println("- Removing " + name);
        for (int i = 0; i < contactList.size(); i++) {
            if (name.toLowerCase().equals(contactList.get(i).toLowerCase())) {
                contactList.remove(i);
                return true;
            }
        }
        System.out.println("Could not find " + name + " in contact list.");
        return false;
        
    }

    // to-do: remove(ArrayList<String> names)
    /* this method removes a list of names from the contact list */
    public void remove(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            remove(names.get(i));
        }
    }




    /** returns a String containing all of the words in list */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // to-do: get(int index)
    /** returns the name at the specified index */
    public String get(int index) {
        return contactList.get(index);
    }

    // to-do: size()
    /** returns the number of names in the contact list */
    public int size() {
        return contactList.size();
    }

    // to-do: clear()
    /** removes all names from the contact list */
    public void clear() {
        System.out.println("Clearing the contact list...");
        contactList.clear();
    }

}
