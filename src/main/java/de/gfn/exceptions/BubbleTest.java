package de.gfn.exceptions;

public class BubbleTest {

    public static void main(String[] args) {
        System.out.println("Start");
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Ende");
    }

    private static void method1() {
        System.out.println("Start 1");
        method2();
        System.out.println("Ende 1");
    }

    private static void method2() {
        System.out.println("Start 2");
//        try {
            method3();
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println("Ende 2");
    }

    private static void method3() {
        System.out.println("Start 3");
//        try {
            String str = null;
            System.out.println(str.toUpperCase());
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println("Ende 3");
    }
}
