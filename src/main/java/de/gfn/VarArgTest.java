package de.gfn;

public class VarArgTest {

    public static void main(String[] args) {

        System.out.println(sum(10, 20));
        System.out.println(sum());
        System.out.println(sum(10,20,30,40,50));
        System.out.println(sum(new int[]{10,20,30,40,50}));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int... werte) {
        // Varargs wirden als ein Array von Werten verarbeitet
        int sum = 0;
        for(int wert : werte) {
            sum += wert;
        }
        return sum;
    }

    // Vararg Parameter muss immer als letztes in der Liste stehen
    public static int sum(byte b, int... werte) {
        //throw new UnsupportedOperationException("Noch nicht implementiert");
        return 0; // TODO: Muss noch implementiert werden
    }

}
