/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasnolineales;

/**
 *
 * @author DianaAlessa
 */
public class Leaf {
    private int data;
    Leaf left;
    Leaf right;
    
    public Leaf(){
        left=right=null;
        data=0;
    }
    public Leaf(int d){
        left=right=null;
        data=d;
    }
    public void print(){
        System.out.println(" " + data + " ");
    }
    public int getData(){
        return data;
    }
    public void setData(int d){
        data=d;
    }
}
