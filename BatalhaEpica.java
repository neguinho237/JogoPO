/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.batalhaepica;

import java.util.Scanner;

/**
 *
 * @author luiz.mazanha
 */
public class BatalhaEpica {

    public static void main(String[] args) {
        
        //--Exercicio:
        //1) Criar pelo menos 3 novos inimiogos:
        //----a) Um deles deve apaenas mudar atributos: deve ter pouca vida, porém um ataque muito forte
        //----b) Um dos inimigos possui um ataque variável (sobrescrever metodo fazAtaque)\
        //----c) Outro inimigo possui uma chance de defesa (sobrescrever metodo tomaDano()
        
        //--Utilize sua criatividade pra criar novos inimigos com diferentes características.
        
        
       
        
        
        Criatura jogador = new Jogador( "Carlos", new Esquiva(20), 
                                                  new Arma[]{   new Faca(), 
                                                                new Pistola(), 
                                                                new Espada(),
                                                                new Metralhadora()
                                                             }       
        );
        
        
        Criatura inimigo = new Demonion( new Bloqueio(20) );
        
        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();
        
        jogador.mostraVida();
        inimigo.mostraVida();
        
        Scanner s = new Scanner(System.in);
        
        int turno = 1;
        while(true){
            
            System.out.println("#################");
            System.out.println("Turno " + turno);
            System.out.println("#################");
            
            System.out.println("Vez do jogador: ");
            System.out.println("Aperte enter");
            //s.nextLine();
            
            
            jogador.fazAtaque(inimigo);
            if( !inimigo.estaVivo() ){
                inimigo.fraseMorte();
                break;
            }
            
            System.out.println("");
            System.out.println("Vez do inimigo: ");
            System.out.println("Aperte enter");
            //s.nextLine();
            
            inimigo.fazAtaque(jogador);
            if( !jogador.estaVivo() ){
                jogador.fraseMorte();
                break;
            }
            
            System.out.println("Fim do turno");
            System.out.println("");
            
            jogador.mostraVida();
            inimigo.mostraVida();
            System.out.println("");
            
            turno++;
        }
        //--Exercicio: Fazer a batalha
        
        
    }
}
