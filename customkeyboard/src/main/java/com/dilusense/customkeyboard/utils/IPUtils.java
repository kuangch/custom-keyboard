package com.dilusense.customkeyboard.utils;

import java.util.regex.Pattern;

public class IPUtils {

    public static boolean isValidatedIPPort(String str){
        Pattern pattern = Pattern.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5]):(\\d{2,6})\\b");
        return pattern.matcher(str).matches();
    }
}