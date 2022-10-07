package panaderia.model;

import java.util.Objects;

public class Panes {
	
	// declaracion de atributos
	private char tamanio;
	private double precio;
	private int cantidad;
	private String tipo;
	
	/**
	 * metodo constructor de panes
	 * @param tamanio
	 * @param precio
	 * @param cantidad
	 * @param tipo
	 */
	public Panes(char tamanio, double precio, int cantidad, String tipo) {
		super();
		this.tamanio = tamanio;
		this.precio = precio;
		this.cantidad = cantidad;
		this.tipo = tipo;
	}
	
	/**
	 * metodo get de tamanio
	 * @return
	 */
	public char getTamanio() {
		return tamanio;
	}
	
	/**
	 * metodo set de tamanio
	 * @param tamanio
	 */
	public void setTamanio(char tamanio) {
		this.tamanio = tamanio;
	}
	
	/**
	 * metodo get de precio
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * metodo set de precio
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * metodo get de cantidad
	 * @return
	 */
	public int getCantidad() {
		return cantidad;
	}
	
	/**
	 * metodo set de cantidad
	 * @param cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * metodo get de tipo
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * metodo set de tipo
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * metodo to string de panes
	 */
	@Override
	public String toString() {
		return "Panes [tamanio=" + tamanio + ", precio=" + precio + ", cantidad=" + cantidad + ", tipo=" + tipo + "]";
	}

	/**
	 * hasch code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(tipo);
	}
	
	/**
	 * metodo equals de tipo 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Panes other = (Panes) obj;
		return Objects.equals(tipo, other.tipo);
	}
	
	
	
	
	
}
