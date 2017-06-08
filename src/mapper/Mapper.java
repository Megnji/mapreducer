package mapper;

public interface Mapper <K,V>{
	
	public int map(Tuple<K,V> t);

}
