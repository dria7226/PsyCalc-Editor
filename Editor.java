import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
    
public class Editor extends JPanel implements MouseListener, MouseMotionListener, MouseWheelListener 
{
    public Editor()
    {
        setBackground(Color.black);
        addListeners();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    //Helpers
    public void addListeners()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }
    
    //Controls
    public void mouseExited(MouseEvent e){
    
    }
    
    public void mouseEntered(MouseEvent e){
    
    }
    
    public void mouseReleased(MouseEvent e){
        
    }
    
    public void mousePressed(MouseEvent e){
    
    }
    
    public void mouseClicked(MouseEvent e){
        
    }
    
    public void mouseMoved(MouseEvent e){        
       
    }
    
    public void mouseDragged(MouseEvent e){
    
    }
    
    public void mouseWheelMoved(MouseWheelEvent e){
    
    }
}
