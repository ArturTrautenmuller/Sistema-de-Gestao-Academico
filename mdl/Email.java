package SGA;

public class Email {
	
	private String prefixo;
	private String sufixo;
	public Email(String prefixo, String sufixo) {
		
		this.prefixo = prefixo;
		this.sufixo = sufixo;
		
	}
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public String getSufixo() {
		return sufixo;
	}
	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}
	
	@Override
	public String toString() {
		return "Email:" + prefixo + "@" + sufixo;
	}
	

}
