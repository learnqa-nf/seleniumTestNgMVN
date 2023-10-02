package elements;

import org.openqa.selenium.By;

public class NewAccountPage{
    public static final By field_firstName = By.xpath("//input[@id='firstName']");
    public static By field_lastName = By.xpath("//input[@id='lastName']");
    public static By field_emailAddress = By.xpath("//*[@id='userEmail']");
    public static By field_gender = By.xpath("//label[normalize-space()='Male']");
    public static By field_mobileNumber = By.xpath("//input[@id='userNumber']");


}
