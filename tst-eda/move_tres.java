import java.util.*;

public class move_tres {
    private static void solve(int[] seq){
        int j = 3;
        while (j > 0){
            for (int i = 0; i < seq.length-1; i++){
                if (seq[i] > seq[i+1]) insereOrdenado(seq, i+1);
            }
            j--;
        }
    }

    private static void insereOrdenado(int[] seq, int i){
        while(i > 0 && seq[i] < seq[i-1]){
            int aux = seq[i];
            seq[i] = seq[i-1];
            seq[i-1] = aux;
            i--;
            System.out.println(Arrays.toString(seq));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] linha = sc.nextLine().split(" ");
        int[] array = Arrays.stream(linha).mapToInt(Integer::parseInt).toArray();
        
        solve(array);
    }
}

