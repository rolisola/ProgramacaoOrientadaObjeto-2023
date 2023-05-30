package Demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L4EX04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gerador de Código");
        System.out.println("-----------------");
        System.out.println("Digite 'fim' para finalizar a inserção das informações.");
        System.out.println();

        System.out.print("Nome da classe: ");
        String nomeClasse = scanner.nextLine();

        System.out.print("Nome do pacote: ");
        String nomePacote = scanner.nextLine();

        List<Atributo> atributos = new ArrayList<>();

        while (true) {
            System.out.print("Modificador (ou 'fim' para encerrar): ");
            String modificador = scanner.nextLine();

            if (modificador.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Tipo: ");
            String tipo = scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            Atributo atributo = new Atributo(modificador, tipo, nome);
            atributos.add(atributo);
        }
        ManipuladordeCodigo mc = new ManipuladordeCodigo();
        mc.geradorCodigo(nomeClasse, nomePacote, atributos);
    }
    
}
