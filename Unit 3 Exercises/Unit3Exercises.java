public class Unit3Exercises {
    public static double calculateAverageStringLength(String[] strs) {
        try {
            int sum = 0;
            int nullCount = 0;
            for (int i = 0; i < strs.length; i++) {
                try {
                    sum += strs[i].length();
                } catch (Exception e) {
                    System.out.println("This string is null");
                    nullCount++;
                }
            }
            
            
            if (strs.length - nullCount == 0) {
                throw new ArithmeticException("Something went wrong");
            } else {
                return sum / (strs.length - nullCount);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
   
    }

    public static String reverseString(String str) {
        String reversed = "";
        
        try {

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

        } catch (Exception e) {
            System.out.println("String is likely null");
        }
        
        return reversed;
    }

    public static int findMaxValue(int [] numbers) {
        int max = 0;

        try {
            max = numbers[0];
            if (numbers.length > 1) {
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Integer array is likely null / empty.");
        }
        
        return max;

        //It returns momentary max, but I don't know how to just return nothing
    }

    public static boolean isPalindrome(String str) {
        String reversedString = Unit3Exercises.reverseString(str);
        //exception already handled in reverseString method

        try {
            if (str.toLowerCase().equals(reversedString.toLowerCase()) && str.length() != 0) {
                return true;
            } //last part of if statement assumes an empty string is not a palindrome, but idk
        } catch (Exception e) {
            System.out.println("Something went wrong:");
            System.out.println(e.getMessage());
        }

        return false;
    }

    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        try {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) { //if number is even
                    sum += numbers[i];
                }
            }
        } catch (Exception e) {
            System.out.println("integer array is likely null");
        }

        return sum;
    }


}
