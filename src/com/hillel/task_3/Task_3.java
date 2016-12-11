package com.hillel.task_3;
public class Task_3 {
  public static void main (String[] args){
  int var = 4563; 
  int firstDigit= (var/1000);
  int secondDigit=(var/100)%10;
  int thirdDigit=(var/10)%10;
  int forthDigit= var%10;
  int sum = firstDigit + secondDigit + thirdDigit + forthDigit;
  System.out.print ("sum  " + sum); 

}
}