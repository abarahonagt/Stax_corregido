package CODEX;

import org.jfree.data.general.DatasetChangeListener;
import org.jfree.data.xy.AbstractIntervalXYDataset;
import org.jfree.data.xy.IntervalXYDataset;

//import com.mallkudev.tablafrecuencias.clases.Clase;
//import com.mallkudev.tablafrecuencias.clases.Frecuencia;

public class SimpleIntervalXYDataset extends AbstractIntervalXYDataset implements IntervalXYDataset {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double xStart[];
    private Double xEnd[];
    private Double yValues[];

    // Variables para los datos
    private Frecuencias frecuencia;
    int k;
    public SimpleIntervalXYDataset(Frecuencias frecuencia) {
        this.frecuencia=frecuencia;

        k=frecuencia.getK();
        Clases[] clase=frecuencia.getClases();
        float[] rel=frecuencia.getFrecRel();

        xStart=new Double[k];
        xEnd=new Double[k];
        yValues=new Double[k];

        for(int i=0;i<k;i++){
            xStart[i]=new Double(clase[i].getLimInf());
            xEnd[i]=new Double(clase[i].getLimSup());
            yValues[i]=new Double(rel[i]);
        }
    }

    public int getSeriesCount() {
        return 1;
    }

    public Comparable getSeriesKey(int i) {
        return "Series 1";
    }

    public int getItemCount(int i) {
        return k;
    }

    public Number getX(int i, int j) {
        return xStart[j];
    }

    public Number getY(int i, int j) {
        return yValues[j];
    }

    public Number getStartX(int i, int j) {
        return xStart[j];
    }

    public Number getEndX(int i, int j) {
        return xEnd[j];
    }

    public Number getStartY(int i, int j) {
        return yValues[j];
    }

    public Number getEndY(int i, int j) {
        return yValues[j];
    }

    @Override
    public void addChangeListener(DatasetChangeListener datasetchangelistener) {
    }

    @Override
    public void removeChangeListener(DatasetChangeListener datasetchangelistener) {
    }
}
