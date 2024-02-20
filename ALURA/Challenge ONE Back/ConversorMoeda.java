import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ConversorMoeda extends JFrame implements ActionListener {
    private JTextField valor;
    private JComboBox<String> moedaOrigem, moedaDestino;
    private JLabel resultado;

    private final String[] moedas = {"Reais", "Dólar", "Euro", "Libras Esterlinas", "Peso Argentino", "Peso Chileno"};
    private final double[] taxas = {1.0, 5.43, 6.38, 7.49, 0.057, 0.0071};

    public ConversorMoeda() {
        setTitle("Conversor de Moeda");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        JLabel valorLabel = new JLabel("Valor:");
        valor = new JTextField();
        moedaOrigem = new JComboBox<>(moedas);
        moedaDestino = new JComboBox<>(moedas);
        JButton converterButton = new JButton("Converter");
        converterButton.addActionListener(this);
        resultado = new JLabel();

        add(valorLabel);
        add(valor);
        add(moedaOrigem);
        add(moedaDestino);
        add(converterButton);
        add(resultado);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Converter")) {
            double valor = Double.parseDouble(this.valor.getText());
            int origemIndex = moedaOrigem.getSelectedIndex();
            int destinoIndex = moedaDestino.getSelectedIndex();

            double valorConvertido = valor * (taxas[destinoIndex] / taxas[origemIndex]);
            DecimalFormat df = new DecimalFormat("#.##");
            resultado.setText("Resultado: " + df.format(valorConvertido) + " " + moedas[destinoIndex]);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ConversorMoeda());
    }
}