package java_explorer.duke.choice;

public class Clothing {

    public String description;
    public double price;
    public String size = "M";

    public String asCommaDelimitedText() {
        return this.description + "," + this.price + "," + this.size;
    }

}
