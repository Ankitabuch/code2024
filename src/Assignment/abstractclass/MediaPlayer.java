package Assignment.abstractclass;

public class MediaPlayer {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer("Spotify", "Fortnight","Taylor Swift");
        VideoPlayer videoPlayer = new VideoPlayer("Youtube", "Jhumka",228);
        ImageDisplay imageDisplay = new ImageDisplay("LightRoom", "Raw Image", "5616x3744");

        audioPlayer.play();
        audioPlayer.displayDetails();
        System.out.println();

        videoPlayer.play();
        videoPlayer.displayDetails();
        System.out.println();

        imageDisplay.displayImage();
        imageDisplay.displayDetails();

    }
}
