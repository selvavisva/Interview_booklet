package structural.facade;

public class HomeTheaterFacade {
	private HomeTheater theater;
	private Lights lights;
	private Projector projector;
	private SoundSystem soundsystem;
	
	HomeTheaterFacade(HomeTheater theater, Lights lights, Projector projector, SoundSystem soundsystem){
		this.theater=theater;
		this.lights=lights;
		this.projector=projector;
		this.soundsystem=soundsystem;
	}
	
	public void watchMovie(String name) {		
		projector.on();
		soundsystem.on();
		lights.dim();
		theater.on();
	}

}
