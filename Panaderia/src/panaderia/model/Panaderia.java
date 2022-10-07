package panaderia.model;

import java.util.ArrayList;
import panaderia.exceptions.PanException;


public class Panaderia {

	//declaracion de variables
	private String nombre;
	private String direccion;
	private ArrayList <Panes> listaPanes= new ArrayList<Panes>();

	//-------------------------------------------------------------

	/**
	 * metodo constructor de panaderia
	 * @param nombre
	 * @param direccion
	 */
	public Panaderia(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	/**
	 * metodo get de nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * metodo set de nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * metodo get para direccion
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * metodo set de direccion
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * metodo get de lista panes
	 * @return
	 */
	public ArrayList<Panes> getListaPanes() {
		return listaPanes;
	}

	/**
	 * metodo set de lista de panes
	 * @param listaPanes
	 */
	public void setListaPanes(ArrayList<Panes> listaPanes) {
		this.listaPanes = listaPanes;
	} 

	//-----------------------------------------

	/**
	 * metodo para crear un pan
	 * @param panNuevo
	 * @return
	 */
	public String crearPan(Panes panNuevo) {
		String mensaje = "";
		Panes panEncontrado = null;

		try {
			panEncontrado = verificarPan(panNuevo.getTipo());
			listaPanes.add(panNuevo);
			mensaje = "el pan fue creado";
		} catch (PanException e) {
			mensaje  = e.getMessage();
		}
		return mensaje;
	}

	/**
	 * metodo para verificar un pan
	 * @param tipo
	 * @return
	 * @throws PanException
	 */
	private Panes verificarPan(String tipo) throws PanException {
		Panes panVerificado = null;

		for (Panes panes : listaPanes) {
			if(panes.getTipo().equals(tipo)){
				panVerificado =  panes;
				throw new PanException ("El pan ya existe");
			}
		}
		return panVerificado;
	}

	/**
	 * metodo para buscar un pan
	 * @param tipo
	 * @return
	 * @throws PanException
	 */
	public Panes buscarPan(String tipo) throws PanException {
		Panes panEncontrado = null;

		for (Panes pan : listaPanes) {
			if(pan.getTipo().equals(tipo)){
				panEncontrado =  pan;
				break;
			}	
		}
		if(panEncontrado == null){
			throw new PanException ("Pan no encontrado");
		}
		return panEncontrado;
	}

	/**
	 * metodo para eliminar un pan
	 * @param tipo
	 * @return
	 * @throws PanException
	 */
	public String eliminarLibro(String tipo) throws PanException{
		String mensaje = "fue eliminado";
		Panes panObtenido = buscarPan(tipo);

		for (int i = 0; i < listaPanes.size(); i++) {
			if(panObtenido.equals(listaPanes.get(i))) {
				listaPanes.add(null);
			}
		}
		if(panObtenido == null) {
			throw new PanException("El pan no a sido creado");
		}
		return mensaje;
	}
}
