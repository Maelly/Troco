package troco;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrocoTeste {
		
		@Test
		public void testTroco100(){
			Troco t = new Troco(50, 150);
			assertEquals(1, t.qtdeCem());
			assertEquals(0, t.qtdeCinquenta());
		}
		
		@Test
		public void testTroco150(){
			Troco t = new Troco(150, 300);
			assertEquals(1, t.qtdeCem());
			assertEquals(1, t.qtdeCinquenta());
		}
		
		@Test
		public void testTroco20(){
			Troco t = new Troco(10, 30);
			assertEquals(1, t.qtdeVinte());
			assertEquals(0, t.qtdeCinquenta());
			assertEquals(0, t.qtdeCem());
		}

		@Test
		public void testTroco10(){
			Troco t = new Troco(10, 20);
			assertEquals(1, t.qtdeDez());
			assertEquals(0, t.qtdeVinte());
			assertEquals(0, t.qtdeCinquenta());
			assertEquals(0, t.qtdeCem());
		}
		
		@Test
		public void testTroco5(){
			Troco t = new Troco(10, 15);
			assertEquals(1, t.qtdeCinco());
			assertEquals(0, t.qtdeDez());
			assertEquals(0, t.qtdeVinte());
			assertEquals(0, t.qtdeCinquenta());
			assertEquals(0, t.qtdeCem());
		}
		
		@Test
		public void testTroco2(){
			Troco t = new Troco(14, 16);
			assertEquals(1, t.qtdeDois());
			assertEquals(0, t.qtdeCinco());
			assertEquals(0, t.qtdeDez());
			assertEquals(0, t.qtdeVinte());
			assertEquals(0, t.qtdeCinquenta());
			assertEquals(0, t.qtdeCem());
		}
	}

