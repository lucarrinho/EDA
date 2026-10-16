import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComparacaoBuscaTest {
    
    private static ComparacaoBusca comp = new ComparacaoBusca();
    private static int[] v = new int[] {1, 4, 5, 6, 7, 8, 23, 45, 67, 89};

    @Test
    public void testLimitesIterativa() {
        assertEquals(0, comp.buscaBinariaIterativa(v,1));
        assertEquals(v.length - 1, comp.buscaBinariaIterativa(v,89));
    }

    @Test
    public void testLimitesIterativaNaoEncontrou() {
        assertEquals(-1, comp.buscaBinariaIterativa(v,-9000));
        assertEquals(-1, comp.buscaBinariaIterativa(v,90000));
    }

    @Test
    public void testLimitesRecursiva() {
        assertEquals(0, comp.buscaBinariaRecursiva(v, 0, v.length - 1, 1));
        assertEquals(v.length - 1, comp.buscaBinariaRecursiva(v, 0, v.length - 1, 89));
    }


    @Test
    public void testLimitesRecursivaNaoEncontrou() {
        assertEquals(-1, comp.buscaBinariaRecursiva(v, 0, v.length - 1, -9000));
        assertEquals(-1, comp.buscaBinariaRecursiva(v, 0, v.length - 1, 90000));
    }

    // TODO: Escreva mais testes!
}
