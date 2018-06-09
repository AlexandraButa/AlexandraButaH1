package com.company;

public class OperatiiLogice {

    public int compare(int number) {

        if ((number >= 2) && (number <= 8)) {
            return number;
        } else {
            return -1;
        }
    }

    public String verifText(String text, int no) {
        if ((text.equals("FastTrack")) && (no <= 3)) {
            return (text + no);
        } else if (!text.equals("FastTrack") && (no >= 4)) {
            return (no + text);
        } else {
            return "Not correct";
        }
    }

    public int compareOr(int number) {
        if ((number > 8) || (number == 6)) {
            System.out.println("The amount of snow this winter was(cm): ");
            return number;
        } else {
            System.out.println("The forecast snow is (cm):");
            return number;
        }

    }

    public void printToHundred(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void printToHundredWhile(int i) {
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    public void countBackwards(int x, int y) {
        for (int i = x; i >= y; i--) {
            System.out.println(i);
        }
    }

    public void returnAsterix() {
        for (int i = 7; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public int sum(){
        int result = 0;

        for (int i = 1; i <=100; i++){
            result = result + i;
        }
        return result;
    }

    public double average(){
        return (double) (sum()/100);

    }

    public int calculateSum(){
        int x = 0;
        int result = 0;
        while (x<=100){
            result = result + x;
            x++;
        }
        return result;
    }

    public double calculateAverage(){
        return (double) (calculateSum()/100);
    }

    public int calculateSum2(){
        int y = 0;
        int result = 0;
        int count = 0;
        do {
            result = result + y;
            y++;
            count ++;
        }while (y<=100);
        return result;
    }

    public double calculateAverage2(){
        return (double) (calculateSum()/100);
    }

    public double calculateEvenNumberAverage(){
        int result = 0;
        int count = 0;
        for (int i = 0; i <=100; i++){
            if (i % 2 != 0){
                result = result + i;
                count++;
            }

        }
        return (result/count);
        
    }

}


