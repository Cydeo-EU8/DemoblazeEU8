package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    public WebElement getProductElement(String product){
        return Driver.getDriver().findElement(By.xpath("//td[.='"+product+"']"));
    }

}
