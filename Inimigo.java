/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.batalhaepica;

/**
 *
 * @author luiz.mazanha
 */
public abstract class Inimigo extends Criatura {
    
    private int ataque = 50;
    
    public Inimigo(String nome) {
        super(nome, 1000);
    }
    
    public Inimigo(String nome, int vida, int ataque ){
        super(nome,vida);
        this.ataque = ataque;
    }
    
    public Inimigo(String nome, int vida, int ataque, Escudo escudo){
        super(nome,vida,escudo);
        this.ataque = ataque;
    }

    @Override
    public void fazAtaque(Criatura atacado) {
        atacado.tomaDano( this.ataque );
    }
    
    @Override
    public void fraseApresentacao() {
        System.out.println("Eu vou te matar!!! Muahahahaha!!!!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Nããããããããããããããããoooooooo!!!!!");
    }
    
}
