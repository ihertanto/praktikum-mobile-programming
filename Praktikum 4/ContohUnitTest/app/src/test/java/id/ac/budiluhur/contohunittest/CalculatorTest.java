package id.ac.budiluhur.contohunittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void tambah_benar() {
        int angka1 = 10;
        int angka2 = 20;
        assertEquals(angka1 + angka2, Calculator.tambah(angka1, angka2));
    }
}
