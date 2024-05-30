package day2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Mark and your Full Mark: ");
        double mark = sc.nextDouble();
        double fullmark = sc.nextDouble();

        System.out.println("your pct is :" + MyMethods.CalcMark(mark, fullmark));
        System.out.println(MyMethods.getMarkStatus(MyMethods.CalcMark(mark, fullmark)));


    }
}
