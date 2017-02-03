package com.company;

import java.util.ArrayList;

/**
 * Created by Yin on 2/1/2017.
 */
public class messageList {
    public message textMessage;

    public static ArrayList <message> originalList = new ArrayList();
    public static ArrayList <message> receivingList = new ArrayList();

    public messageList(message msi)
    {
        textMessage = msi;
    }

    public void saveMessage()
    {
        originalList.add(textMessage);
    }

    public void forward(int position, message ml)
    {
        receivingList.add(ml);
        originalList.remove(position);
    }

    public void display(String number)
    {
        for(int i=0; i < receivingList.size(); i++)
        {
            message msg = receivingList.get(i);
            if(number.equalsIgnoreCase(msg.txtNumber))
            {
                System.out.println("From: " + number);
                System.out.println("Message: " + msg.text);
                System.out.println("Time received: " + msg.receiveTime());
            }
        }
    }
}
