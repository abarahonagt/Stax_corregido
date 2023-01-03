
package CODEX;

/**
 *
 * @author Abner
 */
public class Frecuencias {
    
    //definicion de los atributos de la clase frecuencias:
    
    private float[] valor;  //este nene es equivalente a "n" declarado como vector o array para los gringos
    
    public Frecuencias(){
        valor = new float [10];
    }
    
    public Frecuencias(float[] valores){
        valor = valores;
    }
    
    public void setValor(float[] valor){
        this.valor = valor;
    }
    
    public float[] getValor(){
        return valor;
    }
    
    /**
     * Retorna el maximo valor de la serie
     */
    
    public float getMax(){
        float max = valor[0];
            for(int i=0; i<valor.length; i++){
                if(max < valor[i]){
                    max = valor[i];
                }
            }
            return max;
    }
     
    /**
     * Retorna el valor minimo de la serie
     */
    
    public float getMin(){
        float min = valor[0];
            for(int i=0; i<valor.length; i++){
                if(min > valor[i]){
                    min = valor[i];
                }
            }
            return min;
    }
     
    /**
     * Retorna el Rango
     */
    
    public float getRango(){
        return getMax()-getMin();
    }
    
    /**
     * Retorna el numero de intervalos
     */
    
    public int getK(){
        return Math.round(Math.round((1+3.3*Math.log10(valor.length))+0.5));
        
        //la funcion round redondea los valores al entero mas cercano.
    }
     
    /*
    Retorna la amplitud de la clase
    */
    
    public int getA(){
        return Math.round(getRango()/getK());
    }
    
    /*
    Regresa el limite real inferior
    */
     
    public float getLimiteInferior(){
        return (getMin()-0.5f);
    }
    
    /*
    Regresa el limite real superior
    */
    
    public float getLimiteSuperior(){
        return getMax()+0.5f; 
    }
    
    /*
    Aqui viene lo chido, con esta vaina se definiran las clases de cada intervalo
    oh si, oh si
    */
    
    public Clases[] getClases(){
        //Clases[] hace referencia a la clase java
        Clases[] limites = new  Clases[getK()];     //le paso como parametro el numero de intervalos
            
            //aqui se define el limite inferior y luego, el limite superior es 
            //definido como el menor + la amplitud del intervalo.
            limites[0] = new Clases(getMin(), getMin()+getA());
            
                for(int i=1; i<limites.length; i++){
                    Clases anterior = limites[i-1];
                    limites[i] = new Clases(anterior.getLimSup(), anterior.getLimSup()+getA());
                    
                }
                
                return limites;
    }           
    
    /*
    Aqui hacemos la magia de calcular la frecuencia absoluta
    */
    
    public int[] getFrecAbs(){
        int[] frec = new int[getK()];
        Clases clase[] = getClases();
        
            for(int i =0; i<frec.length-1; i++){
                frec[i] = contar(clase[i].getLimInf(), clase[i].getLimSup());
            }
            
            int ultimo = frec.length-1;
            frec[frec.length-1] = contar(clase[ultimo].getLimInf(), clase[ultimo].getLimSup()+0.5f);
            return frec;
    }

    /*
    Retorna las frecuencias absolutas acumuladas
    */
    
    public int[] getFrecAbsAc(){
        int[] ac = new int[getK()];
        int[] abs = getFrecAbs();
        
        ac[0] = abs[0];
        
         for(int i = 1; i<ac.length; i++){
             ac[i] = ac[i-1] + abs[i];
         }
         return ac;
    }
    
    /*
    Retorna las frecuencias relativas de la serie
    */
    
    public float[] getFrecRel(){
        float[] rel = new float[getK()];
        int[] abs = getFrecAbs();
        
            for(int i=0; i<rel.length; i++){
                rel[i] = Float.parseFloat(abs[i]+"")/Float.parseFloat(valor.length+"");
            }
            return rel;
    }
    
    /*
    Retorna las frecuencias relativas acumuladas
    @return
    */
    
    public float [] getFrecRelAc(){
        float[] ac = new float[getK()];
        float[] rel = getFrecRel();
        ac[0] = rel[0];
        
            for(int i=1; i<ac.length; i++){
                ac[i] = ac[i-1] + rel[i];
            }
            return ac;
    }
  
    
    /*
    Cuenta los numeros dentro del rango de datos
    @param limInf
    @param limSup
    @return
    */
    
    private int contar(float limInf, float limSup){
        int count = 0;
            for(int i=0; i<valor.length; i++){
                if(valor[i] >= limInf && valor[i] < limSup){
                    count++;
                }
            }
            return count;
    }
    
    //analizar si se puede calcular la moda, la mediana y la media. revisar las formulas
}
