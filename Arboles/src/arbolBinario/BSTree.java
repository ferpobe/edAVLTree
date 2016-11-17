package arbolBinario;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;

public class BSTree <T extends Comparable<T>>{

	protected BSTNode<T> raiz;

	/**
	 * @param x
	 *            El objeto comparable que tiene que insertar
	 * 
	 * @return verdadero cuando lo inserta, falso cuando no lo hace (ya existía u otra causa)
	 */
	public boolean add(T x) {
		if (x != null) {
			
			 
				try {
					raiz = addRec(raiz, x);
				} catch (Exception e) {
					// Esta excepcion salta en caso de que el nodo ya exista
					return false;
				}
				return true;
			
			
			
		}
		return false;
	}
	
	private BSTNode<T> addRec(BSTNode<T> r, T x){
		if(r==null){
			return new BSTNode<T> (x);			
		}
		int rama=(x.compareTo(r.getInfo()));
		if(rama<0){
			r.setLeft(addRec(r.getLeft(),x));
		}
		else if(rama>0){
			r.setRight(addRec(r.getRight(),x));			
		}		
		else{
			throw new InvalidParameterException("El nodo ya existe");			
		}
		
		return r;
		
	}

	/**
	 * @param x
	 *            El objeto comparable que se busca
	 * @return El objeto encontrado que se busca (completo) si lo encuentra. (null) si no
	 *         lo encuentra
	 */
	public T find(T x) {
		try {
			return findRecursivo(raiz, x);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	private T findRecursivo(BSTNode<T> r, T x) throws Exception {
		if (r == null || x == null)
			return null;
		else if (x.compareTo(r.getInfo()) < 0)
			return findRecursivo(r.getLeft(), x);
		else if (x.compareTo(r.getInfo()) > 0)
			return findRecursivo(r.getRight(), x);
		else
			new IllegalArgumentException("Ha habido un error al buscar el nodo");
		return r.getInfo();

	}

	/**
	 * Muestra por pantalla el recorrido en pre-orden (izquierda-derecha) y lo devuelve en un String (separados por tabuladores)
	 */
	public String preOrder() {
		return preOrdenRecursivo(raiz);
	}
	private String preOrdenRecursivo(BSTNode<T> r) {
		String cadena = "";
		if (r != null) {
			cadena += r + "\t";
			cadena += preOrdenRecursivo(r.getLeft());
			cadena += preOrdenRecursivo(r.getRight());
		}
		return cadena;

	}


	/**
	 * Muestra por pantalla el recorrido en post-orden (izquierda-derecha) y lo devuelve en un String (separados por tabuladores)
	 */
	public String postOrder() {
		return postOrdenRecursivo(raiz);
	}

	private String postOrdenRecursivo(BSTNode<T> r) {
		String cadena = "";
		if (r != null) {
			cadena += postOrdenRecursivo(r.getLeft());
			cadena += postOrdenRecursivo(r.getRight());
			cadena += r + "\t";
		}
		return cadena;
	}


	/**
	 * Muestra por pantalla el recorrido en in-orden (izquierda-derecha) y lo devuelve en un String (separados por tabuladores)
	 */
	public String inOrder() {
		return inOrdenRecursivo(raiz);
	}

	

	private String inOrdenRecursivo(BSTNode<T> r) {
		String cadena = "";
		if (r != null) {
			cadena += inOrdenRecursivo(r.getLeft());
			cadena += r + "\t";
			cadena += inOrdenRecursivo(r.getRight());
		}
		return cadena;

	}


	
	/**
	 * @param x El objeto que se quiere borrar
	 * @return true si lo ha borrado, false en caso contrario (no existía)
	 */
	public boolean remove (T x){
		if(x==null){
			return false;
		}
		try {
			raiz = removeRec(raiz, x);
		} catch (Exception e) {
				//Excepcion en caso de que el nodo no exista
			return false;
		}
		return true;
		
		
	}
		
	
	
	private BSTNode<T> removeRec(BSTNode<T> r, T x){
		if(r== null){
			throw new InvalidParameterException("el nodo que se quiere borrar no existe");
		}
		
		int rama=(x.compareTo(r.getInfo()));
		if(rama<0){
			r.setLeft(removeRec(r.getLeft(), x));			
		}else if(rama>0){
			r.setRight(removeRec(r.getRight(), x));
		}else{
			if (r.getLeft() == null && r.getRight() == null){
				return null;
			}else if(r.getLeft() != null && r.getRight() == null){
				return r.getLeft();
			}else if (r.getLeft() == null && r.getRight() != null){
				return r.getRight();
			}else{
				r.setInfo(findMaxMin(r.getLeft()));
				r.setLeft(removeRec(r.getLeft(), r.getInfo()));
			}
			
		}
		return r;
		
	}
	
	protected T findMaxMin(BSTNode<T> r){
		if(r==null){
			return null;
		}
			// ya le pasamos la rama izquierda por parametro
		
		if(r.getRight()==null){
			return    r.getInfo();
		}
			return findMaxMin(r.getRight());
		}
		
	


	public String toString() {
		return tumbarArbol(raiz, 0);
	}

	/**
	 * Genera un String con el árbol "tumbado" InOrden-derecha-izquierda y tabulando
	 * para mostrar los distintos niveles; utiliza el toString de la información almacenada
	 *  
	 * @param p	La raíz del árbol a generar
	 * @param esp	El espaciado en número de tabulaciones para indicar la profundidad
	 * @return	El String generado
	 */
	protected String tumbarArbol(BSTNode<T> p, int esp) {
		String cadena = "";

		if (p != null) {
			cadena += tumbarArbol(p.getRight(), esp + 1);
			for (int i = 0; i < esp; i++)
				cadena += "\t";
			cadena += p + "\n";
			cadena += tumbarArbol(p.getLeft(), esp + 1);
		}
		return cadena;
	}
	
	//--------------------------------------------------------------------------------

	


}
