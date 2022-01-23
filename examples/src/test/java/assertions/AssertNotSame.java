package assertions;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertNotSame {

	@Test
	public void test() {
	
		String str1="abc";
		String str2="abcd";
		assertNotSame(str1,str2);
	}

}
