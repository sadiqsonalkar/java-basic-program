import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Menu extends Frame
{
	MenuBar mbar;
	JMenu menu1,submenu,menu2,menu3;
	JMenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11;
	public Menu()
	{
		setTitle("Menu");
		setSize(500,500);
		setLayout(new FlowLayout());
		setVisible(true);
		setLocationRelativeTo(null);
		mbar=new MenuBar();
		menu1=new JMenu("File");
		submenu=new JMenu("Color");
		m1=new JMenuItem("New");
		m2=new JMenuItem("Save clt+s");
		m3=new JMenuItem("Save as");
		m4=new JMenuItem("Open");
		m5=new JMenuItem("Exit");
		m6=new JMenuItem("Red");
		m7=new JMenuItem("Blue");
		m8=new JMenuItem("Yellow");
		menu1.add(m1);
		menu1.add(m2);
		menu1.add(m3);
		menu1.add(m4);
		menu1.add(m5);
		submenu.add(m6);
		submenu.add(m7);
		submenu.add(m8);
		menu1.add(submenu);
		mbar.add(menu1);
		menu2=new JMenu("Edit");
		m9=new JMenuItem("Undo");
		m10=new JMenuItem("Redo");
		menu2.add(m9);
		menu2.add(m10);
		mbar.add(menu2);
		menu3=new JMenu("Help");
		m11=new JMenuItem("About Us");
		menu3.add(m11);
		mbar.add(menu3);
		setMenuBar(mbar);
	}
	public static void main(String args[])
	{
		new Menu();
	}
}
		
		