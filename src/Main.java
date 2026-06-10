public class Main {

    public static void main(String[] args) {

 
        Application salesforce = new Application("001", "Salesforce", "SAML", false);
        SaaSApplication workday = new SaaSApplication("901", "WorkDay", "Oauth2.0", true, "GCP");
        SaaSApplication aws_console = new SaaSApplication("902", "AWS_Console", "oauth2.0", false, "Azure");
        SaaSApplication app123 = new SaaSApplication("900", "app123", "SAML2.0", true, "AWS");

        User darshan = new User("001", "Darshan", "Maddur", "Umesh", "dars@mailinator.com", "Active");
        User darsh = new User("001", "Darsh", "Maddur", "Umesh", "dars@mailinator.com", "Active");

        
        System.out.println("Salesforce App Current Status = " + salesforce.checkifActive());
        System.out.println("Activating the app....\n");
        salesforce.activateApp();
        System.out.println("Salesforce App Current Status = " + salesforce.checkifActive());
        System.out.println("De Activating the app....\n");
        salesforce.deactivateApp();
        System.out.println("Salesforce App Current Status = " + salesforce.checkifActive());
        app123.activateApp();



        darshan.assignedApplication(salesforce);
        darsh.assignedApplication(workday);
        darsh.assignedApplication(aws_console);
        darshan.displayUser();
        darsh.displayUser();
        System.out.println(salesforce.getAppId());
        
        try{
            darshan.assignedApplication(null);
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Provisioning attempt logged for user");
        }

        try{
            darshan.assignedApplication(salesforce);
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Provisioning attempt logged for user");
        }
    }
}