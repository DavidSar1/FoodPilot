/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorMesero;
import Controlador.ControladorPedido;
import Controlador.ControladorUsers;
import Modelo.ListaPedido;
import Modelo.Mesa;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import Modelo.Pedido;

/**
 *
 * @author oscar
 */
public final class EditarPedido extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();
    DefaultTableModel editT = new DefaultTableModel();
    ControladorPedido cp = new ControladorPedido();
    EditarPedido ed;
    private boolean primeraEjecucion = true;
    float suma;
    float poder;
    static float f;
    private boolean textoSuma = true;
    Pedido pedidoActual;
    String posicion;
    private Timer timer;
    int contador = 0;
    
    /**
     * Creates new form EditarPedido
     */
    public EditarPedido() {
        initComponents();
        
        cp.setEditPedido(this);
        asignarTiempo();
        tablaProductoEdit.setModel(dtm);
      
        dtm.addColumn("Producto");
        dtm.addColumn("Precio");
        dtm.addColumn("Estado");
        dtm.addColumn("Descripción");
        cp.ListarProductosEdit();
        
        tablaEd.setModel(editT);
        editT.addColumn("Producto");
        editT.addColumn("Cantidad");
        editT.addColumn("Precio");
        btnIngre.setEnabled(false);
        guardarEditar.setEnabled(false);
        
        /*if(tiempoPedido.getText().equals("Entregado!"))
        {
            jButton1.setEnabled(false);
            btnIngre.setEnabled(false);
            btnMenos1.setEnabled(false);
            guardarEditar.setEnabled(false);
        }*/
        

    }
    
    
    public void asignarTiempo(){
        posicion = String.valueOf(Modelo.numerosStaticos.editarPedido);
        for(int q = 0; q < Modelo.Arrays.pedidosHechos.size();q++){
            if(Modelo.Arrays.pedidosHechos.get(q).getIndex().equals(posicion)){
                pedidoActual = Modelo.Arrays.pedidosHechos.get(q);
                System.out.println(Modelo.numerosStaticos.editarPedido);
                if (pedidoActual.getIndex().equals(posicion)) {
                    // Iniciar un temporizador para actualizar el tiempo en el JLabel cada segundo
                    timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Actualizar la interfaz con el tiempo transcurrido
                            actualizarTiempoLabel();
                            getBtn();
                            if(getBtn().getText().equals("Entregado!"))
                            {
                               Modelo.Arrays.listp.get(Integer.parseInt(posicion)-1).setEstado("Entregado");
                               int posicionMesa = Modelo.Arrays.mesaOcupadas.get(Integer.parseInt(posicion)-1);
                               Modelo.Arrays.mesa_meseros.get(posicionMesa).setEstado("Libre");
                               
                               jButton1.setEnabled(false);
                               btnIngre.setEnabled(false);
                               btnMenos1.setEnabled(false);
                               timer.stop();
                            } 
                            
                        }
                    });
                    timer.setRepeats(true);
                    timer.start();
                } else {
                    // Manejar la situación en la que el pedidoActual es nulo
                    System.out.println("Pedido no encontrado");
                }
            } else {
                System.out.println("Aqui no fue ptm");
            }
        }
  
    }
    
    
    public void actualizarTiempoLabel() {
        SwingUtilities.invokeLater(() -> {
            tiempoPedido.setText(pedidoActual.getTiempoTranscurridoFormateado());
            /*getBtn();
            if(getBtn().getText().equals("Entregado!"))
            {
               //Modelo.Arrays.listp.get(Modelo.numerosStaticos.editarPedido).setEstado("Entregado");
               JOptionPane.showMessageDialog(null,"Ya puto");
               //timer.stop();
            }*/   
        });
    }
    
    public void totalInicial( float tot)
    {  
        getTotal().setText(Float.toString(tot));    
    }
    
    //tabla productos
    public void limpiarTablaEdit(){
        dtm.getDataVector().removeAllElements();
        
    }
    public void totalpedidoeditar(String texto)
    {
        //suma = Float.parseFloat(totaleditar.getText()) + Float.parseFloat(texto);
        suma = Float.parseFloat(texto);
    }
   
    public void agregarFila(String datos[])
    {
        dtm.addRow(datos);
        
    }
    public void agregarFilaEditar(String datos[])
    {
        editT.addRow(datos); 
    }
    //tabla pedidos
    public void limpiarTablaEditar(){
        editT.getDataVector().removeAllElements();
        
    }
    
    public void setTotalPedidoEdit(String texto)
    {
        totaleditar.setText(texto);
    }
    
    public void table3(){
        cp.editaPedido(Modelo.numerosStaticos.editarPedido);
    }
    
    public JLabel getBtn()
    {
        return tiempoPedido;
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductoEdit = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEd = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        totaleditar = new javax.swing.JLabel();
        btnMenos1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        JTselected = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnIngre = new javax.swing.JButton();
        cant = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        btnMas = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        guardarEditar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tiempoPedido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(5, 59, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Editar Pedido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Productos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel4.setOpaque(false);

        tablaProductoEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio", "Estado", "Descripcion"
            }
        ));
        jScrollPane2.setViewportView(tablaProductoEdit);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Pedido", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel5.setOpaque(false);

        tablaEd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaEd);

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("TOTAL");

        totaleditar.setForeground(new java.awt.Color(51, 51, 51));
        totaleditar.setText("0");

        btnMenos1.setBackground(new java.awt.Color(255, 51, 51));
        btnMenos1.setText("Eliminar");
        btnMenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totaleditar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnMenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totaleditar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "Opciones", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel6.setOpaque(false);

        JTselected.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Producto");

        btnIngre.setBackground(new java.awt.Color(0, 153, 255));
        btnIngre.setForeground(new java.awt.Color(255, 255, 255));
        btnIngre.setText("Ingresar");
        btnIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngreActionPerformed(evt);
            }
        });

        cant.setText("Cantidad");

        cantidad.setEditable(false);
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setText("1");

        btnMas.setBackground(new java.awt.Color(0, 153, 255));
        btnMas.setForeground(new java.awt.Color(255, 255, 255));
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(255, 51, 51));
        btnMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTselected)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(cant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnIngre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTselected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        guardarEditar.setBackground(new java.awt.Color(0, 153, 255));
        guardarEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guardarEditar.setText("Guardar");
        guardarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEditarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tiempo de entrega");

        tiempoPedido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tiempoPedido.setForeground(new java.awt.Color(51, 51, 51));
        tiempoPedido.setText("00:00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tiempoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tiempoPedido))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        // TODO add your handling code here:
        String cantstr = getCant().getText();
        int cant = Integer.parseInt(cantstr);
        cant += 1;

        getCant().setText(String.valueOf(cant));
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // TODO add your handling code here:
        String cantstr = getCant().getText();
        int cant = Integer.parseInt(cantstr);

        if(cant <= 1)
        {
            return;
        }

        cant -= 1;

        getCant().setText(String.valueOf(cant));
    }//GEN-LAST:event_btnMenosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            int fila = tablaProductoEdit.getSelectedRow();
            String producto  = tablaProductoEdit.getValueAt(fila, 0).toString();
            JTselected.setText(producto);
            btnIngre.setEnabled(true);
            
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"No seleccionó ningun valor");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngreActionPerformed
        // TODO add your handling code here:
        try
        {     
            int fila = tablaProductoEdit.getSelectedRow();
            String producto = tablaProductoEdit.getValueAt(fila, 2).toString();
            if(producto.equals("INACTIVO"))
            {
                JOptionPane.showMessageDialog(null,"Producto no disponible");
                return;
            }
            cp.editPed();
            
            if(textoSuma)
            {
                f = Float.parseFloat(getTotal().getText());
                System.out.println(getTotal().getText());
                textoSuma = false;
            }
            if(primeraEjecucion)
            {
                
                poder = f + suma;
                //getTotal().setText(String.valueOf(poder));
                getTotal().setText(String.valueOf(poder));
                primeraEjecucion = false;
            }
            else
            {
                
                float p = Float.parseFloat(getTotal().getText());
                suma += f;
                getTotal().setText(String.valueOf(suma));
                
            }
            
            
            btnSalir.setEnabled(false); 
            guardarEditar.setEnabled(true);

        }
        catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"No seleccionó ningun valor");
        }
    }//GEN-LAST:event_btnIngreActionPerformed

    private void btnMenos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenos1ActionPerformed
        // TODO add your handling code here:
        try
        {
            int fila = tablaEd.getSelectedRow();
            String columna = tablaEd.getValueAt(fila, 0).toString();
            cp.eliminarPructoPedido(fila);
            cp.actualziarTotalPed();
            cp.actualziarTotalEdit();
            editT.removeRow( fila);
            btnSalir.setEnabled(false);
            guardarEditar.setEnabled(true);
            
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"No seleccionó ningun valor");
        }
    }//GEN-LAST:event_btnMenos1ActionPerformed

    private void guardarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEditarActionPerformed
        // TODO add your handling code here:
        table3();
        this.dispose();
        
        
    }//GEN-LAST:event_guardarEditarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

        
    
    
    public JTextField getCant()
    {
        return cantidad;
    }
    
    public JTextField getSelect()
    {
        return JTselected;
    }
    
    public JLabel getTotal()
    {
        return totaleditar;
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
            java.util.logging.Logger.getLogger(EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTselected;
    private javax.swing.JButton btnIngre;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMenos1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel cant;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton guardarEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEd;
    private javax.swing.JTable tablaProductoEdit;
    public javax.swing.JLabel tiempoPedido;
    private javax.swing.JLabel totaleditar;
    // End of variables declaration//GEN-END:variables
}
