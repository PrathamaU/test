package assertions;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assert_Null {

	@Test
	public void test() {
			String str1=null;
			
			assertNull(str1);
	}

}
