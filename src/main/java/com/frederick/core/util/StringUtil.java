package com.frederick.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    public static boolean isEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isPhoneNumber(String phoneNumber) {
        String phoneRegex = "^(\\d{3,4}-\\d{3,4}-\\d{4}|\\d{10,12})$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean isValidEmailOrPhone(String emailOrPhone) {
        if (isEmail(emailOrPhone)) {
            return true;
        } else if (isPhoneNumber(emailOrPhone)) {
            return true;
        }
        return false;
    }
}
