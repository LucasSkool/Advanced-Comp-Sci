public class InventoryTester {
    public static void main(String[] args) {
        System.out.println("Inventory Tester");

        // Instantiating Inventory Objects
        Inventory item1 = new Inventory("Laptop", 10, 799.99);
        Inventory item2 = new Inventory("Desktop", 5, 999.99);
        Inventory item3 = new Inventory("Desktop", 5, 999.99);

        // Testing Getters
        System.out.println(
                "1. Item 1 Name: " + item1.getItemName() + testGetItemName(item1, "Laptop"));
        System.out
                .println("2. Item 2 Quantity: " + item2.getQuantity() + testGetQuantity(item2, 5));
        System.out.println("3. Item 1 Price: " + item1.getPrice() + testGetPrice(item1, 799.99));

        // Testing equals()
        System.out.println("4. Are Item 1 and 2 equal? "
                + (item1.equals(item2) ? "Yes... Fail!" : "No... Pass!"));
        System.out.println("5. Are Item 2 and 3 equal? "
                + (item2.equals(item3) ? "Yes... Pass!" : "No... Fail!"));

        // Testing toString()
        String outputMatcher = "Item: Desktop, Quantity: 5, Price: $999.99";
        System.out.println("6. Did I match the string exactly? "
                + (item2.toString().equals(outputMatcher) ? "Yes... Pass!" : "No... Fail!"));

        System.out.println();
        System.out.println("To String Method: ");
        System.out.println(item2.toString());
        System.out.println();

        // Test other methods here
        System.out.println(
                "7. (Optional) Create a test case for any other methods in the class that you have written.");

    }

    public static String testGetItemName(Inventory item, String name) {
        return item.getItemName().equals(name) ? "... Pass!" : "... Fail!";
    }

    public static String testGetQuantity(Inventory item, int quantity) {
        return item.getQuantity() == quantity ? "... Pass!" : "... Fail!";
    }

    public static String testGetPrice(Inventory item, double price) {
        return item.getPrice() == price ? "... Pass!" : "... Fail!";
    }
}
