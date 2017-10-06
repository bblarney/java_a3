package comp2402a3;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Collections;

/**
 * This class implements the IntervalSet interface for storing a set of
 * disjoint intervals
 * @author morin
 *
 * @param <K>
 */
public class DisjointIntervalSet<K extends Comparable<K>> implements IntervalSet<K> {
	SortedSet<Interval<K>> intervals;

	public DisjointIntervalSet() {
		intervals = new TreeSet<Interval<K>>();
	}

	public boolean add(Interval<K> i) {
		// TODO: add checking to see if i overlaps anything in the set
		//       -- if so, don't add it and return false. Otherwise, add
		// it and return true
		return false;
	}

	public void clear() {
		intervals.clear();
	}

	public boolean contains(K x) {
		// TODO Add code for searching here.  See Interval.main() for an example
		for (int i = 0; i < 50; i++) {
		SortedSet<Interval<Integer>> ts = intervals.tailSet(new Interval<K>(i,i)); // Find stuff >= [i,i)
				if (!ts.isEmpty()) {
				Interval<Integer> u = ts.first(); // if it's there, it's in
												  // the first interval
				if (u.contains(i)) {
					return true;
				}
				else{
					return false;
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DumbIntervalSet.runTests(new DisjointIntervalSet<Integer>());
	}

}
