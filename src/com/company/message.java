package com.company;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Yin on 2/1/2017.
 */
public class message {
    public String text;
    public String txtNumber;
    public Date timeReceived;

    public message(String num, String txt)
    {
        txtNumber = num;
        text = txt;
    }
    public Date receiveTime()
    {
        timeReceived = new Date(System.currentTimeMillis());
        return timeReceived;
    }
}
