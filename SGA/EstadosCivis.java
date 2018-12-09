package SGA;
import java.util.ArrayList;
import java.util.List;

public class EstadosCivis {		// usa o padrão criado em ElementoDescritivo para coletar informações
	private List <ElementoDescritivo> estado = new ArrayList<ElementoDescritivo>();
	

	public EstadosCivis(List <ElementoDescritivo> estado) {
		ElementoDescritivo civil;
			
		this.estado = new ArrayList<ElementoDescritivo>();
		civil = new ElementoDescritivo();
		civil.setElementoDescritivo(01, "-", "Desconhecido");
		estado.add(civil);
		
		this.estado = new ArrayList<ElementoDescritivo>();
		civil = new ElementoDescritivo();
		civil.setElementoDescritivo(02, "-", "Solteiro(a)");
		estado.add(civil);
		
		this.estado = new ArrayList<ElementoDescritivo>();
		civil = new ElementoDescritivo();
		civil.setElementoDescritivo(03, "-", "Casado(a)");
		estado.add(civil);
		
		this.estado = new ArrayList<ElementoDescritivo>();
		civil = new ElementoDescritivo();
		civil.setElementoDescritivo(04, "-", "Divorciado(a)");
		estado.add(civil);
		
		this.estado = new ArrayList<ElementoDescritivo>();
		civil = new ElementoDescritivo();
		civil.setElementoDescritivo(05, "-", "Viúvo(a)");
		estado.add(civil);
		
		this.estado = new ArrayList<ElementoDescritivo>();
		civil = new ElementoDescritivo();
		civil.setElementoDescritivo(06, "-", "Outros");
		estado.add(civil);

	}
	@Override
	public String toString() {
		return "Estado Civil:" + estado + ".";
	}

}