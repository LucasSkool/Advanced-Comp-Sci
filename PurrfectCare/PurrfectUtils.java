public class PurrfectUtils {
    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel > 10) {
            return 10;
        } else if (moodLevel < 0) {
            return 0;
        }
        return moodLevel;
    }

    public static String validateCatId(String catId) {
        
        if (Integer.parseInt(catId) >= 1000 && Integer.parseInt(catId) <= 9999) {
            return catId;
        }
        return "" + PurrfectUtils.generateRandomNumber(1000, 10000); //should generate 1000 --> 9999
    }

    public static char generateCatChar(String catId) {
        String newCatId = catId.substring(0, 4); //takes first 4 digits of the parameter
        
        // if (Integer.parseInt(catId) < 1000 || Integer.parseInt(catId) > 9999) {
            
        // } 
        // I'm not sure if this is the way it should be, instructions aren't clear enough
        int sum = 0;
        
        for (int i = 0; i < 4; i++) {
            sum += (int) newCatId.charAt(i);
        }
        int result = sum%26;
        result += 'A';
        return (char) result;
    }

    public static String determineCatMood(Cat cat) {
        int moodLevel = PurrfectUtils.validateMoodLevel(cat.getMoodLevel());
        if (moodLevel > 7) {
            return "Currectly, " + cat.getName() + " is in a great mood.\nPetting is appreciated.";
        } else if (moodLevel > 3 && moodLevel <= 7) {
            return "Currently, " + cat.getName() + " is reminiscing of a past life.\nPetting is acceptable.";
        }
        return "Currently, " + cat.getName() + " is plotting revengance.\nPetting is extremely risky.";
        //no if here cuz no other case after first 2 if's
    }

    public static int generateRandomNumber(int low, int high) {
        int newLow = 0;
        int newHigh = 0;
        if (low > high) {
            newHigh = low;
            newLow = high;
        } else {
            newHigh = high;
            newLow = low;
        }
        
        return (int) (Math.random() * (newHigh - newLow + 1) + newLow);
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        
        boolean success = true;
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            success = true;
        } else if (cat.getMoodLevel() < 2 && cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            success = false;
        } else if (cat.getMoodLevel() < 2 && !cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            success = true;
        }
        
        PurrfectUtils.validateMoodLevel(cat.getMoodLevel());

        if (success) {
            System.out.println("Petting successful!");
        }
        if (!success) {
            System.out.println("Petting failed...");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int decreaseNum = (int) PurrfectUtils.generateRandomNumber(1, 3);
        cat.setMoodLevel(cat.getMoodLevel() - decreaseNum);

        PurrfectUtils.validateMoodLevel(cat.getMoodLevel());

        if (decreaseNum == 1) {
            System.out.println(cat.getName() + " did not like that...");
        } else if (decreaseNum == 2) {
            System.out.println(cat.getName() + " really hated that !");
        } else {
            System.out.println("Something is wrong with the random number generator");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Cleaning the litter box...\nDone!\n" + cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up " + cat.getName()
            + "'s bowl...\nDone!\n" + cat.getName()
            + " is eating...\n" + cat.getName() + " is full!");
    }

}
