import java.util.concurrent.Callable;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
        long l2 = 10000000000L;
        long l3 = 5L;

        float f1 = 3.14F;
        float f2 = 2.5f;
        float f3 = 20.0f;

        double d1 = 5.5;
        double d2 = 87.65;

        char c1 = 'a';
        char c2 = 'b';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 500; // 10

        char c6 = '\u05AB'; //16 ABCDEF

        boolean bool1 = true;
        boolean bool2 = false;

        int a1 = 60; // 10 система исчисления
        int a2 = 0B111100; // 2 система исчисления (не важен,размер буквы)
        int a3 = 0b111100; // 2 система исчисления (не важен,размер буквы)

        int a4 = 074; // 8 сист. счисл.

        int a5 = 0x3c; // 16 сист. исчисления (не важен,размер буквы)
        int a6 = 0X3C; // 16 сист. исчис. (не важен,размер буквы)

        int a7 = 1_000_000_________________00_0; // символ UNDERSCORE _____

        System.out.println(a7);












    }
}
