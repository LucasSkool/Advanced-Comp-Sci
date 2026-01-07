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
                throw new ArithmeticException("There are no actual Strings, all indexes are null");
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

    //task 6
    public static int calculateSumOfSquares(int[] numbers) {
        
        int sum = 0;
        
        try {
            for (int i = 0; i < numbers.length; i++) {
                sum += Math.pow(numbers[i], 2);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new IllegalArgumentException("The array is null");
        }
        return sum;

        // I made for loop starting number 0 b/c it's used as an index, and added an
        // exception catcher
    }

    //task 7
    public static int getNthFibonacci(int n) {
        if (n == 1) {
            return n;
        } //changed this to only n == 1

        if (n < 1) {
            throw new IllegalArgumentException("BAD INPUT");
        } //added negative/0 input exception

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    //task 8
    public static void sortArrayDecending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }     //I didn't change anything and it seems to work thank god
    }

    //task 9
    public static String findLongestWord(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("the String is null");
        } //added null String exception
        
        
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    //task 10
    public static double calculateInterest(double principal, double rate, int years) {
        if (principal <= 0) {
            throw new IllegalArgumentException("Cannot have a principal of 0 or less");
        }

        if (rate < 0) {
            throw new IllegalArgumentException("You probably don't want a negative rate");
        }

        if (years < 0) {
            throw new IllegalArgumentException("Time only goes one way (years cannot be negative");
        }

        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
        //added exceptions for illegal numbers for the 3 input variables
    }

}
