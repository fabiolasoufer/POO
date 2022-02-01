package POO;

public class Patinete {
	
	String cor, modelo;
	int rodas;
	boolean movimento;
	
	public void patinar()
	{
		this.movimento=true;
	}
	
	public void estacionar()
	{
		this.movimento=false;
	}
	
	public void status()
	{
		System.out.println("O modelo do patinete é: "+this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Quantidade de rodas: "+this.rodas);
		System.out.println("O patinete está em movimento? "+this.movimento);
	}

}
