package april27.test;

public interface VideoMediaPlayer extends MediaPlayer{

    default boolean chatAllowed(){
      return true;
    }
}
