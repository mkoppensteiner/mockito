import java.util.Hashtable;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class mockito {

/*	@Test (expected = UnsupportedAddressTypeException.class)
	public void main() {
		LinkedList l = Mockito.mock(LinkedList.class);
		l.add(3);
		l.add(2);	    
		Mockito.when(l.get(1)).thenReturn(2); 
	//	doThrow(new UnsupportedAddressTypeException()).when(l).push(anyInt());
	//	Assert.assertEquals(2, l.get(1));
		*/
	
	
	@Test
	public void mock () {
		LinkedList l = Mockito.mock(LinkedList.class);
		l.add(3);  // Das Element an Stelle 0
		l.add(2); //  Das Element an Stelle 1
		
		Mockito.when(l.get(1)).thenReturn(2);
		Assert.assertEquals(2, l.get(1));
		
		Hashtable h = Mockito.mock(Hashtable.class);
		
		h.put(1, 1);
		h.put(2,2);
		
		Mockito.when(h.get(1)).thenReturn(1);
		Assert.assertEquals(1, 1);
	}

}
