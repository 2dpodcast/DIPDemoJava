# DIPDemoJava
Digital Image Processing Demonstration with OpenCV 2 and Java.

---

## Development Requirements
* System: Windows 7 (32bit)
* JDK ==> jdk1.8.0_51
* Eclipse ==> eclipse-java-mars-R-win32
* EGit ==> http://download.eclipse.org/egit/updates/
* OpenCV ==> OpenCV 2.4.9 for Windows
* MySQL Connector/J ( the official JDBC driver for MySQL ) ==> mysql-connector-java-5.1.39

## Tutorials
* Using OpenCV Java with Eclipse: [http://docs.opencv.org/2.4/doc/tutorials/introduction/java_eclipse/java_eclipse.html#java-eclipse](http://docs.opencv.org/2.4/doc/tutorials/introduction/java_eclipse/java_eclipse.html#java-eclipse "Using OpenCV Java with Eclipse")
* OpenCV Java Tutorials documentation: [http://opencv-java-tutorials.readthedocs.io/en/latest/](http://opencv-java-tutorials.readthedocs.io/en/latest/ "OpenCV Java Tutorials documentation")
* Java Digital Image Processing Tutorial: [http://www.tutorialspoint.com/java_dip/](http://www.tutorialspoint.com/java_dip/ "Java Digital Image Processing Tutorial")

## MySQL Programming with Java
* MySQL Connector/J: [http://dev.mysql.com/downloads/connector/j/](http://dev.mysql.com/downloads/connector/j/)
* JDBC Tutorial: [http://www.tutorialspoint.com/jdbc/index.htm](http://www.tutorialspoint.com/jdbc/index.htm)
* MySQL Java tutorial: [http://zetcode.com/db/mysqljava/](http://zetcode.com/db/mysqljava/)

## Events Processing
* Key Bindings: [http://docs.oracle.com/javase/tutorial/uiswing/misc/keybinding.html](http://docs.oracle.com/javase/tutorial/uiswing/misc/keybinding.html "How to Use Key Bindings")

### Issues
Close frame by pressing the escape key:

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

## Multi-Threading
## Eclipse
### Shortcuts
* Shift + Alt + S: Override/Implement Method...
* Shift + Alt + R: Rename files

### Intellisense
[http://blog.csdn.net/ysydao/article/details/38731069](http://blog.csdn.net/ysydao/article/details/38731069 "eclipse智能提示及快捷键")