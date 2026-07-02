package projects.music.main;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        var num = -1;
        while (num != 0) {
            var stringMenu = """
                    *** Screen Sound Music ***
                    1- Cadastrar artistas
                    2- Cadastrar musicas
                    3- Listar musicas
                    4- Buscar musicas por artistas
                    
                    5- Sair""";

            System.out.println(stringMenu);
            num = scanner.nextInt();
            scanner.nextLine();

            switch (num){
                case 1:
                    addArtist();
                    break;
                case 2:
                    addMusic();
                    break;
                case 3:
                    listMusics();
                    break;
                case 4:
                    searchMusicByArtist();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void addArtist(){
    }
}
