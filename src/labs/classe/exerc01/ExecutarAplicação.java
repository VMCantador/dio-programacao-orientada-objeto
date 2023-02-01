package labs.classe.exerc01;

public class ExecutarAplicação {

	/*
	Parte 4 - Evolua o conceito criando objetos da classe "Carro".
	Utiliza os métodos set/get, quando aplicaveis, para definir valores dos atributos e 
	exibir esses valores. Passe uma mensgem para o cálculo d total para encher o tanque.
	*/
	
	public static void main(String[] args) {
		
		
		// Construtor comum sem parametros.
		
		Carro carro1 =new Carro();
		
		carro1.setCor("Azul;");
		carro1.setModelo("Golf MK8");
		carro1.setCapacidadeTanque(70);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.valorTanque(2.50));
		
		
		// Construtor com parametros utilizando sobrecarga.
		
		Carro carro2 = new Carro("Cinza", "BMW Z3", 66);
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.valorTanque(1.50));
	}

}
