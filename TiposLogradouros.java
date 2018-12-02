package sistemaAcademico;

import java.util.ArrayList;

/*
* Nome.......: TiposLogradouros
* Objetivo...: Representa os possíveis tipos de logradouros a que um endereço
*              pode referir-se
* Observacoes: Se for desconhecido, utilize o tipo 0 - DS - Desconhecido.
*/
public class TiposLogradouros {
    private ArrayList <ElementoDescritivo> tiposLogradouros;
    /**
     * Implementar de maneira semelhante à UnidadeFederativa.
     * 
   Cod. Descrição Comp.   Descrição Abreviada
   00 - Desconhecido      Des
   01 - Rua				  Rua
   02 - Avenida			  Avn
   03 - Alameda			  Alm
   04 - Beco			  Bec
   05 - Boulevard		  Blv
   06 - Caminho	          Cam
   07 - Cais			  Cas
   08 - Campo			  Cmp
   09 - Escada			  Esc
   10 - Estrada		 	  Etr
   11 - Favela	          Fav
   12 - Fazenda	 		  Faz
   13 - Floresta		  Flt
   14 - Ilha		 	  Ilh
   15 - Jardim			  Jrd
   16 - Ladeira		  	  Lad
   17 - Largo		      Lrg
   18 - Loteamento	      Ltm
   19 - Lugar             Lug
   20 - Morro             Mrr
   21 - Parque		      Pqe
   22 - Passeio		      Pas
   23 - Praia             Pra
   24 - Praça             Prc
   25 - Recanto           Rec
   26 - Rodovia           Rod
   28 - Servidao          Srv
   29 - Travessa          Trv
   30 - Via               Via
   31 - Vila              Vil
   32 - Outro             Out  
   * 
   */
    
    public TiposLogradouros() {
        ElementoDescritivo  elementoDescritivo;
        
        this.tiposLogradouros            = new ArrayList();
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0, "DES", "Desconhecido");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(1, "RUA", "Rua");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(2, "AVN", "Avenida");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(3, "AlM", "Alameda");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(4, "BEC", "Beco");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(5, "BLV", "Boulevard");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(6, "CAM", "Caminho");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(7, "CAS", "Cais");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(8, "CMP", "Campo");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(9, "ESC", "Escada");
        this.tiposLogradouros.add(elementoDescritivo);     
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(10, "ETR", "Estrada");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(11, "FAV", "Favela");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(12, "FAZ", "Fazenda");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(13, "FLT", "Floresta");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(14, "ILH", "Ilha");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(15, "JRD", "Jardim");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(16, "LAD", "Ladeira");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(17, "LRG", "Largo");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(18, "LTM", "Loteamento");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(19, "LUG", "Lugar");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(20, "MRR", "Morro");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(21, "PQE", "Parque");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(22, "PAS", "Passeio");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(23, "PRA", "Praia");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(24, "PRC", "Praça");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(25, "REC", "Recanto");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(26, "ROD", "Rodovia");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(27, "SER", "Servidao");
        this.tiposLogradouros.add(elementoDescritivo);
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(28, "TRA", "Travessa");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(29, "VIA", "Via");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(30, "VIL", "Vila");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(31, "TO", "Tocantins");
        this.tiposLogradouros.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(32, "OUT", "Outro");
        this.tiposLogradouros.add(elementoDescritivo); 
    }
    /**
     * @return A coleção das siglas dos tipos de logradouros.
     */
    public ArrayList<ElementoDescritivo> getTiposLogradouros() {
        return (this.tiposLogradouros);
    }
    /**
     * @param index índice, na coleção de tipos de Logradouros, que se deseja recuperar.
     * @return O tipo desejado ou, se inexistente, um elemento vazio.
     */
    public ElementoDescritivo getUfs(int index) {
        if ((index >= 0) && (index < tiposLogradouros.size())) {
            return (this.tiposLogradouros.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }
    /**
     * @param str Sigla do tipo de Logradouro a ser localizado na coleção de tiposLogradouros.
     * @return O índice, na coleção de tiposLogradouros, onde está localizada o tipo desejado ou -1 se inexistente.
     */
    public int indexOf(String str) {
        int i;
        for (i = 0; (i < this.tiposLogradouros.size()); i++) {
            if (this.tiposLogradouros.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }
    /**
     * @return Tamanho da coleção de tipos de Logradouros.
    */
    public int size() {
        return(this.tiposLogradouros.size());
    }
    
}
