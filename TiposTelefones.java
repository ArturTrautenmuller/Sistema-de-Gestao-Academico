package sistemaAcademico;

import java.util.ArrayList;

/*
* Nome.......: TiposTelefones
* Objetivo...: Representa os possÃ­veis tipos de telefone que uma pessoa pode ter.
* Observacoes: Se for desconhecido, utilize o tipo 0 - DS - Desconhecido.
*/
public class TiposTelefones{
    private ArrayList <ElementoDescritivo>      tiposTelefones;
    /**
     * Implementar de maneira semelhante Ã  UnidadeFederativa.
     * 
   Cod. Descrição Comp.   Descrição Abreviada
    00 - Desconhecido       DS
    01 - Fixo               FIXO
    02 - Celular            CEL
    03 - VoIP               VoIP
    04 - Outro              OUT
   * 
   */
    public TiposTelefones() {
		ElementoDescritivo  elementoDescritivo;

		this.tiposTelefones = new ArrayList();
		elementoDescritivo = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecido");
		this.tiposTelefones.add(elementoDescritivo); 
		elementoDescritivo  = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(1, "FIXO", "Fixo");
		this.tiposTelefones.add(elementoDescritivo); 
		elementoDescritivo  = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(2, "CEL", "Celular");
		this.tiposTelefones.add(elementoDescritivo); 
		elementoDescritivo  = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(1, "VoIP", "VoIP");
		this.tiposTelefones.add(elementoDescritivo); 
		elementoDescritivo  = new ElementoDescritivo();
		elementoDescritivo.setElementoDescritivo(2, "OUT", "Outro");
		

	}

	public ArrayList<ElementoDescritivo> getTiposTelefones() {
		return (this.tiposTelefones);
	}

	public ElementoDescritivo getTiposTelefones(int index) {
		if ((index >= 0) && (index < tiposTelefones.size())) {
			return (this.tiposTelefones.get(index));
		}
		else {
			return (new ElementoDescritivo());
		}
	}

	public int indexOf(String str) {
		int i;
		for (i = 0; (i < this.tiposTelefones.size()); i++) {
			if (this.tiposTelefones.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
				return (i);
			}
		}
		return (-1);
	}

	public int size() {
		return(this.tiposTelefones.size());
	}
    
}

