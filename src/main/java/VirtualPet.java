
public class VirtualPet {

	private int hungry;
	private int thirsty;
	private int sleepy;
	private int bored;
	private int poop;
	private int dirty;
	private int sleeptimer;

	public void tick(int speed) {

		hungry+= speed;
		if (hungry >= 100) {
			System.out.println("Your pet has starved to Death!!  I'm calling the SPCA!!");
		} else if (hungry >= 40) {
			talk();
		}
		thirsty+= speed;
		if (thirsty >= 100) {
			System.out.println("Your pet has died of thirst!!  I'm calling the SPCA!!");
		} else if (thirsty >= 40) {
			talk();
		}
		if (sleeptimer > 0) {
			sleeptimer -= speed;
		} else {
			sleepy+= speed;
		}
		if (sleepy >= 100) {
			System.out.println("Your pet has died from lack of sleep!!  I'm calling the SPCA!!");
		} else if (sleepy >= 80) {
			talk();
			System.out.println("Beddybye time!!");
			sleeptimer = 20;
			sleepy = 0;
		}
		if (sleeptimer <= 0) {
			bored+=speed;
			if (bored >= 100) {
				System.out.println("Your pet has run away because it was too bored!!  "
					+ "I'm calling Animal Control!!");
			} else if (bored >= 50) {
				talk();
				System.out.println("What ya doin?");
			}
		}
		poop+=speed;
		if (dirty >= 100) {
			System.out.println("Your pet has run away because you didn't clean it!!  "
					+ "I'm calling Animal Control!!");
		} else if (poop >= 40) {
			talk();
			System.out.println("I made a Boom boom.");
			poop-=30;
			dirty+=10;
		}

		System.out.println("        Hungry"+" "+"Thirsty"+" "+"Sleepy"+" "+"Bored"+" "+"Poop"+" "+"Dirty");
		System.out.println("Status = "+hungry+"     "+thirsty+"      "+sleepy+"      "+bored+"    "+poop+"   "+dirty);
		//	return ;
	}

	public void feed() {
		if (sleeptimer <= 0) {
		hungry-=40;
		bored-=5;
		sleepy+=2;
		thirsty+=2;
		poop+=20;
		} else sleeping();
	}
	
	private void sleeping() {
		System.out.println("Don't bother me I'm sleeping");
	}

	public void water() {
		if (sleeptimer <= 0) {
			bored-=5;
			thirsty-=40;
		} else sleeping();
		
	}

	public void play() {
		if (sleeptimer <= 0) {
			bored-=40;
			hungry+=2;
			thirsty+=2;
			sleepy+=5;
		} else sleeping();
	}

	public void clean() {
		dirty=0;
	}

	public void talk() {
		System.out.println("SQUAK!!");
	}
}
