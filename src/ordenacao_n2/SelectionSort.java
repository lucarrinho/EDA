package ordenacao_n2;

public class SelectionSort implements Sorting<T> {

    /**
    * Ordena um array de inteiros utilizando o selection sort.
    */
    public void sort(int[] v) {
        for (int i = 0; i < v.length - 1; i ++) {
        	int imenor = i;
        	for (int j = i + 1; j < v . length; j++) {
        		if (v[j] < v[imenor]) imenor = j;
        	}
        	int temp = v[i];
        	v[i] = v[imenor];
        	v[imenor] = temp;
        }
    }

    /**
    * Ordena um array de inteiros utilizando o selection sort de maneira recursiva.
    * Pense que selection sort são várias execuções da atividade de procurar 
    * o menor e colocá-lo em seu lugar. Use essa estratégia chamando recursivamente. 
    * Você não pode mudar a assinatura desse método, mas pode/deve criar outros
    * métodos para te auxiliar na recursão.
    */
    public void sortRecursivo(int[] v) {
        // TODO: implementar
    }
    
}
