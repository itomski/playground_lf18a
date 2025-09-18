package de.gfn.api;

public class StringTest {

    public static void main(String[] args) {

        String str = "";
        System.out.println(str += "...");
        System.out.println(str += "...");

        str = "Peter";
        str = str.toLowerCase();
        System.out.println(str);

        String name = "\t   peter   ";
        name = name.trim();
        String firstChar = (name.charAt(0) + "").toUpperCase();
        System.out.println(firstChar + name.substring(1));

        name = null;

        // System.out.println(name.toLowerCase()); // NullPointerException

        System.out.println();

        System.out.println("Moin".hashCode());
        System.out.println(new String("Moin").hashCode());

        System.out.println();
    }
}
