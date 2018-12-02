package sistemaAcademico;

import java.util.ArrayList;

/*
 * Nome.......: ClassesTelefones
 * Objetivo...: Representa as possíveis classes a que um telefone pode pertencer.
 *              
 * Observacoes: Se for desconhecida, utilize o tipo 0 - DS - Desconhecida.
 */

public class ClassesTelefones {
	private ArrayList <ElementoDescritivo>      classesTelefones;

	public ClassesTelefones() {
		ElementoDescritivo  elementoDescritivo;

		this.classesTelefones = new ArrayList();
		elementoDescritivo = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecido");
		this.classesTelefones.add(elementoDescritivo); 
		elementoDescritivo  = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(1, "COM", "Comercial");
		this.classesTelefones.add(elementoDescritivo); 
		elementoDescritivo  = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(2, "RES", "Residencial");
		this.classesTelefones.add(elementoDescritivo); 
		elementoDescritivo  = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(3, "REC", "Alternativo / Recado");
		this.classesTelefones.add(elementoDescritivo); 
		elementoDescritivo  = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(4, "OUT", "Outro");

	}

	public ArrayList<ElementoDescritivo> getClassesTelefones() {
		return (this.classesTelefones);
	}

	public ElementoDescritivo getClassesTelefones(int index) {
		if ((index >= 0) && (index < classesTelefones.size())) {
			return (this.classesTelefones.get(index));
		}
		else {
			return (new ElementoDescritivo());
		}
	}

	public int indexOf(String str) {
		int i;
		for (i = 0; (i < this.classesTelefones.size()); i++) {
			if (this.classesTelefones.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
				return (i);
			}
		}
		return (-1);
	}

	public int size() {
		return(this.classesTelefones.size());
	}

}
