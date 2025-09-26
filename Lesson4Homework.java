package lesson4;

import java.util.Scanner;

public class Lesson4Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int students = input.nextInt();

        String [] names = new String[students];
        int[] ages = new int[students];
        double[] grades = new double[students];

        for (int i=0; i<students; i++)
        {
            System.out.println("Enter student name:");
            names[i] = input.nextLine();
            System.out.println("Enter student age:");
            ages[i] = input.nextInt();
            System.out.println("Enter student grade:");
            grades[i] = input.nextDouble();
            input.nextLine();

        }



        //Calculating average

        int totalAge = 0;
        for (int age: ages)
        {
            totalAge+=age;
        }
        int averageAge = totalAge/ages.length;
        System.out.println("Average age:"+ averageAge);


        double totalGrades =0d;
        for (double grade: grades)
        {
            totalGrades+=grade;
        }
        double average = totalGrades/grades.length;
        System.out.println("Average grade:" + average);

        double minimumGrade = grades[0];
        double maximumGrade = grades[0];

        for (double grade: grades)
        {
            if(grade>maximumGrade) maximumGrade = grade;
            if(grade<minimumGrade) minimumGrade = grade;
        }
        System.out.println("Maximum grade:"+ maximumGrade);
        System.out.println("Minimum grade:"+minimumGrade);



        boolean [] passed = new boolean[students];
        char [] gradesC = new char[students];
        for(int j =0; j<students; j++)
        {
            passed[j] = true;
            double check = grades[j];
            if(check>90&&check<=100)
            {
                gradesC[j] = 'A';
            }
            else if (check>80&&check<=90)
            {
                gradesC[j] = 'B';
            }
            else if(check>70&&check<=80)
            {
                gradesC[j] = 'C';
            }
            else if (check>60&&check<=70)
            {
                gradesC[j] = 'D';
            }
            else
            {
                gradesC[j] = 'F';
                passed[j] = false;
            }

        }

            int passedStudents = 0;
            int failedStudents = 0;

            for(boolean pass: passed)
            {
                if (pass) passedStudents++;
                else failedStudents++;
            }
        System.out.println("Number of passed students:"+ passedStudents);
        System.out.println("Number of failed students:"+ failedStudents);







        //DISPLAY

        int choice;
        do{
            System.out.println("1.Display all students ");
            System.out.println("2. Display grades");
            System.out.println("0. Exit");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                for (String student: names)
                {
                    System.out.println(student);
                }
                break;

                case 2:
                for(int i=0; i<students; i++)
                {
                    System.out.println(names[i]+" "+grades[i]);
                }
                break;

                case 0:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while (choice!=0);




        //search for student
        System.out.println("Which student's information is needed?");
        String search= input.nextLine();
        for (int i=0; i<students; i++)
        {
            if (names[i].equalsIgnoreCase(search))
            {
                System.out.println("Student:"+ search);
                System.out.println("Age:"+ ages[i]);
                System.out.println("Grade:"+ grades[i]);
                System.out.println("Grade(letter):"+ gradesC[i]);
                System.out.println("Passed?"+passed[i]);



            }
        }


    }






}
