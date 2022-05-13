package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha; this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	public String getFecha() {
		return this.fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getPrimicia() {
		return this.primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int mult) {
		int factor = 10;
		return getPaginas()*factor*mult;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString() {
		String s="";
		s += this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n";
		s += fecha+"\n"+primicia;
		return s;
	}

}
