package monteiro.andre;

import java.io.InputStream;
import java.util.regex.*;
import java.util.Scanner;


public class questao1 {

// Function to validate the password.

    public static String validadorDeSenha(String senha){

        String avaliacao;

        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$&])"
                + ".{8,}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (senha == null) {
            avaliacao = "Senha Vazia";
            return avaliacao;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(senha);
        if (m.matches() == true){
            avaliacao = "Aprovado";
            return avaliacao;
        }
        else{
            avaliacao = "Rejeitado";
            return avaliacao;
        }

        // Return if the password
        // matched the ReGex
        //return m.matches();
    }

    // Driver Code.
    public static void main(String args[])
    {

        // Test Case 1:
        String str1 = "Geeks@portal20";
        System.out.println(validadorDeSenha(str1));

        // Test Case 2:
        String str2 = "Geeksforgeeks";
        System.out.println(validadorDeSenha(str2));

        // Test Case 3:
        String str3 = "Geeks@ portal9";
        System.out.println(validadorDeSenha(str3));

        // Test Case 4:
        String str4 = "1234";
        System.out.println(validadorDeSenha(str4));

        // Test Case 5:
        String str5 = "Gfg@20";
        System.out.println(validadorDeSenha(str5));

        // Test Case 6:
        String str6 = "geeks@portal20";
        System.out.println(validadorDeSenha(str6));

        // Teste Usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInsira sua senha para avaliar: ");
        String senha = scanner.next();
        System.out.println(validadorDeSenha(senha));
    }
}