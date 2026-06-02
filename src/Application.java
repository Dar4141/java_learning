public class Application{
    String appId;
    String appName;
    String protocol;
    boolean isActive;

    public Application(String appId, String appName, String protocol, Boolean isActive) {
        this.appId = appId;
        this.appName = appName;
        this.protocol = protocol;
        this.isActive = isActive;
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

    public String getProtocol(){
        return protocol;
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