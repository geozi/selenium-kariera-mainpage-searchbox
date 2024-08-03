# selenium-kariera-mainpage-searchbox
![Demo App](https://img.shields.io/badge/demo_app-blue)

### About the project
The project showcases the use of Selenium with Java and JUnit 5 for testing a search box at a job search website.

### Website[^1]
The website where the element is located is the https://www.kariera.gr/en, a site dedicated to job matching in Greece.

![karieta_screenshot](https://github.com/user-attachments/assets/7b23399f-a639-4c02-b649-fa9f82024a8c)

### Web element under test

The web element tested was the search box found on the landing page of the website.

<div align="center">
	<img src="https://github.com/user-attachments/assets/ee5fce86-146d-47ef-8d5a-eb256fad197d">
</div>

### OOP

To make full use of Java as a pure Object-Oriented language and, by extension, optimize code organization, a small class hierarchy was developed. Each subclass simulates a concrete user action.

<div align="center">
	<img src="https://github.com/user-attachments/assets/4e7e00c4-c54b-42e3-8234-e38519ec3efa">
</div>

### Class and element-centered testing

There are two main test classes: the **ActionSimulatorTest** and the **MainPageSearchBoxTest**. The purpose of the **ActionSimulatorTest** class is to test the functionalities that are inherited by the subclasses, whereas the **MainPageSearchBoxTest** class uses the different subclasses to test the functionality of the search box. In particular, the **MainPageSearchBoxTest** class breaks down the simulated action into a series of steps, with each step corresponding to a test method that is executed in the same class instance. 

<div align="center">

| Test case step  | Test method |
| ------------- | ------------- |
| #1 Open the website  | openWebsite()  |
| #2 Close the pop-up dialog  | closeCookieDialog()  |
| #3 Hover over the search box | hoverOverSearchBox() |
| #4 Click the search box | clickSearchBox() |
| #5 Type inside the search box | typeSearchTerm() |
| #6 Click the search button | clickSearchButton() |
| #7 Return to main page | goBackToMainPage() |
| #8 Quit the browser | quitBrowser() |

</div>

### Prerequisites
* Java 17 or higher,
* Intellij IDEA (or any other Java IDE),
* Maven,
* Selenium.

### Dependencies

```
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.23.0</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-firefox-driver -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-firefox-driver</artifactId>
      <version>4.23.0</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-chrome-driver</artifactId>
      <version>4.23.0</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine -->
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.10.3</version>
      <scope>test</scope>
    </dependency>
    
    <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-api</artifactId>
      <version>5.10.3</version>
      <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.junit.platform/junit-platform-suite-api -->
    <dependency>
      <groupId>org.junit.platform</groupId>
      <artifactId>junit-platform-suite-api</artifactId>
      <version>1.10.3</version>
      <scope>test</scope>
    </dependency>

```

### Further documentation

For more information, please check the provided javadoc.

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,idea,maven,selenium&theme=light"/>
	 
  </a>
</p>

[^1]: Disclaimer: This website was tested in order to showcase the use of Selenium with Java and JUnit 5, and does not constitute an endorsement or promotion.
