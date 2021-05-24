import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PortalLogIn {
    @Test
    public void firstTask (){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://my.silknet.com/login");
        $(byName("_username")).setValue("msimonishvili@silknet.com");
        $(byName("_password")).setValue("Paroli18");
        $(byName("_submit")).click();
        $(byText("ელფოსტა ან პაროლი არასწორია")).shouldBe(Condition.visible);
        $(byName("_password")).setValue("Paroli13");
        $(byText("ელფოსტა ან პაროლი არასწორია")).shouldNotBe(Condition.visible);
        $(byName("_submit")).click();
        $(".logo_img").waitUntil(Condition.visible, 3000);


        sleep (5000);





    }

}
