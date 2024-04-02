import Actracta.Pokemon;

public class Main {
    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle(1,"PIKACHU","ELECTRICO");
        Charmander charmander = new Charmander(2,"CHARMANDER","FUEGO");
        Bulbasaur bulbasaur = new Bulbasaur(3,"CALCIFER","FUEGO");
        Pikachu pikachu = new Pikachu(4,"CHARIZARD","FUEGO");

        System.out.println(squirtle);
        System.out.println(charmander);
        System.out.println(bulbasaur);
        System.out.println(pikachu);
      
    }
}