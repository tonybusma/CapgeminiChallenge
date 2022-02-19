import java.util.Arrays;
import java.util.Scanner;

public class Quest03 {

    public static void main(String[] args) {

        int pairs = 0;

        Scanner enter = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word = enter.next();
        char[] list = word.toCharArray();

        int totalLetter = word.length();

        //Laço de repetição aninhado para detectar e contabilizar os pares de 1 caracter repetido.
        for (int i = 0; i < totalLetter; i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (list[i] == list[j]) {
                    pairs++;
                }
            }
        }

        // O código abaixo são 3 laços de repetição para fazer a varredura da string digitada, dividindo-a em
        // substrings com quantidade de sílabas progressivas a partir de 2, ordenando e testando a igualdade
        // entre elas.

        int count = 2;

        while (count < totalLetter){

            for (int x = 0; (x + count) <= totalLetter; x++) {
                String subWord = word.substring(x, x + count);
                char[] listX = subWord.toCharArray();
                Arrays.sort(listX);

                for (int y = 1; (y + x + count) <= totalLetter; y++) {
                    String subWord2 = word.substring(y + x, y + x + count);
                    char[] listY = subWord2.toCharArray();
                    Arrays.sort(listY);

                    if (Arrays.equals(listX, listY)) {
                        pairs++;
                    }
                }
            }
            count++;
        }

        System.out.println(pairs);
    }
}
