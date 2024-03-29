ackage com.java2novice.files;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
 
public class MyObjectFileStore {
 
    public void storeObject(Employee emp){
         
        OutputStream ops = null;
        ObjectOutputStream objOps = null;
        try {
            ops = new FileOutputStream("MyEmpFile.txt");
            objOps = new ObjectOutputStream(ops);
            objOps.writeObject(emp);
            objOps.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(objOps != null) objOps.close();
            } catch (Exception ex){
                 
            }
        }
         
    }
     
    public void displayObjects(){
         
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        try {
            fileIs = new FileInputStream("MyEmpFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Employee emp = (Employee) objIs.readObject();
            System.out.println(emp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(objIs != null) objIs.close();
            } catch (Exception ex){
                 
            }
        }
         
    }
     
    public static void main(String a[]){
        MyObjectFileStore mof = new MyObjectFileStore();
        Employee e1 = new Employee("Tony",1,"1000");
        mof.storeObject(e1);
        mof.displayObjects();
    }
}
 
class Employee implements Serializable{
     
    private String name;
    private int id;
    private String salary;
     
    public Employee(String name, int id, String salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
     
    public String toString(){
        return name +"=="+id+"=="+salary;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
  // salary works
    public String getSalary() {
        return salary;
    }

    //fixed salary
    public void setSalary(String salary) {
        this.salary = salary;
    }
}
