package Adapter;

/**
 * @ProjectName: demo_design-Patterns
 * @Package: Adapter
 * @ClassName: MP4Player
 * @Author: nieyun
 * @Description: mp4Player
 * @Date: 2023/6/5 下午1:09
 */
public class MP4Player implements AdvencedMediaPlayer {
    @Override public void playMP4(String fileName) {
        System.out.println("play mp4!");
    }

    @Override public void playAVI(String fileName) {
    }
}
