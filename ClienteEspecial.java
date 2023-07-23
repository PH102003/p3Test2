public class ClienteEspecial extends Cliente {
    private int pontos;
    private double saldoDeCompras;
    public ClienteEspecial(int pontos, double saldoDeCompras,String nome, int idade, String cPF, String endereço, boolean bomCliente,
            Item[] carrinhoDeCompras) {
        super(nome, idade, cPF, endereço, bomCliente, carrinhoDeCompras);
        //TODO Auto-generated constructor stub
    }
   
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public double getSaldoDeCompras() {
        return saldoDeCompras;
    }
    public void setSaldoDeCompras(double saldoDeCompras) {
        this.saldoDeCompras = saldoDeCompras;
    }
    public void compra(Item item, double numeroDePontos) {
        double saldoCompra = getSaldoDeCompras();
        
        while(saldoCompra >= 100){
            setSaldoDeCompras(getSaldoDeCompras() * 0.05);
            this.pontos += 5;
            /*logica pra a cada interação que o loop fizer,
            ele adiciona mais 5 pontos,
            por exemplo, 200 reais é o saldo, daí ele vai continuar sendo processado pelo loop
            até que o valor não ultrapasse/não seja igual aos 100 reais (acumulando os pontos juntamente).
            */
            saldoCompra -= 100;

        }
        if(numeroDePontos >= this.pontos){
            this.pontos -= numeroDePontos;
            System.out.println(item.getNome() + "foi comprado com seus pontos");
        }else{
            System.out.println("Item não pode ser adquirido(pontos insuficientes)");
        }
    }
}
