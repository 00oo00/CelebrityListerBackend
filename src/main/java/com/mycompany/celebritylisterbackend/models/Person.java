package com.mycompany.celebritylisterbackend.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Person implements Serializable{
    
    @Id@GeneratedValue
    private int id;
    private String firstName, lastName;
    private Date birthday;

    public Person() {
    }
 
    public Person(String firstName, String lastName, Date birthday) {
        this.firstName = new String(firstName);
        this.lastName = new String(lastName);
        this.birthday = birthday;
    }
//getters
    public int getId()            { return id;            }
    public String getFirstName()  { return firstName;     }
    public String getLastName()   { return lastName;      }
    public Date getBirthday()     { return birthday;      }    
    
//setters
    public void setId(int id)                   {        this.id = id;                      }
    public void setFirstName(String firstName)  {        this.firstName = firstName;        }
    public void setLastName(String lastName)    {        this.lastName = lastName;          }
    public void setBirthday(Date birthday)      {        this.birthday = birthday;          }

}

