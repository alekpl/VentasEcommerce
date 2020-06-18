package mx.com.tane.model;

public class Factura {
	
	private int id;
	private String cveTienda;
	private String folio;
	private String estatus;
	private String estatusRespaldo;
	private String fechaElaboracion;
	private String horaElaboracion;
	private String cveVendedorElabora;
	private String fechaCancelacion;
	private String horaCancelacion;
	private String cveVendedorCancela;
	private String cveCliente;
	private String nombreCliente;
	private String rfcCliente;
	private String direccionClienteCalleNumeros;
	private String direccionClienteColoniaCodigopostal;
	private String direccionClienteDelegacionmunicipioEstadoPais;
	private String telefonoCliente;
	private String cveImpuesto;
	private double descuentoPorcentaje;
	private double descuento_monto;
	private String tipoFactura;
	private String cveUbicacion;
	private double importe;
	private double descuento;
	private double subtotal;
	private double impuesto;
	private double total;
	private int numeroImpresionesRealizadas;
	private double adeudo;
	private double pago;
	private int noPagosEfectuar;
	private int noPagosRealizados;
	private String folioPedido;
	private double anticipoPedido;
	private String observaciones1;
	private String observaciones2;
	private String observaciones3;
	private String observaciones4;
	private String observaciones5;
	private String observaciones6;
	private String cve_tipo_sku;
	private String aplicacion;
	private double porcDsctoIntPrecio;
	private String folioFacturaAplicacionAnticipo;
	private String fechaEfectiva;
	private String numeroTicket;
	private String cveSatUsocfdi;
	private String terminoCredito;
	
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
	
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	public String getEstatusRespaldo() {
		return estatusRespaldo;
	}
	public void setEstatusRespaldo(String estatusRespaldo) {
		this.estatusRespaldo = estatusRespaldo;
	}
	
	public String getFechaElaboracion() {
		return fechaElaboracion;
	}
	public void setFechaElaboracion(String fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}
	
	public String getHoraElaboracion() {
		return horaElaboracion;
	}
	public void setHoraElaboracion(String horaElaboracion) {
		this.horaElaboracion = horaElaboracion;
	}
	
	public String getCveVendedorElabora() {
		return cveVendedorElabora;
	}
	public void setCveVendedorElabora(String cveVendedorElabora) {
		this.cveVendedorElabora = cveVendedorElabora;
	}
	
	public String getFechaCancelacion() {
		return fechaCancelacion;
	}
	public void setFechaCancelacion(String fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}
	
	public String getHoraCancelacion() {
		return horaCancelacion;
	}
	public void setHoraCancelacion(String horaCancelacion) {
		this.horaCancelacion = horaCancelacion;
	}
	
	public String getCveVendedorCancela() {
		return cveVendedorCancela;
	}
	public void setCveVendedorCancela(String cveVendedorCancela) {
		this.cveVendedorCancela = cveVendedorCancela;
	}
	
	public String getCveCliente() {
		return cveCliente;
	}
	public void setCveCliente(String cveCliente) {
		this.cveCliente = cveCliente;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public String getRfcCliente() {
		return rfcCliente;
	}
	public void setRfcCliente(String rfcCliente) {
		this.rfcCliente = rfcCliente;
	}
	
	public String getDireccionClienteCalleNumeros() {
		return direccionClienteCalleNumeros;
	}
	public void setDireccionClienteCalleNumeros(String direccionClienteCalleNumeros) {
		this.direccionClienteCalleNumeros = direccionClienteCalleNumeros;
	}
	
	public String getDireccionClienteColoniaCodigopostal() {
		return direccionClienteColoniaCodigopostal;
	}
	public void setDireccionClienteColoniaCodigopostal(String direccionClienteColoniaCodigopostal) {
		this.direccionClienteColoniaCodigopostal = direccionClienteColoniaCodigopostal;
	}
	
	public String getDireccionClienteDelegacionmunicipioEstadoPais() {
		return direccionClienteDelegacionmunicipioEstadoPais;
	}
	public void setDireccionClienteDelegacionmunicipioEstadoPais(String direccionClienteDelegacionmunicipioEstadoPais) {
		this.direccionClienteDelegacionmunicipioEstadoPais = direccionClienteDelegacionmunicipioEstadoPais;
	}
	
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	
	public String getCveImpuesto() {
		return cveImpuesto;
	}
	public void setCveImpuesto(String cveImpuesto) {
		this.cveImpuesto = cveImpuesto;
	}
	
	public double getDescuentoPorcentaje() {
		return descuentoPorcentaje;
	}
	public void setDescuentoPorcentaje(double descuentoPorcentaje) {
		this.descuentoPorcentaje = descuentoPorcentaje;
	}
	
	public double getDescuento_monto() {
		return descuento_monto;
	}
	public void setDescuento_monto(double descuento_monto) {
		this.descuento_monto = descuento_monto;
	}
	
	public String getTipoFactura() {
		return tipoFactura;
	}
	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}
	
