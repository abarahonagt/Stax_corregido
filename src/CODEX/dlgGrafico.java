package CODEX;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;

//import com.mallkudev.tablafrecuencias.clases.Clase;
public final class dlgGrafico extends javax.swing.JDialog {
    private Clases[] clase;
    private int[] frec;

    public dlgGrafico(Clases[] clases,int[] frecuencias,java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        clase=clases;
        frec=frecuencias;
        JPanel panel=createDemoPanel();
        jPanel1.add(panel);
        pack();
    }

    public JPanel createDemoPanel(){
        JFreeChart jfreechart=createChart(createDataset());
        ChartPanel chartpanel=new ChartPanel(jfreechart);
        chartpanel.setMouseWheelEnabled(true);
        return chartpanel;
    }
    public JFreeChart createChart(IntervalXYDataset dataset){
        JFreeChart chart=ChartFactory.createHistogram("", "X", "Y", dataset, PlotOrientation.VERTICAL, false, false, false);
        XYPlot xyplot=(XYPlot)chart.getPlot();
        xyplot.setBackgroundAlpha(0.85f);
        xyplot.setDomainPannable(true);
        xyplot.setRangePannable(true);

        NumberAxis numberaxis=(NumberAxis)xyplot.getRangeAxis();
        numberaxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        XYBarRenderer xybarrenderer=(XYBarRenderer)xyplot.getRenderer();
        xybarrenderer.setDrawBarOutline(false);
        return chart;
    }

    public IntervalXYDataset  createDataset(){
        SimpleHistogramDataset dataset=new SimpleHistogramDataset("Claves");
        SimpleHistogramBin histogramBin=new SimpleHistogramBin(0D, 1.0D,true,false);
        histogramBin.setItemCount(10);
        dataset.addBin(histogramBin);
        return dataset;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButton1)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
