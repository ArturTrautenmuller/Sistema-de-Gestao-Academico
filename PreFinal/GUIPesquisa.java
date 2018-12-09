import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class GUIPesquisa extends JFrame {
	private JPanel contentPane;

	
	public GUIPesquisa(Academicos aluno) {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(200, 200, 530, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaAcademico = new JLabel("Academico");//adicionar nome do academico
		lblConsultaAcademico.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConsultaAcademico.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaAcademico.setBounds(100, 35, 300, 55);
		contentPane.add(lblConsultaAcademico);
		setVisible(true);
		
		JLabel lblPreNome = new JLabel("Nome:");
		lblPreNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreNome.setBounds(10, 100, 76, 14);
		contentPane.add(lblPreNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSobrenome.setBounds(10, 130, 76, 14);
		contentPane.add(lblSobrenome);
		
		JLabel lblDataNascimento = new JLabel("Data de nascimento:");
		lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataNascimento.setBounds(10, 160, 123, 14);
		contentPane.add(lblDataNascimento);
		
		JLabel lblCidadeNascimento = new JLabel("Cidade nascimento:");
		lblCidadeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidadeNascimento.setBounds(10, 190, 110, 14);
		contentPane.add(lblCidadeNascimento);
		
		JLabel lblEstado = new JLabel("Estado Civil:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstado.setBounds(10, 250, 76, 14);
		contentPane.add(lblEstado);
		
		JLabel lblRua = new JLabel("Logradouro:");
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRua.setBounds(281, 100, 76, 14);
		contentPane.add(lblRua);
		
		JLabel lblNumero = new JLabel("Número:");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumero.setBounds(281, 130, 76, 14);
		contentPane.add(lblNumero);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblComplemento.setBounds(281, 160, 90, 14);
		contentPane.add(lblComplemento);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(281, 190, 90, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCep.setBounds(281, 220, 90, 14);
		contentPane.add(lblCep);
		
		JLabel lblTelRes = new JLabel("Telefone Res.");
		lblTelRes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelRes.setBounds(281, 280, 90, 14);
		contentPane.add(lblTelRes);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 280, 123, 14);
		contentPane.add(lblEmail);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade.setBounds(281, 250, 76, 14);
		contentPane.add(lblCidade);
		
		JLabel lblUfNascimento = new JLabel("UF nascimento:");
		lblUfNascimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUfNascimento.setBounds(10, 220, 110, 14);
		contentPane.add(lblUfNascimento);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMatricula.setBounds(281, 305, 90, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblSituacaoAcademica = new JLabel("Sit. academica:");
		lblSituacaoAcademica.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSituacaoAcademica.setBounds(10, 305, 90, 14);
		contentPane.add(lblSituacaoAcademica);
		
		JLabel lblPreNome2 = new JLabel(aluno.getPreNome());//Pegar dentro do banco de dados o nome do acadêmico
		lblPreNome2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreNome2.setBounds(142, 100, 76, 14);
		contentPane.add(lblPreNome2);
		
		JLabel lblSobrenome2 = new JLabel(aluno.getNome());
		lblSobrenome2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSobrenome2.setBounds(142, 130, 76, 14);
		contentPane.add(lblSobrenome2);
		
		JLabel lblDataNascimento2 = new JLabel(aluno.getDataNascimento());
		lblDataNascimento2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataNascimento2.setBounds(142, 160, 123, 14);
		contentPane.add(lblDataNascimento2);
		
		JLabel lblMunicipioNascimento2 = new JLabel(aluno.getMunicipioNascimento());
		lblMunicipioNascimento2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMunicipioNascimento2.setBounds(142, 190, 110, 14);
		contentPane.add(lblMunicipioNascimento2);
	
		JLabel lblUfNascimento2 = new JLabel(aluno.getUfNascimento());
		lblUfNascimento2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUfNascimento2.setBounds(142, 220, 110, 14);
		contentPane.add(lblUfNascimento2);
		
		JLabel lblEstadoCivil2 = new JLabel(aluno.getEstadoCivil());
		lblEstadoCivil2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstadoCivil2.setBounds(142, 250, 76, 14);
		contentPane.add(lblEstadoCivil2);
		
		JLabel lblEmail2 = new JLabel(aluno.geteMail().getPrefixo());
		lblEmail2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail2.setBounds(142, 280, 123, 14);
		contentPane.add(lblEmail2);
		
		JLabel lblLogradouro2 = new JLabel(aluno.getEndereco().getDescricaoLogradouro());
		lblLogradouro2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogradouro2.setBounds(394, 100, 76, 14);
		contentPane.add(lblLogradouro2);
		
		JLabel lblNumero2 = new JLabel(aluno.getEndereco().getNumero());
		lblNumero2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumero2.setBounds(394, 130, 76, 14);
		contentPane.add(lblNumero2);
		
		JLabel lblComplemento2 = new JLabel(aluno.getEndereco().getComplementoLogradouro());
		lblComplemento2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblComplemento2.setBounds(394, 160, 90, 14);
		contentPane.add(lblComplemento2);
		
		JLabel lblBairro2 = new JLabel(aluno.getEndereco().getBairro());
		lblBairro2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro2.setBounds(394, 190, 90, 14);
		contentPane.add(lblBairro2);
		
		JLabel lblCep2 = new JLabel(aluno.getEndereco().getCep());
		lblCep2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCep2.setBounds(394, 220, 90, 14);
		contentPane.add(lblCep2);
		
		JLabel lblCidade2 = new JLabel(aluno.getEndereco().getMunicipio());
		lblCidade2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade2.setBounds(394, 250, 76, 14);
		contentPane.add(lblCidade2);
		
		JLabel lblTelRes2 = new JLabel(aluno.getTelefone().getNumero());
		lblTelRes2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelRes2.setBounds(394, 280, 90, 14);
		contentPane.add(lblTelRes2);
		
		JLabel lblMatricula2 = new JLabel(Integer.toString(aluno.getMatricula()));
		lblMatricula2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMatricula2.setBounds(394, 305, 90, 14);
		contentPane.add(lblMatricula2);
		
		JLabel lblSituacaoAcademica2 = new JLabel(aluno.getSituacaoAcademica());
		lblSituacaoAcademica2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSituacaoAcademica2.setBounds(142, 305, 90, 14);
		contentPane.add(lblSituacaoAcademica2);
		
		
		
		JButton btnAlterarDados = new JButton("Alterar dados");
		btnAlterarDados.setBounds(80, 344, 150, 40);
		btnAlterarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new GUIAtualizar(aluno);
			}
		});
		contentPane.add(btnAlterarDados);
		
		JButton btnExcluirAcademico = new JButton("Excluir Acadêmico");
		btnExcluirAcademico.setBounds(280, 344, 150, 40);
		btnExcluirAcademico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dados.excluir(aluno.getMatricula());
				JOptionPane.showMessageDialog(null,"Cadastro deletado com sucesso");
				dispose();
			}
		});
		contentPane.add(btnExcluirAcademico);
		
		
	}
}
