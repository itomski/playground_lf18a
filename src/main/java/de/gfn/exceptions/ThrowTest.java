package de.gfn.exceptions;

public class ThrowTest {

    public static void main(String[] args) {

        try {
            System.out.println(checkAlter(-10));
        }
        catch (ZuNiedrigException e) {
            System.out.println("-----");
        }
        catch (ZuHochException e) {
            System.out.println("+++++");
        }

    }

    private static boolean checkAlter(int alter) {
        if(alter < 0) {
            throw new ZuNiedrigException();
        }
        else if(alter > 120) {
            throw new ZuHochException();
        }
        else if(alter < 16) {
            return false;
        }
        else {
            return true;
        }
    }
}
