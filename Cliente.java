public class Cliente {
    private String nome;
    private int idade;
    private String CPF;
    private String endereço;
    private boolean bomCliente;
    private Item[] carrinhoDeCompras = new Item[100];

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

    public void adicionar(Item item) {
        // add o item
        // sempre que achar um vetor, me certificar de verificar se ele precisa ser
        // percorrido ou nao (através da criação de uma nova variavel é possivel
        // percorrer)
        // no caso, foi utilizado o index pra percorrer

        Item[] carrinhoNovo = getCarrinhoDeCompras();
        int index = 0;

        while (index < carrinhoNovo.length) {
            if (carrinhoNovo[index] == null) {
                carrinhoNovo[index] = item;
                return; // Importante: sair do método após adicionar o item
            }
            index++;
        }
        System.out.println("Carrinho cheio!");

    }

    public void cancelar(int codigoProduto) {
        Item[] carrinhoNovo2 = getCarrinhoDeCompras();
        int indice = 0;
        boolean itemEncontrado = false;
        while (indice < carrinhoNovo2.length) {
            //percorrendo vetor
            if (carrinhoNovo2[indice] != null && carrinhoNovo2[indice].getCodigo() == codigoProduto) {
                //localiza se a posição não é *null*
                
                carrinhoNovo2[indice] = null;
                
                itemEncontrado = true;
                break;
            }
            indice++;
        }
    
        if (!itemEncontrado) {
            //caso o item não exista
            System.out.println("Item não pode ser removido (Não encontrado no carrinho)");
        }
    }
    public void comprar() {
        Item carrinhoNovo3[] = getCarrinhoDeCompras();
        int totalItens = 0;
        double gastoTotal = 0.0;
        for(int i = 0; i < carrinhoNovo3.length; i++){
            if(carrinhoNovo3[i] != null){
                gastoTotal+= carrinhoNovo3[i].getValor();
                //incremento de itens não nulos (enquanto o if for verdadeiro, esse incremento serve pro uso da média final)
                totalItens++;
                carrinhoNovo3[i].setQuantidadeEstoque(carrinhoNovo3[i].getQuantidadeEstoque() - 1);
            }
            double media = gastoTotal/totalItens;
            System.out.println(media);
        }
    }
}
