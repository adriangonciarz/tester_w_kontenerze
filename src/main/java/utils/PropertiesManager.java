package utils;

import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.Properties;

public class PropertiesManager {
    private static final String FRAMEWORK_PROPERTIES = "framework.properties";
    private static PropertiesManager propertiesManager;
    private final Properties properties;

    private PropertiesManager() {
        try {
            this.properties = loadProperties();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PropertiesManager getInstance() {
        if (null == propertiesManager) {
            propertiesManager = new PropertiesManager();
        }
        return propertiesManager;
    }

    private Properties loadProperties() throws IOException {
        Properties localProperties = new Properties();
        localProperties.load(PropertiesManager.class.getClassLoader().getResourceAsStream(FRAMEWORK_PROPERTIES));
        return localProperties;
    }

    public String getApiEndpoint() {
        return properties.getProperty("api.endpoint");
    }

    public int getApiPort(){
        return Integer.valueOf(properties.getProperty("api.port"));
    }
}
