package sistemaAcademico;

import java.util.ArrayList;

/*
* Nome.......: Municípios
* Objetivo...: Representa os possíveis municípios a que um endereço
*              pode referir-se
* Observacoes: Se for desconhecido, utilize o tipo 00-00000 - DS - Desconhecido.
*/
public class Municipios {
    ArrayList <ElementoDescritivo>  municipios;
    /**
     * Implementar de maneira semelhante à UnidadesFederativas basta considerar três municípios na aplicação:
     * 
     *  00-00000 * Desconhecido
        52-01405 * Aparecida de Goiânia
        52-08707 * Goiânia
     */
    
    public Municipios() {
		ElementoDescritivo  elementoDescritivo;

		this.municipios = new ArrayList();
		elementoDescritivo = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecido");
		this.municipios.add(elementoDescritivo); 
		elementoDescritivo  = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(1, "APG", "Aparecida de Goiânia");
		this.municipios.add(elementoDescritivo); 
		elementoDescritivo  = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(2, "GYN", "Goiânia");
		

	}

	public ArrayList<ElementoDescritivo> getMunicipios() {
		return (this.municipios);
	}

	public ElementoDescritivo getMunicipios(int index) {
		if ((index >= 0) && (index < municipios.size())) {
			return (this.municipios.get(index));
		}
		else {
			return (new ElementoDescritivo());
		}
	}

	public int indexOf(String str) {
		int i;
		for (i = 0; (i < this.municipios.size()); i++) {
			if (this.municipios.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
				return (i);
			}
		}
		return (-1);
	}

	public int size() {
		return(this.municipios.size());
	}

	public void show(int index) {
		System.out.println();
		System.out.println("------------------");
		System.out.println("Classes Telefones");
		System.out.println("------------------");
		System.out.println("Código..........: " + this.getMunicipios(index).getCodigo());
		System.out.println("Descr. Abreviada: " + this.getMunicipios(index).getDescricaoAbreviada());
		System.out.println("Descr. Completa.: " + this.getMunicipios(index).getDescricaoCompleta());
		System.out.println("------------------");
	}
}
