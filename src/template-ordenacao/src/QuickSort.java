import java.util.Arrays;

public class QuickSort {
    private void pivotMediana(int[] v, int left, int right){
        int middle = (left + right) / 2;
        int[] elem = {v[left], v[middle], v[right]};
        Arrays.sort(elem);
        int index_pivot = middle;
        if (elem[1] == v[left]) index_pivot = left;
        if (elem[1] == v[right]) index_pivot = right;
        swap(v, index_pivot, left);
    }

    private void swap(int[] v, int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public int partitionLomuto(int[] v, int left, int right) {
        pivotMediana(v, left, right);

        int pivot = v[left];
        int i = left;
        for (int j = left + 1; j <= right; j++){
            if (v[j] <= pivot){
                i++;
                swap(v, i, j);
            }
        }
        swap(v, i, left);
        return i;
    }

    public int partitionHoare(int[] v, int left, int right){
        pivotMediana(v, left, right);

        int i = left + 1;
        int j = right;
        int pivot = v[left];
        while (i <= j){
            while (i <= j && v[i] <= pivot)
                i++;
            while(i <= j && v[j] > pivot)
                j--;
            
            if (i < j) swap(v, i, j);
        }
        swap(v, left, j);
        return j;
    }

    public void sort(int[] v, int left, int right) {
        if (left < right){
            //int index_pivot = partitionLomuto(v, left, right);
            int index_pivot = partitionHoare(v, left, right);
            sort(v, left, index_pivot-1);
            sort(v, index_pivot+1, right);
        }
    }
}
