package my.project;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class ActionSimulatorTest {

    @BeforeAll
    static void setUp() throws InterruptedException {
        System.out.println("\nRunning " + ActionSimulatorTest.class.getSimpleName() + "...");
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("Testing driver setter and getter")
    void setAndGetDriver() {

        // Arrange
        ActionSimulator actionSimulator = new ActionSimulator();

        // Act
        actionSimulator.setDriver(new FirefoxDriver());
        WebDriver driver = actionSimulator.getDriver();
        driver.quit();

        // Assert
        assertAll(
                "Failure in testing driver setter and getter",
                () -> assertNotNull(driver),
                () -> assertSame(FirefoxDriver.class, driver.getClass())
        );

    }

}