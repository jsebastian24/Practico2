/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import interfases.Itransacciones;

/**
 *
 * @author Seba-PC
 */
public class Cliente implements Itransacciones{
    private int idCliente;
    private String nombre;
    private String dni;
    private String direccion;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void pagar() {
        System.out.println("pago aceptado");
    }

    @Override
    public void reservar() {
        System.out.println("reserva exitosa");
    }
  
    
    
}
