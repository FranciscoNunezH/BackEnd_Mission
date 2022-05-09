package Herencia;

public class MonaGobble extends Herencia{

    public static void main(String args[]){
        Mona("Gobble-o-Tron", 117);
    }


    public static void Mona(String nombre, int id){

        Herencia gobble = new Herencia();
        gobble.setNombre(nombre);
        gobble.setId(id);

        String msg = "\n#" + gobble.getId();
        msg +=  ": " + gobble.getNombre();

        System.out.println(msg);
    }

    public void engullir(){
        // Do SomeThing
    }


}