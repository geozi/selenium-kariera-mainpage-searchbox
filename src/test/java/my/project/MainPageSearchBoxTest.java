package my.project;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.fail;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainPageSearchBoxTest {

    private static ChromeDriver chromeDriver;
    private static Actions actions;
    private static Clicker clicker;
    private static Typer typer;
    private static Hoverer hoverer;
    private static WebDriverWait wait;
    private static WebElement element;

    @BeforeAll
    static void initializeFields() {

        System.out.println("\nRunning " + MainPageSearchBoxTest.class.getSimpleName() + "...");

        // Arrange
        chromeDriver = new ChromeDriver();
        actions = new Actions(chromeDriver);
        clicker = new Clicker(chromeDriver);
        typer = new Typer(chromeDriver);
        hoverer = new Hoverer(chromeDriver);
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
    }

    @BeforeEach
    void setUpWaiting() {

        actions.pause(Duration.ofSeconds(3)).perform();
    }

    @Test
    @Order(1)
    @DisplayName("Opening the website test")
    void openWebsite() {

        // Act
        try {

            System.out.println("Opening the website...");
            chromeDriver.get("https://www.kariera.gr/en");
            System.out.println("Maximizing browser window...");
            chromeDriver.manage().window().maximize();

        } catch (Exception e) {
            fail(e.getMessage());
        }


    }

    @Test
    @Order(2)
    @DisplayName("Closing cookie dialog test")
    void closeCookieDialog() {

        // Act
        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CybotCookiebotDialog")));
            element = chromeDriver.findElement(By.id("CybotCookiebotBannerCloseButtonE2E"));
            System.out.println("Closing cookie dialog...");
            clicker.click(element);

        } catch (NoSuchElementException | ElementNotInteractableException e) {
            fail(e.getMessage());
        }
    }

    @Test
    @Order(3)
    @DisplayName("Hovering over the search box test")
    void hoverOverSearchBox() {

        // Act
        try {

            element = wait
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid=\"homepage-search-input\"]")));
            System.out.println("Hovering over the search box...");
            hoverer.hover(element, actions);

        } catch (NoSuchElementException | ElementNotInteractableException e) {
            fail(e.getMessage());
        }
    }

    @Test
    @Order(4)
    @DisplayName("Clicking the search box test")
    void clickSearchBox() {

        // Act
        try {

            System.out.println("Clicking the search box...");
            element.click();

        } catch (ElementNotInteractableException e) {
            fail(e.getMessage());
        }
    }

    @Test
    @Order(5)
    @DisplayName("Typing the search term test")
    void typeSearchTerm() {

        // Act
        try {

            System.out.println("Typing the search term...");
            typer.type(element, "software");

        } catch (NoSuchElementException | ElementNotInteractableException e) {
            fail(e.getMessage());
        }
    }

    @Test
    @Order(6)
    @DisplayName("Clicking the search button test")
    void clickSearchButton() {

        // Act
        try {

            element = wait
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid=\"homepage-search-btn\"]")));
            System.out.println("Clicking the search button...");
            element.click();

        } catch (ElementNotInteractableException e) {
            fail(e.getMessage());
        }

    }

    @Test
    @Order(7)
    @DisplayName("Navigating back to main page test")
    void goBackToMainPage() {

        // Act
        try {

            System.out.println("Navigating back to main page...");
            chromeDriver.navigate().back();

        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    @Test
    @Order(8)
    @DisplayName("Quitting the browser test")
    void quitBrowser() {

        // Act
        try {

            System.out.println("Quitting the browser test...");
            chromeDriver.quit();

        } catch (Exception e) {
            fail(e.getMessage());
        }


    }
}
