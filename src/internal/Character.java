/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal;

import java.util.ArrayList;

/**
 *
 * @author Łada
 */
public class Character {
    private int ID;
    private String Name;
    private String Age;
    private String Gender;
    private String Appearance;
    private String Details;
    private String Backstory;
    

    public Character(int ID, String Name, String Age, String Gender, String Appearance, String Details, String Backstory) {
this.ID= ID;      
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.Appearance = Appearance;
        this.Details = Details;
        this.Backstory = Backstory;
        
    }
    
    
public int getID(){
    return ID;
}
public void setID(int ID){
    this.ID=ID;
}
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAppearance() {
        return Appearance;
    }

    public void setAppearance(String Appearance) {
        this.Appearance = Appearance;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

    public String getBackstory() {
        return Backstory;
    }

    public void setBackstory(String Backstory) {
        this.Backstory = Backstory;
    }

    @Override
    public String toString() {
        return "Character{" +"ID"+ID+ "Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + ", Appearance=" + Appearance + ", Details=" + Details + ", Backstory=" + Backstory + '}';
    }

}
