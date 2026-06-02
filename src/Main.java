public class Main {

    public static void main(String[] args) {

 
        Application Salesforce = new Application("001", "Salesforce", "SAML", false);
        Application WorkDay = new Application("002", "WorkDay", "Oauth2.0", false);
        Application AWS_CONSOLE = new Application("003", "AWS_CONSOLE", "OIDC", false);
        
        System.out.println("Salesforce App Current Status = " + Salesforce.checkifActive());
        System.out.println("Activating the app....\n");
        Salesforce.activateApp();
        System.out.println("Salesforce App Current Status = " + Salesforce.checkifActive());
        System.out.println("De Activating the app....\n");
        Salesforce.deactivateApp();
        System.out.println("Salesforce App Current Status = " + Salesforce.checkifActive());
        User Darshan = new User("001", "Darshan", "Maddur", "Umesh", "dars@mailinator.com", "Active");
        User Darsh = new User("001", "Darsh", "Maddur", "Umesh", "dars@mailinator.com", "Active");
        Darshan.assignedApplication(Salesforce);
        Darshan.assignedApplication(WorkDay);
        Darshan.assignedApplication(Salesforce);
        Darshan.assignedApplication(AWS_CONSOLE);
        Darshan.assignedApplication(Salesforce);
        Darshan.displayUser();
        Darsh.displayUser();

    }
}