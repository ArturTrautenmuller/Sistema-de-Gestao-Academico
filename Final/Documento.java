
public class Documento {
	private String tipo;
    private String numero;
    private String complemento;
    private String orgaoExpedidor;
    private String pais;
    
	public Documento(String tipo, String numero,String complemento,String orgaoExpeditor,String pais) {
		this.tipo=tipo;
		this.numero=numero;
		this.complemento=complemento;
		this.orgaoExpedidor=orgaoExpeditor;
		this.pais=pais;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@Override
	public String toString() {
		return "Documento:" + tipo + ", Nº:" + numero + ", Complemento:" + complemento + ", Órgão Expedidor:"
				+ orgaoExpedidor + ", País:" + pais + ".";
	}
}
