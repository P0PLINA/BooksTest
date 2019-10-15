package AnySite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstT {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Code\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ozon.ru");

        WebElement Catalog = driver.findElement(By.cssSelector("button[class='ef8c70']"));
        Catalog.click();
        Thread.sleep(1000);

        WebElement Books = driver.findElement(By.xpath("//span[contains(text(),'Книги')]"));
        Actions action = new Actions(driver);
        action.moveToElement(Books).perform();

//        Thread.sleep(1000);
//        ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + "," + 1200 + ");");
//        Thread.sleep(1000);

//        WebElement SpecLetura = driver.findElement(By.cssSelector("a[href='/category/nehudozhestvennaya-literatura-16511/']"));
//        SpecLetura.click();
//        Thread.sleep(1000);
//        ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + "," + 2000 + ");");
//        Thread.sleep(1000);

        WebElement ITStudy = driver.findElement(By.xpath("//span[contains(text(),'Компьютерные технологии')]"));
        ITStudy.click();
        Thread.sleep(1000);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + "," + 1200 + ");");
        Thread.sleep(2000);

        WebElement LearningJava = driver.findElement(By.cssSelector("a[href='/context/detail/id/7821666/']"));
        LearningJava.click();
        Thread.sleep(2000);

        WebElement PutBasket = driver.findElement(By.cssSelector("button[class='_652bc6']"));
        PutBasket.click();
        Thread.sleep(2000);
        WebElement CheckBasket = driver.findElement(By.cssSelector("a[href='/cart']"));
        CheckBasket.click();
        Thread.sleep(1000);




//       WebElement ITStudy = driver.findElement(By.cssSelector("a[class='a2772b d2b758']"));
//        Actions action2 = new Actions(driver);
//        action2.moveToElement(ITStudy, 100, 0).build().perform();
//        Thread.sleep(1000);


//        WebElement Books = driver.findElement(By.cssSelector("a[class='a2772b _9b4c0a _7addb4']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(Books).build().perform();
//        Books.click();

//        Actions action = new Actions(driver);
//        WebElement Books = driver.findElement(By.cssSelector("a[class='a2772b _9b4c0a _7addb4']"));
//        action.moveToElement(Books);
//        action.perform();
//        Thread.sleep(1000);
//        Books.click();





//        Thread.sleep(1000);
//        WebElement Books = driver.findElement(By.cssSelector("a[href='category/knigi-16500'"));
//        Thread.sleep(1000);
//        Books.click();

//        if (driver.findElement(By.cssSelector("a[class='a2772b _9b4c0a _7addb4']")).isDisplayed())
//        {
//            Thread.sleep(5000);
//            driver.findElement(By.cssSelector("a[class='a2772b d2b758']")).click();
//        }
//            Thread.sleep(5000);



//        ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + "," + 500 + ");");
//
//
//
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());

//        driver.findElement(By.id("header-search-input"));
//        driver.findElement(By.className("header-search-input"));
//        driver.quit();

//        WebElement SearchLine = driver.findElement(By.xpath("//input[@data-test-id='header-search-input' and @type='text']"));
//        Thread.sleep(3000);
//        SearchLine.sendKeys("изучаем java");
//        WebElement SearchButton = driver.findElement(By.cssSelector("button[type='submit']"));
//        SearchButton.click();
//        Thread.sleep(3000);
//        ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + 0 + "," + 250 + ");");
//        Thread.sleep(3000);
//        WebDriver TestDriver = new ChromeDriver();
//        TestDriver.get("https://www.ozon.ru/context/detail/id/7821666/");
//        WebElement Basket = TestDriver.findElement(By.cssSelector("button[class='_652bc6']"));
//        Basket.click();
//        element.submit();
    }
}
