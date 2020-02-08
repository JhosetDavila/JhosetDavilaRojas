/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author l03m08
 */
public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo Model;
    
    public Controlador(Vista view,Modelo model){
        this.view=view;
        this.Model=model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("MVC Multiplicr");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        Model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        Model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
        Model.multiplicar();
        view.txtResultado.setText(String.valueOf(Model.getResultado()));
    }
    
}
