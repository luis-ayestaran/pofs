package com.mexicacode.puntoventa.views;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.mexicacode.puntoventa.configuration.SystemMessages;
import com.mexicacode.puntoventa.exceptions.ToolkitException;
import com.mexicacode.puntoventa.mainapp.PointOfSale;
import com.mexicacode.puntoventa.pojos.User;
import com.mexicacode.puntoventa.services.AuthenticationService;
import com.mexicacode.puntoventa.utils.Toolkit;


public class Login extends JFrame{
	
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	private PointOfSale pofs;

	public Login(PointOfSale pofs) {
		this.pofs = pofs;
		try {
			this.setTitle(SystemMessages.getMessage("system.appname"));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setVisible(true);
		//this.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Images/LOGO.png")));
		this.setResizable(false);
		this.setBounds(100, 100, 600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		this.getContentPane().setLayout(springLayout); 
		
		JPanel Background = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, Background, 0, SpringLayout.NORTH, this.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, Background, 0, SpringLayout.WEST, this.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, Background, 0, SpringLayout.SOUTH, this.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Background, 0, SpringLayout.EAST, this.getContentPane());
		Background.setBackground(new Color(51, 102, 102));
		this.getContentPane().add(Background);
		SpringLayout sl_Background = new SpringLayout();
		Background.setLayout(sl_Background);
		
		JLabel lblInicioDeSesin = new JLabel("Inicio de sesi\u00F3n");
		sl_Background.putConstraint(SpringLayout.SOUTH, lblInicioDeSesin, -309, SpringLayout.SOUTH, Background);
		sl_Background.putConstraint(SpringLayout.EAST, lblInicioDeSesin, -199, SpringLayout.EAST, Background);
		lblInicioDeSesin.setForeground(new Color(255, 255, 255));
		lblInicioDeSesin.setFont(new Font("Avenir LT Std 55 Roman", Font.PLAIN, 26));
		Background.add(lblInicioDeSesin);
		
		JLabel lblnuevoUsuarioCrea = new JLabel("\u00BFNuevo usuario? Crea una cuenta");
		sl_Background.putConstraint(SpringLayout.NORTH, lblnuevoUsuarioCrea, 0, SpringLayout.SOUTH, lblInicioDeSesin);
		sl_Background.putConstraint(SpringLayout.EAST, lblnuevoUsuarioCrea, -189, SpringLayout.EAST, Background);
		lblnuevoUsuarioCrea.setForeground(new Color(204, 204, 204));
		lblnuevoUsuarioCrea.setFont(new Font("Avenir LT Std 35 Light", Font.PLAIN, 14));
		Background.add(lblnuevoUsuarioCrea);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		sl_Background.putConstraint(SpringLayout.NORTH, lblUsuario, 125, SpringLayout.NORTH, Background);
		sl_Background.putConstraint(SpringLayout.WEST, lblUsuario, 117, SpringLayout.WEST, Background);
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setFont(new Font("Avenir LT Std 55 Roman", Font.PLAIN, 16));
		Background.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		sl_Background.putConstraint(SpringLayout.NORTH, lblContrasea, 21, SpringLayout.SOUTH, lblUsuario);
		sl_Background.putConstraint(SpringLayout.WEST, lblContrasea, 0, SpringLayout.WEST, lblUsuario);
		lblContrasea.setFont(new Font("Avenir LT Std 55 Roman", Font.PLAIN, 16));
		lblContrasea.setForeground(new Color(255, 255, 255));
		Background.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtUsuario.setForeground(Color.WHITE);
		txtUsuario.setFont(new Font("Avenir LT Std 35 Light", Font.PLAIN, 14));
		txtUsuario.setBackground(new Color(51,102,102));
		sl_Background.putConstraint(SpringLayout.WEST, txtUsuario, 42, SpringLayout.EAST, lblUsuario);
		sl_Background.putConstraint(SpringLayout.SOUTH, txtUsuario, 0, SpringLayout.SOUTH, lblUsuario);
		sl_Background.putConstraint(SpringLayout.EAST, txtUsuario, 293, SpringLayout.EAST, lblUsuario);
		Background.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JSeparator sepUsuario = new JSeparator();
		sepUsuario.setBackground(Color.WHITE);
		sl_Background.putConstraint(SpringLayout.NORTH, sepUsuario, 2, SpringLayout.SOUTH, txtUsuario);
		sl_Background.putConstraint(SpringLayout.WEST, sepUsuario, 0, SpringLayout.WEST, txtUsuario);
		sl_Background.putConstraint(SpringLayout.EAST, sepUsuario, 2, SpringLayout.EAST, txtUsuario);
		Background.add(sepUsuario);
		
		txtContrasena = new JPasswordField();
		sl_Background.putConstraint(SpringLayout.WEST, txtContrasena, 11, SpringLayout.EAST, lblContrasea);
		txtContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtContrasena.setForeground(Color.WHITE);
		txtContrasena.setFont(new Font("Avenir LT Std 35 Light", Font.PLAIN, 14));
		txtContrasena.setBackground(new Color(51,102,102));
		sl_Background.putConstraint(SpringLayout.NORTH, txtContrasena, 21, SpringLayout.SOUTH, txtUsuario);
		sl_Background.putConstraint(SpringLayout.SOUTH, txtContrasena, 36, SpringLayout.SOUTH, txtUsuario);
		sl_Background.putConstraint(SpringLayout.EAST, txtContrasena, 0, SpringLayout.EAST, txtUsuario);
		Background.add(txtContrasena);
		
		JSeparator sepContrasena = new JSeparator();
		sl_Background.putConstraint(SpringLayout.NORTH, sepContrasena, 2, SpringLayout.SOUTH, txtContrasena);
		sl_Background.putConstraint(SpringLayout.WEST, sepContrasena, 0, SpringLayout.WEST, txtContrasena);
		sl_Background.putConstraint(SpringLayout.EAST, sepContrasena, 0, SpringLayout.EAST, txtContrasena);
		sepContrasena.setBackground(Color.WHITE);
		Background.add(sepContrasena);
		
		final JPanel LoginPanel = new JPanel();
		LoginPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					User user = new User(txtUsuario.getText(),Toolkit.strToMD5(new String(txtContrasena.getPassword())));
					AuthenticationService authServ = new AuthenticationService();
					if(!authServ.isValidUser(user))
						System.out.println("Usuario no valido");
					else
						System.out.println("Usuario valido");
				} catch (ToolkitException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Usuario: " + txtUsuario.getText());
				try {
					System.out.println("Password: " + Toolkit.strToMD5(new String(txtContrasena.getPassword())));
				} catch (ToolkitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Dashboard dashBoard = new Dashboard();
				//dashBoard.frmSoftware.setVisible(true);
			} 
			@Override
			public void mouseEntered(MouseEvent e) {
				LoginPanel.setBackground(new Color(60, 215, 130));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				LoginPanel.setBackground(new Color(51, 204, 102));
			}
		});
		sl_Background.putConstraint(SpringLayout.WEST, LoginPanel, 310, SpringLayout.WEST, Background);
		sl_Background.putConstraint(SpringLayout.EAST, LoginPanel, -115, SpringLayout.EAST, Background);
		LoginPanel.setBackground(new Color(51, 204, 102));
		Background.add(LoginPanel);
		
