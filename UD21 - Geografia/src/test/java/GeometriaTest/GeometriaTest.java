package GeometriaTest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geometria.Geometria;

class GeometriaTest {

	Geometria geom = new Geometria();

	@Test
	void testGeometria() {
		
		int id = 1;
	    Geometria geometria = new Geometria(id);
	    assertEquals(id, geometria.getId());
	    assertEquals("cuadrado", geometria.getNom());
    }
	
	@Test
	void testDefaultConstructor() {
	    
	    assertEquals(9, geom.getId());
	    assertEquals("Default", geom.getNom());
	}
	
	@Test
	void testAreacuadrado() {
		int result = geom.areacuadrado(5);
		assertEquals(25, result) ;
    }

	@Test
	void testAreaCirculo(){
		int result = (int) geom.areaCirculo(10);
		assertEquals(314, result) ;
    }

	@Test
	void testAreatriangulo() {
		int result = geom.areatriangulo(10,20);
		assertEquals(100, result) ;
    }

	@Test
	void testArearectangulo() {
		int result = geom.arearectangulo(5, 10);
		assertEquals(50, result) ;
    }

	@Test
	void testAreapentagono() {
		int result = geom.areapentagono(5,10);
		assertEquals(25, result) ;
    }

	@Test
	void testArearombo() {
		int result = geom.arearombo(5,10);
		assertEquals(25, result) ;
    }

	@Test
	void testArearomboide() {
		int result = geom.arearomboide(5,10);
		assertEquals(50, result) ;
    }

	@Test
	void testAreatrapecio() {
		int result = geom.areatrapecio(3, 5, 6);
		assertEquals(24, result) ;
    }
	
	
	@Test
	void testFigura() {
        
        
		String result1 = geom.figura(1);
		assertEquals("cuadrado", result1);
		
		String result2 = geom.figura(2);
		assertEquals("Circulo", result2);
		
		String result3 = geom.figura(3);
		assertEquals("Triangulo", result3);
		
		String result4 = geom.figura(4);
		assertEquals("Rectangulo", result4);
		
		String result5 = geom.figura(5);
		assertEquals("Pentagono", result5);
		
		String result6 = geom.figura(6);
		assertEquals("Rombo", result6);
		
		String result7 = geom.figura(7);
		assertEquals("Romboide", result7);
		
		String result8 = geom.figura(8);
		assertEquals("Trapecio", result8);
		
		String result9 = geom.figura(9);
		assertEquals("Default", result9);
                
    
	}   
	  
    
	@Test
	void testGetId() {
		int expectedId = 1;
	    Geometria geometria = new Geometria(expectedId);
	    assertEquals(expectedId, geometria.getId());
	}

	@Test
	void testSetId() {
		
	    geom.setId(2); 
	    assertEquals(2, geom.getId());
	}

	@Test
	void testGetNom() {
		
		 geom.setNom("cuadrado");
		 assertEquals("cuadrado", geom.getNom());
	}

	@Test
	void testSetNom() {
		 
		 geom.setNom("Dani"); 
		 assertEquals("Dani", geom.getNom());

	}

	@Test
	void testGetArea() {
		geom.setArea(14.96);
	    assertEquals(14.96, geom.getArea());

	}

	@Test
	void testSetArea() {
		geom.setArea(8.3);
	    assertEquals(8.3, geom.getArea());
	    
	}

	@Test
	void testToString() {
		geom.setId(1);
	    geom.setNom("cuadrado");
	    geom.setArea(8.3);
	    String expectedString = "Geometria [id=1, nom=cuadrado, area=8.3]";
	    assertEquals(expectedString, geom.toString());
	}


}