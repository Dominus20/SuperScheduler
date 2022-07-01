package manager;

import models.User;
import org.testng.annotations.DataProvider;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataProvider {

    @DataProvider
    public Iterator<Object[]> loginData(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{User.builder().email("wick@gmail.com").passwod("Ww12345$").build()});
        list.add(new Object[]{User.builder().email("noa@gmail.com").passwod("Nnoa12345$").build()});

        return list.iterator();
    }
}
