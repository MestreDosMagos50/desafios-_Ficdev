/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo.pkg02;

/**
 *
 * @author ficdev
 */
public class MinhaClasse {
    //variaveis de instancia
    private int valor1;
    private int valor2;
    
    //construtor
    public MinhaClasse(int v1, int v2){
        this.valor1 = v1;
        this.valor2 = v2;
    
    }
    //metodos
    public int somar(){
        return this.valor1 + this.valor2;
    }
    
    public int subtrair(){
        return this.valor1 - this.valor2;
    
    }
    
}
