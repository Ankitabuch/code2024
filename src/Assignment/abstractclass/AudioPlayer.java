package Assignment.abstractclass;

public class AudioPlayer extends MediaDevice implements Playable{
    String songName;
    String artist;

    public AudioPlayer(String name, String songName, String artist) {
        super(name);
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing audio:" + songName + "by" + artist);
    }

    void displayDetails(){
        System.out.println("Audio Player Name: " + name);
        System.out.println("Song Name: " + songName);
        System.out.println("Artist: " + artist);

    }
}
