/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.prototype;

import java.util.ArrayList;

/**
 *
 * @author Jakir
 */
public class Class {
    
    private String cName; // saves class name
    private String sClass = null; // saves name of class it inherits from
    ArrayList<String> fields = new ArrayList<String>();
    ArrayList<Method> methods = new ArrayList<Method>();
    
    public Class(String name){
        /* 
        - When a new class is created, ask for class name
        - maybe pass through Arraylist of methods, but not sure if needed in constructor
        
        */
        cName = name;
    }
    
    //checks if class inherits
    public boolean isSubClass(){
        if (sClass.equals(null)){
            return false;
        }
        return true;
    }
    
      //code to add method object to arrraylist
    public void addMethod(Method m){
        methods.add(m);
    }
    
    // method to remove a method from arraylist
    public void removeMethod(String name){
        for (Method temp: methods){
            if ((temp.getName()).equals(name)){
                methods.remove(temp);
            }
        }
    }
    
    // add fields for the class into arraylist
    public void addField(String f){
        fields.add(f);
    }
    
    // code to turn Arraylist of fields into a certain format
    public String fieldToCode(){
        String s = "";
        
        for (String temp : fields){
            s+= temp + ";\n";
        }
        return s;
    }
    
        //code to turn arraylist of methods into formatted strings
        public String methodToCode(){
        String s = "";
        
        for (Method temp : methods){
            s+= "\n" + temp.toCode() + "\n";
        }
        return s;
    }
    
    //converts whole class into structured code
    public String toCode(){
        String s= "public class " + cName + " {\n\n" + fieldToCode() + "\n";
        s+= "public " + cName + "(){\n\n} \n";
        s+= methodToCode();
        s+= "\n }";
        
        return s;
    }
    
    public String toString(){
        String s = "Class Name:" + cName ;
        if(isSubClass()){
            s+= " Inherits from: " + sClass;
        }
        return s;
    }
    
}
