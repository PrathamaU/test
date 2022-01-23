package assertions;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assert_Same {

	@Test
	public void test() {
		String str1="abc";
		String str2="abc";
		
		assertSame(str1,str2);
		
	
	}

}
