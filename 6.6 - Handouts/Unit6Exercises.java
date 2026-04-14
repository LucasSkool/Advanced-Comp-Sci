public class Unit6Exercises {

    /**
     * Problem 1 - Factorial: Write a recursive and non-recursive method that returns the factorial
     * of a given number n.
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Tried to factorial a negative number");
        }

        if (n == 0) { return 1; }
        
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }

        return result;
    }

    public static int factorialRecursive(int n) {
        if (n == 1) {
            return n;
        }
        if (n == 0) {
            return 1;
        }
        return factorialRecursive(n - 1) * n;
    }

    /**
     * Problem 2 - Fibonacci Sequence: Write a recursive and non-recursive method that returns the
     * nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int tempPrev = 0;
        int tempCurr = 1;
        
        for (int i = 2; i <= n; i++) {
            int tempTempPrev = tempPrev;
            tempPrev = tempCurr;
            tempCurr = tempTempPrev + tempCurr;

        }

        return tempCurr;
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
    }

    /**
     * Problem 3 - Sum of Digits: Write a recursive and non-recursive method that returns the sum of
     * the digits of a given integer.
     */
    public static int sumDigits(int n) {
        int sum = 0;
        boolean noMoreDigits = false;
        while (!noMoreDigits) {
            sum += n % 10;
            n /= 10;

            if (n == 0) {
                noMoreDigits = true;
            }
        }
        return sum;
    }

    public static int sumDigitsRecursive(int n) {
        if (n == 0) {
            return n;
        }
        return sumDigitsRecursive(n / 10) + (n % 10);
    }

    /**
     * Problem 4 - Count X: Write a recursive and non-recursive method that returns the count of
     * occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'x') {
                count++;
            }
        }
        return count;
    }

    public static int countXRecursive(String str) {
        if (str.equals("")) {
            return 0;
        }

        int num = 0;
        if (Character.toLowerCase(str.charAt(0)) == 'x') {
            num = 1;
        }
        return countXRecursive(str.substring(1)) + num;
    }

    /**
     * Problem 5 - Reverse String: Write a recursive and non-recursive method that returns the
     * reverse of a given string.
     */
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String reverseStringRecursive(String str) {
        if (str.equals("")) {
            return "";
        }
        return str.substring(str.length() - 1) + reverseStringRecursive(str.substring(0, str.length() - 1));
    }

    /**
     * Problem 6 - Power of a Number: Write a recursive and non-recursive method that calculates and
     * returns the value of base raised to the power of exponent.
     */
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int powerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * powerRecursive(base, exponent - 1);
    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive method that checks
     * whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {
        //return (str.equals(reverseString(str)));

        for (int i = 0; i < (str.length()) / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    } //is this cheating? I feel like I would just write the exact same method for reverseString()...
      //I guess in retrospect, you may have wanted me to code a for loop that did a similar thing as the
      //isPalindromeRecursive() method. 
      //Okay I went ahead and made it like that.

    public static boolean isPalindromeRecursive(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        } //the str substrings until it reaches this point

        if (str.charAt(0) != str.charAt(str.length() - 1)){ 
            return false;
        }

        return isPalindrome(str.substring(1, str.length() - 1));
    } //okay okay it basically just shrinks the string from left to right, constantly making sure the
      //characters it passes over are the same. Base case is just when there is nothing left to check,
      //and it accounts for both even and odd-lenghted strings.

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and non-recursive method that
     * finds and returns the greatest common divisor of two numbers.
     */
    public static int gcd(int a, int b) {
        for (int i = a; i > 0; i--) {
            
            if (((double) b / (double) i) % 1 == 0.0 && ((double) a / (double) i) % 1 == 0.0) {
                return i;
            }

        }
        for (int i = b; i > 0; i--) {
            
            if (((double) b / (double) i) % 1 == 0.0 && ((double) a / (double) i) % 1 == 0.0) {
                return i;
            }

        }
        return -1; //basically if something goes wrong

    }

    public static int gcdRecursive(int a, int b) { //go down a number, check each time if both are divisible
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
        
    } //this is so confusing

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1, 2, ... The odd
     * bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot. Recursively return the number of "ears" in the bunny
     * line 1, 2, ... n (without loops or multiplication).
     */

    public static int bunnyEars(int bunnies) {
        int sum = 0;
        for (int i = 1; i <= bunnies; i++) {
            if (i % 2 == 1) {
                sum += 2;
            } else {
                sum += 3;
            }
        }
        return sum;

    }

    public static int bunnyEarsRecursive(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        
        if (bunnies % 2 == 1) {
            return bunnyEarsRecursive(bunnies - 1) + 2;
        }
        return bunnyEarsRecursive(bunnies - 1) + 3;
    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method that implements the
     * binary search algorithm to find and return the index of a given element in a sorted array.
     */
    public static int binarySearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        if (high == low && arr[high] != key) {
            return -1;
        }

        if (arr[high] == key) {
            return high;
        }
        
        return binarySearchRecursiveHelper(arr, key, low, high - 1);
    } //dang I'm so good

     // DO NOT EDIT! Work on the helper version above this method. This method is to be used for testing purposes only.
     public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length-1); // Element not found
    }


}
