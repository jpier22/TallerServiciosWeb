package pe.joedayz.libreria.servicios;

import java.util.List;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Inicia la f�brica de proxies
		ListaLibrosService listaLibrosFactory = new ListaLibrosService();

		// Obtener un proxy
		ListaLibros listaLibros = listaLibrosFactory.getListaLibrosPort();

		// Ejecuta el m�todo remoto
		List<Libro> libros = listaLibros.listarLibros();
		for (Libro libro : libros) {
			System.out.println("Nombre: " + libro.getNombre());
		}

	}
}
