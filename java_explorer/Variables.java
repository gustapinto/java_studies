package java_explorer;

/* Variáveis referem-se a valores que podem mudar, em Java variáveis podem ser
 * declaradas com ou sem um valor padrão, também sendo fortemente tipadas
 *
 * Em java existem algumas convenções para nomear variáveis:
 * - usar camelCase
 * - nomes não podem ser palavras chave da linguagem (if, for, etc...)
 * - nomes não podem começar com _ e números
 * - nomes não podem incluir espaços em branco
 *
 * Em Java també podemos declarar constantes usando a keyword final, constantes
 * são valores que não devem mudar ao decorrer do programa
 *
 * Convenções de nomes para constantes
 * - usar snake_case
 * - usar apenas letras maiúsculas
*/
public class Variables {

    public static void main(String[] args) {
        /* Declarando uma variável sem um valor padrão (não inicializada)
         *
         * Quando uma variável não é inicializada ela ainda possui uma valor padrão,
         * que dependede do tipo da variável, os principais são:
         * - String e classes -> null
         * - int -> 0
         * - float/double -> 0.0
         * - boolean -> false
        */
        String firstName;

        // Inicializando a variável definindo um valor para a mesma
        firstName = "Gary";

        // Declarando e inicializando uma variável passando um valor padrão
        String lastName = "Mary";

        System.out.println(firstName + " " + lastName);

        // Declarando uma constante
        final int NUMBER_OF_MONTHS = 12;

        System.out.println(NUMBER_OF_MONTHS);
    }

}
