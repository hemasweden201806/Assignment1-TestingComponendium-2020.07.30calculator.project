package se.lexicon.hema;

import java.util.Scanner;

public class App {
    public static float add(float a, float b)
    {

        return a + b;
    }

    public static String add(int...ints)
    {
       int result=0;
       int result1=0;
       String resultAsString="";
       for(int i=0;i<ints.length;i++)
       {
           result+=ints[i];
           resultAsString += (i != (ints.length - 1)) ? (ints[i] + "+") : ints[i];
       }
       return resultAsString += "=" +result;
    }

    /*public static float mul(float a, float b)
    {

        return a * b;
    }

    public static float div(float a, float b)
    {
        if (b == 0) {
            System.out.println("Division cannot take place when number 2 is 0");
            return 0;

        } else {
            return a / b;
        }

    }*/

    public static void main(String[] args) {
        float number1=0;
        float number2=0, result;
        String resultAsString="";
        System.out.println("Enter the  numbers ");
        Scanner sc = new Scanner(System.in);
        //number1 = sc.nextFloat();
        //number2 = sc.nextFloat();
        //Operations.....
        System.out.println("1.Add\n 2.sub\n 3.Mul\n 4.Div\n \n Enter a choice ....");
        int choice;
        choice = sc.nextInt();
        switch (choice) {
            case 1: {
                result = add(6,7);
                resultAsString=add(3,2,6,7,8,9);
                System.out.println("addition is" + result);
                System.out.println("addition is" + resultAsString);
                break;
            }
            /*case 2: {
                result = sub(number1, number2);
                System.out.println("subtraction is" + result);
                break;
            }
            case 3: {
                result = mul(number1, number2);
                System.out.println("mul is" + result);
                break;
            }
            case 4: {
                result = div(number1, number2);
                System.out.println("div is" + result);
                break;
            }*/
            default:
                throw new java.lang.IllegalStateException("Unexpected value: " + choice);
        }

    }
}