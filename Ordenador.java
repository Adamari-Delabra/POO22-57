/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

import ico.fes.accesorios.Computadora;
import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author Administrador
 */
public class Ordenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Computadora ordenadorNuevo=new Computadora();
    ordenadorNuevo.setModelo(2019);
    ordenadorNuevo.setMarca("LG");
    
    Monitor pantallaMarca=new Monitor();
     pantallaMarca.setMarca("LG");
     pantallaMarca.setModelo("2019");
     pantallaMarca.setPulgadas(13);
     
        Mouse mouseNuevo=new Mouse();
        mouseNuevo.setMarca("Razer");
        mouseNuevo.setModelo("Viper Ultimate");
        mouseNuevo.setTipo("Gamer");
        
        Teclado tecladoNuevo=new Teclado();
        tecladoNuevo.setMarca("Logitetch");
        tecladoNuevo.setModelo("MK850");
        tecladoNuevo.setNumeroDeTeclas(105);
        tecladoNuevo.setMultimedia(10);
        
        CPU cpuNuevo=new CPU();
        cpuNuevo.setMarca("Intel");
        cpuNuevo.setModelo("Core(TM) i7-9867U CPU");
        cpuNuevo.setVelocidadProcesador(3);
         
        System.out.println(ordenadorNuevo);
        System.out.println(pantallaMarca);
        System.out.println(mouseNuevo);
        System.out.println(tecladoNuevo);
        System.out.println(cpuNuevo);
    }
     
}
