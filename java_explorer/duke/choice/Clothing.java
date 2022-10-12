package java_explorer.duke.choice;

// Implementa a interface Comparable<Object> da std lib, essa interface rege como
// um array do tipo <Clothing>[] será ordenado
public class Clothing implements Comparable<Clothing> {

    private String description;
    private double price;
    private String size = "M";

    public static final double MINIMUM_VALUE = 10.0;
    public static final double TAX_RATE = 0.2;

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
        return this.price * (1 + Clothing.TAX_RATE);
    }

    public void setPrice(double newPrice) {
        this.price = (newPrice < Clothing.MINIMUM_VALUE) ? Clothing.MINIMUM_VALUE : newPrice;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String newSize) {
        this.size = newSize;
    }

    @Override
    public String toString() {
        // Sobreescreve o método <Object>.toString para exibir uma formatação
        // específica quando o objeto for convertido para String ex: em um print
        return this.asCommaDelimitedText();
    }

    @Override
    public int compareTo(Clothing c) {
        // Implementa o método <Object>.compareTo(<Object>) da interface
        // Comparable<Object>
        return this.description.compareTo(c.description);
    }

    public String asCommaDelimitedText() {
        return this.getDescription() + ", " + this.getPrice() + ", " + this.getSize();
    }

    public boolean fit(Customer costumer) {
        // <String>.equalsIgnoreCase(<String>) compara duas Strings ignorando
        // a caixa de suas letras
        return this.size.equalsIgnoreCase(costumer.getSize());
    }

}
