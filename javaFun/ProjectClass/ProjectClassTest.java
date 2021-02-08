public class ProjectClassTest {
    public static void main(String[] args){
        ProjectClass project1 = new ProjectClass();
        ProjectClass project2 = new ProjectClass("Coding");
        ProjectClass project3 = new ProjectClass("Code", "Dojo");
        System.out.println(project3.elevatorPitch());
        System.out.println(project2.name);
        project2.setName("NewCoding");
        System.out.println(project2.getName());
        System.out.println(project1.getDescription());
        project1.setDescription("stuff");
        System.out.println(project1.getDescription());
    }
}
