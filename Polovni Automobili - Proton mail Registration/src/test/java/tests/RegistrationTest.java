package tests;

import com.relevantcodes.extentreports.LogStatus;
import methods.PropertyFile;
import org.testng.annotations.Test;
import pageObjects.*;

public class RegistrationTest extends PropertyFile {
    @Test
    public void registerToPolovniAutomobili() throws InterruptedException {
        test = report.startTest("Check if user is able to register into PolovniAutomobili");

        HomePagePolovniAutomobili homePagePolovniAutomobili = new HomePagePolovniAutomobili();
        LogInPolovniAutomobili logInPolovniAutomobili = new LogInPolovniAutomobili();
        RegistrationPage registrationPage = new RegistrationPage();
        RegistrationSuccess registrationSuccess = new RegistrationSuccess();
        HomePageProtonmail homePageProtonmail  = new HomePageProtonmail();
        LogInProtonMail logInProtonMail = new LogInProtonMail();
        InboxPage inboxPage = new InboxPage();
        ProfilePage profilePage = new ProfilePage();

        homePagePolovniAutomobili.clickNewAd();
        test.log(LogStatus.INFO, "[Postavi oglas] is clicked");

        logInPolovniAutomobili.clickRegister();
        test.log(LogStatus.INFO, "[Registruj se] is clicked");

        registrationPage.enterEmail();
        test.log(LogStatus.INFO, "[Email] is entered");

        registrationPage.enterPassFirst();
        test.log(LogStatus.INFO, "[First password] is entered");

        registrationPage.enterPassSec();
        test.log(LogStatus.INFO, "[Second password] is entered");

        registrationPage.checkAccept();
        test.log(LogStatus.INFO, "[Assept] is checked");

        registrationPage.checkAgreeSale();
        test.log(LogStatus.INFO, "[Agree sale] is checked");

        registrationPage.checkAgreeBuy();
        test.log(LogStatus.INFO, "[Agree buy] is checked");

        registrationPage.clickVerEmail();
        test.log(LogStatus.INFO, "[Potvrdi nalog putem email-a] and [Registruj se] are clicked");

        registrationSuccess.verifyThankYou();
        test.log(LogStatus.INFO, "[Hvala na registraciji] is verified");

        registrationSuccess.changeUrl();
        test.log(LogStatus.INFO, "[https://protonmail.com/] is new URL");

        homePageProtonmail.clickLogIn();
        test.log(LogStatus.INFO, "[Log in] is clicked");

        logInProtonMail.enterUserName();
        test.log(LogStatus.INFO, "[magica995] is entered");

        logInProtonMail.enterPass();
        test.log(LogStatus.INFO, "[Petra2016] is entered");

        logInProtonMail.clikLogIn();
        test.log(LogStatus.INFO, "[Log in] is clicked");

        inboxPage.verifyPolovniAutomobili();
        test.log(LogStatus.INFO, "Email from [PolovniAutomobili] is verified");

        inboxPage.enterEmail();
        test.log(LogStatus.INFO, "Email from [PolovniAutomobili] is clicked");

        inboxPage.clickAcceptRegstration();
        test.log(LogStatus.INFO, "[Prihvati registraciju] is clicked");

        profilePage.enterProfileInfo();
        test.log(LogStatus.INFO, "[User informations] are entered");

        profilePage.clickSave();
        test.log(LogStatus.INFO, "[Sacuvaj] is clicked");

        profilePage.verifySave();
        test.log(LogStatus.INFO, "[Uspešno si izmenio tvoje podatke] is verified");

        profilePage.clickLogOut();
        test.log(LogStatus.INFO, "[Izloguj se] is clicked");

        homePagePolovniAutomobili.clickLogIn();
        test.log(LogStatus.INFO, "[Uloguj se] is clicked");

        logInPolovniAutomobili.enterLogIn();
        test.log(LogStatus.INFO, "[Email] and [Password] are entered");

        logInPolovniAutomobili.verifyLogIn();
        test.log(LogStatus.INFO, "[Email] is verified");

        inboxPage.moveToTrash();
        test.log(LogStatus.INFO, "Email from [PolovniAutomobili] is moved to trash");

        inboxPage.verifyEmptyInbox();
        test.log(LogStatus.INFO, "[Inbox] is emptied");

        inboxPage.emptyTrash();
        test.log(LogStatus.PASS, "Email from [PolovniAutomobili] is deleted");
}
    }