	public String getCveUbicacion() {
		return cveUbicacion;
	}
	public void setCveUbicacion(String cveUbicacion) {
		this.cveUbicacion = cveUbicacion;
	}
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public int getNumeroImpresionesRealizadas() {
		return numeroImpresionesRealizadas;
	}
	public void setNumeroImpresionesRealizadas(int numeroImpresionesRealizadas) {
		this.numeroImpresionesRealizadas = numeroImpresionesRealizadas;
	}
	
	public double getAdeudo() {
		return adeudo;
	}
	public void setAdeudo(double adeudo) {
		this.adeudo = adeudo;
	}
	
	public double getPago() {
		return pago;
	}
	public void setPago(double pago) {
		this.pago = pago;
	}
	
	public int getNoPagosEfectuar() {
		return noPagosEfectuar;
	}
	public void setNoPagosEfectuar(int noPagosEfectuar) {
		this.noPagosEfectuar = noPagosEfectuar;
	}
	
	public int getNoPagosRealizados() {
		return noPagosRealizados;
	}
	public void setNoPagosRealizados(int noPagosRealizados) {
		this.noPagosRealizados = noPagosRealizados;
	}
	
	public String getFolioPedido() {
		return folioPedido;
	}
	public void setFolioPedido(String folioPedido) {
		this.folioPedido = folioPedido;
	}
	
	public double getAnticipoPedido() {
		return anticipoPedido;
	}
	public void setAnticipoPedido(double anticipoPedido) {
		this.anticipoPedido = anticipoPedido;
	}
	
	public String getObservaciones1() {
		return observaciones1;
	}
	public void setObservaciones1(String observaciones1) {
		this.observaciones1 = observaciones1;
	}
	
	public String getObservaciones2() {
		return observaciones2;
	}
	public void setObservaciones2(String observaciones2) {
		this.observaciones2 = observaciones2;
	}
	
	public String getObservaciones3() {
		return observaciones3;
	}
	public void setObservaciones3(String observaciones3) {
		this.observaciones3 = observaciones3;
	}
	
	public String getObservaciones4() {
		return observaciones4;
	}
	public void setObservaciones4(String observaciones4) {
		this.observaciones4 = observaciones4;
	}
	
	public String getObservaciones5() {
		return observaciones5;
	}
	public void setObservaciones5(String observaciones5) {
		this.observaciones5 = observaciones5;
	}
	
	public String getObservaciones6() {
		return observaciones6;
	}
	public void setObservaciones6(String observaciones6) {
		this.observaciones6 = observaciones6;
	}
	
	public String getCve_tipo_sku() {
		return cve_tipo_sku;
	}
	public void setCve_tipo_sku(String cve_tipo_sku) {
		this.cve_tipo_sku = cve_tipo_sku;
	}
	
