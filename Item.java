public class Item {
    private String nome;
    private int codigo;
    private double valor;
    private int quantidadeEstoque;
    private boolean disponibilidade;
    public Item(String nome, int codigo, double valor, int quantidadeEstoque, boolean disponibilidade) {
    this.nome = nome;
    this.codigo = codigo;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.disponibilidade = disponibilidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public boolean isDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}
