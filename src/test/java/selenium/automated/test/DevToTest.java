package selenium.automated.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class DevToTest {

    WebDriver driver;//inicjalizacja drivera

    @Before
    public void SetUp() { // metoda set up odnosi się do pre- requirements - warunków początkowych
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaja0\\OneDrive\\Pulpit\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver(); //nadpisanie drivera jako przeględarkę
    }

    @Test
    public void FirstTest(){
        String url = "https://dev.to/"; //zapisujemy w zmiennej url, wartość linky=u
        driver.get("https://dev.to/"); //otworzenie linku w przegladarce

        // na ten moment, mamy otwartą stronę dev.to - żeby sprawdzić, czy faktycznie na niej jesteśmy
        //chcemy porównać url ze zmiennej wcześniejszej od obecnego url z przeglądarki

        String currentUrl = driver.getCurrentUrl(); //wyciągamy obecny url z przeglądarki i [rzypisujemy go do zmiennej currenturl

        //assertTrue - sprawdza poprawność warunku ulr.equals(currentUrl) - czy url ze zmiennej url jest taki sam  jak w zmiennej currentUrl
        //jeżeli nie - wypisuje message "The current url isn't dev.to"

        assertTrue("The current url isn't dev.to", url.equals(currentUrl));
    }

}
