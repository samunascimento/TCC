package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The frame to the GUI of Merge Nature's algorithm
 *
 * @author João Pedro Lima
 * @since 14-04-2021
 */
public class MNInputConnection {

    private static JTextField url;
    private static JTextField user;
    private static JTextField password;

    public static void getMNInputConnection(MNFrame mainFrame) {

        JFrame frame = new JFrame();
        frame.setTitle("Make Connection");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 150);
        frame.setLocationRelativeTo(null);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        JPanel mainPanel = new JPanel(new GridBagLayout());

        url = new JTextField();
        user = new JTextField();
        password = new JTextField();

        JButton tryConnect = new JButton("Try Connect");
        tryConnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                boolean connected = true;
                Connection connection = null;
                try {
                    connection = tryConnection(url.getText(), user.getText(), password.getText());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "URL, user or password incorrect. Try again!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    connected = false;
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "The PostgreSQL's driver isn't installed.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    connected = false;
                } finally {
                    if (connected) {
                        try {
                            MergeNatureTools.createAndWriteInFile(MNFrame.CONNECTION_FILEPATH, url.getText() + ";" + user.getText() + ";" + password.getText());
                            mainFrame.setConnection(connection);
                            JOptionPane.showMessageDialog(null, "Connection done!", "Info", JOptionPane.INFORMATION_MESSAGE);
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "Error in database creation.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        frame.dispose();
                    }
                }
            }
        });

        mainPanel.add(new JLabel("URL:"), gbc);
        gbc.gridy++;
        mainPanel.add(new JLabel("User:"), gbc);
        gbc.gridy++;
        mainPanel.add(new JLabel("Password:"), gbc);
        gbc.gridy++;
        mainPanel.add(tryConnect, gbc);
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(url, gbc);
        gbc.gridy++;
        mainPanel.add(user, gbc);
        gbc.gridy++;
        mainPanel.add(password, gbc);

        frame.add(mainPanel);
        frame.setVisible(true);

    }

    private static Connection tryConnection(String url, String user, String password) throws SQLException, ClassNotFoundException {
        return ConnectionFactory.getConnection(url, user, password);
    }

}
