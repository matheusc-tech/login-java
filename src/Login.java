// Program developed by Matheus Carvalho / git matheusc-tech.
// Application created with the purpose of improving my knowledge in Java.

// Last Update: 06/21/2026 10:41AM by Matheus Carvalho.

import java.util.Scanner;


public class Login
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Welcome message
        System.out.print("\nSeja bem vindo!\nFaça login para ter acesso ao aplicativo!\n");
        System.out.print("\n");

        // Question the user if he have account
        System.out.print("Já possui conta? Faça login, caso não possua, efetue o registro.\n");

        // Boolean that be used in while
        boolean logado = false;

        // Viariable used with While
        String loginCadastro="";
        String senhaCadastro="";


        // While used to return to the menu
        while (!logado) {

            // User choice if have or don't have account, if not he can register.
            System.out.print("1- Já possuo conta.\n");
            System.out.println("2- Realizar registro.");
            System.out.println();

            // Command to read user choice
            int opcao = input.nextInt();

            // option 1, if he have account
            if (opcao == 1) {
                System.out.print("\n".repeat(50));
                System.out.println("Você está na tela de login.");

                System.out.println();
                System.out.println();

                String loginDigitado;
                String senhaDigitada;

                System.out.print("Login: ");
                loginDigitado = input.next();
                System.out.print("Senha: ");
                senhaDigitada = input.next();

                // If user are logged in App, the boolean be true, and the application done
                if (loginDigitado.equals(loginCadastro)
                    && (senhaDigitada.equals(senhaCadastro))) {
                    logado = true;
                    System.out.printf(
                            "%s%s",
                            "Login efetuado com sucesso!\n",
                            "By Matheus Carvalho"
                    );
                } else { // If login and password are wrong, show this message at screen
                    System.out.println("Login ou senha incorretos!");
                }
                System.out.println();

                // This place the user can register your account with login and password
            } else if (opcao == 2) {
                System.out.print("\n".repeat(50));
                System.out.println("Você está na tela de registro.");


                System.out.println();
                System.out.println();

                System.out.print("Login: ");
                loginCadastro = input.next();
                System.out.print("Senha: ");
                senhaCadastro = input.next();
                System.out.println();

                System.out.print("\n".repeat(50));

                // Alert about success in registration
                System.out.println("Registro efetuado com sucesso!\n");





            } else {
                System.out.println();
                System.out.println("Resposta inválida.\nTente novamente.");
            }

        }
        input.close();
    }
}