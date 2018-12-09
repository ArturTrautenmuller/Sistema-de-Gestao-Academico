
public class Pessoa {
	private String preNome;
	private String nome;
	private String dataNascimento;
	private String municipioNascimento;
	private String ufNascimento;
	private String paisNascimento;
	private String estadoCivil;
	private Telefone telefone;
	private Email eMail;
	private Endereco endereco;
	
	

	public Pessoa(String preNome, String nome, String dataNascimento, String municipioNascimento, 
			String ufNascimento, String paisNascimento, String estadoCivil, Telefone telefone, Email eMail,Endereco endereco){
		
		this.preNome=preNome;
		this.nome=nome;
		this.dataNascimento = dataNascimento;
		this.municipioNascimento = municipioNascimento;
		this.ufNascimento = ufNascimento;
		this.paisNascimento = paisNascimento;
		this.estadoCivil = estadoCivil;
		this.telefone=telefone;
		this.eMail = eMail;
		this.endereco = endereco;
	}
	
	public String getPreNome() {
		return preNome;
	}
	public void setPreNome(String preNome) {
		this.preNome = preNome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getMunicipioNascimento() {
		return municipioNascimento;
	}
	public void setMunicipioNascimento(String municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}
	public String getUfNascimento() {
		return ufNascimento;
	}
	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}
	public String getPaisNascimento() {
		return paisNascimento;
	}
	public void setPaisNascimento(String paisNascimento) {
		this.paisNascimento = paisNascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Email geteMail() {
		return eMail;
	}
	public void seteMail(Email eMail) {
		this.eMail = eMail;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Título: "+getPreNome()+"\nNome: "+getNome()+"\nNascimento:"+getDataNascimento()+"\nMunicípio de nascimento:"+getMunicipioNascimento()+
				"\nUF:"+getUfNascimento()+"\nPaís:"+getPaisNascimento()+"\nEstado civil:"+getEstadoCivil()+"\nTelefone:"+
				getTelefone()+"\nE-mail:"+geteMail();
	}
}
