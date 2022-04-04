package ProjetoFinalCalculadora;
/**
 *
 * @author Paula Serodio Terezan
 */
public class Calculadora extends javax.swing.JFrame {
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }
    
    private boolean digitou = false;
    private double NumeroDigitado = 0;
    private double total = 0;
    private int operacao = 0;
    //1 = Adição
    //2 = Subtração
    //3 = Multiplicação
    //4 = Divisão
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelCalculadora = new javax.swing.JPanel();
        jTextFieldTexto = new javax.swing.JTextField();
        jButtonSete = new javax.swing.JButton();
        jButtonQuatro = new javax.swing.JButton();
        jButtonUm = new javax.swing.JButton();
        jButtonOito = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonDois = new javax.swing.JButton();
        jButtonNove = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonVirgula = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonSomar = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Calculadora");

        jPanelCalculadora.setBackground(new java.awt.Color(255, 102, 204));

        jTextFieldTexto.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextFieldTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTexto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 102), 1, true));

        jButtonSete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSete.setText("7");
        jButtonSete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeteActionPerformed(evt);
            }
        });

        jButtonQuatro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonQuatro.setText("4");
        jButtonQuatro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuatroActionPerformed(evt);
            }
        });

        jButtonUm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonUm.setText("1");
        jButtonUm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUmActionPerformed(evt);
            }
        });

        jButtonOito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonOito.setText("8");
        jButtonOito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOitoActionPerformed(evt);
            }
        });

        jButtonCinco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonCinco.setText("5");
        jButtonCinco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCincoActionPerformed(evt);
            }
        });

        jButtonDois.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonDois.setText("2");
        jButtonDois.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoisActionPerformed(evt);
            }
        });

        jButtonNove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonNove.setText("9");
        jButtonNove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoveActionPerformed(evt);
            }
        });

        jButtonSeis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSeis.setText("6");
        jButtonSeis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeisActionPerformed(evt);
            }
        });

        jButtonTres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonTres.setText("3");
        jButtonTres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });

        jButtonZero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonZero.setText("0");
        jButtonZero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });

        jButtonVirgula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonVirgula.setText(".");
        jButtonVirgula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVirgulaActionPerformed(evt);
            }
        });

        jButtonDividir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonDividir.setText("/");
        jButtonDividir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonMultiplicar.setText("X");
        jButtonMultiplicar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonSubtrair.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonSubtrair.setText("-");
        jButtonSubtrair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });

        jButtonSomar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonSomar.setText("+");
        jButtonSomar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomarActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonLimpar.setText("C");
        jButtonLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCalculadoraLayout = new javax.swing.GroupLayout(jPanelCalculadora);
        jPanelCalculadora.setLayout(jPanelCalculadoraLayout);
        jPanelCalculadoraLayout.setHorizontalGroup(
            jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTexto)
                    .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                        .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                                .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                                .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonUm, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonQuatro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                                        .addComponent(jButtonDois, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                                        .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonOito, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCalculadoraLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                                .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonDividir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSubtrair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonSomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanelCalculadoraLayout.setVerticalGroup(
            jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextFieldTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                        .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonOito, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCalculadoraLayout.createSequentialGroup()
                        .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonZero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanelCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanelCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void NumerosDigitados(String numero){
        if(digitou == false){
            jTextFieldTexto.setText(numero);
            digitou = true;
        }else{
            String visor = jTextFieldTexto.getText();
            jTextFieldTexto.setText(visor + numero);
        }
    }
    
    private void OperacaoEscolhida(int operacaoDesejada){
        if(digitou == true){
            NumeroDigitado = Double.parseDouble(jTextFieldTexto.getText());
            
            if(operacao != 0){
                
                if(operacao != operacaoDesejada){
                    PressionarIgual();
                }else{
                    switch(operacaoDesejada){
                        case 1://Adição
                            total = total + NumeroDigitado;
                            break;
                        case 2://Subtração 
                            total = total - NumeroDigitado;
                            break;
                        case 3://Multiplicação
                            total = total * NumeroDigitado;
                            break;
                        case 4://Divisão
                            total = total / NumeroDigitado;
                    }
                }
            }else{
                total = NumeroDigitado;
            }
            
            digitou = false;
        }
        operacao = operacaoDesejada;
        jTextFieldTexto.setText(Double.toString(total));
    }
    
    private void PressionarIgual(){
        switch(operacao){
            case 1://Adição
                if(digitou == true){
                    NumeroDigitado = Double.parseDouble(jTextFieldTexto.getText());
                    total = total + NumeroDigitado;
                    digitou = false;
                }else{
                    total = total + NumeroDigitado;
                }  
                break;
                
            case 2://Subtração
                if(digitou == true){
                  NumeroDigitado = Double.parseDouble(jTextFieldTexto.getText());
                  total = total - NumeroDigitado;
                  digitou = false;
                }else{
                    total = total - NumeroDigitado;
                }               
                break;
                
            case 3://multiplicação
                if(digitou == true){
                    NumeroDigitado = Double.parseDouble(jTextFieldTexto.getText());
                    total = total * NumeroDigitado;
                    digitou = false;
                }else{
                    total = total * NumeroDigitado;
                }
                break;
                
            case 4://Divisão
                if(digitou == true){
                    NumeroDigitado = Double.parseDouble(jTextFieldTexto.getText());
                    total = total / NumeroDigitado;
                    digitou = false;
                }else{
                    total = total / NumeroDigitado;
                }
                break;
        }
        jTextFieldTexto.setText(Double.toString(total));
    }
    
    private void jButtonOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOitoActionPerformed
        NumerosDigitados("8");
    }//GEN-LAST:event_jButtonOitoActionPerformed

    private void jButtonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCincoActionPerformed
        NumerosDigitados("5");
    }//GEN-LAST:event_jButtonCincoActionPerformed

    private void jButtonDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoisActionPerformed
        NumerosDigitados("2");
    }//GEN-LAST:event_jButtonDoisActionPerformed

    private void jButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomarActionPerformed
        OperacaoEscolhida(1);
    }//GEN-LAST:event_jButtonSomarActionPerformed

    private void jButtonVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVirgulaActionPerformed
        NumerosDigitados(".");
    }//GEN-LAST:event_jButtonVirgulaActionPerformed

    private void jButtonSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeteActionPerformed
        NumerosDigitados("7");
    }//GEN-LAST:event_jButtonSeteActionPerformed

    private void jButtonNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoveActionPerformed
        NumerosDigitados("9");
    }//GEN-LAST:event_jButtonNoveActionPerformed

    private void jButtonQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuatroActionPerformed
        NumerosDigitados("4");
    }//GEN-LAST:event_jButtonQuatroActionPerformed

    private void jButtonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeisActionPerformed
        NumerosDigitados("6");
    }//GEN-LAST:event_jButtonSeisActionPerformed

    private void jButtonUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUmActionPerformed
        NumerosDigitados("1");
    }//GEN-LAST:event_jButtonUmActionPerformed

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTresActionPerformed
        NumerosDigitados("3");
    }//GEN-LAST:event_jButtonTresActionPerformed

    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZeroActionPerformed
        NumerosDigitados("0");
    }//GEN-LAST:event_jButtonZeroActionPerformed

    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
        OperacaoEscolhida(2);
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        OperacaoEscolhida(3);
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
        OperacaoEscolhida(4);
    }//GEN-LAST:event_jButtonDividirActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        PressionarIgual();
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldTexto.setText("0");
        total = 0;
        digitou = false;
        operacao = 0;
    }//GEN-LAST:event_jButtonLimparActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonDois;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonNove;
    private javax.swing.JButton jButtonOito;
    private javax.swing.JButton jButtonQuatro;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSete;
    private javax.swing.JButton jButtonSomar;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUm;
    private javax.swing.JButton jButtonVirgula;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCalculadora;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JTextField jTextFieldTexto;
    // End of variables declaration//GEN-END:variables
}
