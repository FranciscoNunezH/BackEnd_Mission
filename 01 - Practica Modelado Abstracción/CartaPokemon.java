package Abstraccion;

public class CartaPokemon {
    public static void main(String[] args){
        shellder();
        pikachu();
        raichu();
        rayquaza();
        squirtle();

    }

    public static void shellder(){
        String nombrePokemon = "Shellder";
        String tipoPokemon = "Agua";
        // Creamos un objeto.
        Abstraccion pokemonShellder = new Abstraccion();
        pokemonShellder.setBasicoEvolucion("Basico");
        pokemonShellder.setPuntosDeSalud(60);
        pokemonShellder.setNombreAtaque("Placaje");
        pokemonShellder.setCosteAtaque(1);
        pokemonShellder.setDanoAtaque(10);
        pokemonShellder.setDebilidad(2);
        pokemonShellder.setResistencia(0);
        pokemonShellder.setCosteRetirada(2);

        String msg = "";
        msg += "\nEtapa Evolutiva: " + pokemonShellder.getBasicoEvolucion();
        msg += "\nNombre: " + nombrePokemon;
        msg += "\nTipo: " + tipoPokemon;
        msg += "\nPS: " + pokemonShellder.getPuntosDeSalud();
        msg += "\nNombre Atk: " + pokemonShellder.getNombreAtaque();
        msg += "\nCoste Atk: " + pokemonShellder.getCosteAtaque();
        msg += "\nDamage Atk: " + pokemonShellder.getDanoAtaque();
        msg += "\nDebilidad: Tipo Planta X" + pokemonShellder.getDebilidad();
        msg += "\nResistencia: " + pokemonShellder.getResistencia();
        msg += "\nRetirada: " + pokemonShellder.getCosteDeRetirada();

        System.out.print(msg);

    }

    public static void pikachu(){
        String nombrePokemon = "Pikachu";
        String tipoPokemon = "Electrico";
        // Creamos un objeto.
        Abstraccion pokemonShellder = new Abstraccion();
        pokemonShellder.setBasicoEvolucion("Basico");
        pokemonShellder.setPuntosDeSalud(60);
        pokemonShellder.setNombreAtaque("Impactrueno");
        pokemonShellder.setCosteAtaque(20);
        pokemonShellder.setDanoAtaque(20);
        pokemonShellder.setDebilidad(2);
        pokemonShellder.setResistencia(-20);
        pokemonShellder.setCosteRetirada(1);

        String msg = "\n";
        msg += "\nEtapa Evolutiva: " + pokemonShellder.getBasicoEvolucion();
        msg += "\nNombre: " + nombrePokemon;
        msg += "\nTipo: " + tipoPokemon;
        msg += "\nPS: " + pokemonShellder.getPuntosDeSalud();
        msg += "\nNombre Atk: " + pokemonShellder.getNombreAtaque();
        msg += "\nCoste Atk: " + pokemonShellder.getCosteAtaque();
        msg += "\nDamage Atk: " + pokemonShellder.getDanoAtaque();
        msg += "\nDebilidad: Tipo Lucha X" + pokemonShellder.getDebilidad();
        msg += "\nResistencia: Tipo Metal " + pokemonShellder.getResistencia();
        msg += "\nRetirada: " + pokemonShellder.getCosteDeRetirada();

        System.out.print(msg);

    }

