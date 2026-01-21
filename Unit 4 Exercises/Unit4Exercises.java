import java.util.ArrayList;

public class Unit4Exercises {
    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        for (int i = 1; i <= n; i++, n--) {
            if (nums[i - 1] != nums[nums.length - n]) {
                return false;
            }
        }
        return true;
        //I know this one seems very strange because I had to go back because
        //I misunderstood the question but it works
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        //odd + even at same time
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i] % 2 == 1)  //odd
                || (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i] % 2 == 0)) {  //even
                return true;
            }
        }

        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int[] newArr = new int[end - start];
        for (int i = start; i < end; i++) {
            newArr[i - start] = i;
        }
        return newArr;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        String [] newArr = new String[end - start];
        for (int i = start; i < end; i++) {
            newArr[i - start] = String.valueOf(i);
        }

        for (int i = 0; i < newArr.length; i++) {
            if (Integer.parseInt(newArr[i]) % 3 == 0 && Integer.parseInt(newArr[i]) % 5 == 0) {
                newArr[i] = "FizzBuzz";
            } else if (Integer.parseInt(newArr[i]) % 3 == 0) {
                newArr[i] = "Fizz";
            } else if (Integer.parseInt(newArr[i]) % 5 == 0) {
                newArr[i] = "Buzz";
            }
            
        } //there's probably a more concise way but idk..
        return newArr;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] newArr = new int[nums.length];
        int newArrIndex = 0;
        for (int i = 0; i < nums.length; i++) {  //even
            if (nums[i] % 2 == 0) {
                newArr[newArrIndex] = nums[i];
                newArrIndex++;
            }
        }
        for (int i = 0; i < nums.length; i++) {  //and THEN odd
            if (nums[i] % 2 == 1) {
                newArr[newArrIndex] = nums[i];
                newArrIndex++;
            }
        }

        return newArr;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        ArrayList<Integer> newArrList = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= 0) {
                newArrList.add(nums.get(i));
            }
        }
        return newArrList;

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> newArrList = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 13 && nums.get(i) > 19) {
                newArrList.add(nums.get(i));
            }
        }
        return newArrList;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        ArrayList<String> newStrList = new ArrayList<String>();
        for (int i = 0; i < strs.size(); i++) {  //goes through input ArrayList
            if (Character.toLowerCase(strs.get(i).charAt(strs.get(i).length() - 1)) != 'y') {
                newStrList.add(strs.get(i) + "y");
            }
        }
        return newStrList;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, ((nums.get(i) * nums.get(i)) + 10));
            if (nums.get(i) % 10 == 5 || nums.get(i) % 10 == 6) {
                nums.remove(i);
            }
        }
        return nums;
    }

}
