/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pachicojm.java_mysql_login_register;

/**
 *
 * @author lokod
 */
public class Users {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private int phone;
    private String username;
    private String password;
    private String usertype;
    
    public Users(int ID, String FirstName, String LastName, String Email, int Phone, String UserName, String Password, String Usertype)
    {
        this.id = ID;
        this.firstname = FirstName;
        this.lastname = LastName;
        this.email = Email;
        this.phone = Phone;
        this.username = UserName;
        this.password = Password;
        this.usertype = Usertype;
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
    
    public String getEmail()
    {
        return email;
    }
    
    public int getPhone()
    {
        return phone;
    }
    
    public String getUserName()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getUsertype()
    {
        return usertype;
    }
}

