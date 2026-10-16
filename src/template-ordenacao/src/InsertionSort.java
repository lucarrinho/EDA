public class InsertionSort implements SortingStrategy {
    /**
    * Importante: seu algoritmo deve ser O(n).
    */
    public void insereUltimoOrdenado(int[] v) {
        int i = v.length - 1;
        while (i > 0 && v[i] < v[i-1]) {
        	int temp = v[i-1];
        	v[i-1] = v[i];
        	v[i] = temp;
        	i--;
        }
    }
   
    /**
    * Importante: seu algoritmo deve ser O(n);
    */
    public void inserePrimeiroOrdenado(int[] v) {
        int i = 0;
        while (i < v.length - 1 && v[i] > v[i+1]) {
        	int temp = v[i+1];
        	v[i+1] = v[i];
        	v[i] = temp;
        	i++;
        }
    }

    public void sort(int[] v) {
        for (int j = 1; j < v.length; j++) {
        	int i = j;
        	while (i > 0 && v[i] < v[i-1]) {
            	int temp = v[i-1];
            	v[i-1] = v[i];
            	v[i] = temp;
            	i--;
            }
        }
    }

    public void sortRecursivo(int[] v, int i) {
    	if (i >= v.length) return;
    	
    	while (i > 0 && v[i] < v[i-1]) {
        	int temp = v[i-1];
        	v[i-1] = v[i];
        	v[i] = temp;
        	i--;
        }
    	
    	sortRecursivo(v, i+1);
    }  

}