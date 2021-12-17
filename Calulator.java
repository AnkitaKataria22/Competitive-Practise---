package com.company;

import java.security.KeyStore;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int result=0;
        while(true){
            System.out.println("Enter operation");
            char ch=in.next().trim().charAt(0);
            System.out.println("Enter number 1");
            int num1=in.nextInt();
            System.out.println("Enter number 2");
            int num2=in.nextInt();
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'){
                if (ch == '+') {
                    result=num1+num2;
                } else if (ch == '-') {
                    result=num1-num2;
                }else if (ch == '*') {
                    result=num1*num2;
                }else if (ch == '/') {
                    if(num2!=0) {
                        result = num1 / num2;
                    }
                }else if (ch == '%') {
                    result=num1%num2;
                }

            }else if(ch=='X'||ch=='x'){
                break;
            }else{
                System.out.println("Invalid Operation");
            }
            System.out.println(result);
        }
    }
}
