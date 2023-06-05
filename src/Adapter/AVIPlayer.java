package Adapter;

/**
 * @ProjectName: demo_design-Patterns
 * @Package: Adapter
 * @ClassName: AVIPlayer
 * @Author: nieyun
 * @Description:
 * @Date: 2023/6/5 下午1:10
 */
public class AVIPlayer implements AdvencedMediaPlayer {
    @Override public void playMP4(String fileName) {

    }

    @Override public void playAVI(String fileName) {
        System.out.println("play AVI!");
    }
}