    public static void raichu(){
        String nombrePokemon = "Raichu";
        String tipoPokemon = "Electrico";
        // Creamos un objeto.
        Abstraccion pokemonShellder = new Abstraccion();
        pokemonShellder.setBasicoEvolucion("Fase 1");
        pokemonShellder.setPuntosDeSalud(130);
        pokemonShellder.setNombreAtaque("Rayo Mach");
        pokemonShellder.setCosteAtaque(30);
        pokemonShellder.setDanoAtaque(120);
        pokemonShellder.setDebilidad(2);
        pokemonShellder.setResistencia(0);
        pokemonShellder.setCosteRetirada(1);

        String msg = "\n";
        msg += "\nEtapa Evolutiva: " + pokemonShellder.getBasicoEvolucion();
        msg += "\nNombre: " + nombrePokemon;
        msg += "\nTipo: " + tipoPokemon;
        msg += "\nPS: " + pokemonShellder.getPuntosDeSalud();
        msg += "\nNombre Atk: " + pokemonShellder.getNombreAtaque();
        msg += "\nCoste Atk: " + pokemonShellder.getCosteAtaque();
        msg += "\nDamage Atk: " + pokemonShellder.getDanoAtaque();
        msg += "\nDebilidad: Tipo Lucha X" + pokemonShellder.getDebilidad();
        msg += "\nResistencia: " + pokemonShellder.getResistencia();
        msg += "\nRetirada: " + pokemonShellder.getCosteDeRetirada();

        System.out.print(msg);

    }

    public static void rayquaza(){
        String nombrePokemon = "Rayquaza Luminoso";
        String tipoPokemon = "Dragon";
        // Creamos un objeto.
        Abstraccion pokemonShellder = new Abstraccion();
        pokemonShellder.setBasicoEvolucion("Basico");
        pokemonShellder.setPuntosDeSalud(120);
        pokemonShellder.setNombreAtaque("Juicio Celeste");
        pokemonShellder.setCosteAtaque(4);
        pokemonShellder.setDanoAtaque(190);
        pokemonShellder.setDebilidad(2);
        pokemonShellder.setResistencia(0);
        pokemonShellder.setCosteRetirada(3);

        String msg = "\n";
        msg += "\nEtapa Evolutiva: " + pokemonShellder.getBasicoEvolucion();
        msg += "\nNombre: " + nombrePokemon;
        msg += "\nTipo: " + tipoPokemon;
        msg += "\nPS: " + pokemonShellder.getPuntosDeSalud();
        msg += "\nNombre Atk: " + pokemonShellder.getNombreAtaque();
        msg += "\nCoste Atk: " + pokemonShellder.getCosteAtaque();
        msg += "\nDamage Atk: " + pokemonShellder.getDanoAtaque();
        msg += "\nDebilidad: Tipo Hada X" + pokemonShellder.getDebilidad();
        msg += "\nResistencia: " + pokemonShellder.getResistencia();
        msg += "\nRetirada: " + pokemonShellder.getCosteDeRetirada();

        System.out.print(msg);

    }

    public static void squirtle(){
        String nombrePokemon = "Squirtle";
        String tipoPokemon = "Agua";
        // Creamos un objeto.
        Abstraccion pokemonShellder = new Abstraccion();
        pokemonShellder.setBasicoEvolucion("Basico");
        pokemonShellder.setPuntosDeSalud(60);
        pokemonShellder.setNombreAtaque("Rayo Burbuja");
        pokemonShellder.setCosteAtaque(10);
        pokemonShellder.setDanoAtaque(10);
        pokemonShellder.setDebilidad(2);
        pokemonShellder.setResistencia(0);
        pokemonShellder.setCosteRetirada(1);

        String msg = "\n";
        msg += "\nEtapa Evolutiva: " + pokemonShellder.getBasicoEvolucion();
        msg += "\nNombre: " + nombrePokemon;
        msg += "\nTipo: " + tipoPokemon;
        msg += "\nPS: " + pokemonShellder.getPuntosDeSalud();
        msg += "\nNombre Atk: " + pokemonShellder.getNombreAtaque();
        msg += "\nCoste Atk: " + pokemonShellder.getCosteAtaque();
        msg += "\nDamage Atk: " + pokemonShellder.getDanoAtaque();
        msg += "\nDebilidad: Tipo Planta X" + pokemonShellder.getDebilidad();
        msg += "\nResistencia: " + pokemonShellder.getResistencia();
        msg += "\nRetirada: " + pokemonShellder.getCosteDeRetirada();

        System.out.print(msg);

    }

}
