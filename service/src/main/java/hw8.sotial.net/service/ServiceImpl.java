package hw8.sotial.net.service;

import hw8.sotial.net.client.ClientImpl;

/**
 * Created by ABurykin on 16.08.2016.
 */

// сервис который работает с фотографаями пользователя
public class ServiceImpl  implements Service {

    private final ClientImpl userClient;
    private int userId;

    public ServiceImpl(){
        this.userClient = new ClientImpl();
    }

    public ServiceImpl(ClientImpl userClient){
        this.userClient = userClient;
    }


    public void authorization(int userId){
        this.userId = userId;
    }

    public String showPhoto(String photoName) {
        return userClient.showPhoto( userId, photoName);
    }

    public String uploadPhoto(String photoName) {
        return userClient.uploadPhoto( userId, photoName);
    }

    public String downloadPhoto(String photoName) {
        return userClient.downloadPhoto( userId, photoName);
    }

    public int sumAB(int a, int b){
        return a+b;
    }



}
