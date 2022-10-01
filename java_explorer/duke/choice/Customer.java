package java_explorer.duke.choice;

public class Customer {

    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name, int measure) {
        this.name = name;
        // Chama o setter dentro do contrutor para garantir que sua regra de
        // negócio seja seguida
        this.setSize(measure);
    }

    // Sobrecarrega o construtor para atuar tanto com ints quanto com Strings
    public Customer(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String newSize) {
        this.size = newSize;
    }

    // Sobrecarrega um método a partir da mudança dos seus argumentos
    public void setSize(int measure) {
        this.size = this.getSizeAsTextFromMeasure(measure);
    }

    public Clothing[] getItems() {
        return this.items;
    }

    public void setItems(Clothing[] newItems) {
        this.items = newItems;
    }

    public double getTotalClothingCost() {
        double total = 0.0;

        for (Clothing item : this.items) {
            // Apenas soma os itens que sirvam para o consumidor
            total += item.getPrice();
        }

        return total;
    }

    public String getSizeAsTextFromMeasure(int measure) {
        String sizeText = "";

        switch (measure) {
            case 1: case 2: case 3:
                sizeText = "S";
                break;
            case 4: case 5: case 6:
                sizeText = "M";
                break;
            case 7: case 8: case 9:
                sizeText = "L";
                break;
            default:
                sizeText = "X";
                break;
        }

        return sizeText;
    }

    public double getAverageClothingCost() throws ArithmeticException, NullPointerException {
        return this.getTotalClothingCost() / Double.valueOf(this.items.length);
    }

}
