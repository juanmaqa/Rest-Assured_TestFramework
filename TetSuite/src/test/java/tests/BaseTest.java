package tests;

import com.CucumberSuite.TetSuite.utils.ConfigRead;
import io.restassured.RestAssured;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import request.RequestFactory;
import com.CucumberSuite.TetSuite.utils.ConfigRead;

import java.util.Properties;


public class BaseTest {
    String configFilename;
    Properties configProperties;
    RequestFactory requestFactory;

    String currentWorkingDirectory;

    @BeforeAll
    public void preSetup() throws Exception {
        currentWorkingDirectory = System.getProperty("user.dir");

        configFilename = currentWorkingDirectory + "/src/test/resources/config/config.properties";

        configProperties = ConfigRead.readConfigProperties(configFilename);
    }

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = configProperties.getProperty("baseUrl");
        RestAssured.port = Integer.parseInt(configProperties.getProperty("baseUrl"));

        requestFactory = new RequestFactory();
    }

    @AfterClass
    public void cleanUp() {
        RestAssured.reset();
    }
}
