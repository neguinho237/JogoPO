/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.batalhaepica;
import java.util.Scanner;
/**
 *
 * @author luiz.mazanha
 */
public class Jogador extends Criatura {
    
    Arma[] armas;
    
    public Jogador(String nome) {
        super(nome, 1000);
    }
    
    public Jogador( String nome, Escudo escudo, Arma[] armas ){
        super(nome, 1000, escudo);
        this.armas = armas;
    }
    
    @Override
    public void fazAtaque(Criatura atacado) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escolha sua arma: ");
        int i = 0;
        for( Arma arma : armas ){
            i++;
            System.out.println(i + ") " + arma.mensagem());
        }
        int escolha = s.nextInt();
        atacado.tomaDano( armas[escolha-1].getDano() );
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu sou o Herói e estou aqui pra defender o Senac");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Meus amigos vao se vingar....");
    }
    
    
    
}
