
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(5,5);
        Assertions.assertEquals(10,resultado,"La suma debe ser 10");
    }
    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.restar(10,5);
        Assertions.assertEquals(5,resultado,"La resta debe ser 5");
    }
    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(-5,-5);
        Assertions.assertEquals(25,resultado,"La multiplicación debe ser 25");
    }
    @Test
    public void testDividirPorCero() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(5,0);
        Assertions.assertEquals(0,resultado,"No se puede divir por cero");
    }
    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(10,2);
        Assertions.assertEquals(5,resultado,"El resultado debe ser 5");
    }
}