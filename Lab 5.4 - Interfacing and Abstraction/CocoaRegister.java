import java.util.ArrayList;

public class CocoaRegister {

    public static final double TAX_RATE = 0.0875;

    private ArrayList<Sellable> items;
    private ArrayList<Integer> quantities;

    public CocoaRegister() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Sellable item, int quantity) {
        if (item != null && quantity > 0) {
            items.add(item);
            quantities.add(quantity);
        }
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < items.size(); i++) {
            subtotal += (items.get(i)).getBasePrice() * (quantities.get(i));
        }
        return ChocolateBar.round2(subtotal);
    }

    public double getTax() {
        return ChocolateBar.round2(getSubtotal() * TAX_RATE);
    }

    public double getTotal() {
        return ChocolateBar.round2(getSubtotal() + getTax());
    }

    public void printReceipt() {
        System.out.println("== COCOA CORNER ==");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i+1) + ". " 
                + items.get(i).getName() 
                + " x" + quantities.get(i) + " @ $" 
                + ChocolateBar.money(items.get(i).getBasePrice()) + " = $" 
                + ChocolateBar.money(items.get(i).getBasePrice() * quantities.get(i)));
        }
        System.out.println("Subtotal: $" + ChocolateBar.money(getSubtotal()));
        System.out.println("Tax: $" + ChocolateBar.money(getTax()));
        System.out.println("Total: $" + ChocolateBar.money(getTotal()));
    }

}
