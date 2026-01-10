public class Unit3Exercises {
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;
        while (i < strs.length) {

            if (strs[i] != null) {
                sum += strs[i].length();
                counted++;
            }

            i++;
        }

        return sum / counted;
        //didn't really change anything I don't think...
    }

    public static String reverseString(String str) {
        
        if (str == null) {
            throw new IllegalArgumentException("String is null");
        }
        
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
        }
        
        return reversed;
        // if statement for null Strings, and rewrote the whole code because the
        // given code seemed too inefficient
    }

    public static int findMaxValue(int [] numbers) {
        int max = 0;

        if (numbers == null || numbers.length < 1) {
            throw new IllegalArgumentException("integer array is null / empty");
        }

        max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;

        //I kinda just rewrote the code because the code just seems excessive.
        // added an if statement for a null or empty array, which is dealt with
        // with try-catch blocks in tester
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String is null");
        }
        
        String reversedString = Unit3Exercises.reverseString(str);

        if (str.toLowerCase().equals(reversedString.toLowerCase()) && str.length() != 0) {
            return true;
        } //last part of if statement assumes an empty string is not a palindrome, but idk

        return false;
        //I just rewrote the entire code using the reverse method we wrote earlier
        // added an if statement for the edge case of if the String is null
    }

    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;

        if (numbers == null || numbers.length < 1) {
            throw new IllegalArgumentException("int array is either null or empty");
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { //if number is even
                sum += numbers[i];
            }
        }

        return sum;
        //rewrote the code again because I did not understand the else statements
        //is it supposed to be confusing???
        //why would the result be the length if sum == 0???
        //I just didn't include that cuz it didn't make sense
        // added if statement for 2 edge cases
    }


    //task 6
    public static int calculateSumOfSquares(int[] numbers) {
        
        if (numbers == null || numbers.length < 1) {
            throw new IllegalArgumentException("integer array is either null or empty");
        } 

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;

        // all I did was add an if statement to throw an exception if the array
        // was empty or null
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


    //"try catch" blocks started being required in these ones in the instructions
    //task 11
    public static int parsePositiveInteger(String str) {
        
        int number = Integer.parseInt(str);
        
        //negative number exception
        try {
            if (number < 0) {
                
                throw new NumberFormatException("parsed number is negative");
            }
        } catch (Exception e) {
            return 1;
        }
        return number;
        //Just added an if statement if the number was negative to throw an exception
    }

    //task 12
    public static String getArrayElement(String[] arr,int index) {
        try { 
            return arr[index];
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        //As instructed, I put the original code in a try-catch and made the
        //method return null if it caught
    }

    //task 13
    public static double calculateSquareRoot(int number) {
        try {
            if (number < 0) {
                throw new IllegalArgumentException("cannot square root negative numbers");
            }
        } catch (Exception e) {
            return Double.NaN;
        }
        
        return Math.sqrt(number);
        //implemented the try-catch with an if statement to handle if
        //the number was negative, and added the Double.NaN as instructed
    }

    //task 14
    public static int sumArrayElements(int[] array) {
        try {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } catch (Exception e) {
            System.out.println("array was likely null");
            return 0;
        }
        //implemented try-catch as instructed, printed a message in catch,
        // and returned 0 if that exception happened
    }

    //task 15
    public static double calculatePower(double base, int exponent) {

        try {
            if (exponent < 0) {
                throw new IllegalArgumentException("apparently cannot have negative exponents..");
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 1.0;
        }
        
        return Math.pow(base, exponent);

        //implemented the try-catch blocks, added if statement in try block that
        //threw an expection if exponent was negative, returned 1 in the catch
        //block
    }
}
