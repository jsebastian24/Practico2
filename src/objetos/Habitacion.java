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
public class Habitacion implements Itransacciones{
    private int idHabitacion;
    private String ServicioTelefonia;
    private String ServicioBar;

    @Override
    public void pagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reservar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
