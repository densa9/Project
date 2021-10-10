public class Project {
    public static void main(String[] args) {
        //oddNumbers();
        // addTwoNumbers();
        //addNumbers();
        //naturalNumbers();
       // max();
        //min();
        addEachNumber();
    }

    //print odd numbers from 1 to 100
    public static void oddNumbers() {
        System.out.println("The odd numbers from 1 to 100 are ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                i++;
            }

        }
    }

    //print any two numbers and display the result
    public static void addTwoNumbers() {
        System.out.println("Enter two numbers ");
        int num1 = 20;
        int num2 = 30;
        System.out.println("The first number is " + num1);
        System.out.println("The first number is " + num2);
        int sum = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + sum);
    }

    //define value 1,2, 3, 2.5,2.5. Add the sum of it
    public static void addNumbers() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        double num4 = 2.5;
        double num5 = 2.5;
        double sum = num1 + num2 + num3 + num4 + num5;
        System.out.println(sum);
    }

    //program to calculate the sum of first 10 natural numbers
    //program to calculate the sum of first 50 natural numbers
    public static void naturalNumbers() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
            if (i==10){     // for sum of 50 natural numbers change i=50
                break;
            }
        }
        System.out.println(sum);
    }

    //program to find max value in an array
    public static void max() {
        int [] marks = {3,5,89,2,6,5,76,2};
        int max = marks[0];
        for (int i=0; i<marks.length; i++){
            if(marks[i]>max){
                max =marks[i];
            }
        }
        System.out.println(max);
    }

    //program to find min value in multidimensional array
    public static void min() {
        int [][] marks = { {2,3,4}, {4,7,8}, {1,2,9}};
        int min = marks[0][0];
        for (int i=0; i<marks.length; i++){
            for(int j=0; j<marks.length;j++)
                if (marks[i][j]<min){
                    min = marks[i][j];
                }
        }
        System.out.println(min);
    }

    //program add each number by 1 in an array
    public static void addEachNumber() {
        int [] numbers = { 2,4,62,8,9,3};
        int [] num1 = new int[numbers.length];
        for (int i=0; i<numbers.length; i++){
            num1[i]=numbers[i] +1;
            System.out.print( num1[i] + " ");
        }
    }





}















