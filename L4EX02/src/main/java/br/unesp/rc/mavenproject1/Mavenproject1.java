/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.unesp.rc.mavenproject1;

import static br.unesp.rc.mavenproject1.ContaPalavras.contarPalavras;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Digite um texto:");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        Map<String, Integer> ocorrencias = ContaPalavras.contarPalavras(texto);

        System.out.println("Relação de palavras:");
        for (Map.Entry<String, Integer> entry : ocorrencias.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
