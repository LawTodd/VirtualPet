import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
	
	private int hours;
	private int days;

	//@Test
	//public void shouldReturnInput() {
		//arrange
		//VirtualPet underTest = new VirtualPet();
		//act
		//String input = underTest.input();
		//assert
		//Assert.assertEquals("test", input);
	//}
	
	@Test
	public void shouldReturnTick() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		//act
		String status = underTest.tick(1);
		//assert
		String answer = "Status = "+1+"     "+1+"      "+1+"      "+1+"    "+1+"   "+0;
		Assert.assertEquals(answer, status);
	}

}
