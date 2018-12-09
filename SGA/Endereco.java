package SGA;

public class Endereco {
	
	private int tipoLogradouro; //Avenida, rua, praça, etc.
	private int codigoLogradouro; //CEP
	private String descricaoLogradouro; //Nome da rua
	private String complementoLogradouro; //Apt, quadra, lote
	private int numero;
	private String bairro;
	private Long municipio;
	private String referencia;
	
	public Endereco(int tipoLogradouro, int codigoLogradouro, String descricaoLogradouro, String complementoLogradouro,
			int numero, String bairro, Long municipio, String referencia) {
		
		this.tipoLogradouro = tipoLogradouro;
		this.codigoLogradouro = codigoLogradouro;
		this.descricaoLogradouro = descricaoLogradouro;
		this.complementoLogradouro = complementoLogradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.municipio = municipio;
		this.referencia = referencia;
	}
	
	public int getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(int tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public int getCodigoLogradouro() {
		return codigoLogradouro;
	}
	public void setCodigoLogradouro(int codigoLogradouro) {
		this.codigoLogradouro = codigoLogradouro;
	}
	public String getDescricaoLogradouro() {
		return descricaoLogradouro;
	}
	public void setDescricaoLogradouro(String descricaoLogradouro) {
		this.descricaoLogradouro = descricaoLogradouro;
	}
	public String getComplementoLogradouro() {
		return complementoLogradouro;
	}
	public void setComplementoLogradouro(String complementoLogradouro) {
		this.complementoLogradouro = complementoLogradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Long getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Long municipio) {
		this.municipio = municipio;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	@Override
	public String toString() {
		return "Endereco:" + tipoLogradouro + "\n" + codigoLogradouro
				+ " " + descricaoLogradouro + " " + complementoLogradouro
				+ " Nº" + numero + "\nBairro:" + bairro + "\nMunicipio:"
				+ municipio + "\nReferencia:" + referencia;
	}	
	
}
