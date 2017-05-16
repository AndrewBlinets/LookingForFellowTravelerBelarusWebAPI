package by.andreiblinets.constant;

public class UserConstant {

    public static final String INFORMATION_ABOU_USER = "/getinformation/{token}";
    public static final String REGISTRATION = "/registration";
    public static final String AUTIFICANTION = "/autification/{login}&{hashpassword}";
    public static final String CHECKING_LOGIN = "/checkingemail/{email}";
    public static final String CHECKING_PHONE = "/checkingphone/{phone}";

    public UserConstant() {
    }

    public static final String NAME_TABLE = "User";

    public static final String NAME = "name";
    public static final String SURNAME = "surname";
    public static final String PHONE = "phone";
    public static final String EMAIL = "email";
    public static final String HASH_PASSWORD = "hashPassword";
    public static final String RATING = "rating";
    public static final String DATA_REGISTRATION = "dataRegistration";
    public static final String ABOUT_USER = "aboutUser";
    public static final String FOTO = "foto";
    public static final String USER_ROLE = "roleUser";

    // controller

    public static final String USERS = "/users";
}
