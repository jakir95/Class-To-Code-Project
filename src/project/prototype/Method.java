/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.prototype;

/**
 *
 * @author Jakir
 */
public class Method {
    
    private String name;
    private String parameters = ""; // parameters of method
    private String rType ; // return type is method has one
    
    //constructor foe mutator
    public Method(String s,String p){ 
        name = s;
        parameters = p;

    }
    
    /* constructor for an accessor,parameter input needed or it wont compile, 
    will fix with inheritence later on hopefully*/
     public Method(String s,String p,String r){ 
        name = s;
        rType = r;
    }
     
    //returns name of method 
    public String getName(){
        return name;
    }
    
    //returns parameters of method, currently all parameters are in one string variable 
    public String getParameters(){
        return parameters;
    }
    
    //checks if method is Accessor
    public boolean isAccessor(){
        if(parameters.equals("")){
            return true;
        }
        return false;
    }
    
    //checks return type to make a valid return statement
    public String checkType(){
        if (rType.equals("int")|| rType.equals("double")){
            return "0";
        }
        if (rType.equals("String")){
            return "\"\"";
        }
        if (rType.equals("boolean")){
            return "false";
        }
        return "";
    }
    
    // returns method in skeleton code
    public String toCode(){
        String s = "public ";
        if (isAccessor()){
            
            s+= rType ;
            s+= " " + name +"() { \n\n return " +checkType()+";\n}";
                    
        }
        else {
            s+= "void";
            s+= " " + name +"(" + parameters + ") { \n\n}";
        }
        
        return s;
    }
    
    //general toString method
    public String toString(){
        
        return "Method Name:" + name + "\nMethod Parameters:" + parameters + "\nReturn Type:" + rType;
    }
}
