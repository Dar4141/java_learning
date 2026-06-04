public class SaaSApplication extends Application {

    private String cloudProvider;

    public SaaSApplication (String appId,String appName , String protocol ,boolean isActive, String cloudProvider){
        
        super(appId,appName,protocol,isActive);
        this.cloudProvider=cloudProvider;
    }
    
    public String getCloudProvider(){return cloudProvider;}

    @Override
    public void activateApp() {
        super.activateApp();
        System.out.println("Cloud provider: " +
            cloudProvider
        );
    }
    
    
}
