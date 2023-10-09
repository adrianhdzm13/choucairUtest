package co.choucair.utils;

import static java.nio.charset.StandardCharsets.UTF_8;


public class Utils {

    public static String convertUtf8(String text) {
        return new String(text.getBytes(), UTF_8);
    }
}
