import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Addition {
	public int add(int x, int y) {
		return x+y;
		
	}

	@Test
	public void test() {
		assertEquals(4,add(2 , 2));
		
	}

}
