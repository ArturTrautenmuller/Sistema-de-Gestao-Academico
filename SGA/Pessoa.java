package SGA;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import sistemaAcademico.DocumentoIdentificacao;
import sistemaAcademico.Email;
import sistemaAcademico.Endereco;
import sistemaAcademico.SistemaAcademico;
import sistemaAcademico.Telefone;

public class Pessoa extends JFrame{
	
	private static String preNome;
	private static String sobrenome;
	private static String dataNascimento;
	private static String municipioNascimento;
	private static String ufNascimento;
	private static String estadoCivil;
	private static Telefone telefone;
	private static Email email;
	
	public Pessoa(String preNome, String sobrenome, String dataNascimento, String municipioNascimento, 
			String ufNascimento, String estadoCivil, Telefone telefone, Email email){
		
		this.preNome=preNome;
		this.sobrenome=sobrenome;
		this.dataNascimento = dataNascimento;
		this.municipioNascimento = municipioNascimento;
		this.ufNascimento = ufNascimento;
		this.estadoCivil = estadoCivil;
		this.telefone=telefone;
		this.email = email;
	}
	
	public static String getPreNome() {
		return preNome;
	}
	public void setPreNome(String preNome) {
		this.preNome = preNome;
	}
	public static String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome= sobrenome;
	}
	public static String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public static String getMunicipioNascimento() {
		return municipioNascimento;
	}
	public void setMunicipioNascimento(String municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}
	public static String getUfNascimento() {
		return ufNascimento;
	}
	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}
	public static String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public static Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public static Email getEmail() {
		return email;
	}
	public void seteMail(Email eMail) {
		this.email = eMail;
	}
	@Override
	public String toString() {
		return "Título: "+getPreNome()+"\nNome: "+getSobrenome()+"\nNascimento:"+getDataNascimento()+"\nMunicípio de nascimento:"+getMunicipioNascimento()+
				"\nUF:"+getUfNascimento()+"\nEstado civil:"+getEstadoCivil()+"\nTelefone:"+
				getTelefone()+"\nE-mail:"+getEmail();
	}

	public Pessoa(){
		super();
	}
	
	
}
