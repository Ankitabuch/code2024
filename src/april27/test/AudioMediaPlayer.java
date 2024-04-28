package april27.test;

public interface AudioMediaPlayer extends MediaPlayer{

    default boolean playOnScreenOff(){
        return true;
    }
}
