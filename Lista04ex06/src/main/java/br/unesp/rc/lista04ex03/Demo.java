package br.unesp.rc.lista04ex03;

import br.unesp.rc.lista04ex03.utils.SenhaUtils;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        //String senha1 = "testezeroum";
        //String senha2 = "teste123aaabbbccc";
        
        Scanner senhaScanner1 = new Scanner(System.in);
        String senha1 = senhaScanner1.next();
        Scanner senhaScanner2 = new Scanner(System.in);
        String senha2 = senhaScanner2.next();

        String novasenha1 = SenhaUtils.codec(1, senha1);
        System.out.println("Senha codificada: " + novasenha1);

        novasenha1 = SenhaUtils.codec(0, novasenha1);
        System.out.println("Original: " + novasenha1);
        
        String novasenha2 = SenhaUtils.codec(1, senha2);
        System.out.println("Senha codificada: " + novasenha2);

        novasenha2 = SenhaUtils.codec(0, novasenha2);
        System.out.println("Original: " + novasenha2);
        
    }
}
