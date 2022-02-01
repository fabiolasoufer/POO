package POO;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.titular="FABÍOLA SOUZA";
		conta1.banco="Itaú";
		conta1.agencia=1016;
		conta1.conta=8888;
		conta1.digito=8;
		conta1.saldo=588.88f;
		conta1.sacar();
		conta1.status();
		

	}

}
