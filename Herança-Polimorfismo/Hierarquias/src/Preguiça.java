
public class Pregui�a extends Animal {
	private String deveSubirEmArvore;
	
	public Pregui�a (String nome, int idade, String emiteSom, String deveSubirEmArvore) {
		super (nome, idade, emiteSom);
		this.deveSubirEmArvore = deveSubirEmArvore;
	}

	public String getDeveSubirEmArvore() {
		return deveSubirEmArvore;
	}

	public void setDeveSubirEmArvore(String deveSubirEmArvore) {
		this.deveSubirEmArvore = deveSubirEmArvore;
	}
	
}
