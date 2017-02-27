/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.prototype;

import java.io.Serializable;

/**
 *
 * @author Jakir
 */

public enum Types implements Serializable
{
    STRING("String"), INT("int"), BOOLEAN("boolean"), DOUBLE("double"), FLOAT("float");
    
    private String type;
    
    private Types(String ty)
    {
        type = ty;
    }
   
    public String toString()
    {
        return type;
    }
     
}

    