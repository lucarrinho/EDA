package analise_assintotica;
import java.util.*;

class VerificaDuplicados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String[] elems = sc.nextLine().split(" ");
            System.out.println(temDuplicado(elems));
        }
    }

    public static boolean temDuplicado(String[] elems){
        for (int i = 0; i < elems.length; i++) {
            for (int j = 0; j < elems.length; j++) {
                if ((i != j) && (elems[i].equals(elems[j]))) {
                    return true;
                }
            }
        }
        return false;
    }
}