package org.practice.common.driverUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebElementFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebElementFacade.class);

    private WebDriver driver;
    private WebElement webElement;
    public WebElementFacade(WebDriver driver, String xpath){
        this.driver = driver;
        try {
            this.webElement = this.driver.findElement(By.xpath(xpath));
            LOGGER.info("WebElement Initialized:: "+this.webElement);
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }
    }

    public void leftClick(){
        try {
            this.webElement.click();
            LOGGER.info("WebElement "+this.webElement+" clicked");
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }
    }
    public void enterMessage(String message){
        try {
            this.webElement.sendKeys(message);
            LOGGER.info("WebElement "+this.webElement+" send message "+message);
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }
    }
}
