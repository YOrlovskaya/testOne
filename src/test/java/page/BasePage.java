package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;
//Проверка
//Проверка
//Проверка
//Проверка
//Проверка
public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //конструктор
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

//    //Wait Wrapper Method
//    public void waitVisibility(By elementBy) {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
//    }

    //Click Method
    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void fillInput(By elementBy, String text) {
        WebElement input = driver.findElement(elementBy);
        input.sendKeys(text, Keys.TAB);
    }

//    public void fillSex() throws InterruptedException {
//
//        WebElement check = driver.findElement(By.xpath(("//input[@type='checkbox'][@name='sopdConfirmed']/../div[1]")));
//        check.click();
//    }

    //Is Element Displayed
    public void isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

}