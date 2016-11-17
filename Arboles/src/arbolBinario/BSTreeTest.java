package arbolBinario;

import static org.junit.Assert.*;

import org.junit.Test;

public class BSTreeTest {
	
	

	
	@Test
	public void test1() {
		BSTree<Integer> b = new BSTree<Integer>();
		assertEquals(true, b.add(5));
		assertEquals(false, b.add(5));
		assertEquals(true, b.add(3));
		assertEquals(false, b.add(3));
		assertEquals(true, b.add(7));
		assertEquals(false, b.add(7));
		assertEquals(true, b.add(4));
		assertEquals(false, b.add(4));
		assertEquals(true, b.add(6));
		assertEquals(false, b.add(6));
		assertEquals(true, b.add(9));
		assertEquals(false, b.add(9));
		assertEquals(false, b.add(null));
		System.out.println(b.inOrder());
		System.out.println(b.preOrder());
		System.out.println(b.postOrder());
		System.out.println(b.toString());
		System.out.println("----------------------------------------");
		assertEquals(true,b.remove(7));
		assertEquals(false,b.remove(7));
		assertEquals(false,b.remove(null));
		assertEquals(true, b.add(7));
		assertEquals(false, b.add(7));
		assertEquals(true,b.remove(5));
		assertEquals(false,b.remove(5));
		
		assertEquals(true, b.add(-7));
		assertEquals(true, b.add(0));
		
		System.out.println(b.toString());
		System.out.println(b.inOrder());
		System.out.println(b.preOrder());
		System.out.println(b.postOrder());
		
		
		
	}

}
