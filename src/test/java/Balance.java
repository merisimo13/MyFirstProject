import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Balance {
    @Test
    public void secondtask(){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://my.silknet.com/login");
        $(byName("_username")).setValue("msimonishvili@silknet.com");
        $(byName("_password")).setValue("Paroli13");
        $(byName("_submit")).click();


        sleep (5000);

    }
}
