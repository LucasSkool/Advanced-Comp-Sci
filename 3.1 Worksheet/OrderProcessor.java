/*
My approach to decomposing the code:
For each value/variable that was needed to contruct an OrderSummary object,
I used a method to perform the necessary calculatons.
Whenever there was something inside a code that I could describe as a unique action,
I made a method for it. Then, I thought of what information the method needed to do
its thing, and also what it would ultimately return. If there were multiple things
I thought I needed to return from a single method, I just made a method for each
value since returning mutliple values in one method in java is not possible.
Finally, I just put all the methods into a reasonable order in the main method.
*/

public class OrderProcessor {
    //creating array for the expensive/premium items
    public static String[] identifyExpensiveItems(Item[] items) {
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;
        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();

            // Check if expensive
            if (price > 50.0) {
                expensiveItemsTemp[premiumCount] = name;
                premiumCount++;
                System.out.println(name + " is a premium item at $" + price);
            } else {
                System.out.println(name + " is a regular item at $" + price);
            }

        }

        String[] expensiveItems = trimStringArray(expensiveItemsTemp, premiumCount);

        return expensiveItems;
    }

    //a general method for trimming an array to a desired length - used in identifyExpensiveItems above
    public static String[] trimStringArray(String[] array, int length) {
        String[] newArray = new String[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // calculating the subtotal before taxes using items array
    public static double calculateSubtotal(Item[] items) {
        double subtotal = 0.0;
        for (Item item : items) {
            subtotal += item.getPrice() * (double) item.getQuantity();
        }
        return subtotal;
    }

    //calculating the total with tax - uses calculateTax method to add to subtotal
    public static double calculateTotal(double subtotal, double taxRate) {
        return subtotal + calculateTax(subtotal, taxRate);
    }

    //validating the subtotal so that it is not negative
    //this function was more or less present in the OG code
    public static double validateSubtotal(double subtotal) {
        if (subtotal > 0.0) {
            return subtotal;
        } else {
            return 0.0;
        }
    }

    //calculating the double value of the tax based off subtotal and taxRate
    public static double calculateTax(double subtotal, double taxRate) {
        return subtotal * taxRate;
    }

    //uses the expensiveItems array itself to count # of premium items
    //The expensiveItems array should have already been cut down to its length where
    // no index was null, but this (i guess) is a full-proof way
    public static int countPremiumItems(String[] expensiveItems) {
        int premiumCount = 0;
        for (String item : expensiveItems) { // the variable 'item' is the temporary variable here
            if (item != null) {
                premiumCount++;
            }
        }
        return premiumCount;
    }

    //prints all the order details
    public static void displayOrderDetails(double subtotal, double tax, double total, int premiumCount) {
        System.out.println("--- Order Details ---");
        System.out.println("Subtotal: $" + round2(subtotal));
        System.out.println("Tax: $" + round2(tax));
        System.out.println("Total: $" + round2(total));
        System.out.println("Number of premium items: " + premiumCount);
    }

    //main order method
    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {

        String[] expensiveItems = identifyExpensiveItems(items);
        int premiumCount = countPremiumItems(expensiveItems);
        double subtotal = validateSubtotal(calculateSubtotal(items));
        double tax = calculateTax(subtotal, taxRate);
        double total = calculateTotal(subtotal, taxRate);

        // print Output
        displayOrderDetails(subtotal, tax, total, premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);

    }

    //took this double decimal rounder from Decomposition Demo
    //I only use it in the display method,
    // since more decimals might be helpful for other calculations
    private static double round2(double x) {
        return Math.round(x * 100.0) / 100.0;
    }

}