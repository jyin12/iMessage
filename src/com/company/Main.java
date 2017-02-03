package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String answer;
        Scanner a = new Scanner(System.in);
        do
        {
            System.out.println("Enter a number");
            String num = a.next();
            System.out.println("Enter text message");
            String txt = a.next();
            message msg1 = new message(num, txt);
            messageList msg2 = new messageList(msg1);
            msg2.saveMessage();
            System.out.println("Would you like to send another message? yes or no");
            answer = a.next();


            System.out.println("Do you want to receive the messages? yes or no");
            String ans = a.next();
            if(ans.equalsIgnoreCase("Yes"))
            {
                msg2.forward(0, msg1);
            }
            System.out.println("Do you want to display the messages? yes or no");
            String ans1 = a.next();
            if(ans1.equalsIgnoreCase("yes"))
            {
                msg2.display(num);
            }
        }while(answer.equalsIgnoreCase("yes"));

    }

}
