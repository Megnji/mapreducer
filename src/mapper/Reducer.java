package mapper;

public interface Reducer<K,V>
{
	/**
	 * Reduce function
	 * @param out A {@link OutCollector} that will be used to write output tuples
	 * @param key The key associated to this instance of reducer
	 * @param in An {@link InCollector} containing all the tuples generated
	 * in the map phase for the given key
	 */
	public void reduce();
}
