public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("dois", 3, 4000, 15, 2, "jonas", 20, null, null, true, new Item[10]);
        //teste se item não for null
        Item itemValido = new Item("Camiseta", 1, 50.0, 10, true);
        funcionario.bloquearItem(itemValido);
        
        
        //teste se item for null
        Item itemNulo = null;
        funcionario.bloquearItem(itemNulo);
    }
}
