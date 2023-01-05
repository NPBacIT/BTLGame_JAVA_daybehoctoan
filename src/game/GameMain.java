/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;



/**
 *
 * @author admin
 */
public class GameMain extends javax.swing.JFrame {
 public int a,b,c,chekcauhoi,thoigian,diem;
 boolean gameover;
 public Timer time;
    public GameMain() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Progress = new javax.swing.JProgressBar();
        sai = new javax.swing.JButton();
        dung = new javax.swing.JButton();
        choi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.pink);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bé Học Làm Toán");

        jLabel2.setBackground(java.awt.Color.pink);
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/pngtree-cute-cartoon-child-question-mark-png-picture-material-image_1443086.jpg"))); // NOI18N
        jLabel2.setText("Câu hỏi");
        jLabel2.setAlignmentY(1.0F);
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 300));

        Progress.setForeground(java.awt.Color.yellow);

        sai.setBackground(new java.awt.Color(0, 255, 255));
        sai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sai.setText("Sai");
        sai.setBorderPainted(false);
        sai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saiActionPerformed(evt);
            }
        });

        dung.setBackground(new java.awt.Color(0, 255, 255));
        dung.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dung.setText("Đúng");
        dung.setBorderPainted(false);
        dung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dungActionPerformed(evt);
            }
        });

        choi.setBackground(new java.awt.Color(0, 255, 255));
        choi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        choi.setText("Chơi ");
        choi.setBorderPainted(false);
        choi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("Score:");

        score.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        score.setForeground(java.awt.Color.red);
        score.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(498, Short.MAX_VALUE)
                        .addComponent(dung, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sai, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(Progress, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(choi, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(score))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dung, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(sai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(choi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dungActionPerformed
        if(!gameover){   
        if(a+b==c)
       {
        load();
        //diemthang();
        thoigian=100;
       time.start();
            try {
                music1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        else if(a-b==c)
       {
        load();
        //diemthang();
        thoigian=100;
       time.start();
            try {
                music1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
           else if(a*b==c)
       {
        load();
        //diemthang();
        thoigian=100;
       time.start();
            try {
                music1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       }
       
       else{
          
         jLabel2.setText("Thua cuộc!!");
         time.stop();
         gameover=true;
            try {
                msthua();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        }
    }//GEN-LAST:event_dungActionPerformed
 public void load(){
     diem++;
     score.setText(diem+"");
    Random rd= new Random();
    a=rd.nextInt(10)+1;
    b= rd.nextInt(10)+1;
    chekcauhoi=rd.nextInt(20);
    
    if(chekcauhoi ==0||chekcauhoi==1||chekcauhoi==10)//phep cong
    {
       c=a+b;
        jLabel2.setText(a+"+"+b+"="+c);
    }
    else if(chekcauhoi==2 ||chekcauhoi==4 ||chekcauhoi==5)//phep tru
    {
      c=a-b;
      jLabel2.setText(a+"-"+b+"="+c);
    }
    else if(chekcauhoi==6 &&diem >=10||chekcauhoi==9&&diem >=10||chekcauhoi==13&&diem >=10)//phep nhan
    {
     c=a*b;
      jLabel2.setText(a+"x"+b+"="+c);
    }
    
    else if(chekcauhoi==12||chekcauhoi==16||chekcauhoi==18){
     c= rd.nextInt(10)+1;
     jLabel2.setText(a+"+"+b+"="+c);
     
    }
    else if(chekcauhoi==11&& diem >=10||chekcauhoi==14 && diem>=10||chekcauhoi==15&&diem>=10){
     c= rd.nextInt(20)+1;
     jLabel2.setText(a+ "x" +b+"="+c);
     
    }
     else {
     c= rd.nextInt(10)+1;
     jLabel2.setText(a+"-"+b+"="+c);
     
    }
    
 }
 
 public void diemthang(){
 diem++;
 score.setText(diem+"");
// load();
//     score.setText(diem+"");
//   
//      if(diem==10){
//     jLabel2.setText("Thắng cuộc!!");
//         time.stop();
//         gameover=true;
//     }
 }

    // public void diemthua(){
// diem--;
//
//     score.setText(diem+"");
//     if(diem==0){
//     
//         jLabel2.setText("Thua!!");
//         time.stop();
//         gameover=true;
//     }
//     
// }
 public class loadtime implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(thoigian>0)
            {
               thoigian--;
               Progress.setValue(thoigian);
            }
            else{
                
//                jLabel2.setForeground(Color.red);
            jLabel2.setText("Thua!!");
            
            
            }
        }
   
 }
 
 
    private void choiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiActionPerformed
     gameover=false;
     diem=0;
        load();
      
      thoigian=100;
      time = new Timer(100, new loadtime());
      time.start();
     try {
         music1();
     } catch (UnsupportedAudioFileException ex) {
         Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
     } catch (LineUnavailableException ex) {
         Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
         Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
     }
      
    }//GEN-LAST:event_choiActionPerformed

    private void saiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saiActionPerformed
      if(!gameover){
        if(a+b==c)
       {
           jLabel2.setText("Thua cuộc!!");
       time.stop();
         gameover= true;
            try {
                msthua();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        else if(a+b!=c) {
          load();
        thoigian=100;
       time.start();
            try {
                music1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       }
         else if(a-b==c){
        
           jLabel2.setText("Thua!!");
       time.stop();
         gameover= true;
            try {
                msthua();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
          else if(a-b!=c){
          load();
        thoigian=100;
       time.start();
            try {
                music1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       }
         else if(a*b==c){
        
           jLabel2.setText("Thua!!");
       time.stop();
         gameover= true;
            try {
                msthua();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         else if(a*b!=c){
          load();
        thoigian=100;
       time.start();
            try {
                music1();
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       }
//         else {
//          load();
//        thoigian=100;
//       time.start();
//       
//       }
       
       
       
        
    }//GEN-LAST:event_saiActionPerformed
    }
    public static void music() throws UnsupportedAudioFileException, LineUnavailableException, IOException{
       File file = new File("nen1.wav");
        AudioInputStream audio= AudioSystem.getAudioInputStream(file);
        Clip cl=AudioSystem.getClip();
        cl.open(audio);
        cl.start();
      cl.loop(Clip.LOOP_CONTINUOUSLY);
     
    
    }
      public static void music1() throws UnsupportedAudioFileException, LineUnavailableException, IOException{
       File file = new File("chosse.wav");
        AudioInputStream audio= AudioSystem.getAudioInputStream(file);
        Clip cl=AudioSystem.getClip();
        cl.open(audio);
        cl.start();
    //  cl.loop(Clip.LOOP_CONTINUOUSLY);
     
    
    }
       public static void msthua() throws UnsupportedAudioFileException, LineUnavailableException, IOException{
       File file = new File("thua.wav");
        AudioInputStream audio= AudioSystem.getAudioInputStream(file);
        Clip cl=AudioSystem.getClip();
        cl.open(audio);
        cl.start();
    //  cl.loop(Clip.LOOP_CONTINUOUSLY);
     
    
    }
   
    public static void main(String args[]) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
      
       music();
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameMain gm=new GameMain();
                      gm.setVisible(true)   ;
                gm.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progress;
    private javax.swing.JButton choi;
    private javax.swing.JButton dung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sai;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables
}
