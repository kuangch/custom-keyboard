package com.dilusense.customkeyboard.utils;

import java.util.regex.Pattern;

public class IPUtils {

    /**
     * 校验输入的ip和端口是否合法
     * @param str ip + port ：10.0.0.0:8080
     * @return
     */
    public static boolean isValidatedIPPort(String str){
        Pattern pattern = Pattern.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5]):(\\d{2,6})\\b");
        return pattern.matcher(str).matches();
    }
}