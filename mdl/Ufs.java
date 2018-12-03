package SGA;

public class Ufs { 
	
	private String siglaUf;
	
	public Ufs(String siglaUf) {
		
		this.siglaUf = siglaUf;
		
	}
	
	public int estados(String siglaUf) {		// compara a sigla inserida pelo usuário, com uma das siglas inseridas na classe UnidadesFederativas.
		if(siglaUf.equals(siglaUf));
		return 0;
	}
	public String getSiglaUf() {
		return siglaUf;
	}
	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	@Override
	public String toString() {
		return "UF:" + siglaUf;
	}
	
}
