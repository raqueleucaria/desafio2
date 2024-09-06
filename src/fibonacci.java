import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class fibonacci {

   /**
    * Gera a sequência de fibonacci até um certo limite e armazena em um HashSet.
    * @param limite O maior número de fibonacci que deve ser calculado.
    * @return Um HashSet contendo todos os números de fibonacci até o limite.
    */
   public static Set<Long> geraFibo(int limite) {
      Set<Long> fiboSet = new HashSet<>();
      long fiboAnterior = 0, fiboAtual = 1;
      fiboSet.add(fiboAnterior);
      fiboSet.add(fiboAtual);

      while (fiboAtual <= limite) {
         long proximoFibo = fiboAnterior + fiboAtual;
         fiboAnterior = fiboAtual;
         fiboAtual = proximoFibo;
         fiboSet.add(fiboAtual);
      }
      return fiboSet;
   }

   /**
    * Calcula o número de fibonacci para um dado n.
    * @param n O índice para o qual queremos calcular o fibonacci.
    * @return O valor de fibonacci no índice n.
    */
   public static long calcularfibonacci(int n) {
      if (n == 0) return 0;
      if (n == 1) return 1;

      long fiboAnterior = 0, fiboAtual = 1;
      for (int i = 2; i <= n; i++) {
         long proximoFibo = fiboAnterior + fiboAtual;
         fiboAnterior = fiboAtual;
         fiboAtual = proximoFibo;
      }
      return fiboAtual;
   }

   public static void main(String[] args) {
      int[] numeros = {1, 23, 50, 55, 8, 21};
      int maiorNumero = Arrays.stream(numeros).max().orElse(0);
      Set<Long> fiboSet = geraFibo(maiorNumero);

      for (int n : numeros) {
         if (n < 0) {
               System.out.println("(" + n + "): Número inválido");
         } else if (fiboSet.contains((long) n)) {
               long fibonacciValor = calcularfibonacci(n);
               System.out.println("(" + n + "): " + fibonacciValor);
         } else {
               System.out.println("(" + n + "): Não pertence à sequência de fibonacci");
         }
      }
   }
}
