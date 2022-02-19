import java.util.Scanner;

public class Quest02 {

    public static void main(String[] args) {

        int upper = 0,  lower = 0, digit = 0, especialChar = 0;
        int minChar = 0;

        Scanner safe = new Scanner(System.in);

        System.out.println("Digite a sua senha: ");
        String password = safe.next();

        int totalLetter = password.length();
        char[] list = password.toCharArray();

        // No código abaixo foi usado o foreach para comparar se os caracteres usados na senha possuem todas
        // as características descritas na questão para uma senha considerada forte.
        for(char letter : list) {
            if(Character.isDigit(letter))
                digit = 1;
            else if(Character.isLowerCase(letter))
                lower = 1;
            else if(Character.isUpperCase(letter))
                upper = 1;
            else if(letter == '!' || letter == '@' || letter == '#' || letter == '$' || letter == '%' || letter == '^'
                    || letter == '&' || letter == '*' || letter == '(' || letter == ')' || letter == '+' || letter == '-')
                especialChar = 1;
        }

        int differentChars = digit + lower + upper + especialChar;
        // Abaixo foram aninhadas duas condições, que analisam se a senha tem a quantidade mínima de caracteres
        // necessários e todos os diferentes tipos.
        if(totalLetter < 6) {
            minChar = totalLetter + (4 - differentChars);
            if (minChar < 6) {
                System.out.println(6 - totalLetter);
            }
            else{
                System.out.println(4 - differentChars);
            }
        }
        else{
            System.out.println(4 - differentChars);
        }
    }
}
