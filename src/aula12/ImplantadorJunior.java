package aula12;

public class ImplantadorJunior extends Implantador {

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return ( getSalario() * 0.15 ) + getSalario();
	}

}
