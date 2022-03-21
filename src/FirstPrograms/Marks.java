package FirstPrograms;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String grade;
        if(marks > 80){
            grade = "A";
        }else if(marks >60){
            grade = "B";
        }else if(marks > 40 ){
            grade = "C";
        }else if(marks == 40){
            grade = "D";
        }else{
            grade = "Fail";
        }
        System.out.println("Grade: "+grade);
    }
}
