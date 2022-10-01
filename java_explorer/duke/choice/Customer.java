package java_explorer.duke.choice;

public class Customer {

    private String name;
    private String size;
    private Clothing[] items;

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
        switch (measure) {
            case 1: case 2: case 3:
                this.size = "S";
                break;
            case 4: case 5: case 6:
                this.size = "M";
                break;
            case 7: case 8: case 9:
                this.size = "L";
                break;
            default:
                this.size = "X";
                break;
        }
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
            if (item.fit(this)) {
                total += item.getPrice();
            }

            if (total > 15) {
                break;
            }
        }

        return total;
    }

}
