package structural.proxy;

public class ProxyVideo implements Video{
	private String fileName;
	private Video video;		
	public ProxyVideo(String fileName){
		this.fileName=fileName;
	}
	
	public void play() {
		if(video==null) {
			video = new RealVideo(fileName);
		}else {
			video.play();
		}
	}

}
