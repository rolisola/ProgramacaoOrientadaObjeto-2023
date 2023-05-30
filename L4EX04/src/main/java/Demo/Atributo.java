package Demo;

/**
 *
 * @author Vitor Marchini Rolisola
 */
public class Atributo {
    private String modificador;
    private String tipo;
    private String nome;

    public Atributo(String modificador, String tipo, String nome) {
        this.modificador = modificador;
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getModificador() {
        return modificador;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }    
    
}
