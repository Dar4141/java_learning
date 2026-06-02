import java.util.HashSet;
import java.util.Set;


class User {

    String userName;
    String id;
    String firstName;
    String email;
    String lastName;
    String status;
    Set<Application> assignedApplications = new HashSet<>();

    public User(String id , String userName , String firstName ,String lastName , String email , String status){

        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;

    }

    public void assignedApplication(Application app) {
        assignedApplications.add(app);
    }

    public void displayUser() {
        System.out.println(
            "User:" + userName + 
            "| Status:" + status
        );

        if(!assignedApplications.isEmpty()){

            for (Application app :assignedApplications){
            System.out.println(
                "App: " + app.appName +
                "| Protocol: " +app.protocol + "\n"
            );
            
            }

        }else{
                System.out.println(
                "NO Application assigned to "+ userName + "\n"
            );
        }

    }

}