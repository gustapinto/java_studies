package java_explorer.duke.choice;

public class ShopApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop");

        /* a keyword var pode ser usada para definir uma variável com inferência
         * de tipo, ela pode e dever ser usada quando o tipo da variável for
         * explicito, ex: quando estamos instanciado um novo objeto
        */
        var c1 = new Customer("Pinky", 3);

        System.out.println("Costumer is " + c1.getName());

        Clothing[] items = {
            new Clothing("Blue Jacket", 20.9),
            new Clothing("Orange T-Shirt", 10.5, "S"),
            new Clothing("Green Scarf", 5, "S"),
            new Clothing("Blue T-Shirt", 10.5, "S"),
        };

        c1.setItems(items);

        for (Clothing item : c1.getItems()) {
            System.out.println("Item," + item.asCommaDelimitedText());
        }


        System.out.println("Total: " + c1.getTotalClothingCost());
    }

}
