package app; //pacote app

import model.Funcionario; //import do model 
import model.FuncionarioAssalariado;
import model.FuncionarioHorista;
 
public class Main { //classe main 

	public static void main(String[] args) {
		//instanciando e atibuindo valor
		Funcionario assalariado = new FuncionarioAssalariado (60000);
		System.out.println("Bônus do funcionário assalariado: R$ " + assalariado.calcularBonus());
		//instanciando e atribuindo valor 
		Funcionario horista = new FuncionarioHorista(45000);
		System.out.println("Bônus do funcionário horista: R$ " + horista.calcularBonus());

	}

}
