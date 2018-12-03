package SGA;

public class Telefone {
	
	private int tipo;
	private int ddi;
	private int ddd;
	private int numero;
	private int ramal;
	    
	public Telefone(int tipo, int ddi, int ddd, int numero, int ramal){
		
		this.tipo=tipo;
		this.ddi=ddi;
		this.ddd=ddd;
		this.numero=numero;
		this.ramal=ramal;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getDdi() {
		return ddi;
	}

	public void setDdi(int ddi) {
		this.ddi = ddi;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	@Override
	public String toString() {
		return "Telefone:" + tipo + " " + ddi + " (" + ddd + ")" + numero + "  ramal:" + ramal;
	}
	

}
