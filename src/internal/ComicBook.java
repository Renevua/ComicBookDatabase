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
public class ComicBook{
    private String Title;
    private String NumberOfBooks;
    private String Genre;
    private String DateOfBeginning;
    private String Status;
    private ArrayList<StoryArc> Story;

    public ComicBook(String Title, String NumberOfBooks, String Genre, String DateOfBeginning, String Status, ArrayList<StoryArc> Story) {
     
        this.Title = Title;
        this.NumberOfBooks = NumberOfBooks;
        this.Genre = Genre;
        this.DateOfBeginning = DateOfBeginning;
        this.Status = Status;
        this.Story = Story;
    }

  




    public String getTitle() {
        return Title;
    }

    public String getNumberOfBooks() {
        return NumberOfBooks;
    }

    public String getGenre() {
        return Genre;
    }

    public String getDateOfBeginning() {
        return DateOfBeginning;
    }

    public String getStatus() {
        return Status;
    }

    public ArrayList<StoryArc> getStory() {
        return Story;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setNumberOfBooks(String NumberOfBooks) {
        this.NumberOfBooks = NumberOfBooks;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public void setDateOfBeginning(String DateOfBeginning) {
        this.DateOfBeginning = DateOfBeginning;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setStory(ArrayList<StoryArc> Story) {
        this.Story = Story;
    }

    @Override
    public String toString() {
        return "ComicBook{" + "Title=" + Title + ", NumberOfBooks=" + NumberOfBooks + ", Genre=" + Genre + ", DateOfBeginning=" + DateOfBeginning + ", Status=" + Status + ", Story=" + Story + '}';
    }

  
    

  
    
    
    
}
