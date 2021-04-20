package com.sunwoda.controller;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * 类描述：
 *
 * @ClassName Test2
 * @Description TODO
 * @Author shiguorang
 * @Date 2021/3/10 20:27
 * @Version 1.0
 */
public class Test2 {
    private static final String DATA = "字串文字";

    public static void main(String[] args) {
        try {
            // BASE64加密
            BASE64Encoder encoder = new BASE64Encoder();
            String data = encoder.encode(DATA.getBytes());
            System.out.println("BASE64加密：" + data);

            // BASE64解密
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] bytes = decoder.decodeBuffer("+5LBg9c6vyKhB75RukcTww==");
            System.out.println("BASE64解密：" + new String(bytes));

            // 结果
            // BASE64加密：Y29tLmJhc2U2NC5kZW1v
            // BASE64解密：com.base64.demo
        } catch (Exception e) {
            System.out.println("BASE64加解密异常");
            e.printStackTrace();
        }

    }


}
