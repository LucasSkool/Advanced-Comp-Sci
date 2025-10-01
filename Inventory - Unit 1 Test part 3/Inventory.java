public class Inventory {
    private String itemName;
    private int quantity;
    private int price;

    public Inventory(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = (int) price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = (int) price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return ("Item: " + itemName + ", Quantity: " + quantity + ", Price: $" + price);
    }

    public boolean equals(Inventory other) {
        return (this.itemName.equals(other.getItemName())
            && this.quantity == other.getQuantity()
            && this.price == other.getPrice());
    }

    public void raisePrice(double percentage) {
        double newPrice;
        newPrice = (double) price * (1 + (percentage * 0.1));
        price = (int) newPrice;
    }

}
