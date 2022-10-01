package java_explorer.duke.choice;

public class Clothing {

    private String description;
    private double price;
    private String size = "M";

    private final double MINIMUM_VALUE = 10.0;
    private final double TAX_RATE = 0.2;

    public Clothing(String description, double price) {
        /* Utiliza um padrão de sobrecarga de construtores onde os construtors
         * "incompletos" só podem utilizar a funçãO this(...), passando os
         * argumentos disponíveis e mantendo os demais como Zero-values (ex: null),
         * com o construtor "completo" lidando com a lógica de incialização da
         * classe, mantendo o código simples e sem repetições
         *
         * OBS: Esse padrão apenas se aplcia quando temos construtores com
         * diferentes números de argumentos, não funcionando quanto temos uma
         * sobrecarga de tipos de argumentos
        */
        this(description, price, null);

    }

    public Clothing(String description, double price, String size) {
        this.description = description;

        // Chama o setter dentro do contrutor para garantir que sua regra de
        // negócio seja seguida
        this.setPrice(price);

        if (size != null) {
            // Apenas altera o valor padrão caso o argumento não seja nulo
            this.size = size;
        }
    }

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

    public boolean fit(Customer costumer) {
        // <String>.equalsIgnoreCase(<String>) compara duas Strings ignorando
        // a caixa de suas letras
        return this.size.equalsIgnoreCase(costumer.getSize());
    }

}
