package POO;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.nome="Fab�ola";
		f1.email="fabiolasoufer@gmail.com";
		f1.telefone="11 97999-9999";
		f1.idade=26;
		f1.endereco="S�o Paulo";
		f1.trabalhar();
		f1.status();
	}

}
