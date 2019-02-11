/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Łada
 */
public class Internal {

  static   ArrayList<Character> oc = new ArrayList<>();
   static  ArrayList<StoryArc> arc = new ArrayList<>();
   static  ArrayList<ComicBook> cb= new ArrayList<>();
     //sets variable for the data
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MainWindow mw=new MainWindow();
        mw.setVisible(true);//opens up MainWindow
        ReadFile("Characters.csv");
        System.out.println(oc);
       
        ReadFi("StoryArcs.csv");
        System.out.println(arc);
        
        System.out.println(arc.get(0).getCharacters().size());
        
        ReadFil("ComicBooks.csv");
        System.out.println(cb);
    }
public static void WriteFileChara(String file_name) throws FileNotFoundException, IOException{
      File file = new File(file_name);
      // creates the file
      if (!file.exists()) file.createNewFile();//// creates a FileWriter Object if the file does not exists
          
        FileWriter writer = new FileWriter(file,false);
            
        // Writes the content to the file
        for (int i = 0; i < oc.size(); i++) {
        writer.write(oc.get(i).getID()+";"+oc.get(i).getName()+";"+oc.get(i).getAge()+";"+oc.get(i).getGender()+";"+oc.get(i).getAppearance()+";"+oc.get(i).getDetails()+";"+oc.get(i).getBackstory()+"\n");//Writes the data in .csv Characters
        }
      
      writer.flush();
      writer.close();  
    }
    
public static void WriteFileCom(String file_name) throws FileNotFoundException, IOException{
      File file = new File(file_name);
      // creates the file
      if (!file.exists()) file.createNewFile();//// creates a FileWriter Object if the file does not exists
          
        FileWriter writer = new FileWriter(file,false);
            
        // Writes the content to the file
        for (int i = 0; i < cb.size(); i++) {
        writer.write(cb.get(i).getTitle()+";"+cb.get(i).getNumberOfBooks()+";"+cb.get(i).getGenre()+";"+cb.get(i).getDateOfBeginning()+";"+cb.get(i).getStatus()+"\n");//writes the data in the .csv ComicBooks
        }
      
      writer.flush();
      writer.close();  
    }

public static void WriteFileArc(String file_name) throws FileNotFoundException, IOException{
      File file = new File(file_name);
      // creates the file
      if (!file.exists()) file.createNewFile();//// creates a FileWriter Object if the file does not exists
          
        FileWriter writer = new FileWriter(file,false);
            
        // Writes the content to the file
        for (int i = 0; i < arc.size(); i++) {
        writer.write(arc.get(i).getID()+";"+arc.get(i).getArcTitle()+";"+arc.get(i).getSetting()+";"+arc.get(i).getLength()+";"+arc.get(i).getKeyEvents()+";"+arc.get(i).getSummary()+"\n");//writes data in .csv Story Arcs
        }
      
      writer.flush();
      writer.close();  
    }

    public static void ReadFile(String file) throws FileNotFoundException, IOException{
            
            //tworzymy obiekt scanner i wskazujemy na plik
        
        FileReader fr = new FileReader(file); 
        BufferedReader bfr = new BufferedReader(fr);
        String linia="";
        String splitBy = ";";
       
        while((linia = bfr.readLine()) != null){
            
            String[] ch = linia.split(splitBy);
            Character x= new Character(Integer.parseInt(ch[0]),ch[1],(ch[2]),ch[3],ch[4],ch[5],ch[6]);
            oc.add(x);//reads information from .csv file and writes it in the oc array
            
        }}
    
        
     public static void ReadFil(String file) throws FileNotFoundException, IOException{
            
            //tworzymy obiekt scanner i wskazujemy na plik
        
        FileReader fr = new FileReader(file); 
        BufferedReader bfr = new BufferedReader(fr);
        String linia="";
        String splitBy = ";";
        
        int temp=0;
        while((linia = bfr.readLine()) != null){
            
            String[] com = linia.split(splitBy);
            ArrayList<StoryArc> arg = new ArrayList<StoryArc>();
            arg.clear();
             for (int i = 5; i < com.length; i++) {
                 
                 for (int j = 0; j < arc.size(); j++) {
                     if (arc.get(j).getID()==Integer.parseInt(com[i])){
                         temp=j;}
                 }
                 
                 arg.add(arc.get(temp));
                
            }
            
       
            ComicBook x= new ComicBook(com[0],com[1],com[2],com[3],com[4],arg);
            cb.add(x);//reads information from .csv file and adds it to the cb array
            
        }}

    public static void ReadFi(String file) throws FileNotFoundException, IOException{
            
            //tworzymy obiekt scanner i wskazujemy na plik
        
        FileReader fr = new FileReader(file); 
        BufferedReader bfr = new BufferedReader(fr);
        String linia="";
        String splitBy = ";";
        
        int temp=0;
        while((linia = bfr.readLine()) != null){
            
             String[] arko = linia.split(splitBy);
          ArrayList<Character> oj = new ArrayList<Character>();
            oj.clear();
            
             for (int i = 6; i < arko.length; i++) {
               
                 for (int j = 0; j < oc.size(); j++) {
                     if (oc.get(j).getID()==Integer.parseInt(arko[i])){
                         temp=j;}
                 }
                 
                 oj.add(oc.get(temp));
                
                
            }
           
            StoryArc x= new StoryArc(Integer.parseInt(arko[0]),arko[1],arko[2],arko[3],arko[4],arko[5],oj);
            arc.add(x);//reads information from .csv file and writes it in the arc array
            
       
    }}
}

