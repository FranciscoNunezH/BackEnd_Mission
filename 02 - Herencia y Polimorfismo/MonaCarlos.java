package Herencia;

public class MonaCarlos {
    public static void main(String args[]){
        Mona("Carlostocat", 114);
    }


    public static void Mona(String nombre, int id){

        Herencia jetPack = new Herencia();
        jetPack.setNombre(nombre);
        jetPack.setId(id);

        String msg = "\n#" + jetPack.getId();
        msg +=  ": " + jetPack.getNombre();

        System.out.println(msg);
    }

    public void balbusear(){
        // Do SomeThing
    }

}
