package cesarPOO.atividadesAula12;

public class Main {

	public static void main(String[] args) {
		Cargo cargo;
		RelatorioCargos relatorio = new RelatorioCargos();
		
		cargo = new Diretor("Zé", 10000.0, 1500);
		relatorio.relatorio(cargo);
		System.out.println("-------------------------");
		
		
		cargo = new DiretorEstatutario("Oliveira", 5000.0, 500.0, 47);
		relatorio.relatorio(cargo);

		
	
	}
}
