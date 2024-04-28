package april27.test;

public class Youtube implements VideoMediaPlayer, AudioMediaPlayer,MediaPlayer{

    @Override
    public void stop() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void play() {

    }

    @Override
    public boolean chatAllowed() {
        System.out.println("Chat is Allowed");
        return VideoMediaPlayer.super.chatAllowed();

    }

    @Override
    public boolean playOnScreenOff() {
        return false;
    }
}
