package POO;

public class ProdutoEletronico {
	
	String tipo, marca, modelo;
	int preco, qtde;
	boolean comprado;
	
	public void comprar()
	{
		this.comprado=true;
	}
	
	public void naocomprar()
	{
		this.comprado=false;
	}
	
	public void status()
	{
		System.out.println("O produto � um(a): "+this.tipo);
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Pre�o R$"+this.preco);
		System.out.println("Quantidade dispon�vel no estoque: "+this.qtde);
	}

}
