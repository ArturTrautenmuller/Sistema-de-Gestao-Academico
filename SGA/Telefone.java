package SGA;

public class Telefone {
	
	private int tipo;
	private int ddd;
	private int numero;

	    
	public Telefone(int tipo, int ddd, int numero){
		
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

	@Override
	public String toString() {
		return "Telefone [tipo=" + tipo + ", ddd=" + ddd + ", numero=" + numero + "]";
	}
	
	

}
