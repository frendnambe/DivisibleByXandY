public class Program {

    public static void Divisible(int n, int x, int y){
        if ((n % x == 0) & (n % y == 0)) {
            System.out.println("Число " + n + " делится на " + x + " и " + y + " без остатка");
        }
        else
            System.out.println("Число " + n + " не делится на " + x + " и " + y + " без остатка");
    }
    public static void main(String[] args) {
        Divisible(6,2,3);
        Divisible(5,2,3);
    }
}
