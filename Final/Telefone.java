
public class Telefone {
	private String tipo;
	private String ddi;
	private String ddd;
	private String numero;
	private String ramal;
	    
	public Telefone(String tipo, String ddi, String ddd, String numero, String ramal){
		
		this.tipo=tipo;
		this.ddi=ddi;
		this.ddd=ddd;
		this.numero=numero;
		this.ramal=ramal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDdi() {
		return ddi;
	}

	public void setDdi(String ddi) {
		this.ddi = ddi;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	@Override
	public String toString() {
		return "Telefone:" + tipo + " " + ddi + " (" + ddd + ")" + numero + "  ramal:" + ramal;
	}
}
