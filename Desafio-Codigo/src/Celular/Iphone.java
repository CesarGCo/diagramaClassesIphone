package Celular;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorNaInternet;
import Funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    public void toca(){
        System.out.println("Tocando musica!");
    }
    public void pausar(){
        System.out.println("Musica pausada!");
    }
    public void selecionarMusica(){
        System.out.println("Selecione a musica!");
    }

    public void ligar(){
        System.out.println("Ligando!");
    }
    public void atender(){
        System.out.println("Atendendo!");
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando Correio De Voz!");
    }

    public void exibirPagina(){
        System.out.println("Exibindo pagina!");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba!");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina!");
    }
}
