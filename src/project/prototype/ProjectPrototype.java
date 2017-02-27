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
public class ProjectPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Class test = new Class("TestClass");
    
    Method a1 = new Method("TestAccessorString","","String");
    Method m1 = new Method("TestMutator","int i");
    Method a2 = new Method("TestAccessorInt","","int");
    Method a3 = new Method("GetName","","String");
    
    test.addField("String testField");
    test.addField("int testIntField");
    test.addMethod(m1);
    test.addMethod(a1);
    test.addMethod(a2);
    test.addMethod(a3);
    System.out.println(test.toCode());
    
    
    }
    
}
