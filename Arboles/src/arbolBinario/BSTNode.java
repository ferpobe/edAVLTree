package arbolBinario;

public class BSTNode <T extends Comparable<T>>{
	private T info;
	protected BSTNode<T> left;
	protected BSTNode<T> right;

	/**
	 * @param info Un objeto comparable
	 */
	public BSTNode (T info) {
		this.info=info;
	}
	
	/**
	 * @param info La información que se quiere meter en el nodo
	 * Se utiliza sólo en algún caso de borrado
	 */
	protected void setInfo(T info) {
		this.info=info;
	}


	/**
	 * @return La información que almacena el nodo
	 */
	public T getInfo() {
		return info;
	}
	
	/**
	 * @param x El nodo que se quiere enlazar en el subarbol izquierdo
	 */
	public void setLeft(BSTNode<T> x){
		this.left=x;
	}

	/**
	 * @param x El nodo que se quiere enlazar en el subárbol derecho
	 */
	public void setRight(BSTNode<T> x){
		this.right=x;
	}
	
	/**
	 * @return El subárbol izquierdo
	 */
	public BSTNode<T> getLeft () {
		return left;
	}

	/**
	 * @return El subárbol derecho
	 */
	public BSTNode<T> getRight () {
		return right;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return info.toString();
	}	
}
