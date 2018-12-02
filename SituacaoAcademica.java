package sistemaAcademico;

import java.util.ArrayList;

/*
* Nome.......: SituacaoAcademica
* Objetivo...: Representa as possíveis situações acadêmicas em que um estudante pode estar
* Observacoes: Se for desconhecido, utilize o tipo 0 - DS - Desconhecido.
*/
public class SituacaoAcademica {
    private ArrayList <ElementoDescritivo>  situacaoAcademica;
    
    public SituacaoAcademica() {
        ElementoDescritivo  elementoDescritivo;
        
        this.situacaoAcademica = new ArrayList();
        elementoDescritivo = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecido");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(1, "MAT", "Matriculado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(2, "SUP", "Supenso");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(3, "TRC", "Trancado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(4, "CAN", "Cancelado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(5, "ABN", "Abandono");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(6, "JUB", "Jubilado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(7, "FRM", "Formado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(8, "JUD", "Judicializado");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(9, "FAL", "Falecido");
        this.situacaoAcademica.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(10, "OUT", "Outra");
    }

    public ArrayList<ElementoDescritivo> getSituacaoAcademica() {
        return (this.situacaoAcademica);
    }

    public ElementoDescritivo getSituacaoAcademica(int index) {
        if ((index >= 0) && (index < situacaoAcademica.size())) {
            return (this.situacaoAcademica.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }

    public int indexOf(String str) {
        int i;
        for (i = 0; (i < this.situacaoAcademica.size()); i++) {
            if (this.situacaoAcademica.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }

    public int size() {
        return(this.situacaoAcademica.size());
    }

}
