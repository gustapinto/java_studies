package java_explorer.duke.choice;

public class ShopApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop");

        /* a keyword var pode ser usada para definir uma variável com inferência
         * de tipo, ela pode e dever ser usada quando o tipo da variável for
         * explicito, ex: quando estamos instanciado um novo objeto
        */
        var c1 = new Costumer();
        c1.setName("Pinky");
        c1.setSize(3);

        System.out.println("Costumer is " + c1.getName());

        var item1 = new Clothing();
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);

        var item2 = new Clothing();
        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        var item3 = new Clothing();
        item3.setDescription("Green Scarf");
        item3.setPrice(5);
        item3.setSize("S");

        var item4 = new Clothing();
        item4.setDescription("Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize("S");

        Clothing[] items = {
            item1,
            item2,
            item3,
            item4,
        };

        c1.setItems(items);

        for (Clothing item : c1.getItems()) {
            System.out.println("Item," + item.asCommaDelimitedText());
        }


        System.out.println("Total: " + c1.getTotalClothingCost());
    }

}
