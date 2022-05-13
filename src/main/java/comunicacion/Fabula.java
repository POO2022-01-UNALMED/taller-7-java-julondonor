package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza; this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza() {
		return this.ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int factor) {
		factor = 1;
		return getPaginas()*factor;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString() {
		String s="";
		s += this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n";
		s += ensenanza;
		return s;
	}
	
}
