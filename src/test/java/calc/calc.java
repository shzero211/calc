package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calc {

    @Test
    public void ���ϱ�_1() {
        int rs = Calculator.run("10 + 20");

        assertEquals(30, rs);
    }

    @Test
    public void ���ϱ�_2() {
        int rs = Calculator.run("20 + 20");

        assertEquals(40, rs);
    }
    @Test
    public void ���ϱ�_3() {
        int rs = Calculator.run("30 + 30");

        assertEquals(60, rs);
    }
    @Test
    public void ����() {
        int rs = Calculator.run("30 - 30");

        assertEquals(0, rs);
    }

}
