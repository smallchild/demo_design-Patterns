package Adapter;

/**
 * @ProjectName: demo_design-Patterns
 * @Package: Adapter
 * @ClassName: AdapterPatternDemo
 * @Author: nieyun
 * @Description:
 * @Date: 2023/6/7 下午4:54
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "song.mp3");
        player.play("mp4", "movie.mp4");
        player.play("avi", "video.avi");
        player.play("flv", "video.flv");
    }
}
