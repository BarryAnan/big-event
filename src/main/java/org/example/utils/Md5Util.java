package org.example.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {



    /**
     * 生成字符串的md5校验值
     *
     * @param s 要计算MD5的字符串
     * @return 返回MD5加密后的十六进制字符串
     */
    public static String getMD5String(String s) {
        return getMD5String(s.getBytes());
    }

    /**
     * 判断字符串的md5校验码是否与一个已知的md5码相匹配
     *
     * @param password   要校验的字符串
     * @param md5        已知的MD5值（十六进制字符串）
     * @return 如果匹配返回 true，否则返回 false
     */
    public static boolean checkPassword(String password, String md5) {
        return getMD5String(password).equals(md5);
    }

    /**
     * 生成字节数组的md5校验值
     *
     * @param bytes 要计算MD5的字节数组
     * @return 返回MD5加密后的十六进制字符串
     */
    private static String getMD5String(byte[] bytes) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md.digest(bytes);
            StringBuilder hexValue = new StringBuilder();
            for (byte md5Byte : md5Bytes) {
                int val = ((int) md5Byte) & 0xff;
                if (val < 16) {
                    hexValue.append("0");
                }
                hexValue.append(Integer.toHexString(val));
            }
            return hexValue.toString();
        } catch (Exception e) {
            throw new RuntimeException("MD5 加密失败", e);
        }
    }
}