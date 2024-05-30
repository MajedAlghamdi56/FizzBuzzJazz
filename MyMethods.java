package day2;

public class MyMethods {

    public static double CalcMark(double mark, double fullmark) {

        return (mark / fullmark) * 100;
    }

    public static String getMarkStatus(double grade) {

        if (grade > 85) return "Excellent";
         else if (grade > 75) return "Very Good";
          else if (grade > 65) return "Good";
            else if (grade >= 50) return "Pass";
            else return "Failed";
    }
}
