package POO;

public class Cliente {
	
	String nome, endereco, email, telefone;
	int idade;
	boolean ativo;
	
	public void comprar ()
	{
		this.ativo=true;
	}
	public void naocomprar ()
	{
		this.ativo=false;
	}
	
	public void status()
	{
		System.out.println("O nome do cliente �: "+this.nome);
		System.out.println("Endere�o: "+this.endereco);
		System.out.println("Emai-l :"+this.email);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("Idade: "+this.idade);
		System.out.println("O cliente est� ativo? "+this.ativo);
	}

}
