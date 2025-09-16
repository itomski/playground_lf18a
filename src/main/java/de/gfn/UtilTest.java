package de.gfn;

import java.time.LocalDate;

public class UtilTest {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        String ldAsStr = FormatHelper.formatToDeDate(ld);
        System.out.println(ldAsStr);

    }

}
