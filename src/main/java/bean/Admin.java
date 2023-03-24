package bean;

public class Admin extends Employee{
    private String branchName;

    public Admin() {
    }

    public Admin(int id, String name, String email, double salary, String branchName) {
        super(id, name, email, salary);
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
