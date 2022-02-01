package POO;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nome="Fabíola";
		cliente1.email="fabiolasoufer@gmail.com";
		cliente1.telefone="11 97999-9999";
		cliente1.idade=26;
		cliente1.endereco="São Paulo";
		cliente1.comprar();
		cliente1.status();
		

	}

}
