package Demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author vitor Marchini Rolisola
 */
public class ManipuladordeCodigo {
    
    public void geradorCodigo(String NomeClasse, String NomePacote, List<Atributo> atributos) {
        StringBuilder codigo = new StringBuilder();

        codigo.append("package ").append(NomePacote).append(";\n\n");

        codigo.append("public class ").append(NomeClasse).append(" {\n\n");

        // Atributos
        for (Atributo atributo : atributos) {
            codigo.append("\t").append(atributo.getModificador()).append(" ").append(atributo.getTipo()).append(" ").append(atributo.getNome()).append(";\n");
        }
        codigo.append("\n");

        // Construtor Vazio
        codigo.append("\tpublic ").append(NomeClasse).append("() {\n");
        codigo.append("\t}\n\n");

        // Construtor com Parametro
        codigo.append("\tpublic ").append(NomeClasse).append("(");
        for (int i = 0; i < atributos.size(); i++) {
            Atributo atributo = atributos.get(i);
            codigo.append(atributo.getTipo()).append(" ").append(atributo.getNome());
            if (i < atributos.size() - 1) {
                codigo.append(", ");
            }
        }
        codigo.append(") {\n");
        for (Atributo atributo : atributos) {
            codigo.append("\t\tthis.").append(atributo.getNome()).append(" = ").append(atributo.getNome()).append(";\n");
        }
        codigo.append("\t}\n\n");

        // Getters e setters
        for (Atributo atributo : atributos) {
            codigo.append("\tpublic ").append(atributo.getTipo()).append(" get").append(capitalize(atributo.getNome())).append("() {\n");
            codigo.append("\t\treturn ").append(atributo.getNome()).append(";\n");
            codigo.append("\t}\n\n");

            codigo.append("\tpublic void set").append(capitalize(atributo.getNome())).append("(").append(atributo.getTipo()).append(" ").append(atributo.getNome()).append(") {\n");
            codigo.append("\t\tthis.").append(atributo.getNome()).append(" = ").append(atributo.getNome()).append(";\n");
            codigo.append("\t}\n\n");
        }
        codigo.append("}");

        // Salvar em arquivo
        String fileName = NomeClasse + ".java";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.print(codigo.toString());
            System.out.println("Código gerado com sucesso e salvo em " + fileName);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o arquivo.");
            e.printStackTrace();
        }
    }
    
     private String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
