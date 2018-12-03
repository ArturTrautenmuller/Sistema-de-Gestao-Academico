package SGA;

public class Endereco {
	
	private int tipoLogradouro;
	private int codigoLogradouro;
	private String descricaoLogradouro;
	private String complementoLogradouro;
	private int numero;
	private String quadra;
	private String lote;
	private String bairro;
	private Long municipio;
	private int unidadeFederacao;
	private int pais;
	private String referencia;
	
	public Endereco(int tipoLogradouro, int codigoLogradouro, String descricaoLogradouro, String complementoLogradouro,
			int numero, String quadra, String lote, String bairro, Long municipio, int unidadeFederacao, int pais,
			String referencia) {
		
		this.tipoLogradouro = tipoLogradouro;
		this.codigoLogradouro = codigoLogradouro;
		this.descricaoLogradouro = descricaoLogradouro;
		this.complementoLogradouro = complementoLogradouro;
		this.numero = numero;
		this.quadra = quadra;
		this.lote = lote;
		this.bairro = bairro;
		this.municipio = municipio;
		this.unidadeFederacao = unidadeFederacao;
		this.pais = pais;
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
	public String getQuadra() {
		return quadra;
	}
	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
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
	public int getUnidadeFederacao() {
		return unidadeFederacao;
	}
	public void setUnidadeFederacao(int unidadeFederacao) {
		this.unidadeFederacao = unidadeFederacao;
	}
	public int getPais() {
		return pais;
	}
	public void setPais(int pais) {
		this.pais = pais;
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
				+ " Nº" + numero + "Qd." + quadra + "Lt." + lote + "\nBairro:" + bairro + "\nMunicipio:"
				+ municipio + "\tUF:" + unidadeFederacao + "\nPais:" + pais + "\nReferencia:" + referencia;
	}	
	
}
