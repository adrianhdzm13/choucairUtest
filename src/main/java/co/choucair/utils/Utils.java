package co.choucair.utils;

import co.choucair.ui.HomeJointTodayPage;

import static java.nio.charset.StandardCharsets.UTF_8;


public class Utils {

    public static String convertUtf8(String text) {
        return new String(text.getBytes(), UTF_8);
    }

    public static final String ACTOR = "Utest user";
    HomeJointTodayPage homeJointTodayPage = new HomeJointTodayPage();
    public static final String URL = "https://utest.com/";

}
