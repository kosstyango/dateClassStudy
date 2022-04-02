public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println("Сообщение от Метода 1: " + s);
        return s;
    }

    public static String method2() {
        method3();
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println("Сообщение от Метода 2: " + s);
        return s;
    }

    public static String method3() {
        method4();
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println("Сообщение от Метода 3: " + s);
        return s;
    }

    public static String method4() {
        method5();
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println("Сообщение от Метода 4: " + s);
        return s;
    }

    public static String method5() {
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println("Сообщение от Метода 5: " + s);
        return s;
    }
}