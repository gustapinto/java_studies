package java_explorer.duke.choice;

public class Costumer {

    private String name;
    private String size;

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

}
