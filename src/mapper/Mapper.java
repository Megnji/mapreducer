package mapper;

public interface Mapper <K,V>{
	
	public void map(OutCollector<K,V> c, Tuple<K,V> t);

}
