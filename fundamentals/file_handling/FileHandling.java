package fundamentals.file_handling;

import java.io.BufferedReader;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.temporal.TemporalField;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FileHandling {

    public static void main(String[] args) throws Exception {
        // Path.of(...) cria um objeto de Path que é utilizado para acessar
        // arquivos, podendo ser passado um caminho ou uma URI.
        var readmePath = Path.of("/java_studies/README.md");
        var readmePathWithURI = Path.of(new URI("file:///java_studies/README.md"));
        System.out.println(readmePath);
        System.out.println(readmePathWithURI);

        // Files.exists(...) verifica se o arquivo existe
        System.out.println(Files.exists(readmePath));

        // Files.getLastModifiedTime(...) obtém a data de modificação do arquivo
        System.out.println(Files.getLastModifiedTime(readmePath));

        // Files.getOwner(...) obtém o id do usuário "dono" do arquivos
        System.out.println(Files.getOwner(readmePath));

        // Files.createTempFile(...) cria um arquivo temporário no diretório padrão
        // de arquivos temperários
        Path tempFile = Files.createTempFile("tempFile", null);
        System.out.println(tempFile);

        // Files.writeString(...) escreve uma string em um arquivo, e é a forma
        // "moderna" de Files.write(...), que também possue a mesma funcionalidade
        //
        // StandardOpenOption.WRITE -> abre o arquivo para escrever desde o
        // começo, é a opção padrão dos métodos de Files.write(...)
        // StandardOpenOption.WRITE -> abre o arquivo para escrita, adicionando
        // linhas ao final
        Files.writeString(tempFile, "foo\n", StandardOpenOption.WRITE);
        Files.write(tempFile, "bar".getBytes(), StandardOpenOption.APPEND);

        // Files.readString(...) lê o conteúdo de um arquivo
        System.out.println(Files.readString(tempFile));

        // Files.newBufferedReader(...) permite a leitura de um arquivo usando
        // buffers e stream, otimizando a leitura de arquivos maiores
        try (BufferedReader reader = Files.newBufferedReader(tempFile)) {
            reader.lines().map(line -> line.toUpperCase()).forEach(line -> System.out.println(line));
        }
    }

}