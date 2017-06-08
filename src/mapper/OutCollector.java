package mapper;

public interface OutCollector<K,V>
{
	/**
	 * Add a new tuple to the Collector
	 * @param t The {@link Tuple} to add
	 */
	public void collect(Tuple<K,V> t);
	
	/**
	 * Rewinds the collector to the beginning of its enumeration
	 */
	public void rewind();
}