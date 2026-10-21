import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ComparacaoBusca comparacao = new ComparacaoBusca();
        System.out.println("alg time sample");

        try {
            BufferedReader reader = new BufferedReader(
                                        new InputStreamReader(System.in));
            String line = "";
            while ((line = reader.readLine()) != null) {
                int[] entrada = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
                // executando 30x para tirar a mediana.
                
                long[] it = new long[30];
                long[] rec = new long[30];
                for (int i = 0; i < 30; i++) {
                    // medindo tempo iterativa
                    long start = System.nanoTime();
                    comparacao.buscaBinariaIterativa(entrada, -123456);
                    long end = System.nanoTime();
                    long time = end - start;
                    it[i] = time;
                    
                    // medindo tempo recursiva
                    start = System.nanoTime();
                    comparacao.buscaBinariaRecursiva(entrada, 0, entrada.length, -123456);
                    end = System.nanoTime();
                    time = end - start;
                    rec[i] = time;
                }

                Arrays.sort(it);
                System.out.println("iterativa " + (it[14]) + " " + entrada.length);
                Arrays.sort(rec);
                System.out.println("recursiva " + (rec[14]) + " " + entrada.length);

           }

       } catch (Exception e) {}
    }   
}
