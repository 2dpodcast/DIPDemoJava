package ghc.windows;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DIPDemoFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public DIPDemoFrame() {
		// TODO Auto-generated constructor stub	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setTitle("DIPDemoJava");
        setSize(800, 600);
        
		Container container = getContentPane();
		container.setLayout(null);
		
		JButton btn = new JButton("µ¯³ö");
		btn.setBounds(10, 10, 100, 50);
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//new FileDownloadDlg(DIPDemoFrame.this).setVisible(true);
			}
		});
		container.add(btn);
			
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub        
        new DIPDemoFrame();
	}
}
