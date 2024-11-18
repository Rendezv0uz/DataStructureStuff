//I DONT UNDERSTAND SHIT ABOUT THIS

package RandomNodeUse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionNode {
    String action;
    String text;
    ActionNode prev;
    ActionNode next;

    public ActionNode(String action, String text) {
        this.action = action;
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

class TextEditorGUI extends JFrame {
    private JTextArea textArea;
    private ActionNode head;
    private ActionNode current;

    public TextEditorGUI() {
        head = new ActionNode("START", "");
        current = head;

        setTitle("Text Editor with Undo/Redo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set up the text area
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Set up the buttons
        JButton undoButton = new JButton("Undo");
        JButton redoButton = new JButton("Redo");

        // Add listeners for buttons
        undoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });

        redoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                redo();
            }
        });

        textArea.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                performAction("Insert", textArea.getText());
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                performAction("Delete", textArea.getText());
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {}
        });

        // Arrange components in the window
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(undoButton);
        buttonPanel.add(redoButton);

        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // Perform an action and add it to the history
    private void performAction(String action, String text) {
        if (current != null && !text.equals(current.text)) {
            ActionNode newNode = new ActionNode(action, text);
            newNode.prev = current;
            current.next = newNode;
            current = newNode;
        }
    }

    // Undo the last action
    private void undo() {
        if (current.prev != null) {
            System.out.println("Undoing: " + current.action);
            current = current.prev;
            textArea.setText(current.text);
        } else {
            System.out.println("No more actions to undo.");
        }
    }

    // Redo the action that was undone
    private void redo() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Redoing: " + current.action);
            textArea.setText(current.text);
        } else {
            System.out.println("No more actions to redo.");
        }
    }
}

public class UndoRedoTextEditor {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TextEditorGUI().setVisible(true);
            }
        });
    }
}

