package fundamentals.generics;

/** Tipos genéricos
 *
 * Java oferece suporte a tipos genéricos, que nada mais são do que uma
 * definição de um tipo personalizado que que pode suportar multiplos
 * tipos e classes, com esses tipos podendo ser usados tanto em
 * classes quanto em métodos
*/
public class Generics<T> { // Classe com tipo genérico

    private T foo;  // Usando o tipo genérico da classe como tipo de suas propriedades

    // Usando o tipo genérico da classe como argumento do método
    Generics(T foo) {
        this.foo = foo;
    }

    // Usando o tipo genérico da classe como retorno do método
    public T getFoo() {
        return this.foo;
    }

    // Usando tipos genéricos em métodos
    public <U> void show(U element) {
        System.out.println(element);
    }

}