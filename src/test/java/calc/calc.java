package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calc {

    @Test
    public void 더하기_1() {
        int rs = Calculator.run("10 + 20");

        assertEquals(30, rs);
    }

    @Test
    public void 더하기_2() {
        int rs = Calculator.run("20 + 20");

        assertEquals(40, rs);
    }
    @Test
    public void 더하기_3() {
        int rs = Calculator.run("30 + 30");

        assertEquals(60, rs);
    }
    @Test
    public void 더하기_4() {
        int rs = Calculator.run("30 + 30 + 30");

        assertEquals(90, rs);
    }
    @Test
    public void 빼기() {
        int rs = Calculator.run("30 - 30");

        assertEquals(0, rs);
    }
    @Test
    public void 빼기_2() {
        int rs = Calculator.run("30 - 30 - 30");

        assertEquals(-30, rs);
    }
//    @Test
//    public void 곱하기() {
//        int rs = Calculator.run("2 * 30");
//
//        assertEquals(60, rs);
//    }
//    @Test
//    public void 나누기() {
//        int rs = Calculator.run("30 / 3");
//
//        assertEquals(10, rs);
//    }

}
