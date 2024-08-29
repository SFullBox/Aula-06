package entidade;

import entidade.enums.Cargo;

//import entidade.Funcionario;
public class pj extends Funcionario {

	private double adicional;

	public pj(String nome, double salario, Cargo cargo, double adicional) {
		super(nome, salario, cargo);
		this.adicional = adicional;
	}

	public double receber() {

		return super.receber(salario + adicional);

	}

}