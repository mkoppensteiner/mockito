import java.util.LinkedList;

import org.junit.Assert;
import org.mockito.Mockito;

public class mockitoTest {

/*	public void test1() {
		// create mock
		mockitoTest test = Mockito.mock(mockitoTest.class);
		
		// define return value for method getUniqueId()
		when (test.getUniqueId()).thenReturn(43);
		
	}*/
	
	public void test (){
		
		LinkedList l = Mockito.mock(LinkedList.class);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		Mockito.when(l.get(1)).thenReturn(2);
		Assert.assertEquals(2, l.get(2));
	}
	
}
