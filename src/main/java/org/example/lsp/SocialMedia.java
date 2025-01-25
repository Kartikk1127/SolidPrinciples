package org.example.lsp;

public abstract class SocialMedia {


    //@supported by Whatsapp,Facebook,Instagram
    public abstract void chatWithFriend();

    //@supported by Facebook,Instagram
    public abstract void publishPost();

    //@supported by Whatsapp,Facebook,Instagram
    public abstract void sendPhotosAndVideos();

    //@supported by Whatsapp,Facebook
    public abstract void groupVideoCall(String... users);
}
