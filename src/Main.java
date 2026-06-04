public class Main {

    public static void main(String[] args) {

 
        Application Salesforce = new Application("001", "Salesforce", "SAML", false);
        SaaSApplication WorkDay = new SaaSApplication("901", "WorkDay", "Oauth2.0", true, "GCP");
        SaaSApplication AWS_CONSOLE = new SaaSApplication("902", "AWS_Console", "oauth2.0", false, "Azure");
        SaaSApplication app123 = new SaaSApplication("900", "app123", "SAML2.0", true, "AWS");

        User Darshan = new User("001", "Darshan", "Maddur", "Umesh", "dars@mailinator.com", "Active");
        User Darsh = new User("001", "Darsh", "Maddur", "Umesh", "dars@mailinator.com", "Active");

        
        System.out.println("Salesforce App Current Status = " + Salesforce.checkifActive());
        System.out.println("Activating the app....\n");
        Salesforce.activateApp();
        System.out.println("Salesforce App Current Status = " + Salesforce.checkifActive());
        System.out.println("De Activating the app....\n");
        Salesforce.deactivateApp();
        System.out.println("Salesforce App Current Status = " + Salesforce.checkifActive());
        app123.activateApp();



        Darshan.assignedApplication(Salesforce);
        Darsh.assignedApplication(WorkDay);
        Darsh.assignedApplication(AWS_CONSOLE);
        Darshan.displayUser();
        Darsh.displayUser();
        System.out.println(Salesforce.getAppId());


    }
}