package adapter.pattern;

/**
 * 适配器模式（Adapter Pattern)
 * 意图：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * http://www.runoob.com/design-pattern/adapter-pattern.html
 * 心得：如果已有工具想多支持功能，可以写个适配器，适配器里可以new 出高级工具来支持mp4格式，而
        原来内置功能只支持mp3，这样可以不改原来的结构
 * Created by lijialiang on 2017/8/11.
 *
 */
public class AdapterPatternMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
