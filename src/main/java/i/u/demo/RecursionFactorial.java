package i.u.demo;

import org.junit.Test;

/**
 * 递归 阶乘 时间复杂度
 */
public class RecursionFactorial {

    private static int step = 0;

    @Test
    public void Test1() {
        long startTime = System.currentTimeMillis();
        int result = func2(1, 1000);
        long endTime = System.currentTimeMillis();
        System.out.println("times: " + (endTime - startTime));
        System.out.println("result: " + result + " step: " + step);
    }

    private int func1(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            step++;
            result = result * x;
        }
        return result;
    }

    private int func2(int x, int n) {
        step++;
        if (n == 1) {
            return 1;
        }
        return func2(x, n - 1) * x;
    }

    private int func3(int x, int n) {
        step++;
        if (n == 0) {
            return 1;
        }
        int t = func3(x, n / 2);
        if (n % 2 == 1) {
            return t * t * x;
        }
        return t * t;
    }
}
