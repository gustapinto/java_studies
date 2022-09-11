/* Java é uma linguagem de programação orientada a objetos, então sempre
 * teremos uma classe no "top-level" de um arquivo, com o nome do arquivo
 * devendo conhecidir com o nome da classe, em Java classes podem ser declaradas
 * com vários níveis de visibilidade:
 *
 * - default (sem keyword): a classe pode ser chamada e instanciada apenas
 *                          por classes dentro do mesmo pacote
 * - public: a classe pode ser chamada e instanciada a partir de qualquer
 *           outra classe e pacote
 * - protected: a classe pode ser chamada e instanciada apenas dentro do mesmo
 *              pacote ou em outros pacotes a partir de heranças
 * - private: a classe pode ser acessada apenas dentro dela mesma
 *
 * Esses modificadores de acesso (visibilidade) são válidos para classes, métodos
 * propriedades e construtores
 */
public class HelloWorld {

    /* O método main(String[] args) atua como método de entrada para um
     * programa java
    */
    public static void main(String[] args) {
        // Usa a classe System da std lib para exibir uma mensagem no terminal
        System.out.println("Hello world!");
    }

}
