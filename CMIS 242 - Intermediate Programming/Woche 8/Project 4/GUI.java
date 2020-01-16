/*
 * Course:  	CMIS 242
 * File: 	GUI.java
 * Author: 	Andrew H. Rohn
 * Date: 	13 October 2018
 * Purpose: 	Contains the Main Method, GUI, and ActionListeners.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class GUI extends JFrame {
	
	// Initialization of TextFields, Labels, String, ComboBox & Button
	private JLabel idLabel = new JLabel("Student ID:");
	private JLabel nameLabel = new JLabel("Student Name:");
	private JLabel majorLabel = new JLabel("Student Major:");
	private JLabel selectionLabel = new JLabel("Choose Selection:");
	private JTextField idTextField = new JTextField("");
	private JTextField nameTextField = new JTextField("");
	private JTextField majorTextField = new JTextField("");
	private String[] action = {"Insert", "Delete", "Find", "Update"};
	private JComboBox<String> actionList = new JComboBox<String>(action);
	private JButton button = new JButton("Process Request");
	
	// Constructor Method
	public GUI() {
		
		setLayout(new GridLayout(1, 2));
		
		// Creation of Label Panel w/ Button
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));
		labelPanel.add(Box.createVerticalStrut(3));
		labelPanel.add(idLabel);
		labelPanel.add(Box.createVerticalStrut(10));
		labelPanel.add(nameLabel);
		labelPanel.add(Box.createVerticalStrut(10));
		labelPanel.add(majorLabel);
		labelPanel.add(Box.createVerticalStrut(10));
		labelPanel.add(selectionLabel);
		labelPanel.add(Box.createVerticalStrut(15));
		labelPanel.add(button);
		labelPanel.add(Box.createVerticalStrut(25));
		add(labelPanel);
		
		// Creation of TextField Panel
		JPanel textFieldPanel = new JPanel();
		textFieldPanel.setLayout(new BoxLayout(textFieldPanel, BoxLayout.PAGE_AXIS));
		textFieldPanel.add(Box.createVerticalStrut(3));
		textFieldPanel.add(idTextField);
		textFieldPanel.add(Box.createVerticalStrut(5));
		textFieldPanel.add(nameTextField);
		textFieldPanel.add(Box.createVerticalStrut(5));
		textFieldPanel.add(majorTextField);
		textFieldPanel.add(Box.createVerticalStrut(5));
		textFieldPanel.add(actionList);
		textFieldPanel.add(Box.createVerticalStrut(68));
		actionList.setSelectedIndex(0);
		add(textFieldPanel);
			
		// Initialization of HashMap
		HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>();
		
		// ActionListener for Button
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Initialization of Student ID
				int studentID = Integer.parseInt(idTextField.getText());
				
				try {
					if (studentID < 1) {
						throw new NumberFormatException();  // Rejects integers less than 1
					}
					// Insert ActionListener
					if (actionList.getSelectedIndex() == 0) {
						if (hashMap.containsKey(studentID) == true) {
							JOptionPane.showMessageDialog(null, "Student ID already exists.\n"
									+ "Please enter another Student ID.");
							idTextField.setText("");
						}
						else {
							Student studentInfo = new Student(nameTextField.getText(),
									majorTextField.getText());
							hashMap.put(studentID, studentInfo);
							JOptionPane.showMessageDialog(null, "Student information "
									+ "was successfully added to database.");
						}
					}
					// Delete ActionListener
					else if (actionList.getSelectedIndex() == 1) {
						if (hashMap.containsKey(studentID)) {
							hashMap.remove(studentID);
							JOptionPane.showMessageDialog(null, "Student information "
									+ "was successfully removed from database.");
						}
						else {
							JOptionPane.showMessageDialog(null, "Student ID doesn't exist.\n"
									+ "Please enter another Student ID.");
							idTextField.setText("");
						}
					}
					// Find ActionListener
					else if (actionList.getSelectedIndex() == 2) {
						if (hashMap.containsKey(studentID)) {
							JOptionPane.showMessageDialog(null, hashMap.get(studentID).toString(),
									"Student ID:    "+studentID, JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Student ID doesn't exist.\n"
									+ "Please enter another Student ID.");
							idTextField.setText("");
						}
					}
					// Update ActionListener
					else if (actionList.getSelectedIndex() == 3) {
						
						// Local Variables
						double gradeValue;
						int numCredits;
						String[] gradeList = {"A", "B", "C", "D", "F"};
						String[] numCreditsList = {"3", "6"};
						
						if (hashMap.containsKey(studentID)) {
							
							// Grade Selection for Major
							String grade = (String) JOptionPane.showInputDialog(null,
							"Choose grade:", "Course Grade", JOptionPane.QUESTION_MESSAGE,
							null, gradeList, gradeList[0]);
							
							// Number of Credits Selection for Major
							String credits = (String) JOptionPane.showInputDialog(null,
							"Choose credits:", "Course Credits", JOptionPane.QUESTION_MESSAGE,
							null, numCreditsList, numCreditsList[0]);
							numCredits = Integer.parseInt(credits);
							
							// Converts Grade to Numeric Value
							if (grade.equals("A")) {
								gradeValue = 4.0;
							}
							else if (grade.equals("B")) {
								gradeValue = 3.0;
							}
							else if (grade.equals("C")) {
								gradeValue = 2.0;
							}
							else if (grade.equals("D")) {
								gradeValue = 1.0;
							}
							else {
								gradeValue = 0;
							}
							Student student = (Student) hashMap.get(studentID);
							student.courseCompleted(gradeValue, numCredits);
							JOptionPane.showMessageDialog(null, "Student information "
									+ "was successful updated.");
						}
						else {
							JOptionPane.showMessageDialog(null, "Student ID doesn't exist.\n"
									+ "Please enter another Student ID.");
							idTextField.setText("");
						}
					}
					else {
						System.exit(0);
					}
					
					// Clears TextFields After ActionListener
					nameTextField.setText("");
					majorTextField.setText("");
				}
				
				// Rejects Non-Numeric Input for Student ID
				catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null,
							"Please enter a valid numeric student ID.\n"
							+ "Ex:  12345");
				}
			}
		});
	}
	
	// Main Method
	public static void main(String args[]) {
		
		// Object for GUI Class
		GUI frame = new GUI();
		
		// Frame Parameters
		frame.setTitle("Student Grade Database");
		frame.setSize(350, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
