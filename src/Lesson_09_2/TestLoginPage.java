package Lesson_09_2;

public class TestLoginPage {
    public void ilogin(LoginPage loginPage){
        loginPage.login();
    }

    public static void main(String[] args) {
        LoginPage internalLoginPage= new InternalLoginPage();
        LoginPage externalLoginPage=new ExternalLoginPage();

        TestLoginPage testLoginPage = new TestLoginPage();
        testLoginPage.ilogin(internalLoginPage);
        testLoginPage.ilogin(externalLoginPage);
    }
}
