package rana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class test {





	@Test
	public void testsub() {
		model m=new  model();
		m.setoper(2);
		m.opr1=12.0;
		m.opr2=4.0;
		m.FindOperation();
		assertEquals(8,8);
		
	}

	@Test
	public void testdiv() {
		model m=new  model();
		m.setoper(5);
		m.opr1=12.0;
		m.opr2=4.0;
		m.FindOperation();
		assertEquals(3,3);
		
	}

	@Test
	public void testmodule() {
		model m=new  model();
		m.setoper(6);
		m.opr1=12.0;
		m.opr2=4.0;
		m.FindOperation();
		assertEquals(0,0);
		
	}

}
