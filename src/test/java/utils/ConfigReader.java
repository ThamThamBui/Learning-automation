package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();
    //static block: chay only 1 lần khi gọi class lần đầu
    static {
        //lấy file trong resource -> getResourceAsStream()
        try (InputStream inputStream = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")){
            properties.load(inputStream);
        }catch (Exception e){
            throw new RuntimeException("Không thể đọc config.properties",e);
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
