package mx.com.tane.model;

public class HistoricoTransaccionArticulo {

	private int id;
	private String cveTienda;
	private String cveUbicacion;
	private String tipoTransaccion;
	private String cveArticulo;
	private String serie;
	private String folio;
	private int existenciaTotalInicial;
	private int cantidadTransaccion;
	private String fecha;
	private String hora;
	private String cveVendedor;
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
	
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
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
	
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	
	public int getExistenciaTotalInicial() {
		return existenciaTotalInicial;
	}
	public void setExistenciaTotalInicial(int existenciaTotalInicial) {
		this.existenciaTotalInicial = existenciaTotalInicial;
	}
	
	public int getCantidadTransaccion() {
		return cantidadTransaccion;
	}
	public void setCantidadTransaccion(int cantidadTransaccion) {
		this.cantidadTransaccion = cantidadTransaccion;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getCveVendedor() {
		return cveVendedor;
	}
	public void setCveVendedor(String cveVendedor) {
		this.cveVendedor = cveVendedor;
	}
	
	public String getCveArticuloAnterior() {
		return cveArticuloAnterior;
	}
	public void setCveArticuloAnterior(String cveArticuloAnterior) {
		this.cveArticuloAnterior = cveArticuloAnterior;
	}
	
	@Override
	public String toString() {
		return "HistoricoTransaccionArticulo [id=" + id + ", cveTienda=" + cveTienda + ", cveUbicacion=" + cveUbicacion
				+ ", tipoTransaccion=" + tipoTransaccion + ", cveArticulo=" + cveArticulo + ", serie=" + serie
				+ ", folio=" + folio + ", existenciaTotalInicial=" + existenciaTotalInicial + ", cantidadTransaccion="
				+ cantidadTransaccion + ", fecha=" + fecha + ", hora=" + hora + ", cveVendedor=" + cveVendedor
				+ ", cveArticuloAnterior=" + cveArticuloAnterior + "]";
	}

}
