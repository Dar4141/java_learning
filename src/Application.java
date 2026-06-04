public class Application{
    private String appId;
    private String appName;
    private String protocol;
    private boolean isActive;

    public Application(String appId, String appName, String protocol, boolean isActive) {
        this.appId = appId;
        this.appName = appName;
        this.protocol = protocol;
        this.isActive = isActive;
    }

    public String getAppId() {return appId;}

    public void setAppId(String appId){
        this.appId= appId;
    }

    public String getAppName() {return appName;}

    public void setAppName(String appName){
        this.appName= appName;
    }

    public String getProtocol() {return protocol;}

    public void setProtocol(String protocol){
        this.protocol= protocol;
    }

    public boolean getIsActive() {return isActive;}

    public void setIsactive(boolean isActive){
        this.isActive= isActive;
    }

    public void activateApp() {
        isActive = true;
        System.out.println("App: " + appName + " is Active\n");
    }

    public void deactivateApp() {
        isActive = false;
        System.out.println("App: " + appName + " is NOT Active\n");
    }

    public boolean checkifActive(){
        return isActive;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if((obj == null) || getClass() != obj.getClass()) return false;
        Application app =(Application) obj;
        return appName.equals(app.appName);
    }

    @Override
    public int hashCode(){
        return appName.hashCode();
    }

}