package POO;

public class ObjetoPaciente {

	public static void main(String[] args) {
		
			Paciente p1 = new Paciente();
			
			p1.nome="Fab�ola";
			p1.email="fabiolasoufer@gmail.com";
			p1.telefone="11 97999-9999";
			p1.idade=26;
			p1.endereco="S�o Paulo";
			p1.liberar();
			p1.status();
		
	}

}
