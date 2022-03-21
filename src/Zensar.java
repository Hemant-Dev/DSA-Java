import java.util.Scanner;

public class Zensar {

    public void foo(int... a){
        int secondhighest = Integer.MIN_VALUE;
        int highest = Integer.MIN_VALUE;
        for(int x : a)
            if(x > highest){
                int temp = highest;
                highest = x;
                secondhighest = temp;
            }
            System.out.println(secondhighest);
    }



    public static void main(String... args) {
        Zensar ob = new Zensar();
        ob.foo(0,2,-1,-20);
        int a=10,b=50;
        a++;
        --b;
        int c=a--+b--;
        System.out.print(++c);
    }
}
