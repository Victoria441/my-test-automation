package utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
    private static final String PROPERTY_PATH = "src/test/resources/configuration.properties";
    private static final Properties properties;
    static {
        properties = new Properties();
        try(BufferedReader reader = new BufferedReader(new FileReader(PROPERTY_PATH))) {
            properties.load(reader);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static String readProperty(String key) {
        return properties.getProperty(key);
    }
}











