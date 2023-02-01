package labs.heranca.exerc01;

public class ExecutarAplicacao {
	/*
		Crie as classes ( Funcionario, Gerente, Vendedor, Faxineiro),
		e faça Upcast e Downcast. (Polimorfismo)
	*/
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		// UpCast
		
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		// DownCast
		Vendedor vendedor_ = (Vendedor) new Funcionario();

	}

}
