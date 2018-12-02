package sistemaAcademico;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Evento extends JFrame {

	private JPanel contentPane;	
	private long matricula;

	/**
	 * Cria o frame.
	 */
	public Evento() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textoBemVindo = new JLabel("BEM VINDO AO SISTEMA ACADÊMICO");
		textoBemVindo.setBounds(5, 5, 424, 69);
		textoBemVindo.setFont(new Font("Tahoma", Font.BOLD, 14));
		textoBemVindo.setBackground(Color.WHITE);
		textoBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(textoBemVindo);
		
		JButton botaoNovoAcademico = new JButton("Novo Acadêmico");
		botaoNovoAcademico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Academico.cadastrar();
			}
		});
		botaoNovoAcademico.setBounds(50, 110, 160, 40);
		contentPane.add(botaoNovoAcademico);
		
		JButton botaoConsultarAcademico = new JButton("Consultar Acadêmico");
		botaoConsultarAcademico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				matricula = Long.parseLong(JOptionPane.showInputDialog("Digite o número de matrícula do acadêmico:"));
				Academico.consultar(matricula);
			}
		});
		botaoConsultarAcademico.setBounds(50, 161, 160, 40);
		contentPane.add(botaoConsultarAcademico);
		
		JButton botaoAlterarAcademico = new JButton("Alterar Acadêmico");
		botaoAlterarAcademico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				matricula = Long.parseLong(JOptionPane.showInputDialog("Digite o número de matrícula do acadêmico:"));
				Academico.alterar(matricula);
			}
		});
		botaoAlterarAcademico.setBounds(220, 110, 160, 40);
		contentPane.add(botaoAlterarAcademico);
		
		JButton botaoExcluirAcademico = new JButton("Excluir Acadêmico");
		botaoExcluirAcademico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				matricula = Long.parseLong(JOptionPane.showInputDialog("Digite o número de matrícula do acadêmico:"));
				Academico.excluir(matricula);
			}
		});
		botaoExcluirAcademico.setBounds(220, 161, 160, 40);
		contentPane.add(botaoExcluirAcademico);
	}

}
