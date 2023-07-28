public class Funcionario extends ClienteEspecial {
    private String setor;
    private int id;
    private double salario;
    public Funcionario(String setor, int id, double salario,int pontos, double saldoDeCompras, String nome, int idade, String cPF, String endereço,
            boolean bomCliente, Item[] carrinhoDeCompras) {
        super(pontos, saldoDeCompras, nome, idade, cPF, endereço, bomCliente, carrinhoDeCompras);
        //TODO Auto-generated constructor stub
    }
    
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void renovarEstoque(int itens, Item item){
        
        item.setQuantidadeEstoque(item.getQuantidadeEstoque() + itens);
        //faz a soma do item dentro do estoque
    }
    public void bloquearItem(Item itemBloqueado){
        try {
         if(itemBloqueado != null){
            System.out.println("Item bloqueado com sucesso");
            itemBloqueado.setDisponibilidade(false);
            //entra no else se o item for 'null'
        }else{
            throw new IllegalArgumentException("Item inexistente");
        } 
        } catch (Exception e) {
            System.out.println("Não pode ser bloqueado: " + e.getMessage());
        }
        
    }
}
