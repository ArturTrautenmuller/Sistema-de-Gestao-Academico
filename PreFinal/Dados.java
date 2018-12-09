import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Dados {

	public static void cadastrar(Academicos aluno) {
		Email email = aluno.geteMail();
		Endereco endereco = aluno.getEndereco();
		Telefone tel = aluno.getTelefone();
		String numTel = ""+tel.getDdd()+""+tel.getNumero();
		Documento doc = aluno.getDocumento();
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sga", "root", "");
			Statement stmt = con.createStatement();
			String sql = "insert into cadastro(Nome,Sobrenome,ddn,CidadeNascimento,UFNascimento,EstadoCivil,"
					+ "Email,Rua,Numero,Complemento,Bairro,CEP,Cidade,TelefoneResidencial,SituacaoAcademica,Documento)"
					+ "values ('"+aluno.getPreNome()+"','"+aluno.getNome()+"','"+aluno.getDataNascimento()+"','"+aluno.getMunicipioNascimento()+"','"+aluno.getUfNascimento()+"','"+aluno.getEstadoCivil()+"','"+email.getPrefixo()+"','"+endereco.getDescricaoLogradouro()+"','"+endereco.getNumero()+"','"+endereco.getComplementoLogradouro()+"','"+endereco.getBairro()+"','"+endereco.getCep()+"','"+endereco.getMunicipio()+"','"+numTel+"','"+aluno.getSituacaoAcademica()+"','"+doc.getNumero()+"') ";
			stmt.executeUpdate(sql);
			
		} 
		
		
		catch(Exception e) {JOptionPane.showMessageDialog(null, e.getMessage());}
		
	}
	
	public static ArrayList<Academicos> pesquisar(String nome){
		ArrayList<Academicos> alunos = new ArrayList<Academicos>();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sga", "root", "");
			Statement stmt = con.createStatement();
			String sql = "select * from cadastro where Nome ='"+nome+"' ";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				Telefone tel = new Telefone("residencial","555","",rs.getString(15),"");
				Email email = new Email(rs.getString(8),"");
				Documento doc = new Documento("rg",rs.getString(17),"","SSP","Brasil");
				Endereco endereco = new Endereco("",0,rs.getString(9),rs.getString(10),rs.getString(10),"","",rs.getString(12),rs.getString(14),"Goias","Brasil","",rs.getString(13));
				Academicos aluno = new Academicos(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),"Brasil",rs.getString(7),tel,email,rs.getString(16),doc,endereco);
				aluno.setMatricula(rs.getInt(1));
				alunos.add(aluno);
			}
			
			
		} 
		
		
		catch(Exception e) {JOptionPane.showMessageDialog(null, e.getMessage());}
		return alunos;
		
		
	}
	
	public static void atualizar(Academicos aluno) {
		Email email = aluno.geteMail();
		Endereco endereco = aluno.getEndereco();
		Telefone tel = aluno.getTelefone();
		String numTel = ""+tel.getDdd()+""+tel.getNumero();
		Documento doc = aluno.getDocumento();
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sga", "root", "");
			Statement stmt = con.createStatement();
			String sql = "update cadastro set Nome = '"+aluno.getPreNome()+"', Sobrenome = '"+aluno.getNome()+"', ddn = '"+aluno.getDataNascimento()+"', CidadeNascimento = '"+aluno.getMunicipioNascimento()+"', UFNascimento = '"+aluno.getUfNascimento()+"', EstadoCivil = '"+aluno.getEstadoCivil()+"',Email = '"+email.getPrefixo()+"', Rua = '"+endereco.getDescricaoLogradouro()+"', Numero = '"+endereco.getNumero()+"', Complemento = '"+endereco.getComplementoLogradouro()+"', Bairro = '"+endereco.getBairro()+"',CEP = '"+endereco.getCep()+"', Cidade = '"+endereco.getMunicipio()+"', TelefoneResidencial = '"+tel.getNumero()+"', Documento = '"+doc.getNumero()+"' where Matricula = "+aluno.getMatricula();
			stmt.executeUpdate(sql);
			
			
		} 
		
		
		catch(Exception e) {JOptionPane.showMessageDialog(null, e.getMessage());}
		
	}
	
	public static void excluir(int matricula) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sga", "root", "");
			Statement stmt = con.createStatement();
			String sql = " delete from cadastro where Matricula = "+matricula;
			stmt.executeUpdate(sql);
			
		} 
		
		
		catch(Exception e) {JOptionPane.showMessageDialog(null, e.getMessage());}
		
	}
}


