package Demo;

import java.util.Scanner;

/**
 *
 * @author Vitor Marchini Rolisola
 */
public class L4EX01 {
    private static String nomeABNT;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome completo do autor:");
        ManipulaNome mn = new ManipulaNome();
        
        mn.setNomeCompleto(scanner.nextLine());
        nomeABNT = mn.formatarNomeABNT();
       
        System.out.println("Nome no formato ABNT: " + nomeABNT);
    }

}