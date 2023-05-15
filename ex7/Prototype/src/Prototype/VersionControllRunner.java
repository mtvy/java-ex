package Prototype;

public class VersionControllRunner {
    public static void main(String[] args){
        Project master = new Project(1, "SuperProject", "source code");
        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();

        System.out.println(masterClone);

    }
}
