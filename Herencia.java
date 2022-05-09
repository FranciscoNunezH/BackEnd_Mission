package Herencia;

public class Herencia {

    protected String nombre;
    protected int id;

    // Getters
    public String getNombre(){  return nombre;  }
    public int getId(){  return id;  }

    // Setters
    public boolean setNombre( String nombre ){
        if( !nombre.isEmpty() ){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setId( int id ){
        if( id > 0 ){
            this.id = id;
            return true;
        } else
            return false;
    }



}