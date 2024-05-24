import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JTextField namaLengkapField;
    private JTextField tanggalLahirField;
    private JTextField nomorPendaftaranField;
    private JTextField nomorTeleponField;
    private JTextField alamatField;
    private JTextField emailField;

    public GUI() {
        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel namaLengkapLabel = new JLabel("Nama Lengkap:");
        namaLengkapField = new JTextField(20);
        JLabel tanggalLahirLabel = new JLabel("Tanggal Lahir:");
        tanggalLahirField = new JTextField(20);
        JLabel nomorPendaftaranLabel = new JLabel("Nomor Pendaftaran:");
        nomorPendaftaranField = new JTextField(20);
        JLabel nomorTeleponLabel = new JLabel("No. Telepon:");
        nomorTeleponField = new JTextField(20);
        JLabel alamatLabel = new JLabel("Alamat:");
        alamatField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(namaLengkapLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        mainPanel.add(namaLengkapField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(tanggalLahirLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(tanggalLahirField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(nomorPendaftaranLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        mainPanel.add(nomorPendaftaranField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(nomorTeleponLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        mainPanel.add(nomorTeleponField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        mainPanel.add(alamatLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        mainPanel.add(alamatField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        mainPanel.add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        mainPanel.add(emailField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(submitButton, gbc);

        add(mainPanel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validateFields()) {
                    int confirmation = JOptionPane.showConfirmDialog(null,
                            "Apakah anda yakin data yang Anda isi sudah benar?",
                            "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
                    if (confirmation == JOptionPane.OK_OPTION) {
                        showDataWindow();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Semua kolom harus terisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    private boolean validateFields() {
        return !namaLengkapField.getText().trim().isEmpty() &&
                !tanggalLahirField.getText().trim().isEmpty() &&
                !nomorPendaftaranField.getText().trim().isEmpty() &&
                !nomorTeleponField.getText().trim().isEmpty() &&
                !alamatField.getText().trim().isEmpty() &&
                !emailField.getText().trim().isEmpty();
    }

    private void showDataWindow() {
        JFrame dataFrame = new JFrame("Data Mahasiswa");
        dataFrame.setSize(400, 300);
        dataFrame.setLocationRelativeTo(null);

        JPanel dataPanel = new JPanel(new GridLayout(7, 1, 10, 10));
        dataPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        dataPanel.add(new JLabel("Nama Lengkap: " + namaLengkapField.getText()));
        dataPanel.add(new JLabel("Tanggal Lahir: " + tanggalLahirField.getText()));
        dataPanel.add(new JLabel("Nomor Pendaftaran: " + nomorPendaftaranField.getText()));
        dataPanel.add(new JLabel("Nomor Telepon: " + nomorTeleponField.getText()));
        dataPanel.add(new JLabel("Alamat: " + alamatField.getText()));
        dataPanel.add(new JLabel("Email: " + emailField.getText()));

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataFrame.dispose();
            }
        });
        dataPanel.add(closeButton);

        dataFrame.add(dataPanel);
        dataFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
}
