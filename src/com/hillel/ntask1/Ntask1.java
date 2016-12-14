package com.hillel.ntask1;

public class Ntask1{

public static void main (String... args){

int a = 1;
int b = 2;
int c = 3;

System.out.println("Min is" + max(a,b,c));


System.out.println("Min is" + min(a,b,c)); 
   
}


   public static int max(int a, int b, int c){
   
   int res = 0; 
   
   if (a>b && a>c){ 
   res=a;   
   } else if(c>b && c>a){
   res=c;
   } else if( b>c && b>a){
   res=b;
   }
    return res;
   }
   
   public static int min(int a, int b, int c){
   
   int min = 0;//в пределах этого метода у тебя нет рес переменной -- только мин - поэтому его и будешь возвращать 
   
   if (a<b && a<c){ 
   min=a;   
   } else if(c<b && c<a){
   min=c;
   } else if( b<c && b<a){
   min=b;
   }
    return min;
   }
}