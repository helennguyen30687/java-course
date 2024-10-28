package Lesson_09_2;

public class ExternalLoginPage extends LoginPage{

    @Override
    protected String usernameLocator() {
        return "ExternalLoginPage | usernameLocator";
    }

    @Override
    protected String passwordLocator() {
        return "ExternalLoginPage | passwordLocator";
    }

    @Override
    protected String btnLoginLocator() {
        return "ExternalLoginPage | btnLoginLocator";
    }
}
