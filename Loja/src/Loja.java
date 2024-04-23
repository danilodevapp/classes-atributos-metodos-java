public class Loja {
    public static void main(String[] args) {

        Produtos produto = new Produtos();

        produto.NomeDoProduto = "Camisa";
        produto.Marca = "Adidas";
        produto.Quantidade = 50;

        String mostraProduto = produto.MostrarProduto(null, null, 0);
        System.out.println(mostraProduto);
        
        

        
    }

}
