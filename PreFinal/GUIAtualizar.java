import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUIAtualizar extends JFrame {
	private JPanel contentPane;
	private JTextField textPreNome;
	private JTextField textSobrenome;
	private JTextField textData;
	private JTextField textRua;
	private JTextField textNum;
	private JTextField textComplemento;
	private JTextField textBairro;
	private JTextField textCEP;
	private JTextField textTelefoneResidencial;
	private JTextField textEmail;
	private JTextField textCidadeNatal;
	private JTextField textDDDResidencial;
	private JTextField textDDDCelular;
	private JTextField textTelefoneCelular;
	private JTextField textDocumento;
	
	public GUIAtualizar(Academicos aluno) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro de novo academico");
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setBounds(100, 11, 300, 50);
		contentPane.add(lblCadastro);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(10, 100, 76, 14);
		contentPane.add(lblNome);
		
		textPreNome = new JTextField(aluno.getPreNome());
		textPreNome.setBounds(144, 100, 112, 20);
		contentPane.add(textPreNome);
		textPreNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSobrenome.setBounds(10, 130, 76, 14);
		contentPane.add(lblSobrenome);
		
		textSobrenome = new JTextField(aluno.getNome());
		textSobrenome.setColumns(10);
		textSobrenome.setBounds(144, 130, 112, 20);
		contentPane.add(textSobrenome);
		
		textData = new JTextField(aluno.getDataNascimento());
		textData.setColumns(10);
		textData.setBounds(144, 160, 112, 20);
		contentPane.add(textData);
		
		JLabel lblDataNascimento = new JLabel("Data de nascimento:");
		lblDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataNascimento.setBounds(10, 160, 123, 14);
		contentPane.add(lblDataNascimento);
		
		JLabel lblCidade = new JLabel("Cidade nascimento:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidade.setBounds(10, 190, 110, 14);
		contentPane.add(lblCidade);
		
		JComboBox boxCidade = new JComboBox();
		boxCidade.setModel(new DefaultComboBoxModel(new String[] {"Goiânia", "Aparecida de Goiânia"}));
		boxCidade.setToolTipText("Cidades");
		boxCidade.setBounds(412, 250, 112, 22);
		contentPane.add(boxCidade);
		
		JLabel lblEstado = new JLabel("Estado Civil:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstado.setBounds(10, 250, 76, 14);
		contentPane.add(lblEstado);
		
		JComboBox boxEstadoCivil = new JComboBox();
		boxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"Solteiro", "Casado", "Desquitado", "Divorciado", "Viúvo", "União Estável", "Outro"}));
		boxEstadoCivil.setToolTipText("");
		boxEstadoCivil.setBounds(144, 250, 112, 22);
		contentPane.add(boxEstadoCivil);
		
		textRua = new JTextField(aluno.getEndereco().getDescricaoLogradouro());
		textRua.setColumns(10);
		textRua.setBounds(411, 100, 112, 20);
		contentPane.add(textRua);
		
		JLabel lblNumero = new JLabel("Número:");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumero.setBounds(277, 131, 76, 14);
		contentPane.add(lblNumero);
		
		textNum = new JTextField(aluno.getEndereco().getNumero());
		textNum.setColumns(10);
		textNum.setBounds(412, 130, 112, 20);
		contentPane.add(textNum);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblComplemento.setBounds(277, 161, 90, 14);
		contentPane.add(lblComplemento);
		
		textComplemento = new JTextField(aluno.getEndereco().getComplementoLogradouro());
		textComplemento.setColumns(10);
		textComplemento.setBounds(412, 160, 112, 20);
		contentPane.add(textComplemento);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairro.setBounds(277, 191, 90, 14);
		contentPane.add(lblBairro);
		
		textBairro = new JTextField(aluno.getEndereco().getBairro());
		textBairro.setColumns(10);
		textBairro.setBounds(412, 190, 112, 20);
		contentPane.add(textBairro);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCep.setBounds(277, 221, 90, 14);
		contentPane.add(lblCep);
		
		textCEP = new JTextField(aluno.getEndereco().getCep());
		textCEP.setColumns(10);
		textCEP.setBounds(412, 220, 112, 20);
		contentPane.add(textCEP);

		
		JLabel lblTelefone = new JLabel("DDD+Tel (Residencial)");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefone.setBounds(277, 281, 123, 14);
		contentPane.add(lblTelefone);
		
		textTelefoneResidencial = new JTextField(aluno.getTelefone().getNumero());
		textTelefoneResidencial.setColumns(10);
		textTelefoneResidencial.setBounds(453, 280, 71, 20);
		contentPane.add(textTelefoneResidencial);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 280, 123, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField(aluno.geteMail().getPrefixo());
		textEmail.setColumns(10);
		textEmail.setBounds(144, 280, 112, 20);
		contentPane.add(textEmail);
		
		JLabel lblDadosPessoais = new JLabel("Dados Pessoais");
		lblDadosPessoais.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosPessoais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDadosPessoais.setBounds(10, 60, 123, 29);
		contentPane.add(lblDadosPessoais);
		
		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEndereco.setBounds(325, 60, 123, 29);
		contentPane.add(lblEndereco);
		
		JComboBox boxTipoLogradouro = new JComboBox();
		boxTipoLogradouro.setModel(new DefaultComboBoxModel(new String[] {"Rua", "Avenida", "Alameda", "Beco", "Boulevard", "Caminho", "Cais", "Campo", "Escada", "Estrada", "Favela", "Fazenda", "Floresta", "Ilha\t", "Jardim", "Ladeira", "Largo", "Loteamento", "Lugar", "Morro", "Parque", "Passeio", "Praia", "Pra\u00E7a", "Recanto", "Rodovia", "Servidao", "Travessa", "Via", "Vila", "Outro"}));
		boxTipoLogradouro.setToolTipText("");
		boxTipoLogradouro.setBounds(269, 100, 90, 22);
		contentPane.add(boxTipoLogradouro);
		
		
		JLabel label = new JLabel("Cidade:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(277, 251, 76, 14);
		contentPane.add(label);
		
		textCidadeNatal = new JTextField(aluno.getMunicipioNascimento());
		textCidadeNatal.setColumns(10);
		textCidadeNatal.setBounds(144, 190, 112, 20);
		contentPane.add(textCidadeNatal);
		
		JLabel lblUfNascimento = new JLabel("UF nascimento:");
		lblUfNascimento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUfNascimento.setBounds(10, 220, 110, 14);
		contentPane.add(lblUfNascimento);
		
		textDDDResidencial = new JTextField();
		textDDDResidencial.setColumns(10);
		textDDDResidencial.setBounds(412, 280, 40, 20);
		contentPane.add(textDDDResidencial);
		
		JComboBox boxUfNascimento = new JComboBox();
		boxUfNascimento.setModel(new DefaultComboBoxModel(new String[] {"Acre AC", "Alagoas AL", "Amapa AP", "Amazonas AM", "Bahia BA", "Ceara CE", "Distrito Federal DF", "Espirito Santo ES", "Goias GO", "Maranhao MA", "Mato Grosso MT", "Mato Grosso do Sul MS", "Minas Gerais MG", "Para PA ", "Paraiba PB", "Parana PR", "Pernambuco PE", "Piaui PI", "Rio de Janeiro RJ", "Rio Grande do Norte RN", "Rio Grande do Sul RS", "Rondonia RO", "Roraima RR", "Santa Catarina SC", "Sao Paulo SP", "Sergipe SE", "Tocantins TO"}));
		boxUfNascimento.setToolTipText("Cidades");
		boxUfNascimento.setBounds(144, 220, 112, 22);
		contentPane.add(boxUfNascimento);
		
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDocumento.setBounds(10, 311, 123, 14);
		contentPane.add(lblDocumento);
		
		textDocumento = new JTextField(aluno.getDocumento().getNumero());
		textDocumento.setColumns(10);
		textDocumento.setBounds(144,311,112,20);
		contentPane.add(textDocumento);
		
		
		JButton btnAtualiza =  new JButton("Atualizar");
		btnAtualiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					if(textPreNome.getText().equals("") || textSobrenome.getText().equals("") || textData.getText().equals("") || textCidadeNatal.getText().equals("") || textDocumento.getText().equals("") || textRua.getText().equals("") || textNum.getText().equals("") || textBairro.getText().equals("") || textCEP.getText().equals("")) throw new Exception("");					
							
						
					Telefone tel = new Telefone("Residencial","555", textDDDResidencial.getText(),textTelefoneResidencial.getText(),"");
					Email email = new Email(textEmail.getText(),"");
					Documento doc = new Documento("rg",textDocumento.getText(),"","SSP","Brasil");
					
					Endereco endereco = new Endereco(boxTipoLogradouro.getSelectedItem().toString(),0,textRua.getText(),textComplemento.getText(),textNum.getText(),
							"","",textBairro.getText(),boxCidade.getSelectedItem().toString(),"Goias","Brasil","",textCEP.getText());
					
					Academicos aluno1 = new Academicos(textPreNome.getText(),textSobrenome.getText(),textData.getText(),
							textCidadeNatal.getText(), boxUfNascimento.getSelectedItem().toString(),"Brasil",boxEstadoCivil.getSelectedItem().toString(),tel,email,
							"matriculado",doc,endereco);
					aluno1.setMatricula(aluno.getMatricula());
					
					Dados.atualizar(aluno1);
					JOptionPane.showMessageDialog(null, "cadastro atualizado com sucesso");
					}
					catch(Exception e) {
						
						JOptionPane.showMessageDialog(null, "Por favor, preencha os campos obrigatórios");
					}
			}
		});
		btnAtualiza.setBounds(210, 430, 100, 23);
		contentPane.add(btnAtualiza);
		
		setVisible(true);
		
		
		
		
		
	}
}
