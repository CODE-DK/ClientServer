package SpringTest;

public class Client {

    public Client(String id, String fullName) {
        this.ID = id;
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String ID;
    private String fullName;


}
