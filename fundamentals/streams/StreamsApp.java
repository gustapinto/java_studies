import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Stream API
 *
 * A API de streams é utilizada para processar coleções de forma funcional,
 * criando uma pipeline de métodos que não modificam a coleção inicial, mas que
 * retornam uma nova coleção (ou valor) como resultado
 *
 * As operações da Stream aPI são divididas em dois grupos:
 * - Intermediárias: são as operações que retornam uma Stream e que podem ser
 *                   utilizadas na pipeline
 * - Finais: são as operações que retornam um valor final, sendo utilizadas para
 *           finalizar a pipeline e fechar a Stream
*/
public class StreamsApp {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 5, 2, 3);

        /* List<T>.stream() obtém uma Stream a partir da lista
         *
         * <Stream>.filter(<predicado>) retorna uma Stream com todos os elementos
         * da coleção cujo predicado seja verdadeiro
         *
         * <Stream>.collect(<collector>) retorna uma coleção montada a partir do
         * coletor passado
         */
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // <Stream>.sorted() retorna uma Stream com todos os elementos ordenados
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        // <Stream>.map(operacao) aplica uma operação em cada elemento da Stream,
        // retornando uma nova Stream com os resultados das operações
        List<Integer> doubledNumbers = numbers.stream()
                                              .map(n -> n * 2)
                                              .sorted() // Adicionando mais steps a pipeline
                                              .collect(Collectors.toList());
        System.out.println(doubledNumbers);

        // <Stream>.forEach(op) aplica uma operação em cada elemento da Stream,
        // não retornando nada
        numbers.stream().forEach(n -> System.out.println(n));

        // <Stream>.reduce(op) reduz os valores da Stream a um único valor,
        // normalmente numérico
        int sum = numbers.stream().reduce(0, (acc, n) -> acc + n);
        System.out.println(sum);
    }

}