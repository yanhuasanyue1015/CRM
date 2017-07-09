package com.youyigejia.crm.util;

/**
 * Created by 张磊 on 2017/7/8.
 */
public class StringUtil {
    public static String handle(String arg) {
        String result = arg;
        if (arg != null) {
            result = arg.trim();
            if (result.length() == 0) {
                result = null;
            }
        }
        return result;
    }
}
