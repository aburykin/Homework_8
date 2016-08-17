package hw8.sotial.net.service;

/**
 * Created by ABurykin on 16.08.2016.
 */
interface Service {

    // любой сервис умеет
    public String showPhoto(String photoName);

    public String uploadPhoto(String photoName);

    public String downloadPhoto(String photoName);


}
