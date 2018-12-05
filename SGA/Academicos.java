package SGA;

import java.awt.Font;
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

import SGA.Documento;
import SGA.Email;
import SGA.Endereco;
import SGA.Pessoa;
import SGA.SistemaAcademico;
import SGA.Telefone;

public class Academicos extends Pessoa {
		
		private String matricula;
		private String situacaoAcademica;
		private Documento documento;		//Estabelece documento como um atributo tipo Documento
		
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
		
		
		public Academicos(String preNome, String sobrenome, String dataNascimento, String municipioNascimento,
				String ufNascimento, String paisNascimento, String estadoCivil, Telefone telefone, Email eMail,
				String matricula, String situacaoAcademica, Documento documento) {
			super();
			
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
		
		//Construtor para criação da GUI de um novo usuário
		public Academicos(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 550, 440);
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
			
			textPreNome = new JTextField();
			textPreNome.setBounds(144, 100, 112, 20);
			contentPane.add(textPreNome);
			textPreNome.setColumns(10);
			
			JLabel lblSobrenome = new JLabel("Sobrenome:");
			lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSobrenome.setBounds(10, 130, 76, 14);
			contentPane.add(lblSobrenome);
			
			textSobrenome = new JTextField();
			textSobrenome.setColumns(10);
			textSobrenome.setBounds(144, 130, 112, 20);
			contentPane.add(textSobrenome);
			
			textData = new JTextField();
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
			
			textRua = new JTextField();
			textRua.setColumns(10);
			textRua.setBounds(411, 100, 112, 20);
			contentPane.add(textRua);
			
			JLabel lblNumero = new JLabel("Número:");
			lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNumero.setBounds(277, 131, 76, 14);
			contentPane.add(lblNumero);
			
			textNum = new JTextField();
			textNum.setColumns(10);
			textNum.setBounds(412, 130, 112, 20);
			contentPane.add(textNum);
			
			JLabel lblComplemento = new JLabel("Complemento:");
			lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblComplemento.setBounds(277, 161, 90, 14);
			contentPane.add(lblComplemento);
			
			textComplemento = new JTextField();
			textComplemento.setColumns(10);
			textComplemento.setBounds(412, 160, 112, 20);
			contentPane.add(textComplemento);
			
			JLabel lblBairro = new JLabel("Bairro:");
			lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblBairro.setBounds(277, 191, 90, 14);
			contentPane.add(lblBairro);
			
			textBairro = new JTextField();
			textBairro.setColumns(10);
			textBairro.setBounds(412, 190, 112, 20);
			contentPane.add(textBairro);
			
			JLabel lblCep = new JLabel("CEP:");
			lblCep.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCep.setBounds(277, 221, 90, 14);
			contentPane.add(lblCep);
			
			textCEP = new JTextField();
			textCEP.setColumns(10);
			textCEP.setBounds(412, 220, 112, 20);
			contentPane.add(textCEP);

			
			JLabel lblTelefone = new JLabel("DDD+Tel (Residencial)");
			lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTelefone.setBounds(277, 281, 123, 14);
			contentPane.add(lblTelefone);
			
			textTelefoneResidencial = new JTextField();
			textTelefoneResidencial.setColumns(10);
			textTelefoneResidencial.setBounds(453, 280, 71, 20);
			contentPane.add(textTelefoneResidencial);
			
			JLabel lblEmail = new JLabel("Email:");
			lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEmail.setBounds(10, 280, 123, 14);
			contentPane.add(lblEmail);
			
			textEmail = new JTextField();
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
			
			textCidadeNatal = new JTextField();
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
			boxUfNascimento.setModel(new DefaultComboBoxModel(new String[] {"Acre (AC)", "Alagoas (AL)", "Amap\u00E1 (AP)", "Amazonas (AM)", "Bahia (BA)", "Cear\u00E1 (CE)", "Distrito Federal (DF)", "Esp\u00EDrito Santo (ES)", "Goi\u00E1s (GO)", "Maranh\u00E3o (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Par\u00E1 (PA) ", "Para\u00EDba (PB)", "Paran\u00E1 (PR)", "Pernambuco (PE)", "Piau\u00ED (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rond\u00F4nia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "S\u00E3o Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)"}));
			boxUfNascimento.setToolTipText("Cidades");
			boxUfNascimento.setBounds(144, 220, 112, 22);
			contentPane.add(boxUfNascimento);
			
			
			JLabel lblDddtelcelular = new JLabel("DDD+Tel (Celular)");
			lblDddtelcelular.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDddtelcelular.setBounds(277, 311, 123, 14);
			contentPane.add(lblDddtelcelular);
			
			textDDDCelular = new JTextField();
			textDDDCelular.setColumns(10);
			textDDDCelular.setBounds(412, 311, 40, 20);
			contentPane.add(textDDDCelular);
			
			textTelefoneCelular = new JTextField();
			textTelefoneCelular.setColumns(10);
			textTelefoneCelular.setBounds(453, 311, 71, 20);
			textTelefoneCelular.add(textTelefoneCelular);
			setVisible(true);
			
			
			JButton btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//Implementar métodos contrutores para salvar os dados escritos
				}			
			});
			btnCadastrar.setBounds(225, 360, 100, 23);
			contentPane.add(btnCadastrar);
		}
		
		//Construtor para consultar um acadêmico com opções de excluir ou alterar o cadastro
		public Academicos(String matricula) { 
			super();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(200, 200, 530, 470);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblConsultaAcademico = new JLabel("Academico");//adicionar nome do academico
			lblConsultaAcademico.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblConsultaAcademico.setHorizontalAlignment(SwingConstants.CENTER);
			lblConsultaAcademico.setBounds(100, 11, 300, 55);
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
			
			JLabel lblTelCel = new JLabel("Celular:");
			lblTelCel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTelCel.setBounds(281, 305, 90, 14);
			contentPane.add(lblTelCel);
			
			JLabel lblPreNome2 = new JLabel(Pessoa.getPreNome());//Pegar dentro do banco de dados o nome do acadêmico
			lblPreNome2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblPreNome2.setBounds(142, 100, 76, 14);
			contentPane.add(lblPreNome2);
			
			JLabel lblSobrenome2 = new JLabel(Pessoa.getSobrenome());
			lblSobrenome2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSobrenome2.setBounds(142, 130, 76, 14);
			contentPane.add(lblSobrenome2);
			
			JLabel lblDataNascimento2 = new JLabel(Pessoa.getDataNascimento());
			lblDataNascimento2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDataNascimento2.setBounds(142, 160, 123, 14);
			contentPane.add(lblDataNascimento2);
			
			JLabel lblMunicipioNascimento2 = new JLabel(Pessoa.getMunicipioNascimento());
			lblMunicipioNascimento2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblMunicipioNascimento2.setBounds(142, 190, 110, 14);
			contentPane.add(lblMunicipioNascimento2);
			
			JLabel lblUfNascimento2 = new JLabel(Pessoa.getUfNascimento());
			lblUfNascimento2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblUfNascimento2.setBounds(142, 220, 110, 14);
			contentPane.add(lblUfNascimento2);
			
			JLabel lblEstadoCivil2 = new JLabel(Pessoa.getEstadoCivil());
			lblEstadoCivil2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEstadoCivil2.setBounds(142, 250, 76, 14);
			contentPane.add(lblEstadoCivil2);
			
			JLabel lblEmail2 = new JLabel(/*Pessoa.getEmail()*/);
			lblEmail2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEmail2.setBounds(142, 280, 123, 14);
			contentPane.add(lblEmail2);
			
			JLabel lblLogradouro2 = new JLabel(/*Endereco.getDescricaoLogradouro()*/);
			lblLogradouro2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblLogradouro2.setBounds(394, 100, 76, 14);
			contentPane.add(lblLogradouro2);
			
			JLabel lblNumero2 = new JLabel(/*Endereco.getNumero()*/);
			lblNumero2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNumero2.setBounds(394, 130, 76, 14);
			contentPane.add(lblNumero2);
			
			JLabel lblComplemento2 = new JLabel(/*Endereco.getComplemento()*/);
			lblComplemento2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblComplemento2.setBounds(394, 160, 90, 14);
			contentPane.add(lblComplemento2);
			
			JLabel lblBairro2 = new JLabel(/*Endereco.getBairro()*/);
			lblBairro2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblBairro2.setBounds(394, 190, 90, 14);
			contentPane.add(lblBairro2);
			
			JLabel lblCep2 = new JLabel(/*Endereco.getCodigoLogradouro()*/);
			lblCep2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCep2.setBounds(394, 220, 90, 14);
			contentPane.add(lblCep2);
			
			JLabel lblCidade2 = new JLabel(/*Endereco.getMunicipio()*/);
			lblCidade2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCidade2.setBounds(394, 250, 76, 14);
			contentPane.add(lblCidade2);
			
			JLabel lblTelRes2 = new JLabel(/*Pessoa.getTelefone()*/);
			lblTelRes2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTelRes2.setBounds(394, 280, 90, 14);
			contentPane.add(lblTelRes2);
			
			JLabel lblTelCel2 = new JLabel(/*Pessoa.getTelefone()*/);
			lblTelCel2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTelCel2.setBounds(394, 305, 90, 14);
			contentPane.add(lblTelCel2);
			
			JButton btnAlterarDados = new JButton("Alterar dados");
			btnAlterarDados.setBounds(80, 344, 150, 40);
			contentPane.add(btnAlterarDados);
			
			JButton btnExcluirAcadmico = new JButton("Excluir Acadêmico");
			btnExcluirAcadmico.setBounds(280, 344, 150, 40);
			contentPane.add(btnExcluirAcadmico);
		}

	}

