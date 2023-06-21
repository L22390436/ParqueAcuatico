import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class VentanaPaquete {

    JFrame ventana;
    JPanel panel;
    JRadioButton botonEntrada, botonBufet, botonEspectaculo, botonNadoDelfines;
    JRadioButton botonInteraccionSencilla, botonInteraccionExtra; // RadioButtons que se utilizarán dentro de un ButtonGroup
    JTextField cajaEntrada, cajaPrecioBufet, cajaPrecioEspectaculo, cajaPrecioNadoDelfines;
    JLabel etiquetaInstruccion, etiquetaInterracion;
    JComboBox<String> listaBufets, listaEspectaculo;
    ButtonGroup grupoBotonInteraccion;
    JButton botonCotizar;

    public VentanaPaquete() {
        // Creación básica de la ventana
        ventana = new JFrame("Compra de paquetes");
        ventana.setSize(480, 260);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Se crea un JPanel y se le añade a la ventana
        panel = new JPanel();
        panel.setLayout(null);

        ventana.add(panel);

        /* Aquí empieza la parte en la que se pedirán los datos. Están divididos por usos */
        // Solicitar las entradas al parque acuático
        etiquetaInstruccion = new JLabel("Seleccione los servicios:");

        etiquetaInstruccion.setBounds(2, 2, 150, 20);
        panel.add(etiquetaInstruccion);

        botonEntrada = new JRadioButton("Entrada");
        botonEntrada.setBounds(2, 22, 100, 20);
        panel.add(botonEntrada);

        cajaEntrada = new JTextField();
        cajaEntrada.setEnabled(false);
        cajaEntrada.setBounds(2, 42, 100, 20);
        panel.add(cajaEntrada);

        botonEntrada.addActionListener(new ActionListener() { // Verifica si el RadioButton de la entrada está activado
            @Override
            public void actionPerformed(ActionEvent e) {
                if (botonEntrada.isSelected()) {
                    cajaEntrada.setEnabled(true);
                }
                if (!botonEntrada.isSelected()) {
                    cajaEntrada.setEnabled(false);
                    cajaEntrada.setText("");
                }
            }
        });

        // Solicitar un bufet en el parque acuático
        botonBufet = new JRadioButton("Solicitar bufet");
        botonBufet.setBounds(2, 62, 110, 20);
        panel.add(botonBufet);

        cajaPrecioBufet = new JTextField();
        cajaPrecioBufet.setBounds(112,82,100,20);
        cajaPrecioBufet.setEnabled(false);
        panel.add(cajaPrecioBufet);

        String[] tiposBufets = {"Desayuno", "Almuerzo", "Cena", "Postres"};
        listaBufets = new JComboBox<>(tiposBufets);
        listaBufets.setBounds(2, 82, 100, 20);
        listaBufets.setEnabled(false);
        panel.add(listaBufets);

        botonBufet.addActionListener(new ActionListener() { // Verifica si el RadioButton del bufet está activado
            @Override
            public void actionPerformed(ActionEvent e) {
                if (botonBufet.isSelected()) {
                    listaBufets.setEnabled(true);
                    cajaPrecioBufet.setEnabled(true);
                }
                if (!botonBufet.isSelected()) {
                    listaBufets.setEnabled(false);
                    listaBufets.setSelectedIndex(0);
                    cajaPrecioBufet.setEnabled(false);
                    cajaPrecioBufet.setText("");
                }
            }
        });

        // Solicitar un evento nocturno en el parque acuático
        botonEspectaculo = new JRadioButton("Solicitar evento nocturno");
        botonEspectaculo.setBounds(2, 102, 170, 20);
        panel.add(botonEspectaculo);

        cajaPrecioEspectaculo = new JTextField();
        cajaPrecioEspectaculo.setBounds(112,122,100,20);
        cajaPrecioEspectaculo.setEnabled(false);
        panel.add(cajaPrecioEspectaculo);

        String[] lugarEspectaculo = {"General", "Balcón", "VIP"};
        listaEspectaculo = new JComboBox<>(lugarEspectaculo);
        listaEspectaculo.setBounds(2, 122, 100, 20);
        listaEspectaculo.setEnabled(false);
        panel.add(listaEspectaculo);

        botonEspectaculo.addActionListener(new ActionListener() { // Verifica si el RadioButton del espectáculo está activado
            @Override
            public void actionPerformed(ActionEvent e) {
                if (botonEspectaculo.isSelected()) {
                    listaEspectaculo.setEnabled(true);
                    cajaPrecioEspectaculo.setEnabled(true);
                }
                if (!botonEspectaculo.isSelected()) {
                    listaEspectaculo.setEnabled(false);
                    listaEspectaculo.setSelectedIndex(0);
                    cajaPrecioEspectaculo.setEnabled(false);
                    cajaPrecioEspectaculo.setText("");
                }
            }
        });

        // Solicitar el nado con delfines en el parque acuático
        botonNadoDelfines = new JRadioButton("Nado con delfines");
        botonNadoDelfines.setBounds(2,142,130,20);
        panel.add(botonNadoDelfines);

        cajaPrecioNadoDelfines = new JTextField();
        cajaPrecioNadoDelfines.setBounds(342,162,100,20);
        cajaPrecioNadoDelfines.setEnabled(false);
        panel.add(cajaPrecioNadoDelfines);

        etiquetaInterracion = new JLabel("Tipo de interacción:");
        etiquetaInterracion.setBounds(2, 162,120,20);
        panel.add(etiquetaInterracion);

        grupoBotonInteraccion = new ButtonGroup(); // Creamos el ButtonGroup que tendrá los tipos de interacción

        botonInteraccionSencilla = new JRadioButton("Sencilla");
        botonInteraccionSencilla.setBounds(122,162,100,20);
        botonInteraccionSencilla.setEnabled(false);
        panel.add(botonInteraccionSencilla);

        botonInteraccionExtra = new JRadioButton("Extra");
        botonInteraccionExtra.setBounds(222, 162,100,20);
        botonInteraccionExtra.setEnabled(false);
        panel.add(botonInteraccionExtra);

        grupoBotonInteraccion.add(botonInteraccionSencilla);
        grupoBotonInteraccion.add(botonInteraccionExtra);

        botonNadoDelfines.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(botonNadoDelfines.isSelected()){
                    botonInteraccionSencilla.setSelected(true);
                    botonInteraccionSencilla.setEnabled(true);
                    botonInteraccionExtra.setEnabled(true);
                    cajaPrecioNadoDelfines.setEnabled(true);
                }
                if(!botonNadoDelfines.isSelected()){
                    botonInteraccionSencilla.setEnabled(false);
                    botonInteraccionExtra.setEnabled(false);
                    cajaPrecioNadoDelfines.setEnabled(false);
                    cajaPrecioNadoDelfines.setText("");
                }
            }
        });

        // Por último, creamos el botón que nos permitirá registrar la compra
        botonCotizar = new JButton("Registrar compra");

        botonCotizar.setBounds(2, 192,460,20);
        panel.add(botonCotizar);

        botonCotizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Compra crearCompra = new Compra();

                double precioFinalEntrada, precioFinalBufet, precioFinalEspectaculo, precioFinalNadoDelfines;
                String tipoFinalBufet, lugarFinalEspectaculo, tipoFinalInteraccion;

                if(botonEntrada.isSelected() && !botonBufet.isSelected() && !botonEspectaculo.isSelected() &&
                !botonNadoDelfines.isSelected()){
                        try{
                            precioFinalEntrada = Double.parseDouble(cajaEntrada.getText());
                            crearCompra.setPrecioEntrada(precioFinalEntrada);

                            crearCompra.CalcularTotal(crearCompra.getPrecioEntrada());
                            JOptionPane.showMessageDialog(null,"El precio total es de "+crearCompra.getPrecioTotal()+
                                    " pesos.", "Compra exitosa", JOptionPane.INFORMATION_MESSAGE);
                        } catch (NumberFormatException invalido){
                            JOptionPane.showMessageDialog(null,"Los datos son inválidos. Compruébelos.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                } else if(botonEntrada.isSelected() && botonBufet.isSelected() && !botonEspectaculo.isSelected() &&
                        !botonNadoDelfines.isSelected()){
                    try {
                        precioFinalEntrada = Double.parseDouble(cajaEntrada.getText());
                        tipoFinalBufet = String.valueOf(listaBufets.getSelectedItem());
                        precioFinalBufet = Double.parseDouble(cajaPrecioBufet.getText());

                        crearCompra.setPrecioEntrada(precioFinalEntrada);
                        crearCompra.setTipoBufet(tipoFinalBufet);
                        crearCompra.setPrecioBufet(precioFinalBufet);

                        crearCompra.CalcularTotal(precioFinalEntrada, tipoFinalBufet, precioFinalBufet);

                        JOptionPane.showMessageDialog(null, "El precio total es de " +crearCompra.getPrecioTotal()+
                                "\nEl bufet que se ha escogido es el de tipo "+crearCompra.getTipoBufet(), "Compra exitosa", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException invalido){
                        JOptionPane.showMessageDialog(null,"Los datos son inválidos. Compruébelos.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else if(botonEntrada.isSelected() && botonBufet.isSelected() && botonEspectaculo.isSelected() &&
                        !botonNadoDelfines.isSelected()){
                    try {
                        precioFinalEntrada = Double.parseDouble(cajaEntrada.getText());
                        tipoFinalBufet = String.valueOf(listaBufets.getSelectedItem());
                        precioFinalBufet = Double.parseDouble(cajaPrecioBufet.getText());
                        lugarFinalEspectaculo = String.valueOf(listaEspectaculo.getSelectedItem());
                        precioFinalEspectaculo = Double.parseDouble(cajaPrecioEspectaculo.getText());

                        crearCompra.setPrecioEntrada(precioFinalEntrada);
                        crearCompra.setTipoBufet(tipoFinalBufet);
                        crearCompra.setPrecioBufet(precioFinalBufet);
                        crearCompra.setLugarEspectaculo(lugarFinalEspectaculo);
                        crearCompra.setPrecioEspectaculo(precioFinalEspectaculo);

                        crearCompra.CalcularTotal(precioFinalEntrada, tipoFinalBufet, precioFinalBufet, lugarFinalEspectaculo, precioFinalEspectaculo);

                        JOptionPane.showMessageDialog(null, "El precio total es de " +crearCompra.getPrecioTotal()+
                                "\nEl bufet que se ha escogido es el de tipo "+crearCompra.getTipoBufet()+
                                "\nEl lugar del espectáculo es en "+crearCompra.getLugarEspectaculo(), "Compra exitosa", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException invalido){
                        JOptionPane.showMessageDialog(null,"Los datos son inválidos. Compruébelos.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else if(botonEntrada.isSelected() && botonBufet.isSelected() && botonEspectaculo.isSelected() &&
                        botonNadoDelfines.isSelected()){
                    tipoFinalInteraccion = "Sencilla";
                    try {
                        precioFinalEntrada = Double.parseDouble(cajaEntrada.getText());
                        tipoFinalBufet = String.valueOf(listaBufets.getSelectedItem());
                        precioFinalBufet = Double.parseDouble(cajaPrecioBufet.getText());
                        lugarFinalEspectaculo = String.valueOf(listaEspectaculo.getSelectedItem());
                        precioFinalEspectaculo = Double.parseDouble(cajaPrecioEspectaculo.getText());

                        if(botonInteraccionSencilla.isSelected()){
                            tipoFinalInteraccion = "Sencilla";
                        } else if(botonInteraccionExtra.isSelected()){
                            tipoFinalInteraccion = "Extra";
                        }

                        precioFinalNadoDelfines = Double.parseDouble(cajaPrecioNadoDelfines.getText());

                        crearCompra.setPrecioEntrada(precioFinalEntrada);
                        crearCompra.setTipoBufet(tipoFinalBufet);
                        crearCompra.setPrecioBufet(precioFinalBufet);
                        crearCompra.setLugarEspectaculo(lugarFinalEspectaculo);
                        crearCompra.setPrecioEspectaculo(precioFinalEspectaculo);
                        crearCompra.setTipoInteraccion(tipoFinalInteraccion);
                        crearCompra.setPrecioNadoDelfines(precioFinalNadoDelfines);

                        crearCompra.CalcularTotal(precioFinalEntrada, tipoFinalBufet, precioFinalBufet,
                                lugarFinalEspectaculo, precioFinalEspectaculo, tipoFinalInteraccion, precioFinalNadoDelfines);

                        JOptionPane.showMessageDialog(null, "El precio total es de " +crearCompra.getPrecioTotal()+
                                "\nEl bufet que se ha escogido es el de tipo "+crearCompra.getTipoBufet()+
                                "\nEl lugar del espectáculo es en "+crearCompra.getLugarEspectaculo()+
                                "\nSu tipo de interacción con los delfines será "+crearCompra.getTipoInteraccion(),
                                "Compra exitosa", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException invalido){
                        JOptionPane.showMessageDialog(null,"Los datos son inválidos. Compruébelos.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione algún paquete disponible." +
                                    "\nPaquete 1: Entrada.\nPaquete 2: Entrada y Bufet.\nPaquete 3: Entrada, bufet y espectáculo." +
                                    "\nPaquete 4: Entrada, bufet, espectáculo y nado con delfines.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Hacer visible la ventana con todos sus componentes
        ventana.setVisible(true);
    }
}
