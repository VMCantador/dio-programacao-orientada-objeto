package labs.classe.exerc01;

	// Parte 1 - Crie uma classe chamada Carro.

public class Carro {

	// Parte 2 - Evolua a clase carro com três atributos(Cor, Modelo e Capacidade do tamque).
		
		String cor;
		String modelo;
		int capacidadeTanque;
		
	/*
		Parte 3 - Evolua o conceito e defina um metodo para calcular o valor total
		para encher o tamque. Este deve receber como parâmetro o valor da gasolina.
		Faça tambem duas sobrecarga do construtor.
	*/
		
	
		// Construtor
		
		Carro(){
			
		}
		
		Carro(String cor, String modelo, int capacidadeTanque){
			this.cor = cor;
			this.modelo = modelo;
			this.capacidadeTanque = capacidadeTanque;
		}
		
		// Set, Get
		
		void setCor(String cor) {
			this.cor = cor;
		}
		
		String getCor() {
			return cor;
		}
		
		void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		String getModelo() {
			return modelo;
		}
					
		void setCapacidadeTanque(int capacidadeTanque) {
			this.capacidadeTanque = capacidadeTanque;
		}
		
		int getCapacidadeTanque() {
			return capacidadeTanque;
		}
		
		// total abastecimento
		
		double valorTanque(double valorCombustivel) {
			return capacidadeTanque * valorCombustivel;
		}
		
}
