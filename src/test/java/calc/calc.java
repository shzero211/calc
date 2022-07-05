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
    public void ���ϱ�_4() {
        int rs = Calculator.run("30 + 30 + 30");

        assertEquals(90, rs);
    }
    @Test
    public void ����() {
        int rs = Calculator.run("30 - 30");

        assertEquals(0, rs);
    }
    @Test
    public void ����_2() {
        int rs = Calculator.run("30 - 30 - 30");

        assertEquals(-30, rs);
    }
//    @Test
//    public void ���ϱ�() {
//        int rs = Calculator.run("2 * 30");
//
//        assertEquals(60, rs);
//    }
//    @Test
//    public void ������() {
//        int rs = Calculator.run("30 / 3");
//
//        assertEquals(10, rs);
//    }

}
