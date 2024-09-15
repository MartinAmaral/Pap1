package com.mycompany.pap1.presentacion;

import com.mycompany.pap1.interfaces.IControladorDonacion;
import com.mycompany.pap1.logica.ControladorDistribucion;
import com.mycompany.pap1.logica.EstadoDistribucion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarDistribucion extends JInternalFrame {

    private JTextField txtEmailBeneficiario;
    private JTextField txtIdDonacion;
    private JTextField txtFechaPreparacion;
    private JTextField txtFechaEntrega;
    private JComboBox<EstadoDistribucion> comboEstadoDistribucion;
    private JButton btnAgregar;
    private JButton btnLimpiar;
    
    private IControladorDonacion controlador;


    // Constructor con controlador como parámetro
    public AgregarDistribucion(IControladorDonacion controlador) {
        setTitle("Agregar Distribución");
        setSize(400, 300);
        setClosable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        this.controlador = controlador; // Inicializa el campo controlador
        
        // Panel principal
        JPanel panelPrincipal = new JPanel(new GridLayout(6, 2, 10, 10));
        
        // Campos del formulario
        JLabel lblEmailBeneficiario = new JLabel("Email del Beneficiario:");
        txtEmailBeneficiario = new JTextField();
        panelPrincipal.add(lblEmailBeneficiario);
        panelPrincipal.add(txtEmailBeneficiario);

        JLabel lblIdDonacion = new JLabel("ID de la Donación:");
        txtIdDonacion = new JTextField();
        panelPrincipal.add(lblIdDonacion);
        panelPrincipal.add(txtIdDonacion);

        JLabel lblFechaPreparacion = new JLabel("Fecha de Preparación (YYYY-MM-DD):");
        txtFechaPreparacion = new JTextField();
        panelPrincipal.add(lblFechaPreparacion);
        panelPrincipal.add(txtFechaPreparacion);

        JLabel lblFechaEntrega = new JLabel("Fecha de Entrega (YYYY-MM-DD):");
        txtFechaEntrega = new JTextField();
        panelPrincipal.add(lblFechaEntrega);
        panelPrincipal.add(txtFechaEntrega);

        JLabel lblEstadoDistribucion = new JLabel("Estado de Distribución:");
        comboEstadoDistribucion = new JComboBox<>(EstadoDistribucion.values());
        panelPrincipal.add(lblEstadoDistribucion);
        panelPrincipal.add(comboEstadoDistribucion);

        // Botones
        btnAgregar = new JButton("Agregar");
        btnLimpiar = new JButton("Limpiar");

        panelPrincipal.add(btnAgregar);
        panelPrincipal.add(btnLimpiar);

        add(panelPrincipal, BorderLayout.CENTER);

        // Acción para agregar distribución
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarDistribucion();
            }
        });

        // Acción para limpiar campos
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
    }

    AgregarDistribucion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Método para agregar la distribución
    private void agregarDistribucion() {
        try {
            String emailBeneficiario = txtEmailBeneficiario.getText();
            int idDonacion = Integer.parseInt(txtIdDonacion.getText());
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaPreparacion = LocalDate.parse(txtFechaPreparacion.getText(), formatter);
            LocalDate fechaEntrega = LocalDate.parse(txtFechaEntrega.getText(), formatter);
            
            EstadoDistribucion estadoDistribucion = (EstadoDistribucion) comboEstadoDistribucion.getSelectedItem();
            
            // Llama al controlador para crear la distribución
            controlador.crearDistribucion(fechaPreparacion, fechaEntrega, estadoDistribucion, emailBeneficiario, idDonacion);
            
            JOptionPane.showMessageDialog(this, "Distribución agregada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos(); // Limpia los campos después de agregar
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar distribución: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para limpiar los campos del formulario
    private void limpiarCampos() {
        txtEmailBeneficiario.setText("");
        txtIdDonacion.setText("");
        txtFechaPreparacion.setText("");
        txtFechaEntrega.setText("");
        comboEstadoDistribucion.setSelectedIndex(0);
    }
}
