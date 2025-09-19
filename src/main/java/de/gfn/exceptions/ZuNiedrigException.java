package de.gfn.exceptions;

public class ZuNiedrigException extends RuntimeException {

    public ZuNiedrigException() {
        super("Der Wert ist zu niedrig");
    }
}
