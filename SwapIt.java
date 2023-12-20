import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwapIt {
    private JTextField textField1;
    private JTextField textField2;
    private JLabel resultLabel;

    public SwapIt() {
        JFrame frame = new JFrame("Text Swapper");
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel label1 = new JLabel("First text:");
        textField1 = new JTextField(20);

        JLabel label2 = new JLabel("Second text:");
        textField2 = new JTextField(20);

        JButton swapButton = new JButton("Swap");

        resultLabel = new JLabel("");

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(new JLabel());
        frame.add(swapButton);
        frame.add(new JLabel());
        frame.add(resultLabel);

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        swapButton.addActionListener(new MyListener());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwapIt());
    }

    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String temp = textField1.getText();
            textField1.setText(textField2.getText());
            textField2.setText(temp);

            resultLabel.setText("Swapped: " + textField1.getText() + " and " + textField2.getText());
        }
    }
}
