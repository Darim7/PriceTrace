public class Item {
    private String name;
    private double price;

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

    private int getOne() {return 1;}
}