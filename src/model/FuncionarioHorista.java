package model;//pacote model

public class FuncionarioHorista implements Funcionario { //classe funcionario horista e implemntes em funcionario

	private double totalRecebidoAnual; //atributos do valor anual
	
	public FuncionarioHorista(double  totalRecebidoAnual) { //contrutores e parametros 
		this.totalRecebidoAnual = totalRecebidoAnual;
	}

	@Override
	public double calcularBonus() {	//método para calcular bonus anual
		return totalRecebidoAnual * 0.10; //return do valor multiplicado
	}
}
