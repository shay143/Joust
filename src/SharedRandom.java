import java.util.Random;

public class SharedRandom {

	public static final Random r = new Random(100);
	
	public static int getRandom(int experience) {
		return (r.nextInt(experience)+1);
	}
	
}//end class
