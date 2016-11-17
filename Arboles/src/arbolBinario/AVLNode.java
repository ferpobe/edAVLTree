package arbolBinario;


public class AVLNode<T extends Comparable<T>> extends BSTNode<T>  {
	/**
	 * Para almacenar al Factor de balance. puede no existir y calcularse cada vez a partir de la altura de los hijos.
	 */
	private byte balanceFactor;
	/**
	 * Para almacenar la altura del árbol
	 */
	private int altura;
	

	/**
	 * @param info la información que se mete en el nuevo nodo
	 */
	public AVLNode(T info){
		super(info);
	}

	/**
	 * @return devuelve la altura del árbol
	 */
	public int getAltura() {
		return altura;
	}



	/**
	 * @return Devuelve el factor de balance según equilibrio del árbol 
	 */
	public byte getBF() {
		return balanceFactor;
	}


	/**
	 * Establece el factor de balance y/o recalcula la altura del nodo utilizando la altura de los hijos
	 * 
	 * si solo tiene un hijo el factor de balance es igual a la altura
	 */
	public void setBFH() {
		if (getLeft() == null && getRight() == null){
			balanceFactor=0;
			altura=0;
		}else if(getLeft() != null && getRight() == null){
			altura=getLeft().getAltura()+1;
			balanceFactor=(byte) -altura;
			
		}else if (getLeft() == null && getRight() != null){
			altura=getRight().getAltura()+1;
			balanceFactor=(byte) altura;
			
		}else{
			altura = Math.max(getLeft().getAltura(),getRight().getAltura())+1;
			balanceFactor = (byte) (getRight().getAltura() - getLeft().getAltura());
			
			
		}
		
			
		
		
	}
		
		
		
	
	

	
	/* (non-Javadoc)
	 * @see p3Arboles.BSTNode#getLeft()
	 */
	public AVLNode<T> getLeft(){
		return (AVLNode<T>) left;
	}


	
	/* (non-Javadoc)
	 * @see p3Arboles.BSTNode#getRight()
	 */
	public AVLNode<T> getRight() {
		return (AVLNode<T>) right;
	}

	
	/* (non-Javadoc)
	 * @see p3Arboles.BSTNode#toString()
	 * Añade factor de balance
	 */
	public String toString() {
		return super.toString()+":FB="+ getBF();
	}
}

