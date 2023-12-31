
import java.applet.AudioClip;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jona
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
         this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_NumeroTriangulos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Metodo de composicion");

        jTextField_NumeroTriangulos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NumeroTriangulosKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Digite el numero de triangulos a calcular");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jTextField_NumeroTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(222, 222, 222))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_NumeroTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NumeroTriangulosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NumeroTriangulosKeyTyped

        //esto para valdiar solo numeros
        char C = evt.getKeyChar();

        if (Character.isLetter(C)) {
            getToolkit().beep();  //esto lo que ahce es hacer un sonido de beep
            evt.consume();
            //  AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            //    sonido.play();
            //   Icon icon = new ImageIcon(getClass().getResource("/Imagenes/123.png")); //para poner icono al aviso
            //   JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Solo caracteres numericos</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);

        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
            || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
            || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
            || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();// //esto lo que ahce es hacer un sonido de beep
            evt.consume();

        } else if (evt.getKeyChar() == KeyEvent.VK_SPACE) {//para no permitir enter
            getToolkit().beep();// //esto lo que ahce es hacer un sonido de beep
            evt.consume();
        } else if (jTextField_NumeroTriangulos.getText().length() >= 10) {//pa limitar el numero de caracteres

            evt.consume();
          getToolkit().beep();// //esto lo que ahce es hacer un sonido de beep
            // Icon icon = new ImageIcon(getClass().getResource("/Imagenes/123.png")); //para poner icono al aviso
            JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.2em\">Numero muy grande</b>", "Error✘ ⊙﹏⊙", JOptionPane.INFORMATION_MESSAGE);

            if (jTextField_NumeroTriangulos.getText().length() > 10) {
                jTextField_NumeroTriangulos.setText("");
            }

        }
    }//GEN-LAST:event_jTextField_NumeroTriangulosKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if("".equals(jTextField_NumeroTriangulos.getText())){
            JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.2em\">Campo vacio</b>", "Error✘ ⊙﹏⊙", JOptionPane.INFORMATION_MESSAGE);

            return;
        }
        int NumeroTriangulos= Integer.parseInt(jTextField_NumeroTriangulos.getText());
         double Vertice_a=0;
         double Vertice_b=0;
        double Vertice_c=0;
      
        if(NumeroTriangulos<=0){
        JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.2em\">El numero de triangulos debe ser mayor a 0</b>", "Error✘ ⊙﹏⊙", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
         for (int i = 0; i < NumeroTriangulos; i++) {
        
         int NumeroTriangulo=i+1; //solo me dira por q triangulo vamos
         
          //Aqui preguntare los vertices del triangulo
         try {
             Vertice_a = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el vertice a para el triangulo "+NumeroTriangulo));
            
              Vertice_b = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el vertice b para el triangulo "+NumeroTriangulo));
             
               Vertice_c = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el vertice c para el triangulo "+NumeroTriangulo));
            //si es igual o menor a 0 no pasa
            if(Vertice_a<=0 || Vertice_b<=0 || Vertice_c<=0) {
                JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.2em\">Numeros mayor a 0 porfavor</b>", "Error✘ ⊙﹏⊙", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            else if(Vertice_a>200 || Vertice_b>200 || Vertice_c>200){
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.2em\">Para evitar errores, no introduzcas numeros tan grandes</b>", "Error✘ ⊙﹏⊙", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            //si da catch dejo el campo vacio o hay una letra
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.2em\">Pusiste un campo vacio o una letra, porfavor vuelve a intentar</b>", "Error✘ ⊙﹏⊙", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
             
         double h= 2/(Vertice_c-Vertice_a);
           //Como el area si o si debe ser 1 entonces A1 Y A2 SON 0.5
       double A1=0.5;
       double A2=0.5;
       
       //TRIANGULO IZQUIERDO
       //Como el area es 1 despejo para hallar h
      double  h_TrianguloIZQ= 2/(Vertice_b-Vertice_a);
      //Hallo la m con la firmula, el punto y1 siempre sera 0 por la hubicacion
     double m_TrianguloIZQ= h_TrianguloIZQ/(Vertice_b-Vertice_a);
     //Ahora hallare la formula de la pendiente parte IZQ
     double Operaciones_TrianguloIZQ = m_TrianguloIZQ*(-Vertice_b);
     Operaciones_TrianguloIZQ=Operaciones_TrianguloIZQ+h_TrianguloIZQ;
       String Formula_Pendiente_PartIZQ= "m_TrianguloIZQ*x+Operaciones_TrianguloIZQ";
             
       
        //TRIANGULO DERECHO
         double  h_TrianguloDER= 2/(Vertice_c-Vertice_b);
          double m_TrianguloDER= h_TrianguloDER/(Vertice_b-Vertice_c);
          
          //Ahora hallare la formula de la pendiente parte DER
     double Operaciones_TrianguloDER = m_TrianguloDER*(-Vertice_b);
     Operaciones_TrianguloDER=Operaciones_TrianguloDER+h_TrianguloDER;
           String Formula_Pendiente_PartDER= "m_Triangulo*x+Operaciones_TrianguloDER";
          
           
           //METODO TRANSFORMADA INVERSA
           //Parte IZQ
           //aqui divido en la integral lo que se hizo 2/2,pero peude ser otro numero
    double Resultado_Integral_Division_ParteIZQ=m_TrianguloIZQ/2;

             String Formula_TransformadaInversa_ParteIZQ_1 = "(Resultado_Integral_Division_ParteIZQ*(Math.pow(x, 2)))+Operaciones_TrianguloIZQ*x";
             double Formula_TransformadInversa_ParteIZQ_2 = -(((m_TrianguloIZQ*(Math.pow(Vertice_a, 2)))/2)+Operaciones_TrianguloIZQ*Vertice_a);

             //resolvere la ecuacion cuadratica por facturizacion, buscare 2 numero q sumados me den el del medio y multiplicados el ultimo
             
             double NumeroX_IZQ =Operaciones_TrianguloIZQ;//estas son para asegurar q los 2x+9 Por ejemplo no sean negativos
             double Numero_IZQ=Formula_TransformadInversa_ParteIZQ_2;
             
             if(NumeroX_IZQ<0){
             NumeroX_IZQ=NumeroX_IZQ*-1;
             }
             if(Numero_IZQ<0){
             Numero_IZQ=Numero_IZQ*-1;
             }
             
             
             int Numero1IZQ=0;
             int Numero2IZQ=0;
             while(true){
             if(Numero1IZQ+Numero2IZQ==NumeroX_IZQ){
                   
             if(Numero1IZQ*Numero2IZQ==Numero_IZQ){
             break;
             }
             }
                Numero1IZQ++; 
                if(Numero1IZQ>200){
                    Numero1IZQ=0;
                    Numero2IZQ++;
                }
                if(Numero2IZQ>200){
                     Numero1IZQ=3;
                    Numero2IZQ=3;
                  break;
                }
             }
             //si este es negativo, el primer numero lo sera
             if(Operaciones_TrianguloIZQ<0){
             Numero1IZQ=Numero1IZQ*-1;
             }
             //para el 2do muiltiplico signos -2X-5 por ejemplo
             if(Operaciones_TrianguloIZQ<0 && Formula_TransformadInversa_ParteIZQ_2>=0){
            Numero2IZQ=Numero2IZQ*-1;
             }
             else if(Operaciones_TrianguloIZQ>=0 && Formula_TransformadInversa_ParteIZQ_2<0){
              Numero2IZQ=Numero2IZQ*-1;
             }
             
             //Verificare cual es mayor ya q ese me sirve
             if(Numero1IZQ>Numero2IZQ){ 
             }
             else{
             Numero1IZQ =Numero2IZQ;
             }
             //La inversa cambie el signo del numero
              Numero1IZQ=Numero1IZQ*-1;
              String Formula_Inversa_PartIZQ= "Math.sqrt(x)+Numero1IZQ";
              
              
              
              
              
              
           //METODO TRANSFORMADA INVERSA
           //Parte DER
           //aqui divido en la integral lo que se hizo 2/2,pero peude ser otro numero
    double Resultado_Integral_Division_ParteDER=m_TrianguloDER/2;

             String Formula_TransformadaInversa_ParteDER_1 = "(Resultado_Integral_Division_ParteDER*(Math.pow(x, 2)))+Operaciones_TrianguloDER*x";
             double Formula_TransformadInversa_ParteDER_2 = -(((m_TrianguloDER*(Math.pow(Vertice_b, 2)))/2)+Operaciones_TrianguloDER*Vertice_b);

             //resolvere la ecuacion cuadratica por facturizacion, buscare 2 numero q sumados me den el del medio y multiplicados el ultimo
             
             double NumeroX_DER =Operaciones_TrianguloDER;//estas son para asegurar q los 2x+9 Por ejemplo no sean negativos
             double Numero_DER=Formula_TransformadInversa_ParteDER_2;
             
             if(NumeroX_DER<0){
             NumeroX_DER=NumeroX_DER*-1;
             }
             if(Numero_DER<0){
             Numero_DER=Numero_DER*-1;
             }
             
             
             int Numero1DER=0;
             int Numero2DER=0;
             while(true){
             if(Numero1DER+Numero2DER==NumeroX_DER){
                   
             if(Numero1DER*Numero2DER==Numero_DER){
             break;
             }
             }
                Numero1DER++; 
                if(Numero1DER>200){
                    Numero1DER=0;
                    Numero2DER++;
                }
                if(Numero2DER>200){
                     Numero1DER=3;
                    Numero2DER=3;
                  break;
                }
             }
             //si este es negativo, el primer numero lo sera
             if(Operaciones_TrianguloDER<0){
             Numero1DER=Numero1DER*-1;
             }
             //para el 2do muiltiplico signos -2X-5 por ejemplo
             if(Operaciones_TrianguloDER<0 && Formula_TransformadInversa_ParteDER_2>=0){
            Numero2DER=Numero2DER*-1;
             }
             else if(Operaciones_TrianguloDER>=0 && Formula_TransformadInversa_ParteDER_2<0){
              Numero2DER=Numero2DER*-1;
             }
             
             //Verificare cual es menor ya q ese me sirve
             if(Numero1DER<Numero2DER){ 
             }
             else{
             Numero1DER=Numero2DER;
             }
             //La inversa cambie el signo del numero
              Numero1DER=Numero1DER*-1;
              String Formula_Inversa_PartDER= "Math.sqrt(x)+Numero1DER";
              
              
              ///////////////////////////////////////////////////////
              //Paso 4
              String Fx= "A1*((m_TrianguloIZQ*x)+Operaciones_TrianguloIZQ)+A2*((m_Triangulo*x)+Operaciones_TrianguloDER)";
              int Cantidad_Numeros_Aleatorios=0;
               try {
             
               Cantidad_Numeros_Aleatorios = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros aleatorios quiere generar para el triangulo "+NumeroTriangulo));
            //si es igual o menor a 0 no pasa
            if(Cantidad_Numeros_Aleatorios<=0 ) {
                JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.2em\">Numeros mayor a 0 porfavor</b>", "Error✘ ⊙﹏⊙", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
           
            //si da catch dejo el campo vacio o hay una letra
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.2em\">Pusiste un campo vacio o una letra, porfavor vuelve a intentar</b>", "Error✘ ⊙﹏⊙", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
               List<Double> Lista_Numeros_Aleatorios = new ArrayList<Double>();
               Lista_Numeros_Aleatorios.clear();
               for (int j = 0; j < Cantidad_Numeros_Aleatorios; j++) {
                 //Ahora generare numeros aleatorios entre 0 y 1
              Random rnd = new Random();
               double R1=rnd.nextDouble();
                double R2=rnd.nextDouble();
                double x=0;
                if(R1<A1){
                //debo usar La funcion 1
                 x= Math.sqrt(R2)+Numero1IZQ;
                 Lista_Numeros_Aleatorios.add(x);
                }
                else {
                x= Math.sqrt(R2)+Numero1DER;
                  Lista_Numeros_Aleatorios.add(x);
                }
               }
               
              //Grafica Ardenson-Darlin/
              
            XYSeriesCollection dataset = new XYSeriesCollection();  
           
    //Boys (Age,weight) series  
    XYSeries series1 = new XYSeries("Punto"); 
    for (int k = 0; k < Lista_Numeros_Aleatorios.size(); k++) {
     series1.add(k,Lista_Numeros_Aleatorios.get(k)); 
        System.out.println("Resultados x para triangulo "+NumeroTriangulo+": "+Lista_Numeros_Aleatorios.get(k));
    }
   

    dataset.addSeries(series1);  
    /*
       //Girls (Age,weight) series  
    XYSeries series2 = new XYSeries("Girls");  
    series2.add(1, 72.5);  
    series2.add(2, 80.1);  
    series2.add(3, 87.2);  
    series2.add(4, 94.5);  
    series2.add(5, 101.4);  
    series2.add(6, 107.4);  
    series2.add(7, 112.8);  
    series2.add(8, 118.2);  
    series2.add(9, 122.9);  
    series2.add(10, 123.4);  
  
    dataset.addSeries(series2); 
  */
    // Create chart  
    
    JFreeChart chart = ChartFactory.createScatterPlot(  
        "Triangulo "+NumeroTriangulo+"-Grafica Ardenson-Darlin POR METODO DE PUNTOS",   
        "Numero del punto", "Resultado del valor x", dataset);  
  
      
    //Changes background color  
    XYPlot plot = (XYPlot)chart.getPlot();  
    plot.setBackgroundPaint(new Color(255,228,196));  
      
     
    // Create Panel  
    ChartPanel panel = new ChartPanel(chart);  
    setContentPane(panel);  
 

        // Creamos la ventana
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(this);
        ventana.setSize(800, 600);
        //  ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        ventana.add(panel);
            
        
        //GRAFICA NORMAL 
        
                XYSeries GraficaMeses = new XYSeries("Grafica");
              for (int a = 0; a <Lista_Numeros_Aleatorios.size(); a++) {
              
                GraficaMeses.add(a, Lista_Numeros_Aleatorios.get(a));
                
              
              }
       
        XYSeriesCollection dataset2 = new XYSeriesCollection();
                dataset2.addSeries(GraficaMeses);
                
          JFreeChart xylineChart = ChartFactory.createXYLineChart(
            "GRAFICA triangulo "+NumeroTriangulo,
            "Cantidad de numeros",
            "x",
            dataset2,
            PlotOrientation.VERTICAL, true, true, false);
 
               
                XYPlot plot2 = xylineChart.getXYPlot();
               
                XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
               
                renderer.setSeriesPaint(0, Color.RED);//color grafica              
                renderer.setSeriesStroke(0, new BasicStroke(4.0f));//grosor de la grafica            
                plot2.setRenderer(renderer);
               
                ChartPanel panel2 = new ChartPanel(xylineChart);
 
                // Creamos la ventana
                JFrame ventana2 = new JFrame("Grafica ");
                ventana2.setVisible(true);
                ventana2.setLocationRelativeTo(this);
                ventana2.setSize(800, 600);
                
              //  ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
                ventana2.add(panel2);
             //si se muestra la ventaja es q el algoritmo determino que no hay patron especifico por lo que la secuencia es pseudoaleatoria   
        
             
             
             
             
             //GRAFICA 3
             /*
               String plotTitle = "1";
        String xAxisLabel = "2";
        String yAxis = "3";
        PlotOrientation orientation = PlotOrientation.VERTICAL;

        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (int z = 0; z < Lista_Numeros_Aleatorios.size(); z++)
        {
            dataSet.addValue(Lista_Numeros_Aleatorios.get(z), (Integer) 0, (Integer) z);
        }
        boolean show = true;
        boolean toolTips = false;
        boolean urls = false;
        
        JFreeChart chart3 = ChartFactory.createBarChart(plotTitle, xAxisLabel,
            yAxis, dataSet, orientation, show, toolTips, urls);
        chart3.setBackgroundPaint(Color.WHITE);

        // Set a very small font for the labels, and rotate them...
        CategoryPlot plot3 = chart3.getCategoryPlot();
        CategoryAxis domainAxis = plot3.getDomainAxis();
        domainAxis.setTickLabelFont(new Font("Dialog", Font.PLAIN, 8));
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_90);

   
               ChartPanel chartPanel = new ChartPanel(chart3);
        chartPanel.setMaximumDrawHeight(3000);
        chartPanel.setMaximumDrawWidth(3000);
        JFrame frame = new JFrame();
        frame.add(chartPanel);

        frame.setSize(2500, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
             */
          
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField_NumeroTriangulos;
    // End of variables declaration//GEN-END:variables
}
