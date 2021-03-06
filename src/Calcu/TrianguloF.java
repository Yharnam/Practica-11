/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calcu;

/**
 *
 * @author tutu5
 */
public class TrianguloF extends javax.swing.JFrame {

    /**
     * Creates new form Triangulo
     */
    public TrianguloF() {
        initComponents();
        this.setResizable(false);
    }
    
    
    
    public class Triangulo implements FiguraGeometrica
{
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double area;
    private double perimetro;
 
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double _ladoA, double _ladoB, double _ladoC)
    {
        this.ladoA = _ladoA;
        this.ladoB = _ladoB;
        this.ladoC = _ladoC;
    }
        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double getLadoA() {
            return ladoA;
        }

        public void setLadoA(double ladoA) {
            this.ladoA = ladoA;
        }

        public double getLadoB() {
            return ladoB;
        }

        public void setLadoB(double ladoB) {
            this.ladoB = ladoB;
        }

        public double getLadoC() {
            return ladoC;
        }

        public void setLadoC(double ladoC) {
            this.ladoC = ladoC;
        }

        public double getArea() {
            return area;
        }

        public double getPerimetro() {
            return perimetro;
        }
    
        @Override
        public void area() {
            area = base * altura / 2 ;
        }

        @Override
        public void perimetro() {
            perimetro = ladoA + ladoB + ladoC ;
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
        txt_resultadoP = new javax.swing.JLabel();
        txt_Altura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Base = new javax.swing.JTextField();
        txt_LadoA = new javax.swing.JTextField();
        txt_LadoC = new javax.swing.JTextField();
        txt_LadoB = new javax.swing.JTextField();
        txt_resultadoA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(209, 209, 209));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Triangulo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Altura:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        txt_resultadoP.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_resultadoP.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_resultadoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 180, 20));

        txt_Altura.setBackground(new java.awt.Color(209, 209, 209));
        txt_Altura.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_Altura.setToolTipText("0");
        txt_Altura.setBorder(null);
        txt_Altura.setName(""); // NOI18N
        txt_Altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_AlturaKeyReleased(evt);
            }
        });
        jPanel2.add(txt_Altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, 20));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Area:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Perimetro: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 20));

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

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Base:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Lado c:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Lado a:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Lado b:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 20));

        txt_Base.setBackground(new java.awt.Color(209, 209, 209));
        txt_Base.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_Base.setToolTipText("0");
        txt_Base.setBorder(null);
        txt_Base.setName(""); // NOI18N
        txt_Base.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BaseKeyReleased(evt);
            }
        });
        jPanel2.add(txt_Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 120, 20));

        txt_LadoA.setBackground(new java.awt.Color(209, 209, 209));
        txt_LadoA.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_LadoA.setToolTipText("0");
        txt_LadoA.setBorder(null);
        txt_LadoA.setName(""); // NOI18N
        txt_LadoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_LadoAKeyReleased(evt);
            }
        });
        jPanel2.add(txt_LadoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 120, 20));

        txt_LadoC.setBackground(new java.awt.Color(209, 209, 209));
        txt_LadoC.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_LadoC.setToolTipText("0");
        txt_LadoC.setBorder(null);
        txt_LadoC.setName(""); // NOI18N
        txt_LadoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_LadoCKeyReleased(evt);
            }
        });
        jPanel2.add(txt_LadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 120, 20));

        txt_LadoB.setBackground(new java.awt.Color(209, 209, 209));
        txt_LadoB.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_LadoB.setToolTipText("0");
        txt_LadoB.setBorder(null);
        txt_LadoB.setName(""); // NOI18N
        txt_LadoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_LadoBKeyReleased(evt);
            }
        });
        jPanel2.add(txt_LadoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 120, 20));

        txt_resultadoA.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        txt_resultadoA.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_resultadoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Calcu Calcu = new Calcu();
        Calcu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txt_BaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BaseKeyReleased
        
        double a;
        double b;
        double resultado;
        
        a = doublevalidat(txt_Base.getText());
        b = doublevalidat(txt_Altura.getText());
        
        Triangulo triangulo = new Triangulo(a, b);
        
        triangulo.area();
        
        resultado = triangulo.getArea();
        
        txt_resultadoA.setText(String.valueOf(resultado));
        
    }//GEN-LAST:event_txt_BaseKeyReleased

    private void txt_AlturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AlturaKeyReleased

        double a;
        double b;
        double resultado;
        
        a = doublevalidat(txt_Base.getText());
        b = doublevalidat(txt_Altura.getText());
        
        Triangulo triangulo = new Triangulo(a, b);
        
        triangulo.area();
        
        resultado = triangulo.getArea();
        
        txt_resultadoA.setText(String.valueOf(resultado));
        
    }//GEN-LAST:event_txt_AlturaKeyReleased

    private void txt_LadoAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_LadoAKeyReleased
        
        double a;
        double b;
        double c;
        double resultado;
        
        a = doublevalidat(txt_LadoA.getText());
        b = doublevalidat(txt_LadoB.getText());
        c = doublevalidat(txt_LadoC.getText());
        
        Triangulo triangulo = new Triangulo(a, b, c);
        
        triangulo.perimetro();
        
        resultado = triangulo.getPerimetro();
        
        txt_resultadoP.setText(String.valueOf(resultado));
    }//GEN-LAST:event_txt_LadoAKeyReleased

    private void txt_LadoBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_LadoBKeyReleased
        double a;
        double b;
        double c;
        double resultado;
        
        a = doublevalidat(txt_LadoA.getText());
        b = doublevalidat(txt_LadoB.getText());
        c = doublevalidat(txt_LadoC.getText());
        
        Triangulo triangulo = new Triangulo(a, b, c);
        
        triangulo.perimetro();
        
        resultado = triangulo.getPerimetro();
        
        txt_resultadoP.setText(String.valueOf(resultado));
    }//GEN-LAST:event_txt_LadoBKeyReleased

    private void txt_LadoCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_LadoCKeyReleased
                double a;
        double b;
        double c;
        double resultado;
        
        a = doublevalidat(txt_LadoA.getText());
        b = doublevalidat(txt_LadoB.getText());
        c = doublevalidat(txt_LadoC.getText());
        
        Triangulo triangulo = new Triangulo(a, b, c);
        
        triangulo.perimetro();
        
        resultado = triangulo.getPerimetro();
        
        txt_resultadoP.setText(String.valueOf(resultado));
    }//GEN-LAST:event_txt_LadoCKeyReleased

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
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrianguloF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_Altura;
    private javax.swing.JTextField txt_Base;
    private javax.swing.JTextField txt_LadoA;
    private javax.swing.JTextField txt_LadoB;
    private javax.swing.JTextField txt_LadoC;
    private javax.swing.JLabel txt_resultadoA;
    private javax.swing.JLabel txt_resultadoP;
    // End of variables declaration//GEN-END:variables
}
