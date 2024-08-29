package entidade;
import entidade.enums.Cargo;

public class Funcionario {

	private String nome;
	protected double salario;
	private Cargo cargo;
 
	public Funcionario(String nome, double salario, Cargo cargo) {
		 
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	public double receber(double salario) {

		return salario ;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", cargo=" + cargo +"]";
	}

}