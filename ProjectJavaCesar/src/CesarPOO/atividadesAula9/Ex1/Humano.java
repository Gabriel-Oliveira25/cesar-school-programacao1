package cesarPOO.atividadesAula9.Ex1;
import java.time.LocalDate;
import java.time.Period;


public class Humano {

	private String nome;
	private int rg;
	private int idade;
	private int anoDeNascimento;
	private int mesDeNascimento;
	private int diaDeNascimento;
	
	
	
	public Humano() {
		
	}
	
	public Humano(String nome, int diaDeNascimento, int anoDeNascimento) {
		this.nome = nome;
		this.diaDeNascimento = diaDeNascimento;
		this.anoDeNascimento = anoDeNascimento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getDiaDeNascimento() {
		return diaDeNascimento;
	}
	public void setDiaDeNascimento(int diaDeNascimento) {
		this.diaDeNascimento = diaDeNascimento;
	}
	
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	public int getMesDeNascimento() {
		return mesDeNascimento;
	}

	public void setMesDeNascimento(int mesDeNascimento) {
		this.mesDeNascimento = mesDeNascimento;
	}
	
	public void  calcularIdade() {
		LocalDate dataNascimento = LocalDate.of(getAnoDeNascimento(), getMesDeNascimento(), getDiaDeNascimento());
		LocalDate hoje = LocalDate.now();
		int idade = Period.between(dataNascimento, hoje).getYears();
		setIdade(idade);		
	}
	
	public void ajustarDataDeNascimento(int dia, int mes, int ano) {
		setDiaDeNascimento(dia);
		setMesDeNascimento(mes);
		setAnoDeNascimento(ano);
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
}
