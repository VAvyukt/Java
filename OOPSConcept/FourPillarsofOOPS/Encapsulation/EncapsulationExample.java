/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPSConcept.FourPillarsofOOPS.Encapsulation;

/**
 *
 * @author Nikhil.Agrawal
 */
public class EncapsulationExample
{
private int id;
private String name;
private String phone;
private String password;

public void setID(int id)
{
    this.id=id;
}
public void setPassword(String password)
{
    this.password=password;
}
public void setPhone(String phone)
{
    this.phone=phone;
}
public void setName(String name)
{
    this.name=name;
}
public int getID()
{
    return id;
}
public String getPassword()
{
    return password;
}
public String getPhone()
{
    return phone;
}
public String getName()
{
    return name;
}

}
