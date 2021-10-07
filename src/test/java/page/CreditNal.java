package page;

import org.openqa.selenium.*;

public class CreditNal extends BasePage {

    public CreditNal(WebDriver driver) {super(driver);}

    public CreditNal fillName() {
        fillInput(By.xpath("//input[@name='fullName']"), "Тестов Клиент Анкетович");
        return this;
    }

    public CreditNal fillPhone() {
        fillInput(By.xpath(("//input[@name='phone']")), "9816994934");
        return this;
    }

    public CreditNal fillEmail() {
        fillInput(By.xpath(("//input[@name='email']")), "test@test.ru");
        return this;
    }

    public CreditNal chooseSex() throws InterruptedException {
        Thread.sleep(1000);
        click(By.xpath("//button/p[text()='Мужской']"));
        return this;
    }

//
//    public void clickButton(String name) throws InterruptedException {
//        WebElement button = driver.findElement(By.xpath(("//button[text()='" + name + "']")));
//        button.click();
//    }
}
