package JUnit;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class JUnit_test {


    @Test
    void dz() {
        Configuration.browserSize= "1920x1080";
        open("https://demoqa.com/automation-practice-form");
        $(".text-center").shouldHave(text("Practice Form"));
        $("#firstName").setValue("Daniil");
        $("#lastName").setValue("Semenov");
        $("#userEmail").setValue("daniisemenov779@gmail.com");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("9038365111");
        $("#dateOfBirthInput").click();
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "A");
        $("#dateOfBirthInput").sendKeys("2");
        $("#dateOfBirthInput").setValue("7 Feb 2005");
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-2]").click();
        $("[for=hobbies-checkbox-3]").click();
        $("#currentAddress").setValue("Some adress");
        $(".css-19bqh2r").scrollTo();
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Delhi")).click();
        $("#uploadPicture").uploadFromClasspath("RobloxScreenShot20240722_232550677.png");
        $("#submit").click();
        $(".modal-body").shouldBe(visible).shouldHave(text("Label Values Student Name Daniil Semenov Student Email daniisemenov779@gmail.com Gender Male Mobile 9038365111 Date of Birth 27 February,2005 Subjects Hobbies Sports, Reading, Music Picture RobloxScreenShot20240722_232550677.png Address Some adress State and City NCR Delhi"));
        sleep(5000);
    }
}
