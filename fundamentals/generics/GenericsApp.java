package fundamentals.generics;

import fundamentals.generics.boilerplate.FooPrinter;

public class GenericsApp {

    public static void main(String[] args) {
        // Implementando um objeto usando uma classe com tipos genéricos
        Generics<String> generics = new Generics<String>("Foo");
        String foo = generics.getFoo();

        // Chamando um método genérico, diferente de classes não é preciso
        // declarar qual tipo genérico o método está usando
        generics.show(foo);

        // Implementando um objeto que utiliza tipos genéricos restritos usando
        // um tipo válido
        FooPrinter printer = new FooPrinter();
        var restricted = new RestrictedGenerics<FooPrinter>(printer);

        restricted.getPrinter().print();

        // E usando um tipo inválido (obs: descomente para ver o resultado)
        // RestrictedGenerics<int, String> restricted = new RestrictedGenerics<int, String>(123456);
    }

}