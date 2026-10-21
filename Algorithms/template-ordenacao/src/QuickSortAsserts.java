public class QuickSortAsserts {
    public void sort() {
        QuickSort sorting = new QuickSort();
        int[] v;

        // já ordenado
        v = new int[]{1, 2, 3, 4, 5};
        sorting.sort(v, 0, v.length-1);
        assert java.util.Arrays.equals(v, new int[]{1, 2, 3, 4, 5});

        // limite final
        v = new int[]{1, 2, 3, 4, 5, -1};
        sorting.sort(v, 0, v.length-1);
        assert java.util.Arrays.equals(v, new int[]{-1, 1, 2, 3, 4, 5});

        // limite inicial
        v = new int[]{10, 1, 2, 3, 4, 5};
        sorting.sort(v, 0, v.length-1);
        assert java.util.Arrays.equals(v, new int[]{1, 2, 3, 4, 5, 10});

        // limite final, meio
        v = new int[]{10, 20, 30, 40, 50, 15};
        sorting.sort(v, 0, v.length-1);
        assert java.util.Arrays.equals(v, new int[]{10, 15, 20, 30, 40, 50});

        // limite inicio, meio
        v = new int[]{45, 10, 20, 30, 40, 50};
        sorting.sort(v, 0, v.length-1);
        assert java.util.Arrays.equals(v, new int[]{10, 20, 30, 40, 45, 50});

        // reverso
        v = new int[]{5, 4, 3, 2, 1};
        sorting.sort(v, 0, v.length-1);
        assert java.util.Arrays.equals(v, new int[]{1, 2, 3, 4, 5});

        // um elemento
        v = new int[]{5};
        sorting.sort(v, 0, v.length-1);
        assert java.util.Arrays.equals(v, new int[]{5});

        v = new int[]{5, 1, 25, 2, -9, 10};
        sorting.sort(v, 0, v.length-1);
        assert java.util.Arrays.equals(v, new int[]{-9, 1, 2, 5, 10, 25});
    }

    public static void main(String[] args) {
        new QuickSortAsserts().sort();
    }
}
