package org.example.lsp.solution;

//now it follows LSP since it implements only those methods that it is capable of supporting
public class Instagram implements SocialMedia,PostMediaManager {
    @Override
    public void publishPost() {

    }

    @Override
    public void chatWithFriend() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }
}
