/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.accesorios;

/**
 *
 * @author Administrador
 */
public class Computadora {
  private String marca;
  private int modelo;

    public Computadora() {
    }

    public Computadora(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }

    
    
    public void procesar(){
     System.out.println("procesamiento de datos");
    }
     
     
}

