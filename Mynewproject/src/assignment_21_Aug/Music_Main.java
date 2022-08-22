package assignment_21_Aug;

interface MusicalInstrument {
	void play();
	
	static void learnInstrument() {
		System.out.println("I Love Music");
	} 
}

abstract class Sound{
	abstract void listenSound();
}

class PercussionInstrument extends Sound implements MusicalInstrument{

	@Override
	public void play() {
		
		System.out.println("Tabla-Zakir Hussain");
	}

	@Override
	void listenSound() {
		System.out.println("Tabla Used in Classical Music");
		
	}
	
}

class StringedInstrument extends Sound implements MusicalInstrument{

	@Override
	public void play() {
		System.out.println("Voilin-L. Subramaniam");
		
	}

	@Override
	void listenSound() {
		System.out.println("Voilin Used in Western Music");
		
	}
	
}

public class Music_Main {

	public static void main(String[] args) {
		MusicalInstrument.learnInstrument();
		System.out.println();
		PercussionInstrument Tabla =new PercussionInstrument();
		Tabla.play();
		StringedInstrument Voilin =new StringedInstrument();
		Voilin.play();
		System.out.println();
		Tabla.listenSound();
		Voilin.listenSound();
	
	}

}
