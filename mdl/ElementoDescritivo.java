package SGA;

public class ElementoDescritivo {		// faz padrão de dados para todas as informações que podem ser abreviadas
	
	int codigo;
	private String descricaoAbreviada;
	private String descricaoCompleta;
	
	public ElementoDescritivo() {
		
		 	this.setCodigo(0);
		 	this.setDescricaoAbreviada("");
		 	this.setDescricaoCompleta("");
		}
				
		
	    public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getDescricaoAbreviada() {
			return descricaoAbreviada;
		}
		public void setDescricaoAbreviada(String descricaoAbreviada) {
			this.descricaoAbreviada = descricaoAbreviada;
		}
		public String getDescricaoCompleta() {
			return descricaoCompleta;
		}
		public void setDescricaoCompleta(String descricaoCompleta) {
			this.descricaoCompleta = descricaoCompleta;
		}
		public void setElementoDescritivo(int codigo, String descricaoAbrev,String descricaoCpt) {
			this.codigo=codigo;
			this.descricaoAbreviada=descricaoAbrev;
			this.descricaoCompleta=descricaoCpt;
		}


		@Override
		public String toString() {
			return codigo + " " + descricaoAbreviada
					+ " " + descricaoCompleta;
		}
		
}
