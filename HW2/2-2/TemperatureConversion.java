package ntou.cs.java2025;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
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
		super("Temperature Conversion");
		fromLabel = new JLabel("From:");
		toLabel = new JLabel("To:");
		sourceLabel = new JLabel("Source Temperature:");
		targetLabel = new JLabel("Converted Temperature:");
		fromOptions = new ButtonGroup();
		toOptions = new ButtonGroup();
		fromFahrenheit = new JRadioButton("Fahrenheit", true);
		fromCelsius = new JRadioButton("Celsius");
		fromKelvin = new JRadioButton("Kelvin");
		toFahrenheit = new JRadioButton("Fahrenheit", true);
		toCelsius = new JRadioButton("Celsius");
		toKelvin = new JRadioButton("Kelvin");
		fromOptions.add(fromFahrenheit);
		fromOptions.add(fromCelsius);
		fromOptions.add(fromKelvin);
		toOptions.add(toFahrenheit);
		toOptions.add(toCelsius);
		toOptions.add(toKelvin);
		fromPanel = new JPanel(new GridLayout(4, 1));
		fromPanel.add(fromLabel);
		fromPanel.add(fromFahrenheit);
		fromPanel.add(fromCelsius);
		fromPanel.add(fromKelvin);
		toPanel = new JPanel(new GridLayout(4, 1));
		toPanel.add(toLabel);
		toPanel.add(toFahrenheit);
		toPanel.add(toCelsius);
		toPanel.add(toKelvin);
		inputPanel = new JPanel(new GridLayout(3, 2));
		inputField = new JTextField(10);
		outputField = new JTextField(10);
		outputField.setEditable(false);
		convesionButton = new JButton("Convert");
		inputPanel.add(sourceLabel);
		inputPanel.add(inputField);
		inputPanel.add(targetLabel);
		inputPanel.add(outputField);
		inputPanel.add(new JLabel());
		inputPanel.add(convesionButton);
		setLayout(new BorderLayout());
		add(fromPanel, BorderLayout.WEST);
		add(toPanel, BorderLayout.EAST);
		add(inputPanel, BorderLayout.SOUTH);
		convesionButton.addActionListener(new MyEventListner());
	}

	private class MyEventListner implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				double temp = Double.parseDouble(inputField.getText());
				double result = temp;
				// from Fahrenheit
				if (fromFahrenheit.isSelected()) {
					if (toCelsius.isSelected()) result = (temp - 32) * 5 / 9;
					else if (toKelvin.isSelected()) result = (temp - 32) * 5 / 9 + 273.15;
					else result = temp;
				}
				// from Celsius
				else if (fromCelsius.isSelected()) {
					if (toFahrenheit.isSelected()) result = temp * 9 / 5 + 32;
					else if (toKelvin.isSelected()) result = temp + 273.15;
					else result = temp;
				}
				// from Kelvin
				else if (fromKelvin.isSelected()) {
					if (toCelsius.isSelected()) result = temp - 273.15;
					else if (toFahrenheit.isSelected()) result = (temp - 273.15) * 9 / 5 + 32;
					else result = temp;
				}
				outputField.setText(String.format("%.2f", result));
			} catch (NumberFormatException ex) {
				outputField.setText("Invalid Input");
			}
		}
	}
}