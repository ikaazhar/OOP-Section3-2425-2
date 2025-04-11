import java.lang.System;


class Employee{
    private
    int EmpNum;
    String EmpName;

    void setEmpNum(int num){
        EmpNum = num;
    }

    void setEmpName(String name){
        EmpName = name;
    }

    int getEmpNum(){
        return EmpNum;
    }

    String getEmpName(){
        return EmpName;
    }

}

public class lab2{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setEmpNum(227);
        e1.setEmpName("DHESHIEGHAN");
        System.out.println("Employee Number: " +  e1.getEmpNum());
        System.out.println("Employee Name :" + e1.getEmpName());
    }
}