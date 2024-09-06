package com.juaracoding.Pages;

import com.juaracoding.Drivers.DriverSingleton;
import com.juaracoding.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TasbihButton {

    private WebDriver driver;
    private String strDelay = Constants.GLOB_PARAM_DELAY;

    public TasbihButton() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='led-btn']")
    private WebElement ledBtn;

    @FindBy(xpath = "//button[@id='reset-btn']")
    private WebElement resetBtn;

    @FindBy(xpath = "//button[@id='count-btn']")
    private WebElement countBtn;

    @FindBy(xpath = "//p[@class='counter-tsbh']")
    private WebElement Counter;

    public void ClickledBtn(){
        ledBtn.click();
    }

    public void ClickresetBtn() {
        resetBtn.click();
    }

    public void ClickcountBtn() {
        countBtn.click();
    }

    public void ClicklockunlockBtn() {
        // Use JavaScript to click both buttons simultaneously
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click(); arguments[1].click();", resetBtn, countBtn);
    }

    public void ClicknthngBtn() {
        // Use JavaScript to click both buttons simultaneously
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click(); arguments[1].click();", resetBtn, ledBtn);
    }

    public void ClicknothingBtn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click(); arguments[1].click();", countBtn, ledBtn);
    }

    public String getcounter() {
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(Counter))
                .getText();
    }

}
