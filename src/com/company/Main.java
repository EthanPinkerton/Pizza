package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price = 0;
        int count;
        String order;
        String size;
        String topping;
        while(true){
            do {
                System.out.print("Enter small, medium, large pizza: ");
                size = input.nextLine();
                if(size.equals("small")){
                    price += 7.99;
                    break;
                }else if(size.equals("medium")){
                    price += 10.99;
                    break;
                }else if(size.equals("large")){
                    price += 13.99;
                    break;
                }else{
                    System.out.println("Invalid response");
                }
            }while(true);

            count = 0;
            while(true){
                System.out.println("Choose 2 toppings for free, extra toppings cost £1.25 (type end to finish)");
                System.out.print("Enter a topping: ");
                topping = input.nextLine();
                if(topping.equals("end")){
                    break;
                }else if(count >= 2){
                    price += 1.25;
                }
                count++;
            }

            System.out.print("Would you like to order another pizza: ");
            order = input.nextLine();
            if(order.equals("no") || order.equals("n")){
                break;
            }
        }
        System.out.print("Total cost is " + price);
    }
}
