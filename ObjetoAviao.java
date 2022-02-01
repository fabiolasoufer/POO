package POO;

public class ObjetoAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.modelo="Boeing";
		aviao1.companhia="Gol";
		aviao1.assentos=33;
		aviao1.altitude=20.000f;
		aviao1.decolar();
		aviao1.status();
		aviao1.escrever();
		
		

	}

}
