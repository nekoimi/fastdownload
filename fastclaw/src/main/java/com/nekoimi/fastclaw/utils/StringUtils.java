package com.nekoimi.fastclaw.utils;

/**
 * <p>字符串工具类</p>
 *
 * @author nekoimi  2022/4/2 15:31
 */
public class StringUtils {

    /**
     * <p>判断字符是否为空</p>
     *
     * @param cs 字符对象
     * @return
     */
    public static boolean isEmpty(CharSequence cs) {
        return !isNotEmpty(cs);
    }

    /**
     * <p>判断字符是否不为空</p>
     *
     * @param cs 字符对象
     * @return
     */
    public static boolean isNotEmpty(CharSequence cs) {
        return cs != null && cs.length() > 0;
    }

    /**
     * <p>判断字符串是否是空白字符</p>
     *
     * @param cs 字符对象
     * @return
     */
    public static boolean isBlank(CharSequence cs) {
        return !isNotBlank(cs);
    }

    /**
     * <p>判断字符是否不为空白字符</p>
     * <p> StringUtils.isNotBlank(null) ==> false </p>
     * <p> StringUtils.isNotBlank("") ==> false </p>
     * <p> StringUtils.isNotBlank("   ") ==> false </p>
     * <p> StringUtils.isNotBlank(" \r\n") ==> false </p>
     *
     * @param cs 字符对象
     * @return
     */
    public static boolean isNotBlank(CharSequence cs) {
        int length;

        if (cs == null || (length = cs.length()) <= 0) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (isBlankChar(cs.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * <p>是否是空白字符</p>
     *
     * @param c 字符
     * @return
     */
    public static boolean isBlankChar(char c) {
        return Character.isWhitespace(c)
                || Character.isSpaceChar(c)
                || c == '\ufeff'
                || c == '\u202a'
                || c == '\u0000';
    }
}
