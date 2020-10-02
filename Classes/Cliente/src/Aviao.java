
public class Aviao {
	private int dia;
	private String mes;
	private int ano;
	private int numeroVoo;
	
	public Aviao(int dia, String mes, int ano, int numeroVoo) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.numeroVoo = numeroVoo;
	}
	
	public String getDadosVoo() {
		String dadosDoVoo = dia + "/" + mes + "/" + ano + " - " + numeroVoo;
		return dadosDoVoo; 
	}
	
}
