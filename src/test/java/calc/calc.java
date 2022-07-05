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
    public void 빼기() {
        int rs = Calculator.run("30 - 30");

        assertEquals(0, rs);
    }

}