	public String getAplicacion() {
		return aplicacion;
	}
	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}
	
	public double getPorcDsctoIntPrecio() {
		return porcDsctoIntPrecio;
	}
	public void setPorcDsctoIntPrecio(double porcDsctoIntPrecio) {
		this.porcDsctoIntPrecio = porcDsctoIntPrecio;
	}
	
	public String getFolioFacturaAplicacionAnticipo() {
		return folioFacturaAplicacionAnticipo;
	}
	public void setFolioFacturaAplicacionAnticipo(String folioFacturaAplicacionAnticipo) {
		this.folioFacturaAplicacionAnticipo = folioFacturaAplicacionAnticipo;
	}
	
	public String getFechaEfectiva() {
		return fechaEfectiva;
	}
	public void setFechaEfectiva(String fechaEfectiva) {
		this.fechaEfectiva = fechaEfectiva;
	}
	
	public String getNumeroTicket() {
		return numeroTicket;
	}
	public void setNumeroTicket(String numeroTicket) {
		this.numeroTicket = numeroTicket;
	}
	
	public String getCveSatUsocfdi() {
		return cveSatUsocfdi;
	}
	public void setCveSatUsocfdi(String cveSatUsocfdi) {
		this.cveSatUsocfdi = cveSatUsocfdi;
	}
	
	public String getTerminoCredito() {
		return terminoCredito;
	}
	public void setTerminoCredito(String terminoCredito) {
		this.terminoCredito = terminoCredito;
	}
	
	@Override
	public String toString() {
		return "Factura [id=" + id + ", cveTienda=" + cveTienda + ", folio=" + folio + ", estatus=" + estatus
				+ ", estatusRespaldo=" + estatusRespaldo + ", fechaElaboracion=" + fechaElaboracion
				+ ", horaElaboracion=" + horaElaboracion + ", cveVendedorElabora=" + cveVendedorElabora
				+ ", fechaCancelacion=" + fechaCancelacion + ", horaCancelacion=" + horaCancelacion
				+ ", cveVendedorCancela=" + cveVendedorCancela + ", cveCliente=" + cveCliente + ", nombreCliente="
				+ nombreCliente + ", rfcCliente=" + rfcCliente + ", direccionClienteCalleNumeros="
				+ direccionClienteCalleNumeros + ", direccionClienteColoniaCodigopostal="
				+ direccionClienteColoniaCodigopostal + ", direccionClienteDelegacionmunicipioEstadoPais="
				+ direccionClienteDelegacionmunicipioEstadoPais + ", telefonoCliente=" + telefonoCliente
				+ ", cveImpuesto=" + cveImpuesto + ", descuentoPorcentaje=" + descuentoPorcentaje + ", descuento_monto="
				+ descuento_monto + ", tipoFactura=" + tipoFactura + ", cveUbicacion=" + cveUbicacion + ", importe="
				+ importe + ", descuento=" + descuento + ", subtotal=" + subtotal + ", impuesto=" + impuesto
				+ ", total=" + total + ", numeroImpresionesRealizadas=" + numeroImpresionesRealizadas + ", adeudo="
				+ adeudo + ", pago=" + pago + ", noPagosEfectuar=" + noPagosEfectuar + ", noPagosRealizados="
				+ noPagosRealizados + ", folioPedido=" + folioPedido + ", anticipoPedido=" + anticipoPedido
				+ ", observaciones1=" + observaciones1 + ", observaciones2=" + observaciones2 + ", observaciones3="
				+ observaciones3 + ", observaciones4=" + observaciones4 + ", observaciones5=" + observaciones5
				+ ", observaciones6=" + observaciones6 + ", cve_tipo_sku=" + cve_tipo_sku + ", aplicacion=" + aplicacion
				+ ", porcDsctoIntPrecio=" + porcDsctoIntPrecio + ", folioFacturaAplicacionAnticipo="
				+ folioFacturaAplicacionAnticipo + ", fechaEfectiva=" + fechaEfectiva + ", numeroTicket=" + numeroTicket
				+ ", cveSatUsocfdi=" + cveSatUsocfdi + ", terminoCredito=" + terminoCredito + "]";
	}
}
