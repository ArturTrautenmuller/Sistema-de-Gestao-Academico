package SGA;
import java.util.ArrayList;

public class SituacaoAcademica {
    private ArrayList <ElementoDescritivo>  sa;// usa a ElementoDescritivo como padrão


    public  SituacaoAcademica(){
        ElementoDescritivo ed;

        this.sa = new ArrayList<ElementoDescritivo>();
        ed = new ElementoDescritivo();
        ed.setElementoDescritivo(00, "DS", "Desconhecido");
        sa.add(ed);

        this.sa = new ArrayList<ElementoDescritivo>();
        ed = new ElementoDescritivo();
        ed.setElementoDescritivo(01, "MAT", "Matriculado(a)");
        sa.add(ed);

        this.sa = new ArrayList<ElementoDescritivo>();
        ed = new ElementoDescritivo();
        ed.setElementoDescritivo(02, "SUP", "Suspenso(a)");
        sa.add(ed);


        this.sa = new ArrayList<ElementoDescritivo>();
        ed = new ElementoDescritivo();
        ed.setElementoDescritivo(03, "TRC", "Trancado");
        sa.add(ed);


        this.sa = new ArrayList<ElementoDescritivo>();
        ed = new ElementoDescritivo();
        ed.setElementoDescritivo(04, "CAN", "Cancelado");
        sa.add(ed);

        this.sa = new ArrayList<ElementoDescritivo>();
        ed = new ElementoDescritivo();
        ed.setElementoDescritivo(05, "ABN", "Abandonado");
        sa.add(ed);

        this.sa = new ArrayList<ElementoDescritivo>();
        ed = new ElementoDescritivo();
        ed.setElementoDescritivo(06, "FRM", "Formado(a)");
        sa.add(ed);

        this.sa = new ArrayList<ElementoDescritivo>();
        ed = new ElementoDescritivo();
        ed.setElementoDescritivo(07, "OUT", "Outro");
        sa.add(ed);
    }

    public ArrayList<ElementoDescritivo> getSa() {
        return sa;
    }

    public void setSa(ArrayList<ElementoDescritivo> sa) {
        this.sa = sa;
    }


    @Override
    public String toString() {
        return "SituacaoAcademica:" + sa;
    }

}
	
	

	
	
	

