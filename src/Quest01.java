import java.util.Scanner;

public class Quest01 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.println("Digite o número de degraus da escada: ");
        int n = enter.nextInt();
        int X = 1;

        for (int i = 0; i < n ; i++){
            for (int j = 0 ; j < n - X ; j++){
                System.out.print(" ");
            }
            for (int h = 0 ; h < X; h++){
                System.out.print("*");
            }
            X++;
            System.out.println();
        }
    }
}
