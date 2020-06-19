package mx.com.tane.model;

public class VentaDiaria {

	private int id;
	private String fecha;
	private String cveTienda;
	private double ventas;
	private double descuentoVentas;
	private double impuestoVentas;
	private double ventasNetas;
	private double otrosIngresos;
	private double descuentoOtrosIngresos;
	private double impuestoOtrosIngresos;
	private double otrosIngresosNetos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getCveTienda() {
		return cveTienda;
	}
	public void setCveTienda(String cveTienda) {
		this.cveTienda = cveTienda;
	}
	
	public double getVentas() {
		return ventas;
	}
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	
	public double getDescuentoVentas() {
		return descuentoVentas;
	}
	public void setDescuentoVentas(double descuentoVentas) {
		this.descuentoVentas = descuentoVentas;
	}
	
	public double getImpuestoVentas() {
		return impuestoVentas;
	}
	public void setImpuestoVentas(double impuestoVentas) {
		this.impuestoVentas = impuestoVentas;
	}
	
	public double getVentasNetas() {
		return ventasNetas;
	}
	public void setVentasNetas(double ventasNetas) {
		this.ventasNetas = ventasNetas;
	}
	
	public double getOtrosIngresos() {
		return otrosIngresos;
	}
	public void setOtrosIngresos(double otrosIngresos) {
		this.otrosIngresos = otrosIngresos;
	}
	
	public double getDescuentoOtrosIngresos() {
		return descuentoOtrosIngresos;
	}
	public void setDescuentoOtrosIngresos(double descuentoOtrosIngresos) {
		this.descuentoOtrosIngresos = descuentoOtrosIngresos;
	}
	
	public double getImpuestoOtrosIngresos() {
		return impuestoOtrosIngresos;
	}
	public void setImpuestoOtrosIngresos(double impuestoOtrosIngresos) {
		this.impuestoOtrosIngresos = impuestoOtrosIngresos;
	}
	
	public double getOtrosIngresosNetos() {
		return otrosIngresosNetos;
	}
	public void setOtrosIngresosNetos(double otrosIngresosNetos) {
		this.otrosIngresosNetos = otrosIngresosNetos;
	}
	
	@Override
	public String toString() {
		return "VentaDiaria [id=" + id + ", fecha=" + fecha + ", cveTienda=" + cveTienda + ", ventas=" + ventas
				+ ", descuentoVentas=" + descuentoVentas + ", impuestoVentas=" + impuestoVentas + ", ventasNetas="
				+ ventasNetas + ", otrosIngresos=" + otrosIngresos + ", descuentoOtrosIngresos="
				+ descuentoOtrosIngresos + ", impuestoOtrosIngresos=" + impuestoOtrosIngresos + ", otrosIngresosNetos="
				+ otrosIngresosNetos + "]";
	}
	
	

}
