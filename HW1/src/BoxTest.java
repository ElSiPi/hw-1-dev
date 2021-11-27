import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class BoxTest {
	
	Box box = new Box("Large", "Yellow", 1300, 12.99);
	Box emptyBox = new Box("", "", 0, 0);	
	
	@Test
	void testPositiveParams() {
	
		assertEquals("Large", box.getSize());
		assertEquals("Yellow", box.getColour());
		assertEquals(1300, box.getVolume());
		assertEquals(12.99, box.getPrice());
	}
	
	@Test
	void testEmptyParams() {
		

		assertNotEquals("", emptyBox.getSize());
		assertEquals("", emptyBox.getColour());
	}

	@Test
	void testCompereVolumes() {

		Box box = new Box("Large", "Yellow", 1300, 12.99);

		assertTrue(box.compareVolumes(500));
		assertFalse(box.compareVolumes(1500));
	}

}
