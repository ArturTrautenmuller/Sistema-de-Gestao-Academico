/*
 * Sistema de Gestão Acadêmica 
 */
package sistemaAcademico;

import java.util.ArrayList;

public class SistemaAcademico {
	//
	// Aqui estão sendo declarados objetos das principais classes.
	// Evidentemente cada equipe utilizará somente alguns deles para 
	// implementar sua porção do sistema. 
	//
	// Todos os objetos foram declarados como sendo ArrayList e, portanto, 
	// ao finalizar uma execução da aplicação todos os dados serão perdidos
	//
	// 
	// Observação: Exclua as declarações que não necessitar...
	//
	//
	private static ArrayList <Academico> academicos;

	//
	// Atributos auxiliares...
	//
	private static UnidadesFederativas	unidadesFederativas;
	private static EstadosCivis 		estadosCivis;
	private static SituacaoAcademica 	situacaoAcademica;



	public static void main(String[] args) {  
		int i;
		academicos	= new ArrayList<>();

		
		Evento evento = new Evento();
		evento.setVisible(true);
	
	}

}
