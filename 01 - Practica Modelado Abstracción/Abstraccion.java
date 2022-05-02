package Abstraccion;

public class Abstraccion {
    // Caracteristicas Escenciales
    public String nombreAtaque, basicoEvolucion;
    public int puntosDeSalud, costeAtaque, danoAtaque, resistencia, debilidad, costeDeRetirada;

    public String getNombreAtaque(){  return nombreAtaque;  }
    public String getBasicoEvolucion(){  return basicoEvolucion;  }
    public int getPuntosDeSalud(){  return puntosDeSalud;  }
    public int getCosteAtaque(){  return costeAtaque;  }
    public int getDanoAtaque() {  return danoAtaque;  }
    public int getResistencia(){  return resistencia;  }
    public int getDebilidad(){  return  debilidad;  }
    public int getCosteDeRetirada(){  return costeDeRetirada;  }

    // Nombre del Ataque
    public boolean setNombreAtaque(String nombreAtaque){
        if (!nombreAtaque.isEmpty()){
            this.nombreAtaque = nombreAtaque;
            return true;
        } else
            return false;
    }

    // Si el pokemon es básico o una evolución
    public boolean setBasicoEvolucion( String basicoEvolucion ){
        if( !basicoEvolucion.isEmpty() ){
            this.basicoEvolucion = basicoEvolucion;
            return true;
        } else
            return false;
    }

    // Puntos de Salud
    public boolean setPuntosDeSalud( int puntosDeSalud ){
        if( puntosDeSalud >= 0 ){
            this.puntosDeSalud = puntosDeSalud;
            return true;
        } else
            return false;
    }

    // Coste del Ataque
    public boolean setCosteAtaque( int costeAtaque ){
        if( costeAtaque >= 0 ){
            this.costeAtaque = costeAtaque;
            return true;
        } else
            return false;
    }

    // Daño del Ataque
    public boolean setDanoAtaque( int danoAtaque ){
        if( danoAtaque >= 0 ){
            this.danoAtaque = danoAtaque;
            return true;
            } else
                return false;
    }

    // Debilidad
    public boolean setDebilidad( int debilidad ){
        if( debilidad >= 0 ){
            this.debilidad = debilidad;
            return true;
        } else
            return false;
    }

    // Resistencia
    public boolean setResistencia( int resistencia ){
        if(resistencia >= 0){
            this.resistencia = resistencia;
            return true;
        } else
            return false;
    }

    // Coste Retirada
    public boolean setCosteRetirada( int costeDeRetirada ){
        if(costeDeRetirada >= 0){
            this.costeDeRetirada = costeDeRetirada;
            return true;
        } else
            return false;
    }


} // Fin
