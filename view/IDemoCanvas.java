package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.awt.Dimension;

import javax.swing.JPanel;

import model.idemo.IRender;
import model.images.ImageStore;

public class IDemoCanvas extends JPanel
{
    private IDemoPanel panel ;
    private ArrayList<IRender> pictures = new ArrayList<>();

    public IDemoCanvas(IDemoPanel panel)
    {
        this.panel = panel;
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for(var p : pictures)
        {
            p.render(g2);
        }
    }

    public ArrayList<IRender> getPictures() {
        return pictures;
    }
}
