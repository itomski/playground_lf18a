package de.gfn.api;

public class StringBuilderTest {

    public static void main(String[] args) {

        String str = ""; // Immutable
        for (int i = 0; i < 10; i++) {
            str += i;
        }
        System.out.println(str);


        StringBuilder sb = new StringBuilder(); // Veränderbarer "String"
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Das ist das Haus");
        sb2.append("...");
        System.out.println(sb2.capacity()); // Größe des Internen Arrays
        System.out.println(sb2.length()); // Anzahl der Zeichen
        System.out.println();

        sb2.ensureCapacity(30);
        System.out.println(sb2.capacity()); // Größe des Internen Arrays
        System.out.println();
        
        sb2.trimToSize(); // internes Array wird auf die passende Größe zugeschnitten
        System.out.println(sb2.capacity());

        System.out.println(sb2.reverse());
        System.out.println(sb2);
    }
}
