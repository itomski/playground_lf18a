package de.gfn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatHelper {

    // Konstante
    public final static String DATE_FMT = "dd.MM.yyyy";
    public final static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FMT);

    private FormatHelper() {
    }

    public static String formatToDeDate(LocalDate date) {
        return date.format(DATE_FORMATTER);
    }
}
