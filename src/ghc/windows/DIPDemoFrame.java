package ghc.windows;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class DIPDemoFrame extends JFrame{	
	private static final long serialVersionUID = 1L;
	
	private JButton btn;
	
	public DIPDemoFrame() {
		// TODO Auto-generated constructor stub			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setTitle("DIPDemoJava");
        setSize(800, 600);
        
		Container container = getContentPane();
		container.setLayout(null);
		
		btn = new JButton("弹出");
		btn.setBounds(10, 10, 100, 50);
		
		container.add(btn);		
		setVisible(true);
		
		addDIPDemoFrameEvents();
		addJButtonsEvents();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub        
        new DIPDemoFrame();
	}
	
	private void addJButtonsEvents(){
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new FileDownloadDlg(DIPDemoFrame.this).setVisible(true);
				
				//DIPOpenCV.write(".\\imgout\\", "ret.png", DIPOpenCV.read("face.jpg"));
			}
		});
	}
	
	private void addDIPDemoFrameEvents(){		    
		addWindowListener(new DIPDemoWindowListener());//为窗体添加事件监听器	
		addKeyListener(new KeyListener() {		
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub	
				switch (e.getKeyCode()) {
				default:
					break;
				}
			}
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub				
			}
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub				
			}
		});
		
		//once ESC is pressed to quit the program
		AbstractAction actionExit = new AbstractAction(){ 
			private static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent e){
				dispose();
				//System.exit(0);
			}
		};
		getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "EXIT");
		getRootPane().getActionMap().put("EXIT", actionExit);
	}
}
