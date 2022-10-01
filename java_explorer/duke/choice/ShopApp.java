package java_explorer.duke.choice;

public class ShopApp {

    public static void main(String[] args) {
        final double TAX = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        /* a keyword var pode ser usada para definir uma variável com inferência
         * de tipo, ela pode e dever ser usada quando o tipo da variável for
         * explicito, ex: quando estamos instanciado um novo objeto
        */
        var c1 = new Costumer();
        c1.name = "Pinky";

        System.out.println("Costumer is " + c1.name);

        var item1 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;

        var item2 = new Clothing();
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        System.out.println("Item 1," + item1.asCommaDelimitedText());
        System.out.println("Item 2," + item2.asCommaDelimitedText());

        total += (2 * item2.price + item1.price) * (1 + TAX);

        System.out.println("Total: " + total);
    }

}
