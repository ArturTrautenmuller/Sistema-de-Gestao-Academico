import java.util.List;
import java.util.ArrayList;

public class EstadosCivis {
private List<ElementoDescritivo> estado = new ArrayList<ElementoDescritivo>();
	

	public EstadosCivis(List<ElementoDescritivo> estado) {
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
		civil.setElementoDescritivo(05, "-", "Vi�vo(a)");
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
