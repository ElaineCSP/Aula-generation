package Heran�a;

public class Empregado extends Pessoa1{
	private int codigoSetor;
	private static double salarioBase;
	private static double imposto;
	
	public Empregado (String nome, String endere�o, int telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, endere�o, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	static void calcularSalario() {
		System.out.println("O valor do s�lario �: " + (salarioBase - ((imposto * salarioBase)/100)));
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public static double getSalarioBase() {
		return salarioBase;
	}

	public static void setSalarioBase(double salarioBase) {
		Empregado.salarioBase = salarioBase;
	}

	public static double getImposto() {
		return imposto;
	}

	public static void setImposto(double imposto) {
		Empregado.imposto = imposto;
	}

}
