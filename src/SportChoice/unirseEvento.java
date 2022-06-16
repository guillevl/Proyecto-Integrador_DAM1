package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class unirseEvento extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JLabel lbl_icon_sport, lblUnirseEvento, lblNombre, lblNombreEvento, lblFecha, lblFechaVariable, lblDeporte, lblDeporteVariable, lblParticipantes, lblParticipantesVariable, lblTipoEvento,
			lblTipoEventoVariable;
	private JPanel panelHeader;
	private JButton btnPerfil, btnUnirse, btnLogo, btnPerfil_1, btnFAQs;
	private JButton btnLogo_1;
	private JButton btnAtras;
	private String eventoSeleccionado;
	private JLabel lblLocalizacionVariable;
	private JTextPane txtAreaDescripcionVariable;

	public static void unirseEvento() {
		unirseEvento window = new unirseEvento();
		window.setVisible(true);
	}

	public unirseEvento() {
		initialize();
	}

	private void initialize() {
		getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setTitle("Sport Choice - Unirse a evento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contenedor.setLayout(null);

		btnUnirse = new JButton("UNIRSE");
		btnUnirse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUnirse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.unirseEvento(miModelo.getEventoSeleccionado());
				
			}
		});
		btnUnirse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUnirse.setBorder(null);
		btnUnirse.setForeground(Color.WHITE);
		btnUnirse.setBackground(new Color(53, 187, 95));
		btnUnirse.setBounds(671, 370, 120, 38);
		getContentPane().add(btnUnirse);

		lblUnirseEvento = new JLabel("UNIRSE EVENTO");
		lblUnirseEvento.setForeground(Color.WHITE);
		lblUnirseEvento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUnirseEvento.setBounds(71, 115, 225, 23);
		getContentPane().add(lblUnirseEvento);

		lblNombre = new JLabel("NOMBRE EVENTO:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(25, 159, 136, 23);
		getContentPane().add(lblNombre);

		lblNombreEvento = new JLabel("Partido Futbol ");
		lblNombreEvento.setForeground(Color.WHITE);
		lblNombreEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEvento.setBounds(171, 159, 125, 23);
		getContentPane().add(lblNombreEvento);

		lblFecha = new JLabel("FECHA:");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFecha.setBounds(25, 187, 125, 23);
		getContentPane().add(lblFecha);

		lblFechaVariable = new JLabel("25 / 05 / 2022");
		lblFechaVariable.setForeground(Color.WHITE);
		lblFechaVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaVariable.setBounds(171, 187, 125, 23);
		getContentPane().add(lblFechaVariable);

		lblDeporte = new JLabel("DEPORTE:");
		lblDeporte.setForeground(Color.WHITE);
		lblDeporte.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporte.setBounds(25, 256, 125, 23);
		getContentPane().add(lblDeporte);

		lblDeporteVariable = new JLabel("FUTBOL");
		lblDeporteVariable.setForeground(Color.WHITE);
		lblDeporteVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporteVariable.setBounds(171, 256, 125, 23);
		getContentPane().add(lblDeporteVariable);

		lblParticipantes = new JLabel("PARTICIPANTES");
		lblParticipantes.setForeground(Color.WHITE);
		lblParticipantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantes.setBounds(25, 222, 125, 23);
		getContentPane().add(lblParticipantes);

		lblParticipantesVariable = new JLabel("10/14");
		lblParticipantesVariable.setForeground(Color.WHITE);
		lblParticipantesVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantesVariable.setBounds(171, 221, 125, 23);
		getContentPane().add(lblParticipantesVariable);

		lblTipoEvento = new JLabel("TIPO EVENTO");
		lblTipoEvento.setForeground(Color.WHITE);
		lblTipoEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEvento.setBounds(349, 189, 125, 23);
		getContentPane().add(lblTipoEvento);

		lblTipoEventoVariable = new JLabel("PUBLICO");
		lblTipoEventoVariable.setForeground(Color.WHITE);
		lblTipoEventoVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEventoVariable.setBounds(463, 187, 125, 23);
		getContentPane().add(lblTipoEventoVariable);

		lbl_icon_sport = new JLabel("");
		lbl_icon_sport.setBounds(35, 305, 68, 72);
		getContentPane().add(lbl_icon_sport);
		lbl_icon_sport.setBackground(Color.WHITE);
		lbl_icon_sport.setToolTipText("");
		lbl_icon_sport.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_icon_sport.setMaximumSize(new Dimension(10, 10));
		lbl_icon_sport.setIconTextGap(2);
		lbl_icon_sport.setIcon(new ImageIcon(unirseEvento.class.getResource("/Imagenes/icons8-soccer-ball-100.png")));

		JLabel lblLocalizacion = new JLabel("LOCALIZACION:");
		lblLocalizacion.setForeground(Color.WHITE);
		lblLocalizacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacion.setBounds(349, 159, 125, 23);
		getContentPane().add(lblLocalizacion);

		lblLocalizacionVariable = new JLabel("C/ CRUZ DE MAYO, 8, Moralzarzal, Madrid, 28411");
		lblLocalizacionVariable.setForeground(Color.WHITE);
		lblLocalizacionVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacionVariable.setBounds(463, 159, 344, 23);
		getContentPane().add(lblLocalizacionVariable);

		JLabel lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcion.setBounds(349, 218, 112, 23);
		getContentPane().add(lblDescripcion);

		txtAreaDescripcionVariable = new JTextPane();
		txtAreaDescripcionVariable.setEditable(false);
		txtAreaDescripcionVariable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAreaDescripcionVariable.setText(
				"Organizamos un partido de futbol unos amigos y yo pero no somos suficientes. \r\nNecesitas llevar una botella de agua propia y dos camisetas, una roja y otra verde para poder cambiarnos y jugar todos con todos.\r\nLugar: Polideportivo de Moralzarzal, a las 17:30, el dia 25 de mayo\r\nAPUNTAROS!\r\n");
		txtAreaDescripcionVariable.setBounds(349, 242, 441, 118);
		getContentPane().add(txtAreaDescripcionVariable);

		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);

		btnLogo = new JButton("");
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(15, 10);
			}
		});
		btnLogo.setIcon(new ImageIcon(unirseEvento.class.getResource("/Imagenes/appppp-modified.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(718, 0, 99, 100);
		panelHeader.add(btnLogo);

		btnPerfil_1 = new JButton("PERFIL");
		btnPerfil_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPerfil_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(15, 10);
			}
		});
		btnPerfil_1.setToolTipText("");
		btnPerfil_1.setForeground(Color.WHITE);
		btnPerfil_1.setBorder(null);
		btnPerfil_1.setBackground((Color) null);
		btnPerfil_1.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil_1);

		btnFAQs = new JButton("FAQS");
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(15, 4);
			}
		});
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);

		btnLogo_1 = new JButton("");
		btnLogo_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(15, 11);
			}
		});
		btnLogo_1.setIcon(new ImageIcon(unirseEvento.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo_1.setBorder(null);
		btnLogo_1.setBackground((Color) null);
		btnLogo_1.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogo_1);

		btnAtras = new JButton("");
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.setBorder(null);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(15, 11);
			}
		});
		btnAtras.setBackground(null);
		btnAtras.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/arrow.png")));
		btnAtras.setBounds(10, 108, 56, 39);
		getContentPane().add(btnAtras);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				String datos[] = miModelo.cargarDatosEvento(miModelo.getEventoSeleccionado());
				lblNombreEvento.setText(datos[1]);
				lblFechaVariable.setText(datos[2]);
				lblParticipantesVariable.setText(datos[3]);
				lblDeporteVariable.setText(datos[4]);
				lblLocalizacionVariable.setText(datos[5]);
				lblTipoEventoVariable.setText(datos[6]);
				txtAreaDescripcionVariable.setText(datos[7]);
				switch (datos[4]) {
				case "Futbol":
					lbl_icon_sport.setIcon(new ImageIcon(unirseEvento.class.getResource("/Imagenes/icons8-soccer-ball-100.png")));
					break;
				case "Baloncesto":
					lbl_icon_sport.setIcon(new ImageIcon(unirseEvento.class.getResource("/Imagenes/basketball-free-icon-font (1).png")));
					break;
				case "Tenis":
					lbl_icon_sport.setIcon(null);
					break;
				default:
					break;
				}
			}
		});
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public JLabel getLblNombreEvento() {
		return lblNombreEvento;
	}

	public void setLblNombreEvento(JLabel lblNombreEvento) {
		this.lblNombreEvento = lblNombreEvento;
	}

	public JLabel getLblFechaVariable() {
		return lblFechaVariable;
	}

	public void setLblFechaVariable(JLabel lblFechaVariable) {
		this.lblFechaVariable = lblFechaVariable;
	}

	public JLabel getLblDeporteVariable() {
		return lblDeporteVariable;
	}

	public void setLblDeporteVariable(JLabel lblDeporteVariable) {
		this.lblDeporteVariable = lblDeporteVariable;
	}

	public JLabel getLblParticipantesVariable() {
		return lblParticipantesVariable;
	}

	public void setLblParticipantesVariable(JLabel lblParticipantesVariable) {
		this.lblParticipantesVariable = lblParticipantesVariable;
	}

	public JLabel getLblTipoEventoVariable() {
		return lblTipoEventoVariable;
	}

	public void setLblTipoEventoVariable(JLabel lblTipoEventoVariable) {
		this.lblTipoEventoVariable = lblTipoEventoVariable;
	}
}
