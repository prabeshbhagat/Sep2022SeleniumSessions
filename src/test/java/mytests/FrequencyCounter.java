package mytests;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

	public Map getFrequency(int[] arr) {
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (freqMap.containsKey(arr[i])) {
				freqMap.put(arr[i], freqMap.get(arr[i] )+ 1);
			} else {
				freqMap.put(arr[i], 1);
			}

		}
		return freqMap;

	}

}
