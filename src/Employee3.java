import java.util.List;

public class Employee3 {

    private  int id;
    private String ename;
    private List<String> skills;

    public Employee3(int id, String ename, List<String> skills) {
        this.id = id;
        this.ename = ename;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
