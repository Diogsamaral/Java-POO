public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");


        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Jubileu", 22, "M", 0, "juba", 0);
        g[1] = new Gafanhoto("Creuza", 12, "F", 0, "Creuzita", 0);
        
        Visualizacao vis[] = new Visualizacao[5];
        
        vis[0] = new Visualizacao(g[0], v[2]); //Jubileu assiste HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]); //Jubileu assite PHP
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());


        System.out.println("\nVÍDEOS\n-------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n-------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

    }

}
