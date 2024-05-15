package mytests;

import java.util.Map;
import org.testng.annotations.Test;

public class FrequencyCounterTest {

	// TODO Auto-generated method stub
	//1 usage
	//FrequencyCounter counter = new FrequencyCounter();

	@Test
	public void testGetFrequency() {
		
		FrequencyCounter counter = new FrequencyCounter();
		int[] arr = {2,4,6,2,4};

		counter.getFrequency(arr).forEach((k, v) -> System.out.println("Key " + k + ": " + v));

	}

}
