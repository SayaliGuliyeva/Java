package lesson2;

import java.util.Scanner;

public class Lesson2Homework {
    public static void main(String[] args) {
        //task 1

        Scanner price = new Scanner(System.in);
        System.out.println("Please enter the price - item 1");
        double item1 = price.nextDouble();

        System.out.println("Please enter the price - item 2");
        double item2 = price.nextDouble();

        double total = item1 + item2;
        System.out.println((total > 50) ? "Free Delivery" : "Charged Delivery");


        //task 2

        Scanner age = new Scanner(System.in);
        System.out.println("Enter age:");
        int input = age.nextInt();

        if (input < 18) {
            System.out.println("Fare:0.50");
        } else {
            System.out.println("Fare:1.00");
        }


        //task3

        double price1 = 1.2;
        double price2 = 2.5;
        double price3 = 0.3;

        double totalprice = 0;

        Scanner product = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the product:");
            String prod = product.nextLine();

            if (!prod.equalsIgnoreCase("bread") &&
                    !prod.equalsIgnoreCase("milk") &&
                    !prod.equalsIgnoreCase("egg")) {
                break;
            }

            System.out.println("Enter quantity:");
            int quantity = product.nextInt();
            product.nextLine();


            switch (prod) {
                case "bread" -> totalprice += quantity * price1;
                case "milk" -> totalprice += quantity * price2;
                case "egg" -> totalprice += quantity * price3;
                default -> System.out.println("Product unavailable");

            }
        }

        System.out.println("Price without discount:" + totalprice);


        if (totalprice > 10) {
            totalprice = totalprice * 0.95;
            System.out.println("Apllied discount: 5%");
        } else if (totalprice > 5) {
            totalprice = totalprice * 0.98;
            System.out.println("Apllied discount: 2%");
        } else {
            System.out.println("Applied discount: 0");
        }

        System.out.println("Total price:" + totalprice);


        //task4
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        int symbols = input.nextInt();
        input.nextLine();

        System.out.println("Is it a picture?(yes/no)");
        String pic = input.nextLine();
        boolean picture = pic.equalsIgnoreCase("yes");

        System.out.println("Enter like count:");
        int likes = input.nextInt();

        if (symbols > 100 && likes > 500) {
            System.out.println("Popular post");
        } else if (picture || symbols > 50) {
            System.out.println("Interesting post");
        } else {
            System.out.println("Ordinary post");
        }


        //task 5

        Scanner input = new Scanner(System.in);
        System.out.println("Enter genre (Action,Comedy,Drama,Animation):");
        String genre = input.nextLine();


        double price = 0;

        switch (genre) {
            case "Action":
                price = 12;
                break;

            case "Comedy":
                price = 12;
                break;

            case "Animation":
                price = 8;
                break;

            default:
                price = 10;

        }

        int extra = 0;
        System.out.println("Which day is it?");
        String day = input.nextLine();

        if (day.equalsIgnoreCase("sunday") || day.equalsIgnoreCase("saturday")) {
            extra = 2;
        }


        System.out.println("Are you a child/student/adult?");
        String person = input.nextLine();

        int discount = 0;
        switch (person) {
            case "child" -> discount = 2;
            case "student" -> discount = 1;
            default -> discount = 0;
        }

        double totalPrice = price + extra - discount;
        System.out.println("Total fee:" + totalPrice);


        //task 6

        Scanner calc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        double num1 = calc.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        char oper = calc.next().charAt(0);

        System.out.println("Enter 2nd number:");
        double num2 = calc.nextDouble();

        double result = 0;

        switch (oper) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);



    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    double discount = 0;
    boolean freeDrink = false;


    if(age< 12)
    {
        System.out.println("Free drink");
        freeDrink = true;
    }
    else if(age <=19)
    {
        System.out.println("20%  discount");
        discount = 0.2;
    }
    else if(age >=60)
    {
        System.out.println("30% discount");
        discount = 0.30;
    }
    else
    {
        System.out.println("No discount");
    }

      System.out.println("\n=== Coffee Menu ===");
      System.out.println("1. Espresso - $3.00");
      System.out.println("2. Cappuccino - $4.00");
      System.out.println("3. Latte - $4.50");
      System.out.println("4. Americano - $3.50");
      System.out.print("Choose your coffee (1-4): ");

    int choice = sc.nextInt();

    double price = 0;
    String coffee = "";

    switch(choice)
    {
        case 1:
            coffee = "Espresso";
            price = 3.00;
            break;
        case 2:
            coffee = "Cappuccino";
            price = 4.00;
            break;
        case 3:
            coffee = "Latte";
            price = 4.50;
            break;
        case 4:
            coffee = "Americano";
            price = 3.50;
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
            return;
    }


    double finalPrice;
                if(freeDrink)

    {
        finalPrice = 0;
    } else

    {
        finalPrice = price - (price * discount);
    }
       System.out.println("\nYou selected: "+coffee);
       System.out.println("Initial Price:"+price);
       if(freeDrink)
       {
        System.out.println("Final Price: 0");
       }
       else if(discount >0)
       {
        System.out.println("Discount applied: " + (discount * 100) + "%");
        System.out.println("Final Price:" + finalPrice);
       }
       else
       {
        System.out.println("Final Price:" + finalPrice);
       }

}

}
