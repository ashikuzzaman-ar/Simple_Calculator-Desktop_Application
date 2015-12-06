package mainBody;

import javax.swing.JOptionPane;

public class Calculator extends javax.swing.JFrame {

    private double numberOne;
    private double numberTwo;
    private double totalNumber;

    private boolean plusClick;
    private boolean minusClick;
    private boolean devideClick;
    private boolean multiplyClick;
    private boolean decimalClick;
    private boolean modeClick;
    private boolean powerClick;

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculatorPanel = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        displayBox = new javax.swing.JTextField();
        button3 = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        devide = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        plusOrMinus = new javax.swing.JButton();
        modeButton = new javax.swing.JButton();
        inverseButton = new javax.swing.JButton();
        powerButton = new javax.swing.JButton();
        rootButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        quitSubMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        refreshSubMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpSubMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator For Lab Project");

        button1.setBackground(new java.awt.Color(0, 102, 102));
        button1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button1.setForeground(new java.awt.Color(204, 0, 0));
        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        displayBox.setBackground(new java.awt.Color(153, 153, 255));
        displayBox.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        displayBox.setForeground(new java.awt.Color(153, 0, 153));

        button3.setBackground(new java.awt.Color(0, 102, 102));
        button3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button3.setForeground(new java.awt.Color(204, 0, 0));
        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(0, 102, 102));
        plus.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        plus.setForeground(new java.awt.Color(204, 0, 0));
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(0, 102, 102));
        button2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button2.setForeground(new java.awt.Color(204, 0, 0));
        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(0, 102, 102));
        minus.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        minus.setForeground(new java.awt.Color(204, 0, 0));
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(0, 102, 102));
        button6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button6.setForeground(new java.awt.Color(204, 0, 0));
        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(0, 102, 102));
        button5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button5.setForeground(new java.awt.Color(204, 0, 0));
        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(0, 102, 102));
        button4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button4.setForeground(new java.awt.Color(204, 0, 0));
        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        devide.setBackground(new java.awt.Color(0, 102, 102));
        devide.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        devide.setForeground(new java.awt.Color(204, 0, 0));
        devide.setText("/");
        devide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devideActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(0, 102, 102));
        clear.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(204, 0, 0));
        clear.setText("Cl");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        decimal.setBackground(new java.awt.Color(0, 102, 102));
        decimal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        decimal.setForeground(new java.awt.Color(204, 0, 0));
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        button0.setBackground(new java.awt.Color(0, 102, 102));
        button0.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button0.setForeground(new java.awt.Color(204, 0, 0));
        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(0, 102, 102));
        multiply.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        multiply.setForeground(new java.awt.Color(204, 0, 0));
        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(0, 102, 102));
        button9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button9.setForeground(new java.awt.Color(204, 0, 0));
        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(0, 102, 102));
        button8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button8.setForeground(new java.awt.Color(204, 0, 0));
        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(0, 102, 102));
        button7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        button7.setForeground(new java.awt.Color(204, 0, 0));
        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(0, 102, 102));
        equal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        equal.setForeground(new java.awt.Color(204, 0, 0));
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        plusOrMinus.setBackground(new java.awt.Color(0, 102, 102));
        plusOrMinus.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        plusOrMinus.setForeground(new java.awt.Color(204, 0, 0));
        plusOrMinus.setText("+/-");
        plusOrMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusOrMinusActionPerformed(evt);
            }
        });

        modeButton.setBackground(new java.awt.Color(102, 255, 102));
        modeButton.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        modeButton.setForeground(new java.awt.Color(51, 0, 51));
        modeButton.setText("MOD");
        modeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeButtonActionPerformed(evt);
            }
        });

        inverseButton.setBackground(new java.awt.Color(102, 255, 102));
        inverseButton.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        inverseButton.setForeground(new java.awt.Color(51, 0, 51));
        inverseButton.setText("1/x");
        inverseButton.setToolTipText("");
        inverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseButtonActionPerformed(evt);
            }
        });

        powerButton.setBackground(new java.awt.Color(102, 255, 102));
        powerButton.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        powerButton.setForeground(new java.awt.Color(51, 0, 51));
        powerButton.setText("Power");
        powerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerButtonActionPerformed(evt);
            }
        });

        rootButton.setBackground(new java.awt.Color(102, 255, 102));
        rootButton.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        rootButton.setForeground(new java.awt.Color(51, 0, 51));
        rootButton.setText("Root");
        rootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calculatorPanelLayout = new javax.swing.GroupLayout(calculatorPanel);
        calculatorPanel.setLayout(calculatorPanelLayout);
        calculatorPanelLayout.setHorizontalGroup(
            calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayBox)
                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(calculatorPanelLayout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(button2)
                                .addGap(27, 27, 27)
                                .addComponent(button3)
                                .addGap(18, 18, 18)
                                .addComponent(plus))
                            .addGroup(calculatorPanelLayout.createSequentialGroup()
                                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(button4)
                                            .addComponent(button7))
                                        .addGap(28, 28, 28)
                                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(button5)
                                            .addComponent(button8)
                                            .addComponent(decimal)))
                                    .addComponent(button0)
                                    .addComponent(plusOrMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                                        .addComponent(button9)
                                        .addGap(18, 18, 18)
                                        .addComponent(multiply))
                                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                                        .addComponent(clear)
                                        .addGap(18, 18, 18)
                                        .addComponent(devide))
                                    .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(calculatorPanelLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(button6)
                                .addGap(18, 18, 18)
                                .addComponent(minus)))
                        .addGap(18, 18, 18)
                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inverseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(powerButton))))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        calculatorPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, clear, decimal, devide, minus, multiply, plus});

        calculatorPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {inverseButton, modeButton, powerButton, rootButton});

        calculatorPanelLayout.setVerticalGroup(
            calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plus)
                            .addComponent(button2)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3))
                        .addGap(18, 18, 18)
                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button4)
                            .addComponent(button5)
                            .addComponent(button6)
                            .addComponent(minus))
                        .addGap(18, 18, 18)
                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button7)
                            .addComponent(button8)
                            .addComponent(button9)
                            .addComponent(multiply))
                        .addGap(18, 18, 18)
                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button0)
                            .addComponent(decimal)
                            .addComponent(clear)
                            .addComponent(devide))
                        .addGap(18, 18, 18)
                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plusOrMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equal)))
                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                        .addComponent(modeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(powerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(inverseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        calculatorPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, clear, decimal, devide, minus, multiply, plus});

        calculatorPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {equal, plusOrMinus});

        quitSubMenu.setText("File");

        jMenuItem1.setText("Refresh");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        quitSubMenu.add(jMenuItem1);

        refreshSubMenu.setText("Quit");
        refreshSubMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshSubMenuActionPerformed(evt);
            }
        });
        quitSubMenu.add(refreshSubMenu);

        jMenuBar1.add(quitSubMenu);

        helpMenu.setText("Help");
        helpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuActionPerformed(evt);
            }
        });

        helpSubMenu.setText("Help");
        helpSubMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpSubMenuActionPerformed(evt);
            }
        });
        helpMenu.add(helpSubMenu);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calculatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculatorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed

        try {

            if (this.multiplyClick == false) {

                this.numberOne = 0;
                this.decimalClick = false;
                this.numberOne = Double.parseDouble(this.displayBox.getText());
                this.multiplyClick = true;
                this.displayBox.setText("");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_multiplyActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        try {

            this.displayBox.setText(this.displayBox.getText() + this.button3.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        try {

            this.displayBox.setText(this.displayBox.getText() + this.button2.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        try {

            this.displayBox.setText("");
            this.numberOne = 0;
            this.numberTwo = 0;
            this.totalNumber = 0;
            this.modeClick = false;
            this.powerClick = false;
            this.plusClick = false;
            this.minusClick = false;
            this.multiplyClick = false;
            this.devideClick = false;
            this.decimalClick = false;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_clearActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        try {

            this.displayBox.setText(this.displayBox.getText() + this.button1.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed

        try {

            this.displayBox.setText(this.displayBox.getText() + this.button4.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed

        try {

            this.displayBox.setText(this.displayBox.getText() + this.button5.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed

        try {

            this.displayBox.setText(this.displayBox.getText() + this.button6.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed

        try {

            this.displayBox.setText(this.displayBox.getText() + this.button7.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed

        try {

            this.displayBox.setText(this.displayBox.getText() + this.button8.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed

        try {

            this.displayBox.setText(this.displayBox.getText() + this.button9.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_button9ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed

        try {

            this.displayBox.setText(this.displayBox.getText() + this.button0.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_button0ActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed

        try {

            if (this.decimalClick == false) {

                this.displayBox.setText(this.displayBox.getText() + this.decimal.getText());
                this.decimalClick = true;
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_decimalActionPerformed

    private void plusOrMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusOrMinusActionPerformed

        try {

            this.displayBox.setText(String.valueOf(Double.parseDouble(this.displayBox.getText()) * (-1)));
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_plusOrMinusActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed

        try {

            if (this.plusClick == false) {

                this.numberOne = 0;
                this.numberOne = Double.parseDouble(this.displayBox.getText());
                this.decimalClick = false;
                this.plusClick = true;
                this.displayBox.setText("");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed

        try {

            if (this.minusClick == false) {

                this.numberOne = 0;
                this.numberOne = Double.parseDouble(this.displayBox.getText());
                this.decimalClick = false;
                this.minusClick = true;
                this.displayBox.setText("");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_minusActionPerformed

    private void devideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devideActionPerformed

        try {

            if (this.devideClick == false) {

                this.numberOne = 0;
                this.numberOne = Double.parseDouble(this.displayBox.getText());
                this.decimalClick = false;
                this.devideClick = true;
                this.displayBox.setText("");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_devideActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed

        try {

            this.numberTwo = 0;
            this.numberTwo = Double.parseDouble(this.displayBox.getText());

            if (this.plusClick == true) {

                this.totalNumber = this.numberOne + this.numberTwo;
            } else if (this.minusClick == true) {

                this.totalNumber = this.numberOne - this.numberTwo;
            } else if (this.multiplyClick == true) {

                this.totalNumber = this.numberOne * this.numberTwo;
            } else if (this.devideClick == true) {

                this.totalNumber = this.numberOne / this.numberTwo;
            } else if (this.modeClick == true) {

                this.totalNumber = this.numberOne % this.numberTwo;
            } else if (this.powerClick == true) {

                this.totalNumber = Math.pow(this.numberOne, this.numberTwo);
            }

            String tempNumber;

            if (this.totalNumber == (int) this.totalNumber) {

                int tempDecimalNumber = (int) this.totalNumber;
                tempNumber = String.valueOf(tempDecimalNumber);
                this.displayBox.setText(tempNumber);
            } else {

                tempNumber = String.valueOf(this.totalNumber);
                this.displayBox.setText(tempNumber);
            }

            this.plusClick = false;
            this.minusClick = false;
            this.multiplyClick = false;
            this.devideClick = false;
            this.modeClick = false;
            this.powerClick = false;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_equalActionPerformed

    private void modeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeButtonActionPerformed

        try {

            if (this.modeClick == false) {

                this.numberOne = 0;
                this.numberOne = Double.parseDouble(this.displayBox.getText());
                this.decimalClick = false;
                this.modeClick = true;
                this.displayBox.setText("");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_modeButtonActionPerformed

    private void inverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseButtonActionPerformed

        try {

            this.numberOne = Double.parseDouble(this.displayBox.getText());
            this.totalNumber = (1 / this.numberOne);

            String tempNumber;

            if (Math.sqrt(this.totalNumber) == Math.sqrt((int) this.totalNumber)) {

                int tempDecimalNumber = (int) this.totalNumber;
                tempNumber = String.valueOf(tempDecimalNumber);
                this.displayBox.setText(tempNumber);
            } else {

                tempNumber = String.valueOf(this.totalNumber);
                this.displayBox.setText(tempNumber);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_inverseButtonActionPerformed

    private void powerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerButtonActionPerformed

        try {

            if (this.powerClick == false) {

                this.numberOne = 0;
                this.decimalClick = false;
                this.numberOne = Double.parseDouble(displayBox.getText());
                this.powerClick = true;
                this.displayBox.setText("");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_powerButtonActionPerformed

    private void rootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootButtonActionPerformed

        try {

            this.numberOne = Double.parseDouble(this.displayBox.getText());
            this.totalNumber = Math.sqrt(this.numberOne);
            String tempNumber;

            if (Math.sqrt(this.totalNumber) == Math.sqrt((int) this.totalNumber)) {

                int tempDecimalNumber = (int) this.totalNumber;
                tempNumber = String.valueOf(tempDecimalNumber);
                this.displayBox.setText(tempNumber);
            } else {

                tempNumber = String.valueOf(this.totalNumber);
                this.displayBox.setText(tempNumber);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_rootButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        try {

            this.clearActionPerformed(evt);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void refreshSubMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshSubMenuActionPerformed

        System.exit(0);
    }//GEN-LAST:event_refreshSubMenuActionPerformed

    private void helpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpMenuActionPerformed

    private void helpSubMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpSubMenuActionPerformed

        try {

            HelpClass.displayHelp();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_helpSubMenuActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton button0;
    javax.swing.JButton button1;
    javax.swing.JButton button2;
    javax.swing.JButton button3;
    javax.swing.JButton button4;
    javax.swing.JButton button5;
    javax.swing.JButton button6;
    javax.swing.JButton button7;
    javax.swing.JButton button8;
    javax.swing.JButton button9;
    javax.swing.JPanel calculatorPanel;
    javax.swing.JButton clear;
    javax.swing.JButton decimal;
    javax.swing.JButton devide;
    javax.swing.JTextField displayBox;
    javax.swing.JButton equal;
    javax.swing.JMenu helpMenu;
    javax.swing.JMenuItem helpSubMenu;
    javax.swing.JButton inverseButton;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JMenuItem jMenuItem1;
    javax.swing.JButton minus;
    javax.swing.JButton modeButton;
    javax.swing.JButton multiply;
    javax.swing.JButton plus;
    javax.swing.JButton plusOrMinus;
    javax.swing.JButton powerButton;
    javax.swing.JMenu quitSubMenu;
    javax.swing.JMenuItem refreshSubMenu;
    javax.swing.JButton rootButton;
    // End of variables declaration//GEN-END:variables
}
