import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.PopupMenu;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton setTimerButton = new JButton("Set Timer");
		setTimerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JPopupMenu popupMenu = new JPopupMenu();
				addPopup(setTimerButton, popupMenu);
				
				JRadioButton rdbtnNewRadioButton = new JRadioButton("1hr");
				popupMenu.add(rdbtnNewRadioButton);
				
				JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2hr");
				popupMenu.add(rdbtnNewRadioButton_1);
				
				JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3hr");
				popupMenu.add(rdbtnNewRadioButton_2);

				
			}
		});
		setTimerButton.setBounds(28, 110, 89, 23);
		contentPane.add(setTimerButton);
	
		JButton viewLogButton = new JButton("Log");
		viewLogButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		viewLogButton.setBounds(164, 110, 89, 23);
		contentPane.add(viewLogButton);
		
		JButton exitButton = new JButton("Close");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		exitButton.setBounds(296, 110, 89, 23);
		contentPane.add(exitButton);
		
		JLabel Ttile = new JLabel("Blood Sugar Reminder");
		Ttile.setForeground(Color.PINK);
		Ttile.setFont(new Font("Constantia", Font.BOLD, 23));
		Ttile.setBounds(87, 11, 255, 44);
		contentPane.add(Ttile);
	}
	
	//log screen
	
	public class Log {
		
		public Log() {
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBackground(Color.DARK_GRAY);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
		}
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
