package insurance;

import action.BaseAction;
import static elements.NewAccountPage.*;
public class FillSignupForm extends BaseAction {
    public static void signup(){
        setText(field_firstName, "nf");
        setText(field_lastName, "go");
        setText(field_emailAddress, "asd@gml.com");
        click(field_gender);
        setText(field_mobileNumber, "081908765431");
    }
    public static void fname(){
        setText(field_firstName, "nf");
    }
    public static void lname(){
        setText(field_lastName, "go");
    }
    public static void emailAddress(){
        setText(field_emailAddress, "asd@gml.com");
    }
    public static void gender(){
        click(field_gender);
    }
    public static void mobileNuber(){
        setText(field_mobileNumber, "081908765431");
    }
}
