package sistemaAcademico;
/*
 * Nome.......: DocumentoIdentificacao
 * Objetivo...: Representa um documento de identificação de uma Pessoa
 * Observacoes:
 */
public class DocumentoIdentificacao {
	/*
	 * tipo                          <veja tipos de documentos possíveis>
	 * numero                        1 .. 
	 * complemento                   complemento do número (por exemplo, letras)
	 * orgaoExpedidor                orgão que expediu o documento
	 * pais                          código do país emissor do documento
	 */
	private int                     tipo;
	private long                    numero;
	private String                  complemento;
	private String                  orgaoExpedidor;
	private int                     pais;


	public DocumentoIdentificacao(int tipo, long numero, String complemento, String orgaoExpedidor, int pais) {
		this.tipo = tipo;
		this.numero = numero;
		this.complemento = complemento;
		orgaoExpedidor = orgaoExpedidor;
		this.pais = pais;
	}

	public DocumentoIdentificacao() {
	}


	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	public int getPais() {
		return pais;
	}
	public void setPais(int pais) {
		this.pais = pais;
	}
	

}
