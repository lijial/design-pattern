package adapter.pattern;

/**
 * Created by lijialiang on 2017/8/11.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    public void playMp4(String fileName) {
        //什么也不做
    }
}
