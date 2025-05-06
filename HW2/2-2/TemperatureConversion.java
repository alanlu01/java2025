import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TemperatureConversion extends JFrame {
	private final JLabel fromLabel;
	private final JLabel toLabel;
	private final JLabel sourceLabel;
	private final JLabel targetLabel;
	private final ButtonGroup fromOptions;
	private final ButtonGroup toOptions;
	private final JRadioButton fromFahrenheit;
	private final JRadioButton fromCelsius;
	private final JRadioButton fromKelvin;
	private final JRadioButton toFahrenheit;
	private final JRadioButton toCelsius;
	private final JRadioButton toKelvin;
	private final JPanel fromPanel;
	private final JPanel toPanel;
	private final JPanel inputPanel;
	private final JTextField inputField;
	private final JTextField outputField;
	private final JButton convesionButton;

	public TemperatureConversion() {
		// TODO
	}

	private class MyEventListner implements ActionListener {
		// TODO	
	}
	
}