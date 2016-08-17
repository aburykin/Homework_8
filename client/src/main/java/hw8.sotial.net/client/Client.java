package hw8.sotial.net.client;

/**
 * Created by ABurykin on 16.08.2016.
 */
public interface Client {

    public String showPhoto(int userId, String photoName);

    public String uploadPhoto(int userId, String photoName);

    public String downloadPhoto(int userId, String photoName);


}


/*




    // получить запрос от сервиса
    public void getRequestFromService();

    // отправить ответ сервису
    public void sendAnswerToService();

    // получить ответ от сервера
    public void getAnswerFromServer();

    // отправить запрос на сервер
    public void sendRequestToServer();

 */