import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    @Test
    public void verificaSeSomaDoisNumeros(){
      int valorMetodo =  calc.somarDoisNumeros(2,4);
       assertEquals(6,valorMetodo);
    }
    @Test
    public void verificaSeSubtraiDoisNumeros(){
        int valorMetodo =  calc.subtrairDoisNumeros(5,4);
        assertEquals(1,valorMetodo);
    }
    @Test
    public void verificaSeMultiplicacaoDoisNumeros(){
        int valorMetodo =  calc.multiplicarDoisNumeros(5,4);
        assertEquals(20,valorMetodo);
    }
    @Test
    public void verificaSeDivideDoisNumeros(){
        int valorMetodo =  calc.dividirDoisNumeros(21,7);
        assertEquals(3,valorMetodo);
    }

}
