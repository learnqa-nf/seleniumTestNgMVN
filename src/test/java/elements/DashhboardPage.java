package elements;

import action.BaseAction;
import org.openqa.selenium.By;

public class DashhboardPage {

    public static By field_email = By.xpath("//*[@id=\"login-form:email\"]");
    public static By field_pwwd = By.xpath("//*[@id=\"login-form:password\"]");
    public static By btn_login = By.xpath("//*[@id=\"login-form:login\"]");
    public static By btn_signup = By.xpath("//*[@id=\"login-form:signup\"]");
}
