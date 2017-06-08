package mapper;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Implementation of mapper
 * @author wykbill
 *
 */
public class MapperThread implements Mapper, Callable<Integer>{

    private String str;
    public MapperThread(String string){
        str = string;
    }
    

    @Override
    public Integer call() throws Exception {
        //TODO : do something with the str variable
        return new Random().nextInt(100);
    }


	@Override
	public void map(OutCollector c, Tuple t) {
		// TODO Auto-generated method stub
		
	}

}
