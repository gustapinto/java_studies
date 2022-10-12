package java_explorer.duke.choice;

import java.net.InetSocketAddress;
import java.util.Arrays;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

public class ShopApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop");
        System.out.println("Minimum price: " + Clothing.MINIMUM_VALUE);
        System.out.println();

        /* a keyword var pode ser usada para definir uma variável com inferência
         * de tipo, ela pode e dever ser usada quando o tipo da variável for
         * explicito, ex: quando estamos instanciado um novo objeto
        */
        var c1 = new Customer("Pinky", 3);
        var c2 = new Customer("Duke", 9);

        System.out.println("Costumer is " + c1.getName());

        Clothing[] items = {
            new Clothing("Blue Jacket", 20.9),
            new Clothing("Orange T-Shirt", 10.5, "S"),
            new Clothing("Green Scarf", 5, "S"),
            new Clothing("Blue T-Shirt", 10.5, "S"),
        };

        c1.setItems(items);

        Arrays.sort(c1.getItems());

        try {
            ItemList list = new ItemList(c1.getItems());

            Routing router = Routing.builder()
                .get("/items", list)
                .build();
            InetSocketAddress socket = new InetSocketAddress(0);
            ServerConfiguration config = ServerConfiguration.builder()
                .bindAddress(socket.getAddress())
                .port(8888)
                .build();
            WebServer server = WebServer.create(config, router);

            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Clothing item : c1.getItems()) {
            System.out.println("Item, " + item);
        }

        System.out.println();
        System.out.println("Total price: " + c1.getTotalClothingCost());

        try {
            System.out.println("Average price: " + c2.getAverageClothingCost());
        } catch(ArithmeticException | NullPointerException e) {
            System.out.println("Customer c2 dont have any items");
        }
    }

}
