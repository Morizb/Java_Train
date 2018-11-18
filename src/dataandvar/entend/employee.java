package dataandvar.entend;

public class employee {
    private String  name;
    private int sex;
    private int salary;

    public employee(String name, int sex, int salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
 public void setsalary (int salary,int pyDeal) {
     this.salary = salary + pyDeal;
 }
}
