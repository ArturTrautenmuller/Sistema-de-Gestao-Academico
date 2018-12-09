package SGA;

public class Telefone {
	
	private int tipo;
	private String ddd;
	private String numero;

	    
	public Telefone(int tipo, String ddd, String numero){
		
		this.tipo=tipo;
		this.ddd=ddd;
		this.numero=numero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

	@Override
	public String toString() {
		return "tipo= " + tipo + ", ddd= " + ddd + ", numero= " + numero;
	}
	
	

}
