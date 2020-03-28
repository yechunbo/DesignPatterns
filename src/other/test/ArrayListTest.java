package other.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author YeChunBo
 * @time 2020年3月24日
 *
 *       类说明
 */

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hello");

		Iterator<String> it = arrayList.iterator();
		boolean hasNext = it.hasNext();
		String string = it.next();

		LinkedList<String> linkedList = new LinkedList<>();
		Iterator<String> iterator = linkedList.iterator();
		boolean hasNext2 = iterator.hasNext();
		String next = iterator.next();

		HashMap<String, String> hashMap = new HashMap<String, String>();
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		Set<Entry<String,String>> entrySet = hashtable.entrySet();
		Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
		boolean hasNext3 = iterator2.hasNext();
		Entry<String, String> next2 = iterator2.next();
		String value = next2.getValue();
		
		Collection<String> values = hashtable.values();
		Iterator<String> iterator3 = values.iterator();
		boolean hasNext4 = iterator3.hasNext();

	}

	private class testClass {

	}
}
