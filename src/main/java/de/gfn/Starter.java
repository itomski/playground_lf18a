package de.gfn;

public class Starter {

    // Reversed-Domain: Packages
    // PascalCase: Klassennamen, Interfaces, Exceptions, Enums
    // camelCase: Methodennamen, Variablen
    // snake_case: Wird in Java nicht verwendet
    // SCREAMING_SNAKE_CASE: Öffentliche Konstanten Math.PI
    // kebap-case: Führt in Java zu Syntax-Error

    public static void main(String[] args) {

        String name = "Peter";
        int i = 100;
        name = "Tony";
        String name2 = "Tony"; // Landet im String-Literal-Pool
        String name3 = new String("Tony"); // Landet NICHT im String-Literal-Pool
        machWas();
    }

    private static void machWas() {

        int i = 200;
        String name = "Tony";

    }
}
