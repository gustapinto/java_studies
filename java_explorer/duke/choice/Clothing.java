package java_explorer.duke.choice;

public class Clothing {

    private String description;
    private double price;
    private String size = "M";

    private final double MINIMUM_VALUE = 10.0;
    private final double TAX_RATE = 0.2;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public double getPrice() {
        return this.price * (1 + this.TAX_RATE);
    }

    public void setPrice(double newPrice) {
        this.price = (newPrice < this.MINIMUM_VALUE) ? this.MINIMUM_VALUE : newPrice;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String newSize) {
        this.size = newSize;
    }

    public String asCommaDelimitedText() {
        return this.description + "," + this.price + "," + this.size;
    }

    public boolean fit(Costumer costumer) {
        return this.size.equals(costumer.getSize());
    }

}
