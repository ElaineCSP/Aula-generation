
public class TesteAnimal {
	public static void main(String args[]) {
		Cachorro Cachorro = new Cachorro("Dora", 3, "AuAuAu", "Ela corre");
		Cavalo Cavalo = new Cavalo("Dorivalda", 13, "hinn in in", "Ele cavalga");
		Pregui�a Pregui�a = new Pregui�a("Cachorro", 10, "i�� i�", "Ela sobe em �rvores");
		
		System.out.println(Cachorro.getEmiteSom());
		
		System.out.println(Cavalo.getEmiteSom());
		
		System.out.println(Pregui�a.getEmiteSom());
	}
	
}
