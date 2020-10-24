
package calculator;

import static java.lang.Double.parseDouble;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Pattern;

 

public class calculator_form extends javax.swing.JFrame {
long i=0;
long total1=0, variable=0,variable2=0;
BigInteger rs3,ANS2;
double db=0;
int temp1=0,temp2=0,temp3=0,temp4=0;
BigInteger result=BigInteger.ZERO,resultm=BigInteger.ONE;
double resultd=0,resultmd=1,rsd3=0;
    public calculator_form() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("+");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("=");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("-");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("*");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("/");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("C");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("ANS");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("0");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton9)
                                    .addGap(32, 32, 32)
                                    .addComponent(jButton11)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton15))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3)
                                        .addComponent(jButton6))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))))))
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton10)
                    .addComponent(jButton13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton12)
                    .addComponent(jButton14))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton11)
                    .addComponent(jButton15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(196, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String s1=jButton1.getText();
        BigInteger a;
        double ad,rsd;
        a=new BigInteger(s1);
        BigInteger rs;
        ad=Double.parseDouble(s1);
        rsd=ad;
        rs=a;
        if(total1>0){
        rs=rs3.multiply(BigInteger.TEN);
        rs=rs.add(a);
        rs3=rs;
        }
        else{
        rs3=rs;
        }
        String rs1=String.valueOf(rs);
        jTextField1.setText(rs1);
          total1++;
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s1=jButton2.getText();
        BigInteger a;
        a=new BigInteger(s1);
        BigInteger rs ;
        rs=a;
        if(total1>0){
        rs=rs3.multiply(BigInteger.TEN);
        rs=rs.add(a);
        rs3=rs;
        }
        else{
        rs3=rs;
        }
        String rs1=String.valueOf(rs);
        jTextField1.setText(rs1);
        total1++;
                 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String s1=jButton3.getText();
        BigInteger a;
        a=new BigInteger(s1);
        BigInteger rs ;
        rs=a;
        if(total1>0){
        rs=rs3.multiply(BigInteger.TEN);
        rs=rs.add(a);
        rs3=rs;
        }
        else{
        rs3=rs;
        }
        String rs1=String.valueOf(rs);
        jTextField1.setText(rs1);
          total1++;
                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String s1=jButton4.getText();
        BigInteger a;
        a=new BigInteger(s1);
        BigInteger rs ;
        rs=a;
        if(total1>0){
        rs=rs3.multiply(BigInteger.TEN);
        rs=rs.add(a);
        rs3=rs;
        }
        else{
        rs3=rs;
        }
        String rs1=String.valueOf(rs);
        jTextField1.setText(rs1);
          total1++;
           
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String s1=jButton5.getText();
        BigInteger a;
        a=new BigInteger(s1);
        BigInteger rs ;
        rs=a;
        if(total1>0){
        rs=rs3.multiply(BigInteger.TEN);
        rs=rs.add(a);
        rs3=rs;
        }
        else{
        rs3=rs;
        }
        String rs1=String.valueOf(rs);
        jTextField1.setText(rs1);
          total1++;
          
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
       String s1=jButton6.getText();
        BigInteger a;
        a=new BigInteger(s1);
        BigInteger rs ;
        rs=a;
        if(total1>0){
        rs=rs3.multiply(BigInteger.TEN);
        rs=rs.add(a);
        rs3=rs;
        }
        else{
        rs3=rs;
        }
        String rs1=String.valueOf(rs);
        jTextField1.setText(rs1);
          total1++;
           
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       String s1=jButton7.getText();
        BigInteger a;
        a=new BigInteger(s1);
        BigInteger rs ;
        rs=a;
        if(total1>0){
        rs=rs3.multiply(BigInteger.TEN);
        rs=rs.add(a);
        rs3=rs;
        }
        else{
        rs3=rs;
        }
        String rs1=String.valueOf(rs);
        jTextField1.setText(rs1);
          total1++;
            
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         String s1=jButton8.getText();
        BigInteger a;
        a=new BigInteger(s1);
        BigInteger rs ;
        rs=a;
        if(total1>0){
        rs=rs3.multiply(BigInteger.TEN);
        rs=rs.add(a);
        rs3=rs;
        }
        else{
        rs3=rs;
        }
        String rs1=String.valueOf(rs);
        jTextField1.setText(rs1);
          total1++;
            
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String s1=jButton9.getText();
        BigInteger a;
        a=new BigInteger(s1);
        BigInteger rs ;
        rs=a;
        if(total1>0){
        rs=rs3.multiply(BigInteger.TEN);
        rs=rs.add(a);
        rs3=rs;
        }
        else{
        rs3=rs;
        }
        String rs1=String.valueOf(rs);
        jTextField1.setText(rs1);
          total1++;
            
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(jTextField1.isDisplayable() ){
        String s1= jTextField1.getText();
       BigInteger a;
    a = new BigInteger(s1);
        temp1=1;
       result=result.add(a);
        total1=0;
        rs3=BigInteger.ZERO;
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String s1=jTextField1.getText();
        BigInteger b= new BigInteger(s1);
        if(temp1==1){
        result=result.add(b);
        temp1=0;
        total1=0;
          String rs1= String.valueOf(result);
        jTextField3.setText(rs1);
        result=BigInteger.ZERO;
        rs3=BigInteger.ZERO;
        int x=0;
        String s2= String.valueOf(x);
        jTextField1.setText(s2);
        }
        else if(temp2==1){
        resultm=resultm.multiply(b);
        temp2=0;
        total1=0;
          String rs1= String.valueOf(resultm);
        jTextField3.setText(rs1);
        resultm=BigInteger.ONE;
        rs3=BigInteger.ZERO;
        int x=0;
        String s2= String.valueOf(x);
        jTextField1.setText(s2);
        }
        else if(temp3==1){
        result=result.subtract(b);
        temp3=0;
        total1=0;
          String rs1= String.valueOf(result);
        jTextField3.setText(rs1);
        result=BigInteger.ZERO;
        rs3=BigInteger.ZERO;
        int x=0;
        String s2= String.valueOf(x);
        jTextField1.setText(s2);
        }
        else if(temp4==1){
        result=result.divide(b);
        temp4=0;
        total1=0;
          String rs1= String.valueOf(result);
        jTextField3.setText(rs1);
        result=BigInteger.ZERO;
        rs3=BigInteger.ZERO;
        int x=0;
        String s2= String.valueOf(x);
        jTextField1.setText(s2);
        }
        else{
        jTextField3.setText(s1);
        int x=0;
        String s2=String.valueOf(x);
        jTextField1.setText(s2);
       }
      total1=0; variable=0;variable2=0;
        temp1=0;temp2=0;temp3=0;temp4=0;
       variable=0;
       variable2=0;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       if(jTextField1.isDisplayable() ){
        String s1= jTextField1.getText();
       
       BigInteger a;
    a = new BigInteger(s1);
        temp2=1;
       resultm=resultm.multiply(a);
        total1=0;
        rs3=BigInteger.ZERO;
       }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(jTextField1.isDisplayable() ){
        String s1= jTextField1.getText(); 
       BigInteger a;
    a = new BigInteger(s1);
        temp3=1;
        BigInteger b;
        b=a;
        if(variable>0){
       result=result.subtract(b);
        }
        else{
        result=a;
        }
        total1=0;
        rs3=BigInteger.ZERO;
        variable++;
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       if(jTextField1.isDisplayable() ){
        String s1= jTextField1.getText();
       BigInteger a,b;
       a = new BigInteger(s1);
       temp4=1;
       b=a;
       if(variable2>0){
            result=result.divide(b);
        }
        else{
        result=a;
        }
        total1=0;
        rs3=BigInteger.ZERO;
        variable2++;
       }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
          BigInteger B;
        B=BigInteger.ZERO;
        String SN2=B.toString();
        jTextField1.setText(SN2);
        jTextField3.setText(SN2);
        total1=0; variable=0;variable2=0;
        temp1=0;temp2=0;temp3=0;temp4=0;
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        
        String S1=jTextField3.getText();
        String s3="0";
        long l2=Long.parseLong(S1);
        jTextField3.setText(s3); 
       ANS2=BigInteger.valueOf(l2);
        String s2=new String(ANS2.toString());
        jTextField1.setText(s2);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String s1=jButton17.getText();
        BigInteger a;
        double ad,rsd,tempdouble=0;
        a=new BigInteger(s1);
        BigInteger rs;
        rs=a;
        if(total1>0){
        rs=rs3.multiply(BigInteger.TEN);
        rs=rs.add(a);
        rs3=rs;
        }
        else{
        rs3=rs;
        }
        String rs1=String.valueOf(rs);
        jTextField1.setText(rs1);
          total1++;
    }//GEN-LAST:event_jButton17ActionPerformed

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
            java.util.logging.Logger.getLogger(calculator_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

 
}
