public class PawesomeUtils {
        public static char generateDogChar(int dogId) {
        int sumOfDigits = dogId % 10 + (dogId % 100) / 10 + (dogId / 100);
        int result = 'F' + (sumOfDigits % 10);
        return (char) result;
    }

    public static String pickup(Dog dog, String personName) {
        if (personName.equals(dog.getOwnerName())) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + dog.getOwnerName() + ".";
        }

        return dog.getName() + " has not been picked up, because " + personName + " is not their owner.";
    }
    
    public static void checkIn(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
    }

    public static String generateDogTag(int dogID, char dogChar) {
        return "" + dogID + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        }
        return (int) (Math.random() * 900 + 100);
    }

    public static boolean validateDogTag(Dog dog) {
        int dogID = dog.getDogID();
        dogID = validateDogId(dogID);
        char newDogChar = generateDogChar(dogID);
        String newDogTag = "" + dogID + newDogChar;

        if (newDogTag.equals(dog.getDogTag())) {
            return true;
        }
        return false;
    }
}
