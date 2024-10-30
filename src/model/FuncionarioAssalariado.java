package model; //pacote model

public class FuncionarioAssalariado implements Funcionario { //classe funcionario assalariado com o a interface 
	
	private double salarioAnual; //atributo salario fixo 

	public FuncionarioAssalariado(double salarioAnual) { //construtores e parametro 
		this.salarioAnual = salarioAnual;
	}

	@Override
	public double calcularBonus() { //método para retornar o bonus 
		return 500.00;
	}
}
