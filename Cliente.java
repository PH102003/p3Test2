public class Cliente{
    private String nome;
    private int idade;
    private String CPF;
    private String endereço;
    private boolean bomCliente;
    private Item [] carrinhoDeCompras = new Item[100];
    public Cliente(String nome, int idade, String cPF, String endereço, boolean bomCliente, Item[] carrinhoDeCompras) {
        this.nome = nome;
        this.idade = idade;
        CPF = cPF;
        this.endereço = endereço;
        this.bomCliente = bomCliente;
        this.carrinhoDeCompras = carrinhoDeCompras;
    }
    
    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getCPF() {
        return CPF;
    }
    
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    
    public String getEndereço() {
        return endereço;
    }
    
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    public boolean isBomCliente() {
        return bomCliente;
    }
    
    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }
    
    public Item[] getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }
    
    public void setCarrinhoDeCompras(Item[] carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    } 
    public void adicionar (Item item){
        //add o item
        //sempre que achar um vetor, me certificar de verificar se ele precisa ser percorrido ou nao (através da criação de uma nova variavel é possivel percorrer)
        //no caso, foi utilizado o index pra percorrer  
        Item[]carrinhoNovo = getCarrinhoDeCompras();
        int index = 0;
        while(carrinhoNovo.length > index){
            index++;
        }
        if(index < carrinhoNovo.length){
            carrinhoNovo[index] = item;
        }else{
            System.out.println("Carrinho cheio!");
        }
    }
    public void cancelar(){

    }
    public void comprar(){

    }
}