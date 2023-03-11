//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErinPage extends BasePage {
    String expectedText = "Erin Recommends";
    By confirmTextOnErinPage = By.xpath("//h1[@id='page-title-heading']");
    By clickOnJadeJogaJacket = By.xpath("//a[@href='https://magento.softwaretestingboard.com/jade-yoga-jacket.html']");

    public ErinPage(WebDriver driver) {
        super(driver);
    }

    public ErinPage validateUserOnErinPage() {
        String actualText = this.readText(this.confirmTextOnErinPage);
        this.assertTextEquals(this.expectedText, actualText);
        return this;
    }

    public ErinPage clickOnJadeJacket() {
        this.click(this.clickOnJadeJogaJacket);
        return this;
    }
}
