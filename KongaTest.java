// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class KongaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void wrongEmail() {
    driver.get("https://www.konga.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    {
      WebElement element = driver.findElement(By.cssSelector(".\\_6a5c8_1aVpq .f5e10_VzEXF"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.linkText("Electronics"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Login / Signup")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("olalyeeayomide@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("lolaldedea");
    driver.findElement(By.cssSelector(".\\_988cf_1aDdJ")).click();
    driver.findElement(By.cssSelector(".\\_40731_3dnAw")).click();
    driver.findElement(By.linkText("Login / Signup")).click();
    driver.findElement(By.cssSelector(".\\_9a1ab_k0UMi:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".\\_0a76d_2_hrl:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".\\_0a76d_2_hrl:nth-child(3) > label")).click();
    driver.findElement(By.cssSelector(".\\_9a1ab_k0UMi:nth-child(3)")).click();
    assertThat(driver.findElement(By.cssSelector(".\\_9a1ab_k0UMi:nth-child(3)")).getText(), is("The username or password you have entered is incorrect. Please try again."));
    driver.close();
  }
  @Test
  public void incorrectpassword() {
    driver.get("https://www.konga.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.linkText("Login / Signup")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("olalyeeayomide@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("ola");
    driver.findElement(By.cssSelector(".\\_988cf_1aDdJ")).click();
    driver.findElement(By.cssSelector(".\\_71d30_2oCCX")).click();
    assertThat(driver.findElement(By.cssSelector(".\\_9a1ab_k0UMi:nth-child(4)")).getText(), is("The password must be at least 6 characters"));
    driver.close();
  }
  @Test
  public void invalidsigningup() {
    driver.get("https://www.konga.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    {
      WebElement element = driver.findElement(By.linkText("Login / Signup"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Login / Signup")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".close-prompt-message-button > img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".close-prompt-message-button > img")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.linkText("Don’t have an account? Sign Up")).click();
    driver.findElement(By.id("firstname")).click();
    driver.findElement(By.id("firstname")).sendKeys("Ololade");
    driver.findElement(By.id("lastname")).click();
    driver.findElement(By.id("lastname")).sendKeys("OLALEYE");
    driver.findElement(By.id("lastname")).sendKeys("Olaleye");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("olaleyeeayomide@gmail.com");
    driver.findElement(By.id("phone")).click();
    driver.findElement(By.id("phone")).sendKeys("08036903742");
    driver.findElement(By.id("phone")).sendKeys("36903742");
    driver.findElement(By.cssSelector(".\\_460b6_SNRLa > #password")).click();
    driver.findElement(By.cssSelector(".\\_460b6_SNRLa > #password")).sendKeys("olaleye");
    driver.findElement(By.cssSelector(".\\_2f3a3_3JCsL")).click();
    driver.findElement(By.cssSelector(".\\_41d61_2xTI6")).click();
    assertThat(driver.findElement(By.cssSelector(".\\_460b6_SNRLa:nth-child(5) > .c1ba4_2Fcv7")).getText(), is("Your phone number must be 11 digits e.g 08023456789"));
    driver.close();
  }
}
