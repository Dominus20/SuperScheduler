package manager;

import models.User;
import org.testng.annotations.DataProvider;

import javax.jws.soap.SOAPBinding;
import java.io.*;
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
    @DataProvider
    public Iterator<Object[]> loginDataCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/data.csv")));
        String line = reader.readLine();

        while (line != null) {
            String[] split = line.split(";");
            list.add(new Object[]{User.builder()
                    .email(split[0])
                    .passwod(split[1])
                    .build()});
            line = reader.readLine();
        }
        return list.iterator();
    }

}
