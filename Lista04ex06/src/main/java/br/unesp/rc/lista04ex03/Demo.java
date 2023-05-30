package br.unesp.rc.lista04ex03;

import br.unesp.rc.lista04ex03.utils.SenhaUtils;

public class Demo {

    public static void main(String[] args) {
        String senha1 = "teste";

        String novasenha = SenhaUtils.codec(1, senha1);
        System.out.println("Senha codificada: " + novasenha);

        novasenha = SenhaUtils.codec(0, novasenha);
        System.out.println("Original: " + novasenha);
    }
}
