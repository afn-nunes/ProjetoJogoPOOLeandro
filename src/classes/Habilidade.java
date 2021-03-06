package classes;

public class Habilidade {
    private String nome;    
    private int valorMaximo;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getValorMaximo() {
        return valorMaximo;
    }
    public void setValorMaximo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
    public Habilidade(String nome, int valorMaximo) {
        this.nome = nome;
        this.valorMaximo = valorMaximo;
    }
    @Override
    public String toString() {
        return String.format("%s (Valor máximo: %d)", nome, valorMaximo);
    }

    
    
}
