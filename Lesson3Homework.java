package lesson3;

import java.util.Scanner;

public class Lesson3Homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Balansi daxil edin;");
        double balans = sc.nextDouble();
        sc.nextLine();

        double gedisHaqqi = 0.5d;

        do {

            while(balans<gedisHaqqi)
            {
                System.out.println("Kifayet qeder balansiniz yoxdur");
                System.out.printf("Balans: %.2f azn\n",balans);
                System.out.println("Balansi artirmaq istediyiniz meblegi daxil edin:");
                double artim = sc.nextDouble();
                sc.nextLine();
                balans+=artim;
                System.out.printf("Balans: %.2f azn\n",balans);
            }

            System.out.println("Avtobusa minirsiniz..");

            balans-=gedisHaqqi;
            System.out.printf("Balans: %.2f azn\n",balans);


            System.out.println("Yeni gedis?");
            String secim = sc.nextLine();
            //sc.nextLine();
            if(secim.equalsIgnoreCase("xeyr")) {
                break;
            }
        }
        while(true);
    }
}
