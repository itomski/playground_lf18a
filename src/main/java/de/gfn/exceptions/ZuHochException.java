package de.gfn.exceptions;

public class ZuHochException extends RuntimeException {

    public ZuHochException() {
        super("Wert ist zu hoch");
    }
}
