import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

  @Test
  void testSumar() {
    Calculadora calc = new Calculadora();
    int resultado = calc.sumar(2, 3);
    assertEquals(5, resultado);
  }

  @Test
  void testMultiplicar() {
    Calculadora calc = new Calculadora();
    int resultado = calc.multiplicar(4, 5);
    assertEquals(20, resultado);
  }

  @Test
  void testDividir() {
    Calculadora calc = new Calculadora();
    int resultado = calc.dividir(10, 2);
    assertEquals(5, resultado);
  }

  @Test
  void testDividirPorCero() {
    Calculadora calc = new Calculadora();
    assertThrows(ArithmeticException.class, () -> {
      calc.dividir(10, 0);
    });
  }
}