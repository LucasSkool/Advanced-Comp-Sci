public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        String result = "";
        if (!vacation) {
            if (day > 0 && day < 6) {
                result = "7:00";
            } else {
                result = "10:00";
            }
        } else {
            if (day > 0 && day < 6) {
                result = "10:00";
            } else {
                result = "off";
            }
        }
        return result;
    }

    public static boolean love6(int a, int b) {
        if (Math.abs(a) == 6 || Math.abs(b) == 6 || Math.abs(a + b) == 6
            || Math.abs(a - b) == 6 || Math.abs(b - a) == 6) {
            return true;
        } 
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        if (str.length() < 1) {
            return "";
        }
        
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        }
        return str;

    }

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;

    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'h'
                && Character.toLowerCase(str.charAt(i + 1)) == 'i') {
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                cat++;
            } else if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o'
                && str.charAt(i + 2) == 'g') {
                dog++;
            }
        }

        return (cat == dog);
    }

    public static String mixString(String a, String b) {
        
        String shorterString = "";
        String longerString = "";
        if (a.length() > b.length()) {
            shorterString = b;
            longerString = a;
        } else {
            shorterString = a;
            longerString = b;
        }
        
        String result = "";
        
        int howFarWeHaveCome = 0;
        for (int i = 0; i < shorterString.length(); i++) {
            result += a.charAt(i);
            result += b.charAt(i);
            howFarWeHaveCome++;
        }
        result += longerString.substring(howFarWeHaveCome);
        return result;

    }

    public static String repeatEnd(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += str.substring(str.length() - n);
        }

        return result;
    }

    public static boolean endOther(String a, String b) {
        String longer = "";
        String shorter = "";
        if (a.length() > b.length()) {
            longer = a.toLowerCase();
            shorter = b.toLowerCase();
        } else {
            longer = b.toLowerCase();
            shorter = a.toLowerCase();
        }

        if (longer.substring(longer.length() - shorter.length()).equals(shorter)) {
            return true;
        }
        return false;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int tempMin = nums[0];
        int tempMax = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            tempMin = Math.min(tempMin, nums[i]);
            tempMax = Math.max(tempMax, nums[i]);
        }
        
        return tempMax - tempMin;
    }

    public static int sum13(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        
        int sum = 0;
        boolean exclude = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                exclude = true;
            } else if (!exclude) {
                sum += nums[i];
            } else if (exclude) {
                exclude = false;
            }
        }

        return sum;
    }

    public static int[] fizzArray(int n) {
        if (n == 0) {
            return new int[0];
        }
        
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = i;
        }

        return newArray;
    }

    public static boolean haveThree(int[] nums) {
        int threeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                threeCount++;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3) {
                return false;
            }
        }

        if (threeCount == 3) {
            return true;
        }

        return false;

    }

    public static String[] fizzArray2(int n) {
        if (n == 0) {
            return new String[0];
        }
        
        String[] newArray = new String[n];
        
        for (int i = 0; i < n; i++) {
            newArray[i] = String.valueOf(i);
        }
        
        return newArray;
    }

    public static int[] zeroFront(int[] nums) {
        if (nums.length < 1) {
            return new int[0];
        } //it didn't say to mention this exception but whatever (maybe)
        
        int[] newArray = new int[nums.length];
        int newArrayIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                newArray[newArrayIndex] = nums[i];
                newArrayIndex--;
            }
        }

        return newArray;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int targetCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                targetCount++;
            }
        }
        String[] newArray = new String[words.length - targetCount];
        int newArrayIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] != target) {
                newArray[newArrayIndex] = words[i];
                newArrayIndex++;
            }
        }
        return newArray;
    }

    public static int scoresAverage(int[] scores) {
        int firstHalfAverage = average(scores, 0, scores.length / 2);
        int secondHalfAverage = average(scores, scores.length / 2, scores.length);
        if (firstHalfAverage > secondHalfAverage) {
            return firstHalfAverage;
        }
        return secondHalfAverage;
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return (int) sum / (end - start);
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        return findLargestSpecial(a) + findLargestSpecial(b);
    }

    public static int findLargestSpecial(int[] scores) { // JDSADUIHBAJKNWSHUIDJN
        int currentLargest = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > currentLargest && scores[i] % 10 == 0) {
                currentLargest = scores[i];
            }
        }
        return currentLargest;
    }

    public static String firstTwo(String str) {
        if (str.equals("")) {
            return "**";
        } else if (str.length() == 1) {
            return str + "*";
        }
        // i know im being lazy but I can't immediately think of a more logical solution
        
        String newString = "";
        for (int i = 0; i < 2; i++) {
            newString += str.charAt(i);
        }
        return newString;
    }

    public static double divide(int a, int b) {
        if ((a == 0 && b > a) || (b == 0 && a > b)) {
            return 0;
        }
        
        if (a > b) {
            return (double) a / b;
        }
        return (double) b / a;
    }
}
