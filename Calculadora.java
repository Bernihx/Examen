package ExamenUF2;
//EXAMEN DE BERNAT MONTERO =D
public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public int divideix() {
		int resul = num1 / num2;
		return resul;
	}
	
	public int potencia() {
		int resul = 1;
		for(int i = 0; i < num2;i++) {
			resul *= num1;
		}
		return resul;
	}
	
	public boolean residu(){
		int resul = 0;
		resul = num1 % num2;
		if(resul == 0) {
			return true;
		}
		else return false;
	}
}
