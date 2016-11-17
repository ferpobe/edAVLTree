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
		assertTrue(t.add(200));
		if (print) System.out.println(t);
		assertEquals("200:FB=0\t",t.preOrder());
		assertEquals("200:FB=0\t",t.inOrder());
		assertEquals("200:FB=0\t",t.postOrder());
		if (debug) System.out.println("ADD(100)");
		assertTrue(t.add(100));
		if (print) System.out.println(t);
		assertEquals("200:FB=-1\t100:FB=0\t",t.preOrder());
		assertEquals("100:FB=0\t200:FB=-1\t",t.inOrder());
		assertEquals("100:FB=0\t200:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(50)");
		assertTrue(t.add(50));
		if (print) System.out.println(t);
		assertEquals("100:FB=0\t50:FB=0\t200:FB=0\t",t.preOrder());
		assertEquals("50:FB=0\t100:FB=0\t200:FB=0\t",t.inOrder());
		assertEquals("50:FB=0\t200:FB=0\t100:FB=0\t",t.postOrder());
		if (debug) System.out.println("ADD(30)");
		assertTrue(t.add(30));
		if (print) System.out.println(t);
		assertEquals("100:FB=-1\t50:FB=-1\t30:FB=0\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=-1\t100:FB=-1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t50:FB=-1\t200:FB=0\t100:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(70)");
		assertTrue(t.add(70));
		if (print) System.out.println(t);
		assertEquals("100:FB=-1\t50:FB=0\t30:FB=0\t70:FB=0\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=0\t70:FB=0\t100:FB=-1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t70:FB=0\t50:FB=0\t200:FB=0\t100:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(60)");
		assertTrue(t.add(60));
		if (print) System.out.println(t);
		assertEquals("70:FB=0\t50:FB=0\t30:FB=0\t60:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=0\t60:FB=0\t70:FB=0\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t60:FB=0\t50:FB=0\t200:FB=0\t100:FB=1\t70:FB=0\t",t.postOrder());
		if (debug) System.out.println("ADD(65)");
		assertTrue(t.add(65));
		if (print) System.out.println(t);
		assertEquals("70:FB=-1\t50:FB=1\t30:FB=0\t60:FB=1\t65:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=1\t60:FB=1\t65:FB=0\t70:FB=-1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t65:FB=0\t60:FB=1\t50:FB=1\t200:FB=0\t100:FB=1\t70:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(67)");
		assertTrue(t.add(67));
		if (print) System.out.println(t);
		assertEquals("70:FB=-1\t50:FB=1\t30:FB=0\t65:FB=0\t60:FB=0\t67:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=1\t60:FB=0\t65:FB=0\t67:FB=0\t70:FB=-1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t60:FB=0\t67:FB=0\t65:FB=0\t50:FB=1\t200:FB=0\t100:FB=1\t70:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(55)");
		assertTrue(t.add(55));
		if (print) System.out.println(t);
		assertEquals("70:FB=-1\t60:FB=0\t50:FB=0\t30:FB=0\t55:FB=0\t65:FB=1\t67:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=0\t55:FB=0\t60:FB=0\t65:FB=1\t67:FB=0\t70:FB=-1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t55:FB=0\t50:FB=0\t67:FB=0\t65:FB=1\t60:FB=0\t200:FB=0\t100:FB=1\t70:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(68)");
		assertTrue(t.add(68));
		if (print) System.out.println(t);
		assertEquals("70:FB=-1\t60:FB=0\t50:FB=0\t30:FB=0\t55:FB=0\t67:FB=0\t65:FB=0\t68:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=0\t55:FB=0\t60:FB=0\t65:FB=0\t67:FB=0\t68:FB=0\t70:FB=-1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t55:FB=0\t50:FB=0\t65:FB=0\t68:FB=0\t67:FB=0\t60:FB=0\t200:FB=0\t100:FB=1\t70:FB=-1\t",t.postOrder());
		if (debug) System.out.println("ADD(64)");
		assertTrue(t.add(64));
		if (print) System.out.println(t);
		assertEquals("67:FB=0\t60:FB=0\t50:FB=0\t30:FB=0\t55:FB=0\t65:FB=-1\t64:FB=0\t70:FB=1\t68:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("30:FB=0\t50:FB=0\t55:FB=0\t60:FB=0\t64:FB=0\t65:FB=-1\t67:FB=0\t68:FB=0\t70:FB=1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("30:FB=0\t55:FB=0\t50:FB=0\t64:FB=0\t65:FB=-1\t60:FB=0\t68:FB=0\t200:FB=0\t100:FB=1\t70:FB=1\t67:FB=0\t",t.postOrder());
		if (debug) System.out.println("ADD(20)");
		assertTrue(t.add(20));
		if (print) System.out.println(t);
		assertEquals("67:FB=-1\t60:FB=-1\t50:FB=-1\t30:FB=-1\t20:FB=0\t55:FB=0\t65:FB=-1\t64:FB=0\t70:FB=1\t68:FB=0\t100:FB=1\t200:FB=0\t",t.preOrder());
		assertEquals("20:FB=0\t30:FB=-1\t50:FB=-1\t55:FB=0\t60:FB=-1\t64:FB=0\t65:FB=-1\t67:FB=-1\t68:FB=0\t70:FB=1\t100:FB=1\t200:FB=0\t",t.inOrder());
		assertEquals("20:FB=0\t30:FB=-1\t55:FB=0\t50:FB=-1\t64:FB=0\t65:FB=-1\t60:FB=-1\t68:FB=0\t200:FB=0\t100:FB=1\t70:FB=1\t67:FB=-1\t",t.postOrder());
			}

}
