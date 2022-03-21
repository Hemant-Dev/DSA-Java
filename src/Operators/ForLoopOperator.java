package Operators;

public class ForLoopOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a+++--b);
        //System.out.println(a--+++b); // error line
        System.out.println(a++-++b);
        //System.out.println(a+++++b); // error line
    }
}
