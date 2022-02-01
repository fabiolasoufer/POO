package POO;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		celular.tipo="Celular";
		celular.marca="Samsung";
		celular.modelo="A5 2017";
		celular.preco=1400;
		celular.qtde=5;
		celular.comprar();
		celular.status();

	}

}
