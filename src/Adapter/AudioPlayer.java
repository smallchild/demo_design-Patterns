package Adapter;

/**
 * @ProjectName: demo_design-Patterns
 * @Package: Adapter
 * @ClassName: AudioPlayer
 * @Author: nieyun
 * @Description:
 * @Date: 2023/6/7 下午4:51
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayAdpat mediaAdapter;
    @Override public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("avi")) {
            mediaAdapter = new MediaPlayAdpat(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
