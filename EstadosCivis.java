package sistemaAcademico;

import java.util.ArrayList;

/*
* Nome.......: EstadosCivis
* Objetivo...: Representa os possíveis estados civis que uma pessoa pode ter.
* Observacoes: Se for desconhecido, utilize o tipo 0 - DS - Desconhecido.
*/
public class EstadosCivis {
    private ArrayList <ElementoDescritivo>      estadosCivis;
    
    public EstadosCivis() {
        ElementoDescritivo  elementoDescritivo;
        
        this.estadosCivis = new ArrayList();
        elementoDescritivo = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecido");
        this.estadosCivis.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(1, "??", "Solteiro");
        this.estadosCivis.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(2, "??", "Casado");
        this.estadosCivis.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(3, "??", "Desquitado");
        this.estadosCivis.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(4, "??", "Divorciado");
        this.estadosCivis.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(5, "??", "Viúvo");
        this.estadosCivis.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(6, "??", "União Estável");
        this.estadosCivis.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(7, "??", "Outro");        
    }

    public ArrayList<ElementoDescritivo> getEstadosCivis() {
        return (this.estadosCivis);
    }

    public ElementoDescritivo getEstadosCivis(int index) {
        if ((index >= 0) && (index < estadosCivis.size())) {
            return (this.estadosCivis.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }

    public int indexOf(String str) {
        int i;
        for (i = 0; (i < this.estadosCivis.size()); i++) {
            if (this.estadosCivis.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }

    public int size() {
        return(this.estadosCivis.size());
    }    
}
