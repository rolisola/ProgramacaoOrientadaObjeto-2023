/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.mavenproject1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aluno
 */
public class ContaPalavras {
    
    
    public static Map<String, Integer> contarPalavras(String texto) {
        
        Map<String, Integer> ocorrencias = new HashMap<>();
        String[] palavras = texto.split(" ");

        for (String palavra : palavras) {
            if (ocorrencias.containsKey(palavra)) {
                ocorrencias.put(palavra, ocorrencias.get(palavra) + 1);
            } else {
                ocorrencias.put(palavra, 1);
            }
        }

        return ocorrencias;
    }
    
    
}
