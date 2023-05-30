package Demo;

/**
 *
 * @author vitor Marchini Rolisola
 */
public class ManipulaNome {

    private String nomeCompleto;

    public ManipulaNome() {
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String formatarNomeABNT() {
        String[] partesNome = nomeCompleto.split(" ");
        StringBuilder nomeABNT = new StringBuilder();

        // Último nome
        String sobrenome = partesNome[partesNome.length - 1].toUpperCase();
        if (isPreposicao(sobrenome)) {
            sobrenome = removerPreposicaoSobrenome(sobrenome);
        }
        nomeABNT.append(sobrenome);
        nomeABNT.append(", ");

        // Iniciais dos nomes
        for (int i = 0; i < partesNome.length - 1; i++) {
            String nome = partesNome[i];
            if (!isPreposicao(nome)) {
                nomeABNT.append(Character.toUpperCase(nome.charAt(0)));
                nomeABNT.append(". ");
            }
        }

        return nomeABNT.toString().trim();
    }

    private boolean isPreposicao(String palavra) {
        String[] preposicoes = {"DE", "DO", "DA", "DOS", "DAS"};
        for (String preposicao : preposicoes) {
            if (preposicao.equals(palavra.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    private static String removerPreposicaoSobrenome(String sobrenome) {
        String[] preposicoes = {"DE", "DO", "DA", "DOS", "DAS"};
        for (String preposicao : preposicoes) {
            if (sobrenome.toUpperCase().startsWith(preposicao)) {
                return sobrenome.substring(preposicao.length()).trim();
            }
        }
        return sobrenome;
    }
}
