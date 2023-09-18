package elements;

import action.BaseAction;
import org.openqa.selenium.By;

public class NewAccountPage {
    public static By field_firstName = By.xpath("//*[@id=\"signup:fname\"]");
    public static By field_lastName = By.xpath(" //*[@id=\"signup:lname\"]");
    public static By field_birthday = By.xpath("//*[@id=\"BirthDate\"]");
    public static By field_emailAddress = By.xpath("//*[@id=\"signup:email\"]");
    public static By field_mailingAddress = By.xpath("//*[@id=\"signup:street\"]");
    public static By field_city = By.xpath("//*[@id=\"signup:city\"]");
    public static By field_state = By.xpath("//*[@id=\"signup:state\"]");
    public static By field_postalCode = By.xpath("//*[@id=\"signup:zip\"]");
    public static By field_password = By.xpath("//*[@id=\"signup:password\"]");


}
