/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.batalhaepica;

/**
 *
 * @author luiz.mazanha
 */
public class Bloqueio extends Escudo {
    
    private int reducao;

    public Bloqueio(int reducao) {
        this.reducao = reducao;
    }

    @Override
    public int danoReduzido(int dano) {
        if( dano < this.reducao ){
            return 0;
        } else {
            return dano - this.reducao;
        }
    }
    
    
}
