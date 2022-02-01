package POO;

public class Funcionario {
	
	String nome, endereco, email, telefone;
	int idade;
	boolean contratado;
	
	public void trabalhar ()
	{
		this.contratado=true;
	}
	public void desligar ()
	{
		this.contratado=false;
	}
	
	public void status()
	{
		System.out.println("O nome do funcionário é: "+this.nome);
		System.out.println("Endereço: "+this.endereco);
		System.out.println("Emai-l :"+this.email);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("Idade: "+this.idade);
		System.out.println("O funcionário está ativo/contratado? "+this.contratado);

	}
}
