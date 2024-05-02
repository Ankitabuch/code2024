package Assignment.abstractclass;

public class VideoPlayer extends MediaDevice implements Playable {

    String videoTitle;
    int duration;

    public VideoPlayer(String name, String videoTitle, int duration) {
        super(name);
        this.videoTitle = videoTitle;
        this.duration = duration;
    }


    @Override
    public void play() {
        System.out.println("Playing video: " + videoTitle + " (Duration: " + duration + " seconds)");
    }

    public void displayDetails() {
        System.out.println("Video Player: " + name);
        System.out.println("Title: " + videoTitle);
        System.out.println("Duration: " + duration + " seconds");

    }
}

