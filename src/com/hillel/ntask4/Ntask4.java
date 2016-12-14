package com.hillel.ntask4;

public class Ntask4 {

public static void main (String[] args){

double c = 8.5 ;
double b = 11.45;
double a = 10;

double n = Math.abs(a-b);
double m = Math.abs(a-c);

if (n==m){
 System.out.println("Chislo "+n +" è "+m + " ravnoydalenni ot "+a);
}
if (n>m){
   System.out.println("Chislo "+m+" blije k "+a);
}
if (m<n){
System.out.println("Chislo "+n+" blije k "+a);;

}
}
}