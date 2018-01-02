package com.iris.atm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 2018/1/2.
 */

public class Tester {
    public static void main(String[] args) {//pavm Tab鍵
        Date now = new Date();
        System.out.println(now);//sout
        System.out.println(now.getTime());//毫秒
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");//Sdf
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//Sdf
        System.out.println(sdf.format(now));
        String s = "1997-12-19";
        try {
            Date birthday = sdf.parse(s);
            System.out.println(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
