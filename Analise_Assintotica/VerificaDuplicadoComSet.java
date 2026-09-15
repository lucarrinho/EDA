import java.util.*;

class VerificaDuplicadoComSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] elems = sc.nextLine().split(" ");
        System.out.println(temDuplicado(elems));
    }

    public static boolean temDuplicado(String[] elems){
        Set<String> elem = new HashSet<>();
        for (String e: elems){
            elem.add(e);
        }
        if (elems.length != elem.size()) return true;
        return false;
    }
}