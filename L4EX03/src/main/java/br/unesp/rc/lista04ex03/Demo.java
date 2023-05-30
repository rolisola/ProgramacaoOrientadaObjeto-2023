package br.unesp.rc.lista04ex03;

import br.unesp.rc.lista04ex03.utils.SenhaUtils;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Digite uma senha:");
        Scanner senhaScanner = new Scanner(System.in);
        String senha1 = senhaScanner.next();

        String novasenha = SenhaUtils.codec(1, senha1);
        System.out.println("Senha codificada: " + novasenha);

        novasenha = SenhaUtils.codec(0, novasenha);
        System.out.println("Original: " + novasenha);
    }
}
