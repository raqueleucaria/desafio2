import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringA {

    /**
     * Verifica se a letra 'a' ou 'A' está presente em uma string.
     * @param texto A string onde será verificada a presença da letra.
     * @return true se a letra 'a' ou 'A' estiver presente, false caso contrário.
     */
    public static boolean verificaA(String texto) {
        Pattern pattern = Pattern.compile("[aA]");
        Matcher matcher = pattern.matcher(texto);
        return matcher.find();
    }

    /**
     * Conta a ocorrência de 'a' e 'A' em uma string usando expressões regulares.
     * @param texto A string onde será verificada a ocorrência.
     * @return O número de vezes que 'a' ou 'A' aparecem na string.
     */
    public static int contaA(String texto) {
        Pattern pattern = Pattern.compile("[aA]");
        Matcher matcher = pattern.matcher(texto);

        int contador = 0;
        while (matcher.find()) {
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        // Vetor de strings a ser processado
        String[] strings = {"oi", "TESTE", "Azul", "AabbA"};

        // Processar cada string no vetor
        for (String texto : strings) {
            if (verificaA(texto)) {
                int ocorrencias = contaA(texto);
                System.out.println(String.format("\"%s\": %d vezes", texto, ocorrencias));
            } else {
                System.out.println(String.format("\"%s\": Não possui", texto));
            }
        }
    }
}
