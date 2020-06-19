package mx.com.tane.model;

public class Existencia {

	private int id;
	private String cveTienda;
	private String cveUbicacion;
	private String cveArticulo;
	private String serie;
	private int cantidadDisponible;
	private int cantidadApartada;
	private int cantidadTotal;
	private String fechaUltimaTransaccion;
	private String referencia;
	private String cveArticuloAnterior;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCveTienda() {
		return cveTienda;
	}
	public void setCveTienda(String cveTienda) {
		this.cveTienda = cveTienda;
	}
	
	public String getCveUbicacion() {
		return cveUbicacion;
	}
	public void setCveUbicacion(String cveUbicacion) {
		this.cveUbicacion = cveUbicacion;
	}
	
	public String getCveArticulo() {
		return cveArticulo;
	}
	public void setCveArticulo(String cveArticulo) {
		this.cveArticulo = cveArticulo;
	}
	
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public int getCantidadDisponible() {
		return cantidadDisponible;
	}
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public int getCantidadApartada() {
		return cantidadApartada;
	}
	public void setCantidadApartada(int cantidadApartada) {
		this.cantidadApartada = cantidadApartada;
	}
	
	public int getCantidadTotal() {
		return cantidadTotal;
	}
	public void setCantidadTotal(int cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}
	
	public String getFechaUltimaTransaccion() {
		return fechaUltimaTransaccion;
	}
	public void setFechaUltimaTransaccion(String fechaUltimaTransaccion) {
		this.fechaUltimaTransaccion = fechaUltimaTransaccion;
	}
	
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	public String getCveArticuloAnterior() {
		return cveArticuloAnterior;
	}
	public void setCveArticuloAnterior(String cveArticuloAnterior) {
		this.cveArticuloAnterior = cveArticuloAnterior;
	}
	
	@Override
	public String toString() {
		return "Existencia [id=" + id + ", cveTienda=" + cveTienda + ", cveUbicacion=" + cveUbicacion + ", cveArticulo="
				+ cveArticulo + ", serie=" + serie + ", cantidadDisponible=" + cantidadDisponible
				+ ", cantidadApartada=" + cantidadApartada + ", cantidadTotal=" + cantidadTotal
				+ ", fechaUltimaTransaccion=" + fechaUltimaTransaccion + ", referencia=" + referencia
				+ ", cveArticuloAnterior=" + cveArticuloAnterior + "]";
	}
	
	

}
