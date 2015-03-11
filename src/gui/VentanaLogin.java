package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SpringLayout;
import java.awt.Cursor;
import java.awt.Component;
import javax.swing.ImageIcon;

public class VentanaLogin extends JFrame {
	private JPanel panelBotones;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JPanel panelDatos;
	private JTextField textFieldUsuario;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JPanel panelTitulo;
	private JLabel lblLogin;
	private JPasswordField passwordField;
	private SpringLayout sl_panelDatos;
	private JLabel lblRegistrarme;
	private JButton btnRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaLogin() {
		initialize();
	}
	private void initialize() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPanelBotones(), BorderLayout.SOUTH);
		getContentPane().add(getPanelDatos(), BorderLayout.CENTER);
		getContentPane().add(getPanelTitulo(), BorderLayout.NORTH);
	}
	private JPanel getPanelBotones() {
		if (panelBotones == null) {
			panelBotones = new JPanel();
			panelBotones.add(getBtnRegistro());
			panelBotones.add(getBtnAceptar());
			panelBotones.add(getBtnCancelar());
		}
		return panelBotones;
	}
	private JButton getBtnAceptar() {
		if (btnAceptar == null) {
			btnAceptar = new JButton("Aceptar");
		}
		return btnAceptar;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}
		return btnCancelar;
	}
	private JPanel getPanelDatos() {
		if (panelDatos == null) {
			panelDatos = new JPanel();
			sl_panelDatos = new SpringLayout();
			panelDatos.setLayout(sl_panelDatos);
			panelDatos.add(getLabelUsuario());
			panelDatos.add(getTextField_1());
			panelDatos.add(getLblContrasea());
			panelDatos.add(getPasswordField());
			panelDatos.add(getLblRegistrarme());
		}
		return panelDatos;
	}
	private JTextField getTextField_1() {
		if (textFieldUsuario == null) {
			textFieldUsuario = new JTextField();
			sl_panelDatos.putConstraint(SpringLayout.NORTH, textFieldUsuario, 60, SpringLayout.NORTH, getPanelDatos());
			sl_panelDatos.putConstraint(SpringLayout.WEST, textFieldUsuario, 230, SpringLayout.WEST, getPanelDatos());
			textFieldUsuario.setColumns(10);
		}
		return textFieldUsuario;
	}
	private JLabel getLabelUsuario() {
		if (lblUsuario == null) {
			lblUsuario = new JLabel("Usuario:");
			sl_panelDatos.putConstraint(SpringLayout.NORTH, lblUsuario, 66, SpringLayout.NORTH, getPanelDatos());
			sl_panelDatos.putConstraint(SpringLayout.WEST, lblUsuario, 131, SpringLayout.WEST, getPanelDatos());
		}
		return lblUsuario;
	}
	private JLabel getLblContrasea() {
		if (lblContrasea == null) {
			lblContrasea = new JLabel("Contraseña:");
			sl_panelDatos.putConstraint(SpringLayout.NORTH, lblContrasea, 99, SpringLayout.NORTH, getPanelDatos());
			sl_panelDatos.putConstraint(SpringLayout.WEST, lblContrasea, 120, SpringLayout.WEST, getPanelDatos());
		}
		return lblContrasea;
	}
	private JPanel getPanelTitulo() {
		if (panelTitulo == null) {
			panelTitulo = new JPanel();
			panelTitulo.add(getLblLogin());
		}
		return panelTitulo;
	}
	private JLabel getLblLogin() {
		if (lblLogin == null) {
			lblLogin = new JLabel("LOGIN");
			lblLogin.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		}
		return lblLogin;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			sl_panelDatos.putConstraint(SpringLayout.NORTH, passwordField, 93, SpringLayout.NORTH, getPanelDatos());
			sl_panelDatos.putConstraint(SpringLayout.WEST, passwordField, 230, SpringLayout.WEST, getPanelDatos());
			sl_panelDatos.putConstraint(SpringLayout.EAST, passwordField, 364, SpringLayout.WEST, getPanelDatos());
		}
		return passwordField;
	}
	private JLabel getLblRegistrarme() {
		if (lblRegistrarme == null) {
			lblRegistrarme = new JLabel("");
			lblRegistrarme.setIcon(new ImageIcon("/Users/mariopalacios/Downloads/image1.png"));
			lblRegistrarme.setToolTipText("Realizar registro para poder jugar");
			lblRegistrarme.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			sl_panelDatos.putConstraint(SpringLayout.NORTH, lblRegistrarme, 6, SpringLayout.SOUTH, getPasswordField());
			sl_panelDatos.putConstraint(SpringLayout.WEST, lblRegistrarme, 10, SpringLayout.WEST, getPasswordField());
		}
		return lblRegistrarme;
	}
	private JButton getBtnRegistro() {
		if (btnRegistro == null) {
			btnRegistro = new JButton("Registro");
		}
		return btnRegistro;
	}
}
