package com.jetbrains;
import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;


public class Main
{

    public static void main(String[] args)
    {
        int i;
        int a = 1;
        double correct = 0;
        SecureRandom random = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        System.out.println("What level of difficulty would you like to attempt? ");
        int difficulty = scnr.nextInt();
        System.out.println("What arithmetic problem would you like to study? ");
        int math = scnr.nextInt();


        int num1 = randNum(difficulty);
        int num2 = randNum(difficulty);


        while(a == 1)
        {
            if(math == 1)
            {
                a = questionsadd(num1,num2, difficulty);
            }

            if(math == 2)
            {
                a = questionstimes(num1,num2, difficulty);
            }

            if(math == 3)
            {
                a = questionssub(num1,num2, difficulty);
            }

            if(math == 4)
            {
                a = questionsdiv(num1,num2, difficulty);
            }

            if(math == 5)
            {
               a = questionsmix(num1,num2,difficulty);

            }
            if(a==0)
            {
                break;
            }
            num1 = randNum(difficulty);
            num2 = randNum(difficulty);

            System.out.println("What level of difficulty would you like to attempt? Level 1,2,3, or 4?");
            difficulty = scnr.nextInt();
            System.out.println("What arithmetic problem would you like to study? ");
            math = scnr.nextInt();
        }



    }

    public static int randNum(int num)
    {
        int seeder = 1;
        SecureRandom random = new SecureRandom();
        while(num != 0)
        {
            seeder = seeder * 10;
            num--;
        }
        int numb = random.nextInt(seeder);
        return numb;
    }

    public static int seed()
    {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(4);
        return num;
    }

    public static void phraseGood(int a)
    {
         int seed = a;
        switch (seed)
        {
            case 0:
                System.out.println("Very good!");
                break;

            case 1:
                System.out.println("Excellent!");
                break;

            case 2:
                System.out.println("Nice work!");
                break;

            case 3:
                System.out.println("Keep up the good work!");
                break;
        }

    }

    public static void phraseBad(int a)
    {
        int seed = a;
        switch (seed) {
            case 0:
                System.out.println("No. Please try again.");
                break;

            case 1:
                System.out.println("Wrong. Try once more.");
                break;

            case 2:
                System.out.println("Don’t give up!");
                break;

            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
    }

    public static int questionsadd(int num1, int num2, int difficulty)
    {
        double result = num1 + num2;
        double correct = 0;
        Scanner scnr = new Scanner(System.in);
        int i;
        for(i=0; i<10;i++)
        {
            System.out.println("How much is " + num1 + " plus " + num2 + "?");
            double user = scnr.nextDouble();
            int s = seed();
            if(user == result)
            {
                phraseGood(s);
                correct++;
            }

            else
            {
                phraseBad(s);
            }

            num1 = randNum(difficulty);
            num2 = randNum(difficulty);
            result = num1 + num2;
        }

        if((correct/10) >= .75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

        else
        {
            System.out.println("Please ask your teacher for extra help.");
        }

        System.out.println("Would you like another session? Press 1 for Yes or press 0 for No.");
        int a = scnr.nextInt();
        return a;
    }

    public static int questionstimes(int num1, int num2, int difficulty)
    {
        double result = num1 * num2;
        double correct = 0;
        Scanner scnr = new Scanner(System.in);
        int i;
        for(i=0; i<10;i++)
        {
            System.out.println("How much is " + num1 + " times " + num2 + "?");
            double user = scnr.nextDouble();
            int s = seed();
            if(user == result)
            {
                phraseGood(s);
                correct++;
            }

            else
            {
                phraseBad(s);
            }

            num1 = randNum(difficulty);
            num2 = randNum(difficulty);
            result = num1 * num2;
        }

        if((correct/10) >= .75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

        else
        {
            System.out.println("Please ask your teacher for extra help.");
        }

        System.out.println("Would you like another session? Press 1 for Yes or press 0 for No.");
        int a = scnr.nextInt();
        return a;
    }

    public static int questionssub(int num1, int num2, int difficulty)
    {
        double result = num1 - num2;
        double correct = 0;
        Scanner scnr = new Scanner(System.in);
        int i;
        for(i=0; i<10;i++)
        {
            System.out.println("How much is " + num1 + " minus " + num2 + "?");
            double user = scnr.nextDouble();
            int s = seed();
            if(user == result)
            {
                phraseGood(s);
                correct++;
            }

            else
            {
                phraseBad(s);
            }

            num1 = randNum(difficulty);
            num2 = randNum(difficulty);
            result = num1 - num2;
        }

        if((correct/10) >= .75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

        else
        {
            System.out.println("Please ask your teacher for extra help.");
        }

        System.out.println("Would you like another session? Press 1 for Yes or press 0 for No.");
        int a = scnr.nextInt();
        return a;
    }

    public static int questionsdiv(int num1, int num2, int difficulty)
    {
        double numb1 = num1;
        double numb2 = num2;
        double result = numb1 / numb2;
        double correct = 0;
        Scanner scnr = new Scanner(System.in);
        int i;
        for(i=0; i<10;i++)
        {
            num1 = (int) numb1;
            num2 = (int) numb2;
            result =Math.round(result*10.0)/10.0;
            System.out.println("How much is " + num1 + " divided by " + num2 + "?");
            double user = scnr.nextDouble();
            int s = seed();
            if(user == result)
            {
                phraseGood(s);
                correct++;
            }

            else
            {
                phraseBad(s);
            }

            numb1 = randNum(difficulty);
            numb2 = randNum(difficulty);
            result = numb1 / numb2;
        }

        if((correct/10) >= .75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

        else
        {
            System.out.println("Please ask your teacher for extra help.");
        }

        System.out.println("Would you like another session? Press 1 for Yes or press 0 for No.");
        int a = scnr.nextInt();
        return a;
    }

    public static int questionsmix(int num1,int num2 ,int difficulty)
    {
        Scanner scnr = new Scanner(System.in);
        double numb1 = num1;
        double numb2 = num2;
        int correct = 0;
        int seeder = seed() + 1;
        int count = 10;
        double result;
        while(count != 0)
        {
            num1 = (int) numb1;
            num2 = (int) numb2;
            if(seeder == 1)
            {
                result = numb1 + numb2;
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                double user = scnr.nextDouble();
                int s = seed();
                if(user == result)
                {
                    phraseGood(s);
                    correct++;
                }

                else
                {
                    phraseBad(s);
                }
            }

            if(seeder == 2)
            {
                result = numb1 * numb2;
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                double user = scnr.nextDouble();
                int s = seed();
                if(user == result)
                {
                    phraseGood(s);
                    correct++;
                }

                else
                {
                    phraseBad(s);
                }
            }

            if(seeder == 3)
            {
                result = numb1 - numb2;
                System.out.println("How much is " + num1 + " minus " + num2 + "?");
                double user = scnr.nextDouble();
                int s = seed();
                if(user == result)
                {
                    phraseGood(s);
                    correct++;
                }

                else
                {
                    phraseBad(s);
                }
            }

            if(seeder == 4)
            {
                result = numb1 / numb2;
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                double user = scnr.nextDouble();
                int s = seed();
                result =Math.round(result*10.0)/10.0;
                if(user == result)
                {
                    phraseGood(s);
                    correct++;
                }

                else
                {
                    phraseBad(s);
                }
            }

            seeder = seed() + 1;
            numb1 = randNum(difficulty);
            numb2 = randNum(difficulty);
            count--;
        }

        if((correct/10) >= .75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

        else
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        System.out.println("Would you like another session? Press 1 for Yes or press 0 for No.");
        int a = scnr.nextInt();
        return a;
    }
}
