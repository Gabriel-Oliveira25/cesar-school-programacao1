package cesarPOO.atividadesAula12;

public class ProgramaCargo2 {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		Cargo c1 = new Diretor();		
		Cargo c2 = new Gerente();
		Diretor d2 = (Diretor)c1;	
		
		//g1 = Gerente   / Gerente
		//c1 = Cargo    / Diretor
		//c2 = Cargo   / Gerente
		//d2 = Diretor/ Diretor
		
		
		DiretorEstatutario de1 = (Diretor)c2; 
		
		DiretorEstatutario de2 = (DiretorEstatutario)g1;
		
		DiretorEstatutario de3 = (DiretorEstatutario)c2;
	}
}