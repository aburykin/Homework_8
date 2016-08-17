package hw8.sotial.net.server;

/**
 * Created by ABurykin on 16.08.2016.
 */
public interface Server {

    public String showPhoto(int userId, String photoName);

    public String uploadPhoto(int userId, String photoName);

    public String downloadPhoto(int userId, String photoName);



}
