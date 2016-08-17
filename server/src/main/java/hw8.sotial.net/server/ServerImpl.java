package hw8.sotial.net.server;

import java.util.ArrayList;

/**
 * Created by ABurykin on 16.08.2016.
 */
public class ServerImpl implements Server {

    private static ArrayList<ArrayList> userData ;
    private static ArrayList<String> PhotoData ;

    static{
        PhotoData = new ArrayList<String>();
        PhotoData.add(0,"Фотография 0");
        PhotoData.add(1,"Фотография 1");
        PhotoData.add(2,"Фотография 2");

        userData =  new ArrayList();
        userData.add(null);
        userData.add(null);
        userData.add(null);
        userData.add(null);
        userData.set(3,PhotoData);
    }


    public String showPhoto(int userId, String photoName) {
        if(checkAuth(userId)){
            ArrayList<String> usersPhoro =  userData.get(userId);
            for (String photo : usersPhoro) {
                if (photoName.equals(photo)){
                    return "showPhoto: " + photo;
                }
            }
            return "showPhoto: Ничего не найдено";
        }
        return "";

    }

    public String uploadPhoto(int userId, String photoName) {
        return "uploadPhoto тестовое сообщение";
    }

    public String downloadPhoto(int userId, String photoName) {
        return "downloadPhoto тестовое сообщение";
    }


    private boolean checkAuth(int userId){
        if (userData.get(userId) == null) {// здесь криво
            System.out.println("showPhoto: Вы не автризованы");
            return false;
        }

        return true;
    }

    // метод для тестового тестирования
    public int sumAB(int a, int b){
        return a+b;
    }


}
