package EmployeeManage;

public class Employee {
    private int ID;
    private String name;
    
    public int getId(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int ID){
        this.ID = ID;
    }

    public void setName(String name){
        this.name = name;
    }
}