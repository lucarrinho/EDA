public class CountingSort {
    public int[] sort(int[] v, int k){ //sequencia de 1 a k
        int[] count = new int[k];
        for (int i = 0; i < v.length; i++){
            count[v[i]-1] += 1;
        }
        for (int i = 1; i < k; i++){
            count[i] += count[i-1];
        }
        int[] novo = new int[v.length];
        for (int i = v.length-1; i >= 0; i--){
            novo[count[v[i]-1]-1] = v[i];
            count[v[i]-1] -= 1;
        }
        return novo;
    }

    public int[] sort(int[] v, int k, int menor){
        //sequencia de um valor minimo qualquer a k (0 a k-menor)
        int[] count = new int[k-menor+1];
        for (int i = 0; i < v.length; i++){
            count[v[i]-menor] += 1;
        }
        for (int i = 1; i < k-menor+1; i++){
            count[i] += count[i-1];
        }
        int[] novo = new int[v.length];
        for (int i = v.length-1; i >= 0; i--){
            novo[count[v[i]-menor]-1] = v[i];
            count[v[i]-menor] -= 1;
        }
        return novo;
    }
}
