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
public class BinaryTree {
    private Leaf root;
    private int leaves;
    
    public BinaryTree(){
        root=null;
        leaves=0;
    }
    public BinaryTree(int d){
        Leaf leaf = new Leaf(d);
        root=leaf;
        leaves=1;
    }
    //Dependiendo de la aplicacion del arbol, este aceptará iguales o no
    public void insert(int d, Leaf root){
    if(!isEmpty()){ //Si no esta vacio
        if(d<root.getData()){ //Si es mayor o menor el dato
            if(root.left==null){ //Si no esta ocupado
                root.left = new Leaf(d);
                leaves++;
            } else { //Si esta ocupado lo hago recursivo y apunto al otro dato
                insert(d,root.left);
            }
        } else { //Mayores o iguales a la derecha, menores izquierda
            if(root.right==null){ //Si esta vacio en derecha
                root.right = new Leaf(d);
                leaves++;
            }else{
                insert(d,root.right); //Si esta ocupado se hace recursivo y se apunta al otro dato
            }
        }
    } else{
        root=new Leaf(d);
        leaves=1;
    }
    }
    
    public void showLeaf(Leaf root) {
    root.print();
    }
    
    public int Height(Leaf root) { //Va eliminando los menores hasta leer solo la altura del mayor 
    int a, b;
    if (root.left==null && root.right==null) { //Si esta vacia izquierda y derecha
        return 1; //Regresa uno porque solo hay una raíz
    } else {
        a=Height(root.left); //izquierda
        b=Height(root.right); //derecha
        if(a>b) return a+1; //cual de los dos tiene más hijos
        else return b+1;
    }
    }

    private boolean isEmpty() {
        return root==null;
    }
}
