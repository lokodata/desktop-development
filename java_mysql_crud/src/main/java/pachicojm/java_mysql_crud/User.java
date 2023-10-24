package pachicojm.java_mysql_crud;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lokod
 */
public class User {
    private int id;
    private String firstname;
    private String lastname;
    private int age;
    
    public User(int ID, String FirstName, String LastName, int Age)
    {
        this.id = ID;
        this.firstname = FirstName;
        this.lastname = LastName;
        this.age = Age;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstname;
    }
    
    public String getLastName()
    {
        return lastname;
    }
    
    public int getAge()
    {
        return age;
    }
}