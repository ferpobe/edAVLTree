package arbolBinario;

import static org.junit.Assert.*;

import org.junit.Test;

public class AVLTreeTestV0 {
boolean debug=true;
boolean print=false;
	@Test
	public void test() {
		AVLTree <Integer> t = new AVLTree<Integer>();
		
		if (debug) System.out.println("ADD(200)");
		t.add(200);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("200:FB=0\t",t.preOrder());
		assertEquals("200:FB=0\t",t.inOrder());
		assertEquals("200:FB=0\t",t.postOrder());
		if (debug) System.out.println("ADD(100)");
		t.add(100);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("200:FB=-1\t100:FB=0\t",t.preOrder());
		assertEquals("100:FB=0\t200:FB=-1\t",t.inOrder());
		assertEquals("100:FB=0\t200:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(50)");
		t.add(50);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("100:FB=0\t50:FB=0\t200:FB=0\t",t.preOrder());
		assertEquals("50:FB=0\t100:FB=0\t200:FB=0\t",t.inOrder());
		assertEquals("50:FB=0\t200:FB=0\t100:FB=0\t",t.postOrder());
		if (debug) System.out.println("ADD(30)");
		t.add(30);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("100:FB=-1\t50:FB=-1\t30:FB=0\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=-1\t100:FB=-1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t50:FB=-1\t200:FB=0\t100:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(70)");
		t.add(70);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("100:FB=-1\t50:FB=0\t30:FB=0\t70:FB=0\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=0\t70:FB=0\t100:FB=-1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t70:FB=0\t50:FB=0\t200:FB=0\t100:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(60)");
		t.add(60);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("70:FB=0\t50:FB=0\t30:FB=0\t60:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=0\t60:FB=0\t70:FB=0\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t60:FB=0\t50:FB=0\t200:FB=0\t100:FB=1\t70:FB=0\t",t.postOrder());
		if (debug) System.out.println("ADD(65)");
		t.add(65);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("70:FB=-1\t50:FB=1\t30:FB=0\t60:FB=1\t65:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=1\t60:FB=1\t65:FB=0\t70:FB=-1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t65:FB=0\t60:FB=1\t50:FB=1\t200:FB=0\t100:FB=1\t70:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(67)");
		t.add(67);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("70:FB=-1\t50:FB=1\t30:FB=0\t65:FB=0\t60:FB=0\t67:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=1\t60:FB=0\t65:FB=0\t67:FB=0\t70:FB=-1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t60:FB=0\t67:FB=0\t65:FB=0\t50:FB=1\t200:FB=0\t100:FB=1\t70:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(55)");
		t.add(55);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("70:FB=-1\t60:FB=0\t50:FB=0\t30:FB=0\t55:FB=0\t65:FB=1\t67:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=0\t55:FB=0\t60:FB=0\t65:FB=1\t67:FB=0\t70:FB=-1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t55:FB=0\t50:FB=0\t67:FB=0\t65:FB=1\t60:FB=0\t200:FB=0\t100:FB=1\t70:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(68)");
		t.add(68);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("70:FB=-1\t60:FB=0\t50:FB=0\t30:FB=0\t55:FB=0\t67:FB=0\t65:FB=0\t68:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=0\t55:FB=0\t60:FB=0\t65:FB=0\t67:FB=0\t68:FB=0\t70:FB=-1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t55:FB=0\t50:FB=0\t65:FB=0\t68:FB=0\t67:FB=0\t60:FB=0\t200:FB=0\t100:FB=1\t70:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(64)");
		t.add(64);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("67:FB=0\t60:FB=0\t50:FB=0\t30:FB=0\t55:FB=0\t65:FB=-1\t64:FB=0\t70:FB=1\t68:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=0\t55:FB=0\t60:FB=0\t64:FB=0\t65:FB=-1\t67:FB=0\t68:FB=0\t70:FB=1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t55:FB=0\t50:FB=0\t64:FB=0\t65:FB=-1\t60:FB=0\t68:FB=0\t200:FB=0\t100:FB=1\t70:FB=1\t67:FB=0\t",t.postOrder());
		if (debug) System.out.println("ADD(20)");
		t.add(20);
		System.out.println(t);
		System.out.println("------------------------------");
		
		if (print) System.out.println(t);
		assertEquals("67:FB=-1\t60:FB=-1\t50:FB=-1\t30:FB=-1\t20:FB=0\t55:FB=0\t65:FB=-1\t64:FB=0\t70:FB=1\t68:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("20:FB=0\t30:FB=-1\t50:FB=-1\t55:FB=0\t60:FB=-1\t64:FB=0\t65:FB=-1\t67:FB=-1\t68:FB=0\t70:FB=1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("20:FB=0\t30:FB=-1\t55:FB=0\t50:FB=-1\t64:FB=0\t65:FB=-1\t60:FB=-1\t68:FB=0\t200:FB=0\t100:FB=1\t70:FB=1\t67:FB=-1\t",t.postOrder());
		System.out.println(t);
			}

}
