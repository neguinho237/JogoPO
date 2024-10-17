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
public abstract class Arma {
    private String nome;
    private int dano;
    private int risco;

    public Arma(String nome, int dano, int risco) {
        this.nome = nome;
        this.dano = dano;
        this.risco = risco;
    }
    
    public String mensagem(){
        return (this.nome + ": Dano " 
                  + this.dano + " - Risco " + 
                          this.risco + "%");
    }
    
    public int getDano(){
        Random rd = new Random();
        int sorteio = rd.nextInt(101);
        
        if (sorteio < this.risco) {
            System.out.println("O ataque falhou!");
            return 0;
        } else {
            return this.dano;
        }
    }
}
