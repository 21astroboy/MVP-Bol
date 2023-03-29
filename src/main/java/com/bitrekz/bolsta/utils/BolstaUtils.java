package com.bitrekz.bolsta.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.util.StringUtils;


public class BolstaUtils {

    private static final Random random = new Random();

    private BolstaUtils() {
    }

    public static String generatePhoneVerificationCode() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public static String cleanPhone(String phone) {
        if (StringUtils.isEmpty(phone)) {
            return null;
        }
        return phone.replaceAll("\\D", "");
    }

    public static Date parseStringToDate(String date) throws ParseException {
        SimpleDateFormat formatter = getDateFormatter();
        return formatter.parse(date);
    }

    public static SimpleDateFormat getDateFormatter() {
        return new SimpleDateFormat("dd.MM.yyyy");
    }
}
