import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;
import org.wecancodeit.exercise.ohmy.OhMyIterator;

public class VirtualPetTest {
	
	private int hours;
	private int days;

	@Test
	public void shouldReturnInput() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		//act
		String input = underTest.input();
		//assert
		Assert.assertEquals("test", input);
	}
	
	@Test
	public void shouldReturnTick() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		//act
		String first = underTest.tick(hours, days);
		//assert
		Assert.assertEquals("lions", first);
	}

}
