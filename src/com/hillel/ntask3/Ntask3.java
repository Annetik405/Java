package com.hillel.ntask3;


public class Ntask3 {

public static void main(String... args){

int a = Integer.valueOf(args[0]);
int b = Integer.valueOf(args[1]);

if(a%b==0){
 System.out.println("chislo " + a + "c ostatkom");
} else{
 System.out.println("chislo " + a + "bez ostatka");
}
}
}