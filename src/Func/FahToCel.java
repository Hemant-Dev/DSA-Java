package Func;

public class FahToCel {

    public static void FahrenheitToCelsius(int s, int e, int w){
        for (int i = s; i<= e; i+=w){
            System.out.println(i + "\t" + (i - 32) * 5/9);
        }
    }
    public static void main(String[] args) {
        FahrenheitToCelsius(120, 200, 40);
    }
}
