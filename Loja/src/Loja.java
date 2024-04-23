public class Loja {
    public static void main(String[] args) {

        Produtos produto = new Produtos();

        produto.NomeDoProduto = "Camisa";
        produto.Marca = "Adidas";
        produto.Quantidade = 50;

        String mostraProduto = produto.MostrarProduto(null, null, 0);
        System.out.println(mostraProduto);
        
        System.out.println("");
        
        System.out.println("Quantidade aumentada!");
        
        produto.AumentarQuantidade();
        System.out.println("A quantidade atualizada é: " + produto.Quantidade);

        System.out.println("");

        System.out.println("Quantidade diminuida!");

        produto.DiminuirQuantidade();
        produto.DiminuirQuantidade();
        produto.DiminuirQuantidade();
        System.out.println("A quantidade atualizada é: " + produto.Quantidade);

        System.out.println("");

        
    }

}
