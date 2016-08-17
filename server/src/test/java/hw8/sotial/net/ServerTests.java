package hw8.sotial.net;

/**
 * Created by ABurykin on 17.08.2016.
 */

import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

import hw8.sotial.net.server.ServerImpl;

public class ServerTests {

    @Mock
    ServerImpl x = new ServerImpl();

     @Test
    public void test_sumAB() throws IllegalAccessException, InstantiationException {
         //подготавливаем тестируемый класс
        ServerImpl server = new ServerImpl();
        //выполняем
        int sum = server.sumAB(1,2);
        //сравниваем
         assertEquals("test_sumAB сравниваем значение sum с числом 3", sum, 3);
    }

    // тестирую с заглушкой
    @Test
    public void testWthMock(){
        int sum = x.sumAB(1,2);
        //сравниваем
        assertEquals("testWthMock сравниваем значение sum с числом", sum, 3);
    }

    @Test
    public void showPhotoTest_1(){
       String namePhoto =  x.showPhoto(3,"Фотография 2");
        assertEquals("showPhotoTest_1 должна быть получена  Фотография 2", namePhoto, "showPhoto: Фотография 2");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void showPhotoTest_2(){
        String namePhoto =  x.showPhoto(1234,"Фотография 2");
    }

}
