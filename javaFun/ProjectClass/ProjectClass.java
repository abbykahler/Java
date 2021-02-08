public class ProjectClass {
    String name;
    String description;
    public String elevatorPitch(){
        return name +" : " + description;
        
    }
    public ProjectClass() {
        name = "";
        description ="";
    }
    public ProjectClass(String input) {
        name = input;
        description = "";
    }
    public ProjectClass(String input, String desc) {
        name = input;
        description = desc;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setName(String NewName) {
        this.name = NewName;
    }
    public void setDescription(String NewDescription) {
        this.description = NewDescription;
    }
}