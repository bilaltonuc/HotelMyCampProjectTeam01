package utilities;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    static {

        String path="src/configuration.properties"; //configuration.properties (Resource Bundle isimli file)
        //configuration.properties isimli file da test datalari, URL, valid credentials gibi bilgiler mevcuttur
        //oradan alip kullaniriz ve tekrar olmamis olur

        try {

            FileInputStream fis=new FileInputStream(path);
            properties=new Properties();
            properties.load(fis);
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static String getProperty(String key){

        return properties.getProperty(key); //key bizim browser olabilir mesela
    }


}
