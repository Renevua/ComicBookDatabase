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
public class StoryArc {
    private int ID;
  private String ArcTitle;
  private String Setting;
  private String Length;
  private String KeyEvents;
  private String Summary;
  private ArrayList<Character> Characters;
  
    public StoryArc(int ID,String ArcTitle, String Setting, String Length, String KeyEvents, String Summary,ArrayList<Character> Ch) {
        this.ID=ID;
        this.ArcTitle = ArcTitle;
        this.Setting = Setting;
        this.Length = Length;
        this.Characters=Ch;
        this.KeyEvents = KeyEvents;
        this.Summary = Summary;
    }

   
public int getID(){
    return ID;
}
public void setID(int ID){
    this.ID=ID;
}
    public String getArcTitle() {
        return ArcTitle;
    }

    public String getSetting() {
        return Setting;
    }

    public String getLength() {
        return Length;
    }

    public ArrayList<Character> getCharacters() {
        return Characters;
    }

    public String getKeyEvents() {
        return KeyEvents;
    }

    public String getSummary() {
        return Summary;
    }

    public void setArcTitle(String ArcTitle) {
        this.ArcTitle = ArcTitle;
    }

    public void setSetting(String Setting) {
        this.Setting = Setting;
    }

    public void setLength(String Length) {
        this.Length = Length;
    }

    public void setCharacters(ArrayList<Character> Characters) {
        this.Characters = Characters;
    }

    public void setKeyEvents(String KeyEvents) {
        this.KeyEvents = KeyEvents;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    @Override
    public String toString() {
        return "StoryArc{" +"ID" +ID+"ArcTitle=" + ArcTitle + ", Setting=" + Setting + ", Length=" + Length + ", Characters=" + Characters + ", KeyEvents=" + KeyEvents + ", Summary=" + Summary + '}';
    }
  
    
}
