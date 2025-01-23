/*
Program to compute and print the net bonus amount
Author:clinton oketh
Reg: CT101/G/20284/23
Date: 22/1/2025
*/
import java.util.Scanner;
//netBonus class
public class Netbonus
{
// main Method
public static void main(String[] args)
{
//Create scanner object
Scanner scanner = new Scanner(System.in);
// Prompt user for there years of service
System.out.print("Enter Years of Service: ");
double year =
scanner.nextInt();
//Prompt user for there salary
System.out.print("Enter Salary: ");
double salary =
scanner.nextInt();
//Formula for netbonus and the different bonus
double netbonus;
double percent = 0.0;

//Writing a boolean expression to get the net bonus
if(year > 10)
{
percent =  12.0/100;
}
else if(year >= 6 || year <= 10)
{
percent = 10.0/100;
}
else
{
percent = 8.0/100;
}

//Calculate the netbonus
netbonus = percent * salary;

//Print the netbonus
System.out.println("Netbonus" + netbonus);

//Close the scanner
scanner.close();
}
}
