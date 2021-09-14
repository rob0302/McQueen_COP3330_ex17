/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Scanner;
public class BAC {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
final double MEN = 0.73;
final double WOMEN = 0.66;

System.out.print("Enter a (1) if you are a male or a (2) if you are a female: ");
int gender =0;
gender = sc.nextInt();

System.out.print("How many ounces of alcohol did you have? ");
int drinks = sc.nextInt();

System.out.print("What is your weight in pounds? ");
double weight = sc.nextDouble();

System.out.print("How many hours has it been since your last drink? ");
int hours = sc.nextInt();
float BAC = 0;
if(gender == 1){
     BAC = (float)((drinks * 5.14 / weight * MEN) - 0.015 * hours);
}else if(gender == 2){
    BAC =(float)((drinks * 5.14/weight * WOMEN) - 0.015 * hours);
        }


if(BAC >= 0.08){
    System.out.print("Your BAC is "+BAC+"\nIt is not legal to drive.");
}else
    System.out.print("Your BAC is "+BAC+"\nIt is  legal to drive.");

    }
}
