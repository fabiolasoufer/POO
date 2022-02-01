package POO;

public class Aviao {
	
	String modelo, companhia;
	int assentos;
	float altitude;
	boolean voando;
	
	public void decolar()
	{
		this.voando=true;
	}
	public void pousar()
	{
		this.voando=false;
	}
	
	public void escrever()
	{
		if(this.voando==voando)
			System.out.println("Senhores passageiros, estamos decolando...");
		else
			System.out.println("Senhores passageiros, preparem-se para o pouso.");
	}
	
	public void status()
	{
		System.out.println("O modelo do avi�o �: "+this.modelo);
		System.out.println("Companhia �rea: "+this.companhia);
		System.out.println("A aeronave tem "+this.assentos+" assentos dispon�veis.");
		System.out.println("A altitude do voo �: "+this.altitude);
		System.out.println("Estamos decolando? "+this.voando);
	}

}
