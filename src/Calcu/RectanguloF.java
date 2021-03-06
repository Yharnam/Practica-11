/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calcu;

/**
 *
 * @author tutu5
 */
public class RectanguloF extends javax.swing.JFrame {

    /**
     * Creates new form RectanguloF
     */
    public RectanguloF() {
        initComponents();
        this.setResizable(false);
    }

    public class Rectangulo implements FiguraGeometrica
{
    private double base;
    private double altura;
    private double areaRectangulo;
    private double perimetro;
 
    public Rectangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }
 
    public double getBase() 
    {
        return base;
    }
 
    public void setBase(double base)
    {
        this.base = base;
    }
 
    public double getAltura() 
    {
        return altura;
    }
 
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
 
    public double getAreaRectangulo() 
    {
        return areaRectangulo;
    }
 
    public double getPerimetro()
    {
        return perimetro;
    }
    @Override
    public void area() 
    {
        areaRectangulo = base * altura;
    }

    @Override
    public void perimetro() 
    {    
        perimetro = 2 * base * altura;    
    }
}
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_resultado = new javax.swing.JLabel();
        txt_base = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_resultadoP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_altura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(209, 209, 209));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Rectangulo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Base:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        txt_resultado.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_resultado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 180, 20));

        txt_base.setBackground(new java.awt.Color(209, 209, 209));
        txt_base.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_base.setToolTipText("0");
        txt_base.setBorder(null);
        txt_base.setName("0"); // NOI18N
        txt_base.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_baseKeyReleased(evt);
            }
        });
        jPanel2.add(txt_base, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 120, 20));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Area:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Perimetro: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        txt_resultadoP.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_resultadoP.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_resultadoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 180, 20));

        jLabel1.setBackground(new java.awt.Color(204, 0, 51));
        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Regresar");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 40));

        txt_altura.setBackground(new java.awt.Color(209, 209, 209));
        txt_altura.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_altura.setToolTipText("0");
        txt_altura.setBorder(null);
        txt_altura.setName("0"); // NOI18N
        txt_altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_alturaKeyReleased(evt);
            }
        });
        jPanel2.add(txt_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, 20));

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Altura:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 410));

        setSize(new java.awt.Dimension(299, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public double doublevalidat(String number){
        double result = 0;
        try{
            if (number !=null) {
                result = Double.parseDouble(number);
            }
            
        }catch(NumberFormatException nfe){
            //*No es numerico
        }
        return result;
    }
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Calcu Calcu = new Calcu();
        Calcu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txt_alturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_alturaKeyReleased

        double a;
        double b;
        double perimetro;
        double resultado;
        
        a = doublevalidat(txt_base.getText());
        b = doublevalidat(txt_altura.getText());
        
        Rectangulo rectangulo = new Rectangulo(a, b);
        
        rectangulo.area();
        rectangulo.perimetro();
        
        resultado = rectangulo.getAreaRectangulo();
        perimetro = rectangulo.getPerimetro();
        
        txt_resultado.setText(String.valueOf(resultado));
        txt_resultadoP.setText(String.valueOf(perimetro));
        
    }//GEN-LAST:event_txt_alturaKeyReleased

    private void txt_baseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_baseKeyReleased
        
        double a;
        double b;
        double perimetro;
        double resultado;
        
        a = doublevalidat(txt_base.getText());
        b = doublevalidat(txt_altura.getText());
        
        Rectangulo rectangulo = new Rectangulo(a, b);
        
        rectangulo.area();
        rectangulo.perimetro();
        
        resultado = rectangulo.getAreaRectangulo();
        perimetro = rectangulo.getPerimetro();
        
        txt_resultado.setText(String.valueOf(resultado));
        txt_resultadoP.setText(String.valueOf(perimetro));
        
    }//GEN-LAST:event_txt_baseKeyReleased

    
    
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
            java.util.logging.Logger.getLogger(RectanguloF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RectanguloF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RectanguloF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RectanguloF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RectanguloF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_base;
    private javax.swing.JLabel txt_resultado;
    private javax.swing.JLabel txt_resultadoP;
    // End of variables declaration//GEN-END:variables
}
