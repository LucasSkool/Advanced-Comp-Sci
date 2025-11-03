public class PoolUtils {
    
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel > 10) {
            return 10;
        } else if (cleanlinessLevel < 0) {
            return 0;
        }
        return cleanlinessLevel;
    }

    public static String generateUsername(String name) {
        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + 1, name.length());
        return "@" + firstName + "_" + lastName + "_" + (int) (Math.random() * 100 + 1950);
    } //IDK how to make them lowercasednsakodnasmokdw

    
    public static void cleanPool(Pool pool) {
        pool.setCleanlinessLevel(pool.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        String result = name.trim();
        int spaceCount = 0;
        for (int i = name.indexOf(" "); name.charAt(i) == ' '; i++) {
            spaceCount++;
        }

        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + spaceCount);
        result = firstName + " " + lastName;
        return result;
    }



}
