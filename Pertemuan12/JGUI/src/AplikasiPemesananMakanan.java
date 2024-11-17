import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class AplikasiPemesananMakanan extends JFrame {
    private JTextField namaField, alamatField, telpField, totalBayarField;
    private JCheckBox steakCheckBox, spaghetiCheckBox, pizzaCheckBox;
    private JTextArea dataPenjualanArea;
    private JButton tambahButton;
    private int totalBayar = 0;
    private int pesananCounter = 1; 
    private DecimalFormat formatRupiah = new DecimalFormat("Rp#,##0");
    private Color LILAC = new Color(255, 204, 255);
    private Color PLUM = new Color(153, 0, 153);

    public AplikasiPemesananMakanan() {
        setTitle("Aplikasi Pemesanan Makanan");
        setSize(500, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Panel Data Customer
        JPanel dataCustomerPanel = new JPanel();
        dataCustomerPanel.setLayout(new GridLayout(3, 2));
        dataCustomerPanel.setBorder(BorderFactory.createTitledBorder("Data Customer"));
        dataCustomerPanel.setBackground(LILAC);

        namaField = new JTextField(15);
        namaField.setBackground(LILAC);
        alamatField = new JTextField(15);
        alamatField.setBackground(LILAC);
        telpField = new JTextField(15);
        telpField.setBackground(LILAC);

        dataCustomerPanel.add(new JLabel("Nama: "));
        dataCustomerPanel.add(namaField);
        dataCustomerPanel.add(new JLabel("Alamat: "));
        dataCustomerPanel.add(alamatField);
        dataCustomerPanel.add(new JLabel("No. Telp: "));
        dataCustomerPanel.add(telpField);

        // Panel Pilih Menu
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(3, 1));
        menuPanel.setBorder(BorderFactory.createTitledBorder("Pilih Menu"));
        menuPanel.setBackground(LILAC);

        steakCheckBox = new JCheckBox("Steak (Rp50.000)");
        steakCheckBox.setBackground(LILAC);
        spaghetiCheckBox = new JCheckBox("Spagheti (Rp40.000)");
        spaghetiCheckBox.setBackground(LILAC);
        pizzaCheckBox = new JCheckBox("Pizza (Rp80.000)");
        pizzaCheckBox.setBackground(LILAC);

        menuPanel.add(steakCheckBox);
        menuPanel.add(spaghetiCheckBox);
        menuPanel.add(pizzaCheckBox);

        // Menambahkan ActionListener pada setiap checkbox
        steakCheckBox.addActionListener(new MenuListener(50000));
        spaghetiCheckBox.addActionListener(new MenuListener(40000));
        pizzaCheckBox.addActionListener(new MenuListener(80000));

        // Panel Total Bayar
        JPanel totalPanel = new JPanel();
        totalPanel.setBorder(BorderFactory.createTitledBorder("TOTAL BAYAR"));
        totalPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        totalPanel.setBackground(LILAC);

        totalBayarField = new JTextField(10);
        totalBayarField.setFont(new Font("Arial", Font.BOLD, 20));
        totalBayarField.setHorizontalAlignment(JTextField.RIGHT);
        totalBayarField.setForeground(Color.RED);
        totalBayarField.setBackground(LILAC);
        totalBayarField.setEditable(false);
        totalBayarField.setText("Rp0");

        totalPanel.add(totalBayarField);

        // Button Tambah
        tambahButton = new JButton("TAMBAH");
        tambahButton.setBackground(PLUM);
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosesPesanan();
            }
        });

        // Panel untuk tombol tambah agar rata kanan
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(LILAC);
        buttonPanel.add(tambahButton);

        // Text Area Data Penjualan
        dataPenjualanArea = new JTextArea(12, 40);
        dataPenjualanArea.setEditable(false);
        dataPenjualanArea.setBackground(LILAC);
        JScrollPane scrollPane = new JScrollPane(dataPenjualanArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Data Penjualan"));
        scrollPane.getViewport().setBackground(LILAC); 
        scrollPane.setBackground(LILAC); 

        // Footer 
        JLabel footerLabel = new JLabel("Aulia Putri Ramadhani 231511070 ");
        footerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        footerLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        footerLabel.setForeground(Color.DARK_GRAY);

        // Panel footer
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(LILAC);
        footerPanel.add(footerLabel);

        // Add components to frame
        add(dataCustomerPanel);
        add(menuPanel);
        add(totalPanel);
        add(buttonPanel);
        add(scrollPane);
        add(footerPanel); 

        getContentPane().setBackground(LILAC); 
        setVisible(true);
    }

    // ActionListener khusus untuk checkbox menu
    private class MenuListener implements ActionListener {
        private int harga;

        public MenuListener(int harga) {
            this.harga = harga;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JCheckBox checkBox = (JCheckBox) e.getSource();
            if (checkBox.isSelected()) {
                totalBayar += harga;
            } else {
                totalBayar -= harga;
            }
            totalBayarField.setText(formatRupiah.format(totalBayar));
        }
    }

    private void prosesPesanan() {
        String nama = namaField.getText();
        String alamat = alamatField.getText();
        String telp = telpField.getText();

        StringBuilder pesanan = new StringBuilder();

        if (steakCheckBox.isSelected()) {
            pesanan.append("- Steak (" + formatRupiah.format(50000) + ")\n");
        }
        if (spaghetiCheckBox.isSelected()) {
            pesanan.append("- Spagheti (" + formatRupiah.format(40000) + ")\n");
        }
        if (pizzaCheckBox.isSelected()) {
            pesanan.append("- Pizza (" + formatRupiah.format(80000) + ")\n");
        }

        // Tambahkan nomor pesanan
        dataPenjualanArea.append("Pesanan #" + pesananCounter + "\n");
        dataPenjualanArea.append("Nama: " + nama + "\n");
        dataPenjualanArea.append("Alamat: " + alamat + "\n");
        dataPenjualanArea.append("Telp: " + telp + "\n");
        dataPenjualanArea.append("----------------------------------\n");
        dataPenjualanArea.append("Pesanan:\n" + pesanan.toString());
        dataPenjualanArea.append("----------------------------------\n");
        dataPenjualanArea.append("Total Bayar: " + formatRupiah.format(totalBayar) + "\n");
        dataPenjualanArea.append("===================\n\n");

        pesananCounter++; 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AplikasiPemesananMakanan::new);
    }
}