		final JLabel lblolvidasteTuContrasea = new JLabel("\u00BFOlvidaste tu contrase\u00F1a?");
		lblolvidasteTuContrasea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblolvidasteTuContrasea.setForeground(SystemColor.controlHighlight);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblolvidasteTuContrasea.setForeground(new Color(204, 204, 204));
			}
		});
		sl_Background.putConstraint(SpringLayout.SOUTH, LoginPanel, -23, SpringLayout.NORTH, lblolvidasteTuContrasea);
		sl_Background.putConstraint(SpringLayout.NORTH, lblolvidasteTuContrasea, 290, SpringLayout.NORTH, Background);
		sl_Background.putConstraint(SpringLayout.EAST, lblolvidasteTuContrasea, -219, SpringLayout.EAST, Background);
		lblolvidasteTuContrasea.setForeground(new Color(204, 204, 204));
		lblolvidasteTuContrasea.setFont(new Font("Avenir LT Std 35 Light", Font.PLAIN, 12));
		Background.add(lblolvidasteTuContrasea);
		
		JLabel lblAdvertencia = new JLabel("");
		sl_Background.putConstraint(SpringLayout.NORTH, LoginPanel, 22, SpringLayout.SOUTH, lblAdvertencia);
		sl_Background.putConstraint(SpringLayout.SOUTH, lblAdvertencia, -153, SpringLayout.SOUTH, Background);
		sl_Background.putConstraint(SpringLayout.WEST, lblAdvertencia, 0, SpringLayout.WEST, lblnuevoUsuarioCrea);
		lblAdvertencia.setFont(new Font("Avenir LT Std 45 Book", Font.PLAIN, 12));
		lblAdvertencia.setForeground(new Color(255, 127, 80));
		Background.add(lblAdvertencia);
		
		final JPanel RegistroPanel = new JPanel();
		RegistroPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				RegistroPanel.setBackground(SystemColor.control);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				RegistroPanel.setBackground(SystemColor.controlHighlight);
			}
		});
		RegistroPanel.setBackground(SystemColor.controlHighlight);
		sl_Background.putConstraint(SpringLayout.NORTH, RegistroPanel, 22, SpringLayout.SOUTH, lblAdvertencia);
		sl_Background.putConstraint(SpringLayout.WEST, RegistroPanel, 117, SpringLayout.WEST, Background);
		sl_Background.putConstraint(SpringLayout.SOUTH, RegistroPanel, -23, SpringLayout.NORTH, lblolvidasteTuContrasea);
		sl_Background.putConstraint(SpringLayout.EAST, RegistroPanel, -24, SpringLayout.WEST, LoginPanel);
		LoginPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblIniciarSesin = new JLabel("Iniciar sesi\u00F3n");
		LoginPanel.add(lblIniciarSesin);
		lblIniciarSesin.setForeground(new Color(255, 255, 255));
		lblIniciarSesin.setFont(new Font("Avenir LT Std 65 Medium", Font.PLAIN, 18));
		Background.add(RegistroPanel);
		
		JLabel lblRegistrarse = new JLabel("Registrarte");
		lblRegistrarse.setForeground(SystemColor.controlDkShadow);
		lblRegistrarse.setFont(new Font("Avenir LT Std 65 Medium", Font.PLAIN, 18));
		RegistroPanel.add(lblRegistrarse);
	}
}
