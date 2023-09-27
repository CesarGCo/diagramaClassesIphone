package Testando;

import Celular.Iphone;

public class Teste {

    public static void main(String[] args){

        Iphone iphone = new Iphone();

        System.out.println("Tocador de musica:");
        iphone.toca();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.print("\n");

        System.out.println("Aparelho Telefonico:");
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioDeVoz();
        System.out.print("\n");

        System.out.println("Navegador de internet:");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        System.out.print("\n");
    }
}
