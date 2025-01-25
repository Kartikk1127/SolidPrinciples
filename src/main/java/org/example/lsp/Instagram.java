package org.example.lsp;
//since instagram does not support group video call but since it extends the abstract social media class
//hence it has to implement the groupVideoCall method so we can say that it does not support
//Liskov Substitution principle
public class Instagram extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {
        //not applicable
    }
}
