package com.hillel.ntask5;

public class Ntask5 {
    public static void main(String[] args) {
        if (args.length > 0) {
            int days = Integer.valueOf(args[0]);//количество дней
            int sumWithoutDiscount = days * 40;
            if (days > 5 && days <= 7) {
                sumWithoutDiscount -= 20;
            } else if (days > 7) {
                sumWithoutDiscount -= 50;
            }
            System.out.println(String.format("days %s -> sum = %d", days, sumWithoutDiscount));
        } else {
            System.out.println("please provide number");
        }
    }
}

	
