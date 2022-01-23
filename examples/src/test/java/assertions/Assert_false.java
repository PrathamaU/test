package assertions;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assert_false {

	@Test
	public void assertfalse() {
			int val1=1;
			int val2=2;
			
			assertFalse(val1>val2);
	}

}
