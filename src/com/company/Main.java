package com.company;

import java.util.Scanner;

public class Main {
//    static int myMemberVariable = 3;

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int myInt = 45;
//        float myFloat = 234.3f;
//        long myLong = 2334744832821933L;
//        char myChar = 'a';
//        double myDouble = 12345656.5;
//        String myString = "alexandra";
//        int sum = myInt + myMemberVariable;
//        float sum2 = 2 + 3.5f;
//        double sum3 = 2 + 4.3;
//
//        System.out.println("Sum 1 =" + sum);
//        System.out.println(sum2);
//        System.out.println(sum3);
//        System.out.println("Suma totala este:" + (sum + sum2 +sum3));
//
//        double valueGradC = 25;
//        double valueGradF = valueGradC * 0.338;
//        System.out.println("");
//
//
//
//
//    int result = 1 + 2;
//        System.out.println("1 + 2 = " + result);
//
//    int previousResult = result;
//
//    result = result - 1;
//        System.out.println(previousResult + " - 1 = " + result);
//
//    previousResult = result;
//
//    result = result * 10;
//        System.out.println(previousResult + " * 10 = " + result);
//
//    previousResult = result;
//
//    result = result / 5;
//        System.out.println(previousResult + " / 5 = " + result);
//
//    previousResult = result;
//    result = result % 3;
//        System.out.println(previousResult + " % 3 = " + result);
//
//    previousResult = result;
//    result = result + 1;
//        System.out.println("Result is now " + result);
//    result++;
//        System.out.println("Result is now " + result);
//    result--;
//        System.out.println("Result is now " + result);
//
//    result += 2;
//        System.out.println("Result is now " + result);
//    result *= 10;
//        System.out.println("Result is now " + result);
//    result -= 10;
//        System.out.println("Result is now " + result);
//    result /= 10;
//        System.out.println("Result is now " + result);
//
//
//
//    adunare(3,7);
//
//    costs(1100, 187, 215);
//    remainder (2000, costs(1100, 187, 215));
//    moneyPerDay(498, 30);
//}
//
//    public static void adunare (int primuNumar, int alDoileaNumar){
//        System.out.println(primuNumar + alDoileaNumar);
//    }
//
//
//    public static double costs ( double rent, double utilities, double transport){
//        System.out.println("Total cost is: " +(rent + utilities + transport));
//        return rent + utilities + transport;
//    }
//
//    public static void remainder (double salary, double costs){
//        System.out.println("The remainder is: " + (salary - costs));
//
//    }
//    public static void moneyPerDay (double remainder, int days){
//        System.out.println("Youre money per day are: " + (remainder / days));
//    }
//
//        Grivei catel = new Grivei();
//        System.out.println("Culoarea lui Patrocle este: " + catel.culoare);
//
//
//
//         Dog jack = new Dog();
//         Dog lupu = new Dog();
//         Dog roco = new Dog();
//
//         Calculator calc = new Calculator();
//          Scanner scanner = new Scanner(System.in);
//
//        System.out.println(calc.adunare(2,3));
//
//        System.out.println("Please enter a number:");
//        lupu.setVarsta(scanner.nextInt());
//
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println(calc.adunare(x,y));
//
//        System.out.println("Varsta lui lupu este: " + lupu.getVarsta());
//
//        System.out.println("Please set a color:");
//        lupu.setCuloare(scanner.next());
//        System.out.println("Culoarea lui lupu este: " + lupu.getCuloare());

     Scanner scanner = new Scanner(System.in);
     OperatiiLogice operatii = new OperatiiLogice();

//        System.out.println("Enter a number");
//        int number = scanner.nextInt();
//
//        System.out.println("Enter a text and a number");
//        String text = scanner.next();
//        int no = scanner.nextInt();
//        System.out.println(operatii.verifText(text, no));

//        System.out.println("Enter a number");
//        int number = scanner.nextInt();
//        System.out.println(operatii.compareOr(number));


//        System.out.println("Enter number");
//        int i = scanner.nextInt();
//        operatii.printToHundred(i);

//        System.out.println("Enter a number");
//        int i = scanner.nextInt();
//        operatii.printToHundredWhile(i);
//
//        System.out.println("Enter two numbers");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        operatii.countBackwards(x,y);


        operatii.returnAsterix();
        System.out.println(operatii.sum());
        System.out.println(operatii.average());

        System.out.println(operatii.calculateSum());
        System.out.println(operatii.calculateAverage());

        System.out.println(operatii.calculateSum2());
        System.out.println(operatii.calculateAverage2());

        System.out.println(operatii.calculateEvenNumberAverage());


    }
}