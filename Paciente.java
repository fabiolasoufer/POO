package POO;

public class Paciente {
	
	String nome, endereco, email, telefone;
	int idade;
	boolean internado;
	
	public void internar ()
	{
		this.internado=true;
	}
	public void liberar ()
	{
		this.internado=false;
	}
	
	public void status()
	{
		System.out.println("O nome do paciente �: "+this.nome);
		System.out.println("Endere�o: "+this.endereco);
		System.out.println("Emai-l :"+this.email);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("Idade: "+this.idade);
		System.out.println("O paciente est� internado? "+this.internado);

	}

}
