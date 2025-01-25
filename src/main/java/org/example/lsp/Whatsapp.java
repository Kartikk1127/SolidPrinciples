package org.example.lsp;

//here, since whatsapp does not allow to publish a post but it still extends social media due
//to which it has to implement the publishPost method, hence we can say that it does not support
//Liskov Substitution Principle
public class Whatsapp extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost() {
        //not applicable
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
