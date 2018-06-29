package be.vdab.veiling;

import org.junit.Test;
import static org.junit.Assert.*;

public class VeilingTest {

	@Test
	public void als_nog_geen_bod_is_gedaan_dan_is_het_hoogste_bod_nul() {
		Veiling veiling = new Veiling();
		assertEquals(0, veiling.getHoogsteBod());
	}
	
	@Test
	public void als_er_een_eerste_bod_werd_uitgevoerd_dan_is_hoogste_bod_eerste_bod() {
		Veiling veiling = new Veiling();
		veiling.doeBod(100);
		assertEquals(100, veiling.getHoogsteBod());
	}
	
	@Test
	public void als_er_meermaals_bod_werd_uitgevoerd_dan_is_hoogste_bod_gelijk_aan_hoogste_bod() {
		Veiling veiling = new Veiling();
		veiling.doeBod(100);
		veiling.doeBod(50);
		veiling.doeBod(150);
		assertEquals(150, veiling.getHoogsteBod());
	}
	
	

}
