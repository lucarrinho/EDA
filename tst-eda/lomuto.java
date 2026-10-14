import java.util.*;

public class lomuto {
    private static void swap(int[] v, int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
        System.out.println(Arrays.toString(v));
    }

    private static void partitionLomuto(int[] v, int left, int right) {
        int pivot = v[left];
        int i = left;
        for (int j = left + 1; j <= right; j++){
            if (v[j] < pivot){
            i++;
            swap(v, i, j);
            }
        }
        
        swap(v, i, left);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] linha = sc.nextLine().split(" ");
        int[] nums = Arrays.stream(linha).mapToInt(Integer::parseInt).toArray();

        partitionLomuto(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
