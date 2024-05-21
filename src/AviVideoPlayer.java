//By segregating the interfaces, each class only needs to implement the methods it actually requires. This not only makes the code more maintainable but also prevents clients from being forced to depend on methods they don't use.
public class AviVideoPlayer implements VideoPlayer{
    @Override
    public void playVideo() {

    }

    @Override
    public void stopVideo() {

    }

    @Override
    public void adjustVideoBrightness() {

    }
}
