public class Contact implements Comparable {
    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    public static String validatePhoneNumber(String telephoneNumber) {
        for (int i = 0; i < telephoneNumber.length(); i++) {
            if (telephoneNumber.charAt(i) < 48 || telephoneNumber.charAt(i) > 57) {
                System.out.println("telephoneNumber has incorrect foratting (1)");
                //throw new IllegalArgumentException("telephoneNumber has incorrect foratting (1)");
            }
            if ((i == 3 || i == 7) && telephoneNumber.charAt(i) != '-') {
                System.out.println("telephoneNumber has incorrect foratting (2)");
                throw new IllegalArgumentException("telephoneNumber has incorrect foratting (2)");
            }
        }
        return telephoneNumber;
        
    }


    public int compareTo(Object other) {
        Contact otherContact = (Contact) other;

        if (stringCompare(this.firstName, otherContact.getFirstName()) < 0) {
            return -1;
        } else if (stringCompare(this.firstName, otherContact.getFirstName()) > 0) {
            return 1;
        }
        if (stringCompare(this.lastName, otherContact.getLastName()) < 0) {
            return -1;
        } else if (stringCompare(this.lastName, otherContact.getLastName()) > 0) {
            return 1;
        }
        if (stringCompare(validatePhoneNumber(this.telephoneNumber), validatePhoneNumber(otherContact.getTelephoneNumber())) < 0) {
            return -1;
        } else if (stringCompare(this.telephoneNumber, otherContact.getTelephoneNumber()) > 0) {
            return 1;
        }
        return 0;
    }

    public static int stringCompare(String str, String other) {
        for (int i = 0; i < str.length() && i < other.length(); i++) { //for each letter
            if (Character.toLowerCase(str.charAt(i)) < Character.toLowerCase(other.charAt(i))) {
                return -1;
            } else if (Character.toLowerCase(other.charAt(i)) < Character.toLowerCase(str.charAt(i))) {
                return 1;
            }
        }
        return 0;
    } //should be correct/working as intended

    public int compareToLastFirst(Object other) {
        Contact otherContact = (Contact) other;

        if (stringCompare(this.lastName, otherContact.getLastName()) < 0) {
            return -1;
        } else if (stringCompare(this.lastName, otherContact.getLastName()) > 0) {
            return 1;
        }
        if (stringCompare(this.firstName, otherContact.getFirstName()) < 0) {
            return -1;
        } else if (stringCompare(this.firstName, otherContact.getFirstName()) > 0) {
            return 1;
        }
        if (stringCompare(validatePhoneNumber(this.telephoneNumber), validatePhoneNumber(otherContact.getTelephoneNumber())) < 0) {
            return -1;
        } else if (stringCompare(this.telephoneNumber, otherContact.getTelephoneNumber()) > 0) {
            return 1;
        }
        return 0;
    }


    /*public int compareTo(Object other) {
        Contact otherContact = (Contact) other;
        for (int i = 0; i < this.firstName.length() && i < otherContact.getFirstName().length(); i++) {
            if (Character.toLowerCase(this.firstName.charAt(i)) 
                    < Character.toLowerCase(otherContact.getFirstName().charAt(i))) {
                return -1;
            } else if (Character.toLowerCase(this.firstName.charAt(i)) 
                    > Character.toLowerCase(otherContact.getFirstName().charAt(i))) {
                return 1;
            }
        }





        for (int i = 0; i < this.lastName.length() && i < otherContact.getLastName().length(); i++) { //goes through each character of this
            if (Character.toLowerCase(this.lastName.charAt(i)) 
                    < Character.toLowerCase(otherContact.getLastName().charAt(i))) {
                return -1;
            } else if (Character.toLowerCase(this.lastName.charAt(i)) 
                    > Character.toLowerCase(otherContact.getLastName().charAt(i))) {
                return 1;
            }
        }

        for (int i = 0; i < this.telephoneNumber.length() && i < otherContact.getTelephoneNumber().length(); i++) { //goes through each character of this
            if (Character.toLowerCase(validatePhoneNumber(this.telephoneNumber).charAt(i)) 
                    < Character.toLowerCase(validatePhoneNumber(otherContact.getTelephoneNumber()).charAt(i))) {
                return -1;
            } else if (Character.toLowerCase(validatePhoneNumber(this.telephoneNumber).charAt(i)) 
                    > Character.toLowerCase(validatePhoneNumber(otherContact.getTelephoneNumber()).charAt(i))) {
                return 1;
            }
        }

        return 0; //they are equal
    } //im not sure if this method 100% works for all edge cases */





    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = validatePhoneNumber(telephoneNumber); //will throw exceptions if input is invalid
    }

    public String toString() {
        return "Contact: " + firstName + " " + lastName + " | Telephone Number: " + telephoneNumber;
    }



}