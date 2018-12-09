package SGA;

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
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SistemaAcademico extends JFrame{
	
	private JPanel contentPane;
	private String matricula;
	private static ArrayList <Academicos> academicos;

	public SistemaAcademico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel textoBemVindo = new JLabel("BEM VINDO AO SISTEMA ACADEMICO");//Mensagem de Bem Vindo na tela principal do Sistema
		textoBemVindo.setBounds(5, 5, 424, 69);
		textoBemVindo.setFont(new Font("Tahoma", Font.BOLD, 14));
		textoBemVindo.setBackground(Color.WHITE);
		textoBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(textoBemVindo);

		JButton botaoNovoAcademico = new JButton("Novo Acad�mico");//Criando do botão Novo academico, para criar um novo cadastro no sistema
		botaoNovoAcademico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Academicos a = new Academicos();
				dispose();
			}
		});
		botaoNovoAcademico.setBounds(140, 110, 160, 40);
		contentPane.add(botaoNovoAcademico);

		JButton botaoConsultarAcademico = new JButton("Consultar Acad�mico"); //Criando do bot�o Consultar acad�mico, pedindo o n�mero
		botaoConsultarAcademico.addActionListener(new ActionListener() {      //de matr�cula.
			public void actionPerformed(ActionEvent arg0) {
				matricula = JOptionPane.showInputDialog("Digite o número de matrícula do acad�mico:");
				Academicos a = new Academicos(matricula);
				dispose();
			}
		});
		botaoConsultarAcademico.setBounds(140, 161, 160, 40);
		contentPane.add(botaoConsultarAcademico);
	}
		
	
	public static void main (String Args[]) {
		academicos	= new ArrayList<>();


		SistemaAcademico a = new SistemaAcademico();
		a.setVisible(true);

		}
}


