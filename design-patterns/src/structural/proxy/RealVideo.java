package structural.proxy;

public class RealVideo implements Video{
	
	private String fileName;
	
	public RealVideo(String fileName) {
		this.fileName=fileName;
		loadVideoFromDisk(fileName);
	}
	
	private void loadVideoFromDisk(String fileName) {		
		System.out.println("Loading video from the disk :: "+fileName);
	}
	
	@Override
	public void play() {		
		System.out.println("Playing video :: "+fileName);
	}
}