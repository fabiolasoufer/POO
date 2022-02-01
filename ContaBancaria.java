package POO;

public class ContaBancaria {
	
	String banco, titular;
	int agencia, conta, digito;
	float saldo;
	boolean positiva;
	
	public void sacar()
	{
		this.positiva=true;
	}
	
	public void depositar()
	{
		this.positiva=false;
	}
	
	public void status()
	{
		System.out.println("Titular: "+this.titular);
		System.out.println("Banco: "+this.banco);
		System.out.println("AG: "+this.agencia);
		System.out.println("C-C: "+this.conta);
		System.out.println("Dígito: "+this.digito);
		System.out.println("SALDO: "+this.saldo);
		System.out.println("Saldo positivo para saque? "+this.positiva);
	}

}
