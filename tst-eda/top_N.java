import java.util.*;
public class top_N {
    private static void solve(int[] seq, int n){
        reverseSort(seq, 0, seq.length-1);
        String resp = "";
        for (int i = 0; i < n; i++){
            resp += seq[i] + " ";
        }
        System.out.println(resp.strip());
    }

    public static void merge(int[] v, int left, int right){
        int rightHelper = right - left;
        int[] helper = new int[rightHelper + 1];

        for (int i = 0; i <= rightHelper; i++){
            helper[i] = v[left+i];
        }
        int middleHelper = rightHelper / 2;
        int i = 0;
        int j = middleHelper + 1;
        int k = left;

        while (i <= middleHelper && j <= rightHelper){
            if (helper[i] >= helper[j]){
                v[k] = helper[i];
                i++;
            } else {
                v[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= middleHelper) {
            v[k] = helper[i];
            i++; k++;
        }
    }

    public static void reverseSort(int[] v, int left, int right){
        if (left < right) {
            int middle = (left + right) / 2;
            reverseSort(v, left, middle);
            reverseSort(v, middle+1, right);

            merge(v, left, right);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] linha = sc.nextLine().split(" ");
        int[] array = Arrays.stream(linha).mapToInt(Integer::parseInt).toArray();
        int n = sc.nextInt();

        solve(array, n);
    }
}
