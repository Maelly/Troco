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
	}

