public class RadixSort {
    public void sort(int[] seq){
        int maior = getMax(seq);
        int qtddDigit = ("" + maior).length();

        for (int iDigit = 1; iDigit <= qtddDigits; iDigit++){
            auxSort(seq, iDigit);
        }
    }
}
