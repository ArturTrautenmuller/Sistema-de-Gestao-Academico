import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Evento extends JFrame implements ActionListener  {

	public Evento() {
		super("Teste");
		JButton botao = new JButton("Clique aqui");
		getContentPane().add(botao);
		botao.addActionListener(this);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Clicou");
		
	}
	public static void main(String[] args) {
		new Evento();
	}
	

}
