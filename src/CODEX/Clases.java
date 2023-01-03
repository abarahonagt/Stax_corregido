
package CODEX;

/**
 *
 * @author Abner
 */
public class Clases {
    
    //atributos de la clase Clases -limite inferior y limite superior
    private float limInf;
    private float limSup;
    //fin de definicio de atributos
    
    public Clases(){ 
        limInf = 0f;
        limSup = 0f;
    }
    
    //constructor, recibe  2 parametros (diferentes a los atributos)
    public Clases(float limInf, float limSup) {
        this.limInf = limInf;
        this.limSup = limSup;
    }
    
    //setters y getters

    public float getLimInf() {
        return limInf;
    }

    public void setLimInf(float limInf) {
        this.limInf = limInf;
    }

    public float getLimSup() {
        return limSup;
    }

    public void setLimSup(float limSup) {
        this.limSup = limSup;
    }
    
    //fin de los getters and setters
    
    //calculo de la marca de clase o media de clase
    
    public float getMarca(){
        return (getLimSup()+getLimInf())/2; 
    // (superior + inferior)/2, retorna el resultado
    
    //fin
    }
    
    
}
