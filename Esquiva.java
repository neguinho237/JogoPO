/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.batalhaepica;

import java.util.Random;

/**
 *
 * @author luiz.mazanha
 */
public class Esquiva extends Escudo {
    
    int chance;
    
    Esquiva( int chance ){
        this.chance = chance;
    }

    @Override
    public int danoReduzido(int dano) {
        Random rd = new Random();
        int sorteio = rd.nextInt(101);
        
        if( sorteio < this.chance ){
            //--Esquiva bem sucedida
            return 0;
        } else {
            return dano;
        }
    }
    
    
    
    
}
