import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame
{
    static Editor content = new Editor();
    
    public Main()
    {
        int[] max_size = getmaxsize();
        
        getContentPane().add(content); // add the editor window to the pane
        setVisible(true);
        setSize(max_size[0], max_size[1]);
        setFocusable(true);
        setBackground(Color.black);
        setTitle("Editor"); // title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public int[] getmaxsize()
    {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        
        int[] toReturn = {width,height};
        
        return toReturn;
    }
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }});
    }
}
