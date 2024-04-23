public class Produtos {

    public String NomeDoProduto, Marca;
    public int Quantidade;

    public String MostrarProduto (String nomedoproduto, String marca, int quantidade){
        
        nomedoproduto = NomeDoProduto;
        marca = Marca;
        quantidade = Quantidade;

        return " -> Nome do Produto: " + nomedoproduto + " - Marca: " + marca + " - Quantidade: " + quantidade;
    }

}
