package lesson5;

import java.util.Scanner;

public class Lesson5Hw {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String [][] quiz = {{"Azerbaycanin paytaxti?", "A", "A)Baki B)Gence C)Sumqayit"},{"Turkiyenin paytxati?","C","A)Istanbul B)Izmir C) Ankara"},{"Rusiyanin paytaxti?","B","A)St.Peterburq B)Moskva C)Kreml"},{"Cinin paytaxti?","B","A)HonKonq B)Beijinq C)Shanqai"},{"Ozbekistanin paytaxti?","A","A)Taskent B)Bukhara C)Semerkend"}};

        int ind = 0;
        int questions = quiz.length;

        while (ind<questions)
        {
            String question = quiz[ind][0];
            String corrAnswer = quiz[ind][1];
            boolean answer = false;

            do {
                System.out.println("\nSual "+ (ind+1));
                System.out.println(quiz[ind][0]);
                System.out.println(quiz[ind][2]);
                System.out.println("Cavabiniz:");
                String userAnswer = input.nextLine();

                if (userAnswer.equalsIgnoreCase(corrAnswer))
                {
                    System.out.println("Dogrudur!");
                    answer = true;
                }
                else
                {
                    System.out.println("Yanlis, yeniden cehd edin.");
                }

            }while(!answer);
            ind++;
        }

        System.out.println("Oyun bitdi!");
    }



    }
