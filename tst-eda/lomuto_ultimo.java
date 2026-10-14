import java.util.*;

public class lomuto_ultimo {
    private static void swap(int[] v, int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
        System.out.println(Arrays.toString(v));
    }

    private static void partitionLomutoUltimo(int[] v, int left, int right) {
        int pivot = v[right];
        int i = right;
        for (int j = right - 1; j >= 0; j--){
            if (v[j] > pivot){
            i--;
            swap(v, i, j);
            }
        }
        swap(v, i, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] linha = sc.nextLine().split(" ");
        int[] nums = Arrays.stream(linha).mapToInt(Integer::parseInt).toArray();

        partitionLomutoUltimo(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
