package applivraria;

import java.util.Scanner;

public class Applivraria {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Livro listaLivro[] = new Livro[1];
        Livro livro;

        int i;
        String titulo;
        String autor;
        int ISBN;
        String genero;
        float preco;

        for (i = 0; i < listaLivro.length; i++) {
            System.out.println("Titulo: ");
            titulo = leia.next();
            System.out.println("Autor: ");
            autor = leia.next();
            System.out.println("ISBN: ");
            ISBN = leia.nextInt();
            System.out.println("Genero: ");
            genero = leia.next();
            System.out.println("Preco: ");
            preco = leia.nextFloat();

            livro = new Livro(titulo, autor, ISBN, genero, preco);

            listaLivro[i] = livro;
                
        }
        for(Livro genero : listaLivro){
        
        }    
    }
}

}
