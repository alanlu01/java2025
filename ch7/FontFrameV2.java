package ntou.cs.java2025;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FontFrameV2 extends JFrame {
    private JButton increaseButton; // button to increase font size
    private JButton decreaseButton; // button to decrease font size
    private JTextArea text;         // displays example text
    private int fontSize = 20;      // current font size

    public FontFrameV2() {
        super("Font Test");

        MyEventListener handler = new MyEventListener();
        // create buttons and add action listeners
        decreaseButton = new JButton("Decrease font size");
        increaseButton = new JButton("Increase font size");
        decreaseButton.addActionListener(handler);
        increaseButton.addActionListener(handler);

        // create text area and set initial font
        text = new JTextArea("Test");
        text.setFont(new Font("Consolas", Font.PLAIN, fontSize));

        // add GUI components to frame
        JPanel panel = new JPanel(); // used to get proper layout
        panel.add(decreaseButton);
        panel.add(increaseButton);

        add(panel, BorderLayout.NORTH);       // add buttons at top
        add(new JScrollPane(text));           // allow scrolling

        // window settings
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class MyEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();
            if (src == increaseButton) {
                fontSize += 2;
                if (fontSize > 160) {
                    fontSize = 160;
                    JOptionPane.showMessageDialog(FontFrameV2.this,
                        "No, it cannot be larger!");
                }
            } else if (src == decreaseButton) {
                fontSize -= 2;
                if (fontSize < 8) {
                    fontSize = 8;
                    JOptionPane.showMessageDialog(FontFrameV2.this,
                        "No, it cannot be smaller!");
                }
            }
            text.setFont(new Font("Consolas", Font.PLAIN, fontSize));
        }
    }

    // for testing
    public static void main(String[] args) {
        new FontFrameV2();
    }
}