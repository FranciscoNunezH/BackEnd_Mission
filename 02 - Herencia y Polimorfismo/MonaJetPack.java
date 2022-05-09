package Herencia;

public class MonaJetPack extends Herencia{
    public static void main(String args[]){
        Mona("JetPackocat", 116);
    }


    public static void Mona(String nombre, int id){

        Herencia jetPack = new Herencia();
        jetPack.setNombre(nombre);
        jetPack.setId(id);

        String msg = "\n#" + jetPack.getId();
        msg +=  ": " + jetPack.getNombre();

        System.out.println(msg);
    }

    public void volar(){
        // Do SomeThing
    }


}