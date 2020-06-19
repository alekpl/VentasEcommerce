package mx.com.tane.model;

public class FormaPagoTransaccion {
	
	private int id;
	private String tipoTransaccion;
	private String cveTienda;
	private String folio;
	private String cveFormaPago;
	private String cveMonedaBancoFolio;
	private double cantidadMonto;
	private double tipoCambio;
	private double importe;
	private double cambioMn;
	private String tipoTransaccionGenerada;
	private String folioGenerado;
	private double montoFolioGenerado;
	private String fechaElaboracion;
	private String estatus;
	private String cuentaPago;
	private String terminoCredito;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}
	
	public String getCveTienda() {
		return cveTienda;
	}
	public void setCveTienda(String cveTienda) {
		this.cveTienda = cveTienda;
	}
	
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	
	public String getCveFormaPago() {
		return cveFormaPago;
	}
	public void setCveFormaPago(String cveFormaPago) {
		this.cveFormaPago = cveFormaPago;
	}
	
	public String getCveMonedaBancoFolio() {
		return cveMonedaBancoFolio;
	}
	public void setCveMonedaBancoFolio(String cveMonedaBancoFolio) {
		this.cveMonedaBancoFolio = cveMonedaBancoFolio;
	}
	
	public double getCantidadMonto() {
		return cantidadMonto;
	}
	public void setCantidadMonto(double cantidadMonto) {
		this.cantidadMonto = cantidadMonto;
	}
	
	public double getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public double getCambioMn() {
		return cambioMn;
	}
	public void setCambioMn(double cambioMn) {
		this.cambioMn = cambioMn;
	}
	
	public String getTipoTransaccionGenerada() {
		return tipoTransaccionGenerada;
	}
	public void setTipoTransaccionGenerada(String tipoTransaccionGenerada) {
		this.tipoTransaccionGenerada = tipoTransaccionGenerada;
	}
	
	public String getFolioGenerado() {
		return folioGenerado;
	}
	public void setFolioGenerado(String folioGenerado) {
		this.folioGenerado = folioGenerado;
	}
	
	public double getMontoFolioGenerado() {
		return montoFolioGenerado;
	}
	public void setMontoFolioGenerado(double montoFolioGenerado) {
		this.montoFolioGenerado = montoFolioGenerado;
	}
	
	public String getFechaElaboracion() {
		return fechaElaboracion;
	}
	public void setFechaElaboracion(String fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}
	
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	public String getCuentaPago() {
		return cuentaPago;
	}
	public void setCuentaPago(String cuentaPago) {
		this.cuentaPago = cuentaPago;
	}
	
	public String getTerminoCredito() {
		return terminoCredito;
	}
	public void setTerminoCredito(String terminoCredito) {
		this.terminoCredito = terminoCredito;
	}
	
	@Override
	public String toString() {
		return "FormaPagoTransaccion [id=" + id + ", tipoTransaccion=" + tipoTransaccion + ", cveTienda=" + cveTienda
				+ ", folio=" + folio + ", cveFormaPago=" + cveFormaPago + ", cveMonedaBancoFolio=" + cveMonedaBancoFolio
				+ ", cantidadMonto=" + cantidadMonto + ", tipoCambio=" + tipoCambio + ", importe=" + importe
				+ ", cambioMn=" + cambioMn + ", tipoTransaccionGenerada=" + tipoTransaccionGenerada + ", folioGenerado="
				+ folioGenerado + ", montoFolioGenerado=" + montoFolioGenerado + ", fechaElaboracion="
				+ fechaElaboracion + ", estatus=" + estatus + ", cuentaPago=" + cuentaPago + ", terminoCredito="
				+ terminoCredito + "]";
	}
	
	


}
