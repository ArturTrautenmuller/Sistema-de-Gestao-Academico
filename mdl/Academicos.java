package SGA;



public class Academicos extends Pessoa {
		
		private String matricula;
		private String situacaoAcademica;
		private Documento documento;		//Estabelece documento como um atributo tipo Documento
		
		
		public Academicos(String preNome, String nome, String dataNascimento, String municipioNascimento,
				String ufNascimento, String paisNascimento, String estadoCivil, Telefone telefone, Email eMail,
				String matricula, String situacaoAcademica, Documento documento) {
			super(preNome, nome, dataNascimento, municipioNascimento, ufNascimento, paisNascimento, estadoCivil,
					telefone, eMail);
			
			this.matricula = matricula;
			this.situacaoAcademica = situacaoAcademica;
			this.documento = documento;
		}

		/*public String verificaMatricula() {
			//verificar matricula já utilizada
			if(novaMatricula != getMatricula()) {
				
				System.out.println("Matricula Disponivel para cadastro!");
			}else {
				System.out.println("Matricula já cadastrada no sistema, por favor validar outra matricula!");
			}
		}*/
		
		 
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getSituacaoAcademica() {
			return situacaoAcademica;
		}
		public void setSituacaoAcademica(String situacaoAcademica) {
			this.situacaoAcademica = situacaoAcademica;
		}
		public Documento getDocumento() {		//chama e preenche dados solicitados na classe Documento
			return documento;
		}
		public void setDocumento(Documento documento) {
			this.documento = documento;
		}
		@Override
		public String toString(){
			return super.toString()+"Matricula: "+getMatricula()+"\nSituação:"+getSituacaoAcademica()+ "Dados:"+getDocumento();
		}
}
