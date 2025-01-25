package org.example.lsp.solution;

//now it follows LSP since it implements only those methods that it is capable of supporting
//we can also say Whatsapp is now a substitute of both parents
public class Whatsapp implements SocialMedia,SocialMediaVideoCallManager{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
