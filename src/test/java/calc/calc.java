package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calc {

    @Test
    public void 더하기_테스트() {
        int rs = Calculator.add("10 + 20");

        assertEquals(30, rs);
    }

    @Test
    public void 더하기_테스트_2() {
        int rs = Calculator.add("20 + 20");

        assertEquals(40, rs);
    }

}
