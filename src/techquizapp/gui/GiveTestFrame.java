

package techquizapp.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquizapp.Dao.PerformanceDao;
import techquizapp.Dao.QuestionDao;
import techquizapp.pojo.Answer;
import techquizapp.pojo.AnswerStore;
import techquizapp.pojo.Exam;
import techquizapp.pojo.Performance;
import techquizapp.pojo.Question;
import techquizapp.pojo.QuestionStore;
import techquizapp.pojo.UserProfile;


public class GiveTestFrame extends javax.swing.JFrame {

    Color oldColor;
    private int qno,pos=0;
    private QuestionStore qstore;
    private AnswerStore astore;
    private Exam exam;
    public GiveTestFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUserName.setText("Hello "+UserProfile.getUsername());
        oldColor=lblLogout.getForeground();
        qstore=new QuestionStore();
        astore=new AnswerStore();
        qno=1;
        lblQno.setText(lblQno.getText()+qno);
        Time t=new Time();
        t.start();
    }
    public GiveTestFrame(Exam exam)
    {
        this();
        this.exam=exam;
        lblTitle.setText(exam.getLanguage().toUpperCase()+" PAPER");
        loadQuestions();
        showQuestions();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblQno = new javax.swing.JLabel();
        jrOption1 = new javax.swing.JRadioButton();
        jrOption2 = new javax.swing.JRadioButton();
        jrOption3 = new javax.swing.JRadioButton();
        jrOption4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtQuestion.setEditable(false);
        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        lblQno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 51, 51));
        lblQno.setText("Question no:");

        jrOption1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrOption1);
        jrOption1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrOption1.setForeground(new java.awt.Color(255, 0, 51));
        jrOption1.setText("jRadioButton1");

        jrOption2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrOption2);
        jrOption2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrOption2.setForeground(new java.awt.Color(255, 0, 51));
        jrOption2.setText("jRadioButton2");

        jrOption3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrOption3);
        jrOption3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrOption3.setForeground(new java.awt.Color(255, 0, 51));
        jrOption3.setText("jRadioButton3");

        jrOption4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrOption4);
        jrOption4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrOption4.setForeground(new java.awt.Color(255, 0, 51));
        jrOption4.setText("jRadioButton4");

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 0, 51));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 0, 51));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 0, 51));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 0, 51));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 153, 51));
        lblTitle.setText("SUBJECT PAPER");

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 51, 102));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblUserName.setBackground(new java.awt.Color(0, 0, 0));
        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 51, 102));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquizapp/gui/images/good luck2.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Total Time: 1 min");

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrOption1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrOption2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jrOption3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrOption4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrevious)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 40, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption1)
                    .addComponent(jrOption2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption3)
                    .addComponent(jrOption4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDone)
                    .addComponent(btnCancel)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null)
        {
            Question quest=qstore.getQuestionByQno(qno);
            String correctAnswer=quest.getCorrectAnswer();
            Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            Answer attempted=astore.getAnswerByQno(qno);
            if(attempted==null)
            {
               astore.addAnswer(ans);
            }
            else
            {
                String prevAnswer=attempted.getChosenAnswer(); 
                if(prevAnswer.equals(chosenAnswer)==false)
                {
                    int apos=astore.removeAnswer(attempted);
                    astore.setAnswerAt(apos, ans); 
                }
            }
       }
        pos++;
            if(pos>=qstore.getCount())
            {
               pos=0;
            }
            qno++;
            if(qno>qstore.getCount())
            {
              qno=1;
            }
            lblQno.setText("Question no:"+qno);
            showQuestions();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null)
        {
            Question quest=qstore.getQuestionByQno(qno);
            String correctAnswer=quest.getCorrectAnswer();
            Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            Answer attempted=astore.getAnswerByQno(qno);
            if(attempted==null)
            {
               astore.addAnswer(ans);
            }
            else
            {
                String prevAnswer=attempted.getChosenAnswer();
                if(prevAnswer.equals(chosenAnswer)==false)
                {
                    int apos=astore.removeAnswer(attempted);
                    astore.setAnswerAt(apos, ans);
                    
                }
            }
       }
        pos--;
        if(pos<0)
        {
           pos=qstore.getCount()-1;
        }
       qno--;
       if(qno<=0)
       {
            qno=qstore.getCount();
       }
       lblQno.setText("Question no:"+qno);
       showQuestions();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null)
        {
            Question quest=qstore.getQuestionByQno(qno);
            String correctAnswer=quest.getCorrectAnswer();
            System.out.println("In next: qno="+qno+" Correct answer: "+correctAnswer);//testing  //Error point
            Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            Answer attempted=astore.getAnswerByQno(qno);
            if(attempted==null)
            {
               astore.addAnswer(ans);
            }
            else
            {
                String prevAnswer=attempted.getChosenAnswer();
                if(prevAnswer.equals(chosenAnswer)==false)
                {
                    int apos=astore.removeAnswer(attempted);
                    astore.setAnswerAt(apos, ans);
                    
                }
            }
        }
        int right=0,wrong=0;
        for(Question quest:qstore.getAllQuestions())
        {
            int qno=quest.getQno();
            Answer ans=astore.getAnswerByQno(qno);
            if(ans==null)
                continue;
            String attemptedAnswer=ans.getChosenAnswer();
            String correctAnswer=ans.getCorrectAnswer();
            System.out.println("qno "+qno+" attempted ans "+attemptedAnswer+",correct="+correctAnswer);//for testing 
            if(attemptedAnswer.equals(correctAnswer))
                ++right;
            else
                ++wrong;
        }
        StringBuilder sb=new StringBuilder();
        sb.append("\nRight Answer: "+right);
        sb.append("\nWrong Answer: "+wrong);
        sb.append("\nUnattempted: "+(qstore.getCount()-(right+wrong)));
        JOptionPane.showMessageDialog(null, sb.toString(),"Result",JOptionPane.INFORMATION_MESSAGE);
        try
        {
            Performance per=new Performance(exam.getExamId(),exam.getLanguage(),UserProfile.getUsername(),right,wrong,qstore.getCount()-(right+wrong),(double)right/qstore.getCount()*100);
            PerformanceDao.addPerformance(per);
            JOptionPane.showMessageDialog(null, "Result Saved!\nThank you for the test","Done",JOptionPane.INFORMATION_MESSAGE);
            ChoosePaperFrame paperFrame=new ChoosePaperFrame();
            paperFrame.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(null,"DB Error","GiveTest Error!",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
         LoginFrame loginFrame=new LoginFrame();
         loginFrame.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(oldColor);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ChoosePaperFrame Paper=new ChoosePaperFrame();
        Paper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(GiveTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiveTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiveTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiveTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiveTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrOption1;
    private javax.swing.JRadioButton jrOption2;
    private javax.swing.JRadioButton jrOption3;
    private javax.swing.JRadioButton jrOption4;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
private void loadQuestions()
{
    try
    {
        ArrayList <Question> questionList=QuestionDao.getQuestionByExamId(exam.getExamId());
        for(Question q:questionList)
        {
            qstore.addQuestion(q);
        }
        System.out.println("Qstore: "+qstore);
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null,"DB Error","Edit Question Error!",JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
}

    private void showQuestions() {
        Question q=qstore.getQuestion(pos);
        buttonGroup1.clearSelection();     //clearing selected radio buttons
        txtQuestion.setText(q.getQuestion());
        jrOption1.setText(q.getAnswer1());
        jrOption2.setText(q.getAnswer2());
        jrOption3.setText(q.getAnswer3());
        jrOption4.setText(q.getAnswer4());
        Answer ans=astore.getAnswerByQno(qno);
        if(ans==null)
        {
            return;
        }
        String str=ans.getChosenAnswer();
        switch(str)
        {
            case "Answer1":
                jrOption1.setSelected(true);
                break;
            case "Answer2":
                jrOption2.setSelected(true);
                break;
            case "Answer3":
                jrOption3.setSelected(true);
                break;
            case "Answer4":
                jrOption4.setSelected(true);
                break; 
        }
    }
    private String getUserAnswer()
    {
        if(jrOption1.isSelected())
         return "Answer1";
        else if(jrOption2.isSelected())
         return "Answer2";
        else if(jrOption3.isSelected())
         return "Answer3";
        else if(jrOption4.isSelected())
         return "Answer4";
        else
         return null;
        
    }
    class Time extends Thread
    {
       public void run()
       {
          try
          {
          for(int i=1;i<60;i++)
          {
              lblTime.setText("Time Taken:"+i+" Sec");
              Thread.sleep(1000);
              lblTime.setText("");
          }
          JOptionPane.showMessageDialog(null, "Press Done Button to Save Result","Time's Up",JOptionPane.INFORMATION_MESSAGE);
          btnNext.setEnabled(false);
          btnPrevious.setEnabled(false);
          btnCancel.setEnabled(false);
          }
          catch(InterruptedException ex)
          {
              JOptionPane.showMessageDialog(null, "Exception in Time: "+ex, "Error", JOptionPane.ERROR_MESSAGE);
          }
          
       }
    }
}
