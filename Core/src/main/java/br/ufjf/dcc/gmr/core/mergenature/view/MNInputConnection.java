package br.ufjf.dcc.gmr.core.mergenature.view;

import br.ufjf.dcc.gmr.core.db.ConnectionFactory;
import br.ufjf.dcc.gmr.core.mergenature.controller.MergeNatureTools;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
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

        JDialog dialog = new JDialog();
        dialog.setModal(true);
        dialog.setSize(500, 275);
        dialog.setResizable(false);
        dialog.setAlwaysOnTop(true);
        dialog.setTitle("Make Connection");
        dialog.setLocationRelativeTo(mainFrame);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.getRootPane().setBackground(MNFrame.PRIMARY_COLOR);
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        dialog.getRootPane().setBorder(BorderFactory.createEmptyBorder(2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP, 2 * MNFrame.BORDER_GAP));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        gbc.insets = new Insets(MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP, MNFrame.BORDER_GAP);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(MNFrame.PRIMARY_COLOR);
        mainPanel.setBorder(BorderFactory.createLineBorder(MNFrame.TERTIARY_COLOR, 3, true));

        url = getTextField("jdbc:postgresql://localhost:5432/");
        user = getTextField("postgres");
        password = getTextField("");

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
                        dialog.dispose();
                    }
                }
            }
        });

        mainPanel.add(getLabel("URL:"), gbc);
        gbc.gridy++;
        mainPanel.add(url, gbc);
        gbc.gridy++;
        mainPanel.add(getLabel("User:"), gbc);
        gbc.gridy++;
        mainPanel.add(user, gbc);
        gbc.gridy++;
        mainPanel.add(getLabel("Password:"), gbc);
        gbc.gridy++;
        mainPanel.add(password, gbc);
        gbc.gridy++;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        mainPanel.add(tryConnect, gbc);

        dialog.add(mainPanel);
        dialog.setVisible(true);

    }

    private static Connection tryConnection(String url, String user, String password) throws SQLException, ClassNotFoundException {
        return ConnectionFactory.getConnection(url, user, password);
    }

    private static JTextField getTextField(String text) {
        JTextField result = new JTextField(text);
        result.setOpaque(false);
        result.setEditable(true);
        result.setMargin(new Insets(0, 10, 0, 10));
        result.setForeground(MNFrame.SECUNDARY_COLOR);
        result.setCaretColor(MNFrame.SECUNDARY_COLOR);
        result.setPreferredSize(new Dimension(1, 30));
        return result;
    }

    private static JLabel getLabel(String labelString) {
        JLabel pathLabel = new JLabel(labelString);
        pathLabel.setForeground(MNFrame.SECUNDARY_COLOR);
        pathLabel.setPreferredSize(new Dimension(150, 20));
        return pathLabel;
    }

}
