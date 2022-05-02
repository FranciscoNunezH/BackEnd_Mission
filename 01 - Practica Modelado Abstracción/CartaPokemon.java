package Abstraccion;

public class CartaPokemon {
    public static void main(String[] args){
        pokemon("Charizard", "Fuego", "Fase 2", "Ascuas Regias", 2, 100, 170, 2, 0, 3);
        pokemon("Rayquaza", "Normal", "Basico", "Estallido Vigoroso", 3, 120, 130, 2, -30, 2);
        pokemon("Totodile", "Agua", "Basico", "Golpe de LLuvia", 1, 20, 70, 2, 0, 1);
        pokemon("Bulbasaur", "Planta", "Basico", "Encontrar Amigo", 1, 0, 60, 2, 0, 1);
        pokemon("Pikachu", "Electrico", "Basico", "Impacto Estatico", 1, 10, 60, 2, -20, 1);
    }

    public static void pokemon(String nombre, String tipo, String evo, String atk, int atkCosto, int atkDamage,
                               int salud, int debilidad, int resistencia, int retirada){
        // Creamos un objeto.
        Abstraccion datosPokemon = new Abstraccion();
        datosPokemon.setBasicoEvolucion(evo);
        datosPokemon.setPuntosDeSalud(salud);
        datosPokemon.setNombreAtaque(atk);
        datosPokemon.setCosteAtaque(atkCosto);
        datosPokemon.setDanoAtaque(atkDamage);
        datosPokemon.setDebilidad(debilidad);
        datosPokemon.setResistencia(resistencia);
        datosPokemon.setCosteRetirada(retirada);

        String msg = "\nNombre: " + nombre;
        msg +=  "\nEtapa Evolutiva: " + datosPokemon.getBasicoEvolucion();
        msg += "\nTipo: " + tipo;
        msg += "\nPS: " + datosPokemon.getPuntosDeSalud();
        msg += "\nAtaque: " + datosPokemon.getNombreAtaque();
        msg += "\n- Costo: " + datosPokemon.getCosteAtaque();
        msg += "\n- Damage: " + datosPokemon.getDanoAtaque();
        msg += "\nDebilidad: " + datosPokemon.getDebilidad();
        msg += "\nResistencia: " + datosPokemon.getResistencia();
        msg += "\nRetirada: " + datosPokemon.getCosteDeRetirada();

        System.out.println(msg);
    }

}
