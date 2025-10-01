public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby");  // added "new"
        Cat otherCat = new Cat("Tiger Beast", "Tabby"); // added "new"
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); // added System.out.println() so that we print this line

        System.out.println("Are the cat's equal?" + myCat.equals(otherCat)); // return --> System.out.println()

        System.out.println(("Is my cat hungry? " + myCat.getIsHungry()));  //print does not print, print --> System.out.println()

        String firstName = "Tiger";
        String lastName = "Beast"; // == --> = because we are setting equals
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cats are the same now: " + myCat.equals(otherCat)); //"Cat's" --> "Cats" (punctuation error)

    }

}