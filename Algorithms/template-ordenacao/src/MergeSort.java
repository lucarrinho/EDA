public class MergeSort {
    public void merge(int[] v, int left, int right){
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
            if (helper[i] <= helper[j]){
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

    public void sort(int[] v, int left, int right){
        if (left < right) {
            int middle = (left + right) / 2;
            sort(v, left, middle);
            sort(v, middle+1, right);

            merge(v, left, right);
        }
    }
}
