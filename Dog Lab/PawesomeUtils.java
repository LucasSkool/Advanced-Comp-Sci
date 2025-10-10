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
        if (validateDogTag(dog)) { 
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
            System.out.println(dog + " was successfully checked in by " + personName + ".");
        } else {
            dog.setStillInFacility(false);
            System.out.println(dog + " is a counterfeit dog! Please contact customer service if you believe this is incorrect.");
        }
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        }
        return (int) ((Math.random() * 900) + 100);
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        int oldDogId = dogId;
        dogId = validateDogId(dogId);
        if (oldDogId != dogId) {
            return false;
        }
        char newDogChar = generateDogChar(dogId);
        String newDogTag = "" + dogId + newDogChar;
        if (newDogTag.equals(dog.getDogTag())) {
            return true;
        }
        return false;
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 0) {
            return 0;
        } else if (dog.getAge() == 1) {
            return 15;
        } else if (dog.getAge() == 2) {
            return 24;
        }
        return (24 + ((dog.getAge() - 2) * 5));
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears == 0) {
            return 0;
        } else if (humanYears <= 15) {
            return 1;
        } else if (humanYears > 15 && humanYears <= 24) {
            return 2;
        }
        return ((humanYears - 24) / 5) + 2;
    }
}
