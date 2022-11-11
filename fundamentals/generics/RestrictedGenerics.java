package fundamentals.generics;

import fundamentals.generics.boilerplate.Printer;

/** Tipos genéricos restritos
 *
 * Além dos tipos genéricos sem restrição (<T>) podemos também declarar tipos
 * genericos que devem implementar uma interface para serem válidos
 *
 * Sintaxe:
 * - T extends <Classe> -> O tipo deve implementar a interface <Classe>
*/
public class RestrictedGenerics<T extends Printer> {
    private T printer;

    RestrictedGenerics(T printer) {
        this.printer = printer;
    }

    public T getPrinter() {
        return this.printer;
    }

}