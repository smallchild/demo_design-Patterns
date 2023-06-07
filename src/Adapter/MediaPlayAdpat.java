package Adapter;

/**
 * @ProjectName: demo_design-Patterns
 * @Package: Adapter
 * @ClassName: MediaPlayAdpat
 * @Author: nieyun
 * @Description:
 * @Date: 2023/6/5 下午1:11
 */
public class MediaPlayAdpat implements MediaPlayer {
    AdvencedMediaPlayer advencedMediaPlayer;


    public MediaPlayAdpat(String aduioType){
        if("mp4".equalsIgnoreCase(aduioType)){
            advencedMediaPlayer = new MP4Player();
        }else if("avi".equalsIgnoreCase(aduioType)){
            advencedMediaPlayer = new AVIPlayer();
        }
    }

    @Override public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")) {
            advencedMediaPlayer.playMP4(fileName);
        }
        else if(audioType.equalsIgnoreCase("avi")) {
            advencedMediaPlayer.playAVI(fileName);
        }
    }
}
