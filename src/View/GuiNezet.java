package View;

import javax.swing.JOptionPane;

public abstract class GuiNezet extends javax.swing.JFrame {
    public GuiNezet() {
        initComponents();
    }
    public abstract void megjelenit(String uzenet);
    public abstract int bekeres(); 
    public abstract boolean dontes(); 
    public abstract void reset(); 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlAjtok = new javax.swing.JPanel();
        btnAjto1 = new javax.swing.JButton();
        btnAjto3 = new javax.swing.JButton();
        btnAjto2 = new javax.swing.JButton();
        pnlVisszajelzes = new javax.swing.JPanel();
        txtaVisszajelzes = new javax.swing.JTextField();
        pnlAllapotok = new javax.swing.JPanel();
        lblAjto1Allapot = new javax.swing.JLabel();
        lblAjto2Allapot = new javax.swing.JLabel();
        lblAjto3Allapot = new javax.swing.JLabel();
        pnlDontesValtoztat = new javax.swing.JPanel();
        rbtnEredeti = new javax.swing.JRadioButton();
        rbtnValasztUjat = new javax.swing.JRadioButton();
        pnlElsoValasztasom = new javax.swing.JPanel();
        lblEredetiValaszt = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuKilepes = new javax.swing.JMenuItem();
        mnuUjJatek = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajtós Nyeremény Vetélkedő");

        pnlAjtok.setBorder(javax.swing.BorderFactory.createTitledBorder("Válaszd ki a nyerő ajót!"));

        btnAjto1.setText("1.ajtó");

        btnAjto3.setText("3.ajtó");

        btnAjto2.setText("2.ajtó");

        javax.swing.GroupLayout pnlAjtokLayout = new javax.swing.GroupLayout(pnlAjtok);
        pnlAjtok.setLayout(pnlAjtokLayout);
        pnlAjtokLayout.setHorizontalGroup(
            pnlAjtokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAjtokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAjto1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAjto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAjto3)
                .addContainerGap())
        );

        pnlAjtokLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAjto1, btnAjto2, btnAjto3});

        pnlAjtokLayout.setVerticalGroup(
            pnlAjtokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAjtokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAjtokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAjto2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(btnAjto3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlAjtokLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAjto1, btnAjto2, btnAjto3});

        pnlVisszajelzes.setBorder(javax.swing.BorderFactory.createTitledBorder("Visszajelzés"));

        txtaVisszajelzes.setEditable(false);
        txtaVisszajelzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaVisszajelzesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlVisszajelzesLayout = new javax.swing.GroupLayout(pnlVisszajelzes);
        pnlVisszajelzes.setLayout(pnlVisszajelzesLayout);
        pnlVisszajelzesLayout.setHorizontalGroup(
            pnlVisszajelzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisszajelzesLayout.createSequentialGroup()
                .addComponent(txtaVisszajelzes, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlVisszajelzesLayout.setVerticalGroup(
            pnlVisszajelzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisszajelzesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtaVisszajelzes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAllapotok.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajtók állapota"));

        lblAjto1Allapot.setText("Zárva");

        lblAjto2Allapot.setText("Zárva");

        lblAjto3Allapot.setText("Zárva");

        javax.swing.GroupLayout pnlAllapotokLayout = new javax.swing.GroupLayout(pnlAllapotok);
        pnlAllapotok.setLayout(pnlAllapotokLayout);
        pnlAllapotokLayout.setHorizontalGroup(
            pnlAllapotokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAllapotokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAjto1Allapot, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAjto2Allapot, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblAjto3Allapot, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlAllapotokLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAjto1Allapot, lblAjto2Allapot, lblAjto3Allapot});

        pnlAllapotokLayout.setVerticalGroup(
            pnlAllapotokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAllapotokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAllapotokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAjto1Allapot)
                    .addComponent(lblAjto2Allapot)
                    .addComponent(lblAjto3Allapot))
                .addContainerGap())
        );

        pnlAllapotokLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAjto1Allapot, lblAjto2Allapot, lblAjto3Allapot});

        pnlDontesValtoztat.setBorder(javax.swing.BorderFactory.createTitledBorder("Megváltoztatod a döntésed?"));

        rbtnEredeti.setText("Maradok az eredetinél");

        rbtnValasztUjat.setText("Másikat választok");

        pnlElsoValasztasom.setBorder(javax.swing.BorderFactory.createTitledBorder("Az eredeti választásom"));

        lblEredetiValaszt.setText("x. ajtó");

        javax.swing.GroupLayout pnlElsoValasztasomLayout = new javax.swing.GroupLayout(pnlElsoValasztasom);
        pnlElsoValasztasom.setLayout(pnlElsoValasztasomLayout);
        pnlElsoValasztasomLayout.setHorizontalGroup(
            pnlElsoValasztasomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlElsoValasztasomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEredetiValaszt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlElsoValasztasomLayout.setVerticalGroup(
            pnlElsoValasztasomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlElsoValasztasomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEredetiValaszt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlDontesValtoztatLayout = new javax.swing.GroupLayout(pnlDontesValtoztat);
        pnlDontesValtoztat.setLayout(pnlDontesValtoztatLayout);
        pnlDontesValtoztatLayout.setHorizontalGroup(
            pnlDontesValtoztatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDontesValtoztatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDontesValtoztatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnEredeti)
                    .addComponent(rbtnValasztUjat))
                .addGap(18, 18, 18)
                .addComponent(pnlElsoValasztasom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDontesValtoztatLayout.setVerticalGroup(
            pnlDontesValtoztatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDontesValtoztatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDontesValtoztatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlElsoValasztasom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDontesValtoztatLayout.createSequentialGroup()
                        .addComponent(rbtnEredeti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnValasztUjat)))
                .addContainerGap())
        );

        jMenu1.setText("Menü");

        mnuKilepes.setText("Kilépés");
        jMenu1.add(mnuKilepes);

        mnuUjJatek.setText("Új játék");
        jMenu1.add(mnuUjJatek);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pnlAjtok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlVisszajelzes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAllapotok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDontesValtoztat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pnlAjtok, pnlAllapotok, pnlDontesValtoztat, pnlVisszajelzes});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAjtok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAllapotok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDontesValtoztat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlVisszajelzes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtaVisszajelzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaVisszajelzesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaVisszajelzesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjto1;
    private javax.swing.JButton btnAjto2;
    private javax.swing.JButton btnAjto3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAjto1Allapot;
    private javax.swing.JLabel lblAjto2Allapot;
    private javax.swing.JLabel lblAjto3Allapot;
    private javax.swing.JLabel lblEredetiValaszt;
    private javax.swing.JMenuItem mnuKilepes;
    private javax.swing.JMenuItem mnuUjJatek;
    private javax.swing.JPanel pnlAjtok;
    private javax.swing.JPanel pnlAllapotok;
    private javax.swing.JPanel pnlDontesValtoztat;
    private javax.swing.JPanel pnlElsoValasztasom;
    private javax.swing.JPanel pnlVisszajelzes;
    private javax.swing.JRadioButton rbtnEredeti;
    private javax.swing.JRadioButton rbtnValasztUjat;
    private javax.swing.JTextField txtaVisszajelzes;
    // End of variables declaration//GEN-END:variables

}
