//In this case, any class that implements the MediaPlayer interface would be forced to implement all the methods, even if it doesn't need them.
//
//For example, an audio player would have to implement the play_video, stop_video, and adjust_video_brightness methods, even though they are not relevant for audio playback.
public interface MediaPlayer {

    void playAudio();
    void playVideo();
    void stopAudio();
    void stopVideo();
    void adjustAudioVolume();
    void adjustVideoBrightness();
}
