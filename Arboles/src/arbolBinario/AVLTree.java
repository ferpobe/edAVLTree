package arbolBinario;

import java.security.InvalidParameterException;


public class AVLTree<T extends Comparable<T>> extends BSTree<T> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see BSTree#add(java.lang.Comparable) Redefine inserción para
	 * funcionalidad AVL
	 */
	public boolean add(T info) {
		if (info != null)
			try {
				raiz = add((AVLNode<T>) raiz, info);
				return true;
			} catch (IllegalArgumentException e) {
				return false;
			}

		return false;

	}

	private AVLNode<T> add(AVLNode<T> theRoot, T info) {
		if (theRoot == null)
			return new AVLNode<T>(info);
		if (info.compareTo(theRoot.getInfo()) == 0)
			throw new IllegalArgumentException("the element already exist!");
		if (info.compareTo(theRoot.getInfo()) < 0)
			theRoot.setLeft(add(theRoot.getLeft(), info));
		else
			theRoot.setRight(add(theRoot.getRight(), info));
		return (updateBF(theRoot));
	}

	/**
	 * 
	 * @param theRoot
	 * @return actualizaliza el bf
	 */
	private AVLNode<T> updateBF(AVLNode<T> theRoot) {
		theRoot.setBFH();
		if (theRoot.getBF() == -2) {
			if (theRoot.getLeft().getBF() == -1)
				theRoot = singleLeftRotation(theRoot);
			else
				theRoot = doubleLeftRotation(theRoot);
		} else if (theRoot.getBF() == 2) {
			if (theRoot.getRight().getBF() == 1)
				theRoot = (singleRightRotation(theRoot));
			else
				theRoot = (doubleRightRotation(theRoot));
		}
		return (theRoot);
	}

	/**
	 * @param nodo
	 *            la raíz del árbol a balancear con rotación simple
	 * @return la raíz del nuevo árbol que ha cambiado
	 */
	private AVLNode<T> singleLeftRotation(AVLNode<T> nodo) {
		AVLNode<T> aux = nodo.getLeft();
		nodo.setLeft(aux.getRight());
		aux.setRight(nodo);
		updateBF(nodo);
		updateBF(aux);
		return aux;
	}

	/**
	 * @param nodo
	 *            la raíz del árbol a balancear con rotación doble
	 * @return la raíz del nuevo árbol que ha cambiado
	 */
	private AVLNode<T> doubleLeftRotation(AVLNode<T> nodo) {
		AVLNode<T> aux = nodo.getLeft().getRight();
		nodo.getLeft().setRight(aux.getLeft());
		aux.setLeft(nodo.getLeft());
		nodo.setLeft(aux.getRight());
		aux.setRight(nodo);
		aux.setLeft(updateBF(aux.getLeft()));
		aux.setRight(updateBF(aux.getRight()));
		aux=updateBF(aux);

		return aux;

	}

	/**
	 * @param nodo
	 *            la raíz del árbol a balancear con rotación simple
	 * @return la raíz del nuevo árbol que ha cambiado
	 */
	private AVLNode<T> singleRightRotation(AVLNode<T> nodo) {
		AVLNode<T> aux = nodo.getRight();
		nodo.setRight(aux.getLeft());
		aux.setLeft(nodo);
		updateBF(nodo);
		updateBF(aux);
		return aux;
	}

	/**
	 * @param nodo
	 *            la raíz del árbol a balancear con rotación doble
	 * @return la raíz del nuevo árbol que ha cambiado
	 */
	private AVLNode<T> doubleRightRotation(AVLNode<T> nodo) {
		AVLNode<T> aux = nodo.getRight().getLeft();
		nodo.getRight().setLeft(aux.getRight());
		aux.setRight(nodo.getRight());
		nodo.setRight(aux.getLeft());
		aux.setLeft(nodo);
		aux.setLeft(updateBF(aux.getLeft()));
		aux.setRight(updateBF(aux.getRight()));
		aux=updateBF(aux);

		return aux;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see practica_arboles.ArbolBinario#borrar(java.lang.Comparable)
	 * Redefiniciónpara incluir características AVL
	 */
	public boolean remove(T info) {
		if (info != null)
			try {
				raiz = removeRec((AVLNode<T>) raiz, info);
				return true;
			} catch (IllegalArgumentException e) {
				return false;
			}

		return false;

	}

	public AVLNode<T> removeRec(AVLNode<T> r, T x) {
		if (r == null||x==null) {
			throw new InvalidParameterException(
					"el nodo que se quiere borrar no existe");
		}

		int rama = (x.compareTo(r.getInfo()));
		if (rama < 0) {
			r.setLeft(removeRec(r.getLeft(), x));
			r = updateBF(r);

		} else if (rama > 0) {
			r.setRight(removeRec(r.getRight(), x));
			r = updateBF(r);
		} else {
			if (r.getLeft() == null && r.getRight() == null) {
				return null;
			} else if (r.getLeft() != null && r.getRight() == null) {
				return r.getLeft();
			} else if (r.getLeft() == null && r.getRight() != null) {
				return r.getRight();
			} else {
				r.setInfo(findMaxMin(r.getLeft()));
				r.setLeft(removeRec(r.getLeft(), r.getInfo()));
			}

		}
		return updateBF(r);
	}

}


