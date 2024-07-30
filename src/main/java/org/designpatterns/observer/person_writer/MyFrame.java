package org.designpatterns.observer.person_writer;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.designpatterns.observer.person_writer.entity.Person;
import org.designpatterns.observer.person_writer.observer.CsvPersonWriterObserver;
import org.designpatterns.observer.person_writer.observer.JsonPersonWriterObserver;
import org.designpatterns.observer.person_writer.observer.XmlPersonWriterObserver;
import org.designpatterns.observer.person_writer.target.PersonWriterTarget;

public class MyFrame extends JFrame implements ActionListener
{
    private final JTextField nameField;
    private final JLabel nameLabel;
    private final JTextField ageField;
    private final JLabel ageLabel;

    private final JCheckBox xmlBox;
    private final JCheckBox jsonBox;
    private final JCheckBox csvBox;

    private final JButton btn;
    private final PersonWriterTarget target;

    public MyFrame() 
    {
        target = new PersonWriterTarget();

        nameLabel = new JLabel("Name: ");
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        nameLabel.setVerticalAlignment(JLabel.CENTER);
        nameField = new JTextField(10);

        ageLabel = new JLabel("Age: ");
        ageLabel.setHorizontalAlignment(JLabel.CENTER);
        ageLabel.setVerticalAlignment(JLabel.CENTER);
        ageField = new JTextField(10);

        xmlBox = new JCheckBox("XML");
        xmlBox.addChangeListener(e -> {
            final XmlPersonWriterObserver observer = new XmlPersonWriterObserver();
            if(xmlBox.isSelected()) 
                target.register(observer);
            else
                target.unregister(observer.toString());
        });

        jsonBox = new JCheckBox("JSON");
        jsonBox.addChangeListener(e -> {
            final JsonPersonWriterObserver observer = new JsonPersonWriterObserver();
            if(jsonBox.isSelected())
                target.register(observer);
            else
                target.unregister(observer.toString());
        });

        csvBox = new JCheckBox("CSV");
        csvBox.addChangeListener(e -> {
            final CsvPersonWriterObserver observer = new CsvPersonWriterObserver();
            if(csvBox.isSelected())
                target.register(observer);
            else
                target.unregister(observer.toString());
        });

        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(xmlBox);
        checkBoxPanel.add(jsonBox);
        checkBoxPanel.add(csvBox);

        btn = new JButton("Submit");
        btn.addActionListener(this);

        this.add(nameLabel);
        this.add(nameField);
        this.add(ageLabel);
        this.add(ageField);
        this.add(checkBoxPanel);
        this.add(btn);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 3, 0, 0));
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == this.btn)
        {
            String name = nameField.getText();
            Integer age = Integer.valueOf(ageField.getText());
            Person person = new Person(name, age);
            target.notifyObservers(person);

            nameField.setText("");
            ageField.setText("");
        }
    }

}
