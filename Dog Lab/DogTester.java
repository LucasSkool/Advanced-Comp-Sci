public class DogTester {
    public static void main(String[] args) {
        
        System.out.println("--------------------------- Dog Part 1 ----------------------------");
        System.out.println("");
        
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Bobby", "Lucas", 4, 123);
        Dog dog3 = new Dog("Galaxy Destroyer", "Katelyn", 3, 234);

        System.out.println(dog1.getName());
        System.out.println(dog1.getOwnerName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getDogID());
        System.out.println(dog1.getDogChar());
        System.out.println(dog1.getDogTag());
        System.out.println(dog1.isStillInFacility());

        System.out.println(dog3.getName());
        System.out.println(dog3.getOwnerName());
        System.out.println(dog3.getAge());
        System.out.println(dog3.getDogID());
        System.out.println(dog3.getDogChar());
        System.out.println(dog3.getDogTag());
        System.out.println(dog3.isStillInFacility());
        
        System.out.println(dog2.getName());
        System.out.println(dog2.getOwnerName());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getDogID());
        System.out.println(dog2.getDogChar());
        System.out.println(dog2.getDogTag());
        System.out.println(dog2.isStillInFacility());

        dog2.setAge(5);
        dog2.setStillInFacility(false);

        System.out.println(dog2.getAge());
        System.out.println(dog2.isStillInFacility());

        System.out.println(PawesomeUtils.generateDogChar(123));
        System.out.println(PawesomeUtils.generateDogChar(693));

        System.out.println("Dog tag for dog1: " + PawesomeUtils.generateDogTag(dog1.getDogID(), dog1.getDogChar()));
        System.out.println("Dog tag for dog2: " + PawesomeUtils.generateDogTag(dog1.getDogID(), dog1.getDogChar()));
        System.out.println("Dog tag for dog3: " + PawesomeUtils.generateDogTag(dog1.getDogID(), dog1.getDogChar()));


        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        System.out.println("Does dog1 equal dog2? " + dog1.equals(dog2));

        Dog dog4 = new Dog();
        System.out.println("Does dog1 equal dog4? " + dog1.equals(dog4));

        System.out.println(dog2.isStillInFacility());

        System.out.println("");
        System.out.println("--------------------------- Dog Part 2 ----------------------------");
        System.out.println("");

        System.out.println(PawesomeUtils.generateDogChar(123)); //should be L
        System.out.println(PawesomeUtils.generateDogChar(456)); // idk
        System.out.println(PawesomeUtils.generateDogChar(789)); // idk

        System.out.println(PawesomeUtils.pickup(dog2, "Lucas"));
        System.out.println(PawesomeUtils.pickup(dog1, "Lucas"));
        System.out.println("Dog 1 still in facility? " + dog2.isStillInFacility()); //false
        System.out.println("Dog 2 still in facility? " + dog1.isStillInFacility()); //true

        dog3.setStillInFacility(false);

        PawesomeUtils.checkIn(dog3, "New Owner");
        System.out.println("Dog 3 still in facility? " + dog3.isStillInFacility());
        System.out.println(dog3.getOwnerName());

        System.out.println("");
        System.out.println("--------------------------- Dog Part 3 ----------------------------");
        System.out.println("");

        System.out.println(PawesomeUtils.validateDogId(429)); //should print 429
        System.out.println(PawesomeUtils.validateDogId(40)); //should print random, valid dog ID
        System.out.println(PawesomeUtils.validateDogId(40)); //should pring a DIFFERENT (probably) random, valid dog ID than before

        Dog dog5 = new Dog("Bill", "Max", 2, 391);
        Dog dog6 = new Dog("Lolipop", "Demir", 4, 732);
        Dog dog7 = new Dog("James", "Hank", 8, 934);

        System.out.println(PawesomeUtils.validateDogTag(dog5));
        System.out.println(PawesomeUtils.validateDogTag(dog6));
        System.out.println(PawesomeUtils.validateDogTag(dog7));
        //above 3 should all be true...

        dog6.setDogTag("482B");
        System.out.println(PawesomeUtils.validateDogTag(dog6));
        //should print false


    }
}
