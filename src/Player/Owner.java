package Player;
public class Owner {
	public static void main(String[] args) {
		// TODO code application logic here
		AudioPlayer myAudioPlayer = new AudioPlayer();
		VideoPlayer myVideoPlayer = new VideoPlayer();
		AVPlayer myAVPlayer = myAudioPlayer;
		myAVPlayer.play();
	}
	
}
