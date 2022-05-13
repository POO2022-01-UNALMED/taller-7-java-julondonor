package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras,String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	public String[] getLetras() {
		return this.letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return this.letras.length;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString() {
		String s="";
		for (String letra: this.letras) {
			s += letra + ", ";
		}
		return s.substring(0,s.length()-2);
	}

}
