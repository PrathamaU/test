package assertions;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertArrayEquals {

	@Test
	public void test() {

		String[] arr1= {"abc","def","ghi"};
		String[] arr2= {"abc","def","ghi"};

		assertArrayEquals(arr1,arr2);
		
	}

}
