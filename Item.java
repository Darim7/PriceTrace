import java.io.Serializable;
import java.util.ArrayList;

public class Item implements Serializable {
    private String name;
    private double price;
    private ArrayList<PurchaseSite> places;

    public Item(String name) {
        this.name = name;
        this.price = -1;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}