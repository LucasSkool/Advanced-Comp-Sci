public class CatTester {
    
    public static void main(String[] args) {
        // private String name;
        // private String ownerName;
        // private int moodLevel;
        // private String catId;
        // private char catChar;
        // private boolean isHungry;

        
        Cat cat1 = new Cat("hmm", "idk", 0, "1234");

        System.out.println();
        System.out.println(cat1.toString());
        System.out.println();

        System.out.println("Testing setters and getters:");
        cat1.setName("Bobby");
        cat1.setOwnerName("Lucas");
        cat1.setMoodLevel(11);
        cat1.setCatId("1859");
        cat1.setCatChar('F');
        cat1.setHungry(false);

        System.out.println();
        System.out.println(cat1.toString());
        System.out.println();

        Cat cat2 = new Cat("Bobby", "Lucas", 10, "1859");
        cat2.setCatChar('F');
        cat2.setHungry(false);

        System.out.println();
        System.out.println("This should return true: " + cat1.equals(cat2));
        System.out.println();


        PurrfectUtils.bootUp(cat1);
        System.out.println();
        PurrfectUtils.pet(cat1);
        System.out.println();

        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(cat1);
        }

        System.out.println();

        PurrfectUtils.cleanLitterBox(cat1);
        System.out.println();

        PurrfectUtils.feed(cat1);



    }

}
