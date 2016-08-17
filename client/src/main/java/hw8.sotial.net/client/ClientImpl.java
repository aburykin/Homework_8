package hw8.sotial.net.client;

import hw8.sotial.net.server.ServerImpl;

/**
 * Created by ABurykin on 16.08.2016.
 */
public class ClientImpl implements Client {

    private final ServerImpl server;

    public ClientImpl(){
        this.server = new ServerImpl();
    }


    public String showPhoto(int userId, String photoName) {
        return server.showPhoto( userId, photoName);
    }

    public String uploadPhoto(int userId, String photoName) {
        return server.uploadPhoto( userId, photoName);
    }

    public String downloadPhoto(int userId, String photoName) {
        return server.downloadPhoto( userId, photoName);
    }
}
