public class DogTester {
    public static void main(String[] args) {
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

        System.out.println(Dog.generateDogChar(123));
        System.out.println(Dog.generateDogChar(693));

        System.out.println("Dog tag for dog1: " + dog1.generateDogTag());
        System.out.println("Dog tag for dog2: " + dog2.generateDogTag());
        System.out.println("Dog tag for dog3: " + dog3.generateDogTag());


        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        System.out.println("Does dog1 equal dog2? " + dog1.equals(dog2));

        Dog dog4 = new Dog();
        System.out.println("Does dog1 equal dog4? " + dog1.equals(dog4));

        System.out.println(dog2.isStillInFacility());

    }
}
