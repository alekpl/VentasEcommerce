package mx.com.tane.model;

public class FacturaDet {
	private int id;
	private String cveTienda;
	private String folio;
	private String cveArticulo;
	private String serie;
	private int cantidad;
	private double precioUnitario;
	private double importe;
	private String descrip1;
	private String descrip2;
	private String descrip1Ingles;
	private String descrip2Ingles;
	private String cveEstatusArticulo;
	private String cveClasificacionArticulo;
	private String afectaVtasuOing;
	private String ediciones;
	private String skuArticulo;
	private String cveArticuloAnterior;
	private String unidadMedida;
	private String facturaPh;
	private String cveSatProdserv;
	private String cveSatUnidadmedida;
	private double descuento;
	private double impuesto;
	
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
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public String getDescrip1() {
		return descrip1;
	}
	public void setDescrip1(String descrip1) {
		this.descrip1 = descrip1;
	}
	
	public String getDescrip2() {
		return descrip2;
	}
	public void setDescrip2(String descrip2) {
		this.descrip2 = descrip2;
	}
	
	public String getDescrip1Ingles() {
		return descrip1Ingles;
	}
	public void setDescrip1Ingles(String descrip1Ingles) {
		this.descrip1Ingles = descrip1Ingles;
	}
	
	public String getDescrip2Ingles() {
		return descrip2Ingles;
	}
	public void setDescrip2Ingles(String descrip2Ingles) {
		this.descrip2Ingles = descrip2Ingles;
	}
	
	public String getCveEstatusArticulo() {
		return cveEstatusArticulo;
	}
	public void setCveEstatusArticulo(String cveEstatusArticulo) {
		this.cveEstatusArticulo = cveEstatusArticulo;
	}
	
	public String getCveClasificacionArticulo() {
		return cveClasificacionArticulo;
	}
	public void setCveClasificacionArticulo(String cveClasificacionArticulo) {
		this.cveClasificacionArticulo = cveClasificacionArticulo;
	}
	
	public String getAfectaVtasuOing() {
		return afectaVtasuOing;
	}
	public void setAfectaVtasuOing(String afectaVtasuOing) {
		this.afectaVtasuOing = afectaVtasuOing;
	}
	
	public String getEdiciones() {
		return ediciones;
	}
	public void setEdiciones(String ediciones) {
		this.ediciones = ediciones;
	}
	
	public String getSkuArticulo() {
		return skuArticulo;
	}
	public void setSkuArticulo(String skuArticulo) {
		this.skuArticulo = skuArticulo;
	}
	
	public String getCveArticuloAnterior() {
		return cveArticuloAnterior;
	}
	public void setCveArticuloAnterior(String cveArticuloAnterior) {
		this.cveArticuloAnterior = cveArticuloAnterior;
	}
	
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	
	public String getFacturaPh() {
		return facturaPh;
	}
	public void setFacturaPh(String facturaPh) {
		this.facturaPh = facturaPh;
	}
	
	public String getCveSatProdserv() {
		return cveSatProdserv;
	}
	public void setCveSatProdserv(String cveSatProdserv) {
		this.cveSatProdserv = cveSatProdserv;
	}
	
	public String getCveSatUnidadmedida() {
		return cveSatUnidadmedida;
	}
	public void setCveSatUnidadmedida(String cveSatUnidadmedida) {
		this.cveSatUnidadmedida = cveSatUnidadmedida;
	}
	
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	
	@Override
	public String toString() {
		return "FacturaDet [id=" + id + ", cveTienda=" + cveTienda + ", folio=" + folio + ", cveArticulo=" + cveArticulo
				+ ", serie=" + serie + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", importe="
				+ importe + ", descrip1=" + descrip1 + ", descrip2=" + descrip2 + ", descrip1Ingles=" + descrip1Ingles
				+ ", descrip2Ingles=" + descrip2Ingles + ", cveEstatusArticulo=" + cveEstatusArticulo
				+ ", cveClasificacionArticulo=" + cveClasificacionArticulo + ", afectaVtasuOing=" + afectaVtasuOing
				+ ", ediciones=" + ediciones + ", skuArticulo=" + skuArticulo + ", cveArticuloAnterior="
				+ cveArticuloAnterior + ", unidadMedida=" + unidadMedida + ", facturaPh=" + facturaPh
				+ ", cveSatProdserv=" + cveSatProdserv + ", cveSatUnidadmedida=" + cveSatUnidadmedida + ", descuento="
				+ descuento + ", impuesto=" + impuesto + "]";
	}
	
}
