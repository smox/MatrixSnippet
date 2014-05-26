package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class TestGUI extends JFrame{
	
	private JSpinner spinUp1, spinUp2;
	private JPanel pnlMatrix, pnlUp, pnlDown;
	GridLayout grid = new GridLayout(1, 0);

	
	public TestGUI(){
		
		setLayout(new BorderLayout());
		createWidgets();
		addWidgets();
		addListener();
		
		getContentPane().add(pnlMatrix, BorderLayout.CENTER);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
		
	}

	private void addListener() {
		spinUp1.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				int spinnerRowValue = (int)spinUp1.getValue();
				int spinnerColValue = (int)spinUp2.getValue();
				grid.setRows(spinnerRowValue);
				grid.setColumns(spinnerColValue);
				
				
				JTextField[][] matrix1Array = new JTextField[(spinnerRowValue)][(spinnerColValue)];
				pnlDown.removeAll();
				
				
				for(int i = 0; i <= matrix1Array.length-1; i++){
					pnlDown.add(new JTextField("0"));
					
					for(int j = 0; j <= matrix1Array[i].length-2; j++){
						pnlDown.add(new JTextField("0"));
					}
			//		getContentPane().validate();
			//		pack();
			//		System.out.println(matrix1Array.length);
					
					System.out.println(matrix1Array.length);
					System.out.println(matrix1Array[i].length);
				}
				getContentPane().validate();
				pack();
			}
		});
		
		spinUp2.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				int spinnerRowValue = (int)spinUp1.getValue();
				int spinnerColValue = (int)spinUp2.getValue();
				grid.setRows(spinnerRowValue);
				grid.setColumns(spinnerColValue);
				
				
				JTextField[][] matrix1Array = new JTextField[(spinnerRowValue)][(spinnerColValue)];
				pnlDown.removeAll();
				
				
				for(int i = 0; i <= matrix1Array.length-1; i++){
					pnlDown.add(new JTextField("0"));
					
					for(int j = 0; j <= matrix1Array[i].length-2; j++){
						pnlDown.add(new JTextField("0"));
					}
			//		getContentPane().validate();
			//		pack();
			//		System.out.println(matrix1Array.length);
					
					System.out.println(matrix1Array.length);
					System.out.println(matrix1Array[i].length);
				}
				getContentPane().validate();
				pack();
			}
		});
	}
	

	private void addWidgets() {
		pnlMatrix.add(pnlUp);
		pnlUp.add(spinUp1);
		pnlUp.add(spinUp2);
		
		pnlMatrix.add(pnlDown);
		
	}
	

	private void createWidgets() {
		spinUp1 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
		spinUp2 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
		
		pnlMatrix = new JPanel();
		pnlMatrix.setLayout(new BoxLayout(pnlMatrix, BoxLayout.PAGE_AXIS));

		pnlUp = new JPanel();
		pnlUp.setLayout(new BoxLayout(pnlUp, BoxLayout.LINE_AXIS));
		pnlUp.setMaximumSize(new Dimension(200, pnlUp.getPreferredSize().height));
		pnlDown = new JPanel(grid);
	//	pnlDown.setMaximumSize(new Dimension(500, pnlDown.getPreferredSize().height));
		
	}
	

}
