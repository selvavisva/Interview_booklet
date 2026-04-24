package structural.facade;

public class FacadePatternTest {
	public static void main(String[] args) {
		Lights light = new Lights();
		Projector prj = new Projector();
		SoundSystem soundSys = new SoundSystem();
		HomeTheater theater = new HomeTheater();
		HomeTheaterFacade facade = new HomeTheaterFacade(theater, light, prj, soundSys);
		facade.watchMovie("GBU");
	}

}
