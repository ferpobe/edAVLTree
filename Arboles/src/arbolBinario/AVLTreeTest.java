package arbolBinario;

import static org.junit.Assert.*;

import org.junit.Test;

public class AVLTreeTest {

	@Test
	public void test() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.add(10);
		b.add(5);
		b.add(3);
		b.add(7);
		b.add(6);
		b.add(4);
		b.add(2);
		b.add(8);
		b.add(11);
		b.add(12);
		b.add(13);
		b.add(14);
		
		System.out.println(b);
		System.out.println("\n"+"-----------Test add-----------"+" \n");
	}
	@Test
	public void test2() {
		//caso especial
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.add(20);
		b.add(5);
		b.add(50);
		b.add(0);
		b.add(10);
		b.add(30);
		b.add(70);
		b.add(-4);
		b.add(3);
		b.add(7);
		b.add(15);
		b.add(25);
		b.add(40);
		b.add(60);
		b.add(80);
		b.add(-5);
		b.add(-2);
		b.add(2);
		b.add(4);
		b.add(6);
		b.add(8);
		b.add(12);
		b.add(18);
		b.add(45);
		b.add(1);
		b.add(11);
		b.add(13);
		b.add(16);
		b.add(19);
		System.out.println(b);
		System.out.println("\n"+"------------Caso especial----------"+" \n");
		b.remove(45);
		System.out.println(b);
		
		System.out.println("\n"+"------------Caso especial borrado----------"+" \n");
		
		
		
		
	}
	@Test
	public void test3() {
		AVLTree<Integer> b = new AVLTree<Integer>();
		b.add(10);
		b.add(10);
		b.remove(10);
		b.remove(10);
		b.add(10);
		b.remove(10);
		b.add(null);
		
		
		//borrar rotacion simple derecha
		b.add(10);
		b.add(5);
		b.add(15);
		b.add(3);
		b.remove(15);
		System.out.println(b);
		
		System.out.println("\n"+"-----------Simple Derecha-----------"+" \n");
	}
		
		
		//borrar rotacion simple izquierda
		@Test
		public void testSimpleIzq() {
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.add(10);
			b.add(5);
			b.add(10);
			b.add(15);
			b.add(16);
			System.out.println("------------------------");
			System.out.println(b);
			b.remove(5);
			System.out.println("------------------------");
			System.out.println(b);
			
			System.out.println("\n"+"-----------Simple Izquierda-----------"+" \n");
		}
		
		
		//borrar rotacion doble derecha
		@Test
		public void testDobleDer() {
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.add(10);
			b.add(5);
			b.add(15);
			b.add(14);
			System.out.println("------------------------");
			System.out.println(b);
			
			b.remove(5);
			System.out.println("------------------------");
			System.out.println(b);
			System.out.println("\n"+"---------Doble Derecha-------------"+" \n");
		}
		
		//borrar rotacion doble izquierda 1
		@Test
		public void testDobleIzq1() {
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.add(10);
			b.add(5);
			b.add(15);
			b.add(7);
			System.out.println("------------------------");
			System.out.println(b);
			b.remove(15);
			System.out.println("------------------------");
			System.out.println(b);
			System.out.println("\n"+"-----------Doble Izquierda 1-----------"+" \n");
		}
		
		//borrar rotacion doble izquierda 0
		@Test
		public void testDobleIzq0() {
					AVLTree<Integer> b = new AVLTree<Integer>();
					b.add(10);
					b.add(5);
					b.add(15);
					b.add(3);
					b.add(7);
					System.out.println("------------------------");
					System.out.println(b);
					b.remove(15);
					System.out.println("------------------------");
					System.out.println(b);
					System.out.println("\n"+"-----------Doble Izquierda 2-----------"+" \n");
				}
		@Test
		public void testSemirario() {
			AVLTree<Integer> b = new AVLTree<Integer>();
			b.add(70);
			b.add(40);
			b.add(100);
			b.add(20);
			b.add(50);
			b.add(110);
			b.add(10);
			b.add(60);
			System.out.println(b);
			b.remove(100);
			System.out.println(b);
		}
		
	
				
		
	}

