
public class Endereco {
	private String tipoLogradouro;
	private int codigoLogradouro;
	private String descricaoLogradouro;
	private String complementoLogradouro;
	private String numero;
	private String quadra;
	private String lote;
	private String bairro;
	private String municipio;
	private String unidadeFederacao;
	private String pais;
	private String referencia;
	private String cep;
	
	

	public Endereco(String tipoLogradouro, int codigoLogradouro, String descricaoLogradouro, String complementoLogradouro,
			String numero, String quadra, String lote, String bairro, String municipio, String unidadeFederacao, String pais,
			String referencia,String cep) {
		
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
		this.cep = cep;
	}
	
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
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
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUnidadeFederacao() {
		return unidadeFederacao;
	}
	public void setUnidadeFederacao(String unidadeFederacao) {
		this.unidadeFederacao = unidadeFederacao;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public String toString() {
		return "Endereco:" + tipoLogradouro + "\n" + codigoLogradouro
				+ " " + descricaoLogradouro + " " + complementoLogradouro
				+ " Nº" + numero + "Qd." + quadra + "Lt." + lote + "\nBairro:" + bairro + "\nMunicipio:"
				+ municipio + "\tUF:" + unidadeFederacao + "\nPais:" + pais + "\nReferencia:" + referencia;
	}	
}
