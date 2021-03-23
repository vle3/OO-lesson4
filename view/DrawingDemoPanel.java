package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class DrawingDemoPanel 
{
    private JFrame window;
    private DrawingDemoCanvas canvas; 
    private JRadioButton circleButton = new JRadioButton("Circle");
    private JRadioButton rectangleButton = new JRadioButton("Rectangle");
    private JRadioButton triangleButton = new JRadioButton("Triangle");

    private JRadioButton whiteColor = new JRadioButton("white");
    private JRadioButton yellowColor = new JRadioButton("yellow");
    private JRadioButton redColor = new JRadioButton("red");

    private JCheckBox filledBox = new JCheckBox("filled");

    private JRadioButton smallSize = new JRadioButton("small");
    private JRadioButton mediumSize = new JRadioButton("medium");
    private JRadioButton largeSize = new JRadioButton("large");

    private JButton sortXButton = new JButton("Sort by X");
    private JButton sortYButton = new JButton("Sort by Y");
    private JButton showAllButton = new JButton("Show All");
    private JButton showOrderButton = new JButton("Show Order"); 
    private JButton clearButton = new JButton("Clear");  
    private JButton exitButton = new JButton("Exit");  
    
    public DrawingDemoPanel (JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();

        canvas = new DrawingDemoCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);

        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);
        southPanel.setLayout(new GridLayout(4,1));
        JPanel shapePanel = new JPanel();
        JPanel colorPanel = new JPanel();
        JPanel sizePanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        southPanel.add(shapePanel);
        southPanel.add(colorPanel);
        southPanel.add(sizePanel);
        southPanel.add(buttonPanel);

        shapePanel.setBorder(BorderFactory.createTitledBorder("Shape"));
        shapePanel.add(circleButton);
        shapePanel.add(rectangleButton);
        shapePanel.add(triangleButton);
        ButtonGroup shapeGroup = new ButtonGroup();
        shapeGroup.add(circleButton);
        shapeGroup.add(rectangleButton);
        shapeGroup.add(triangleButton);
        circleButton.setSelected(true);

        colorPanel.setBorder(BorderFactory.createTitledBorder("Color"));
        colorPanel.add(whiteColor);
        colorPanel.add(yellowColor);
        colorPanel.add(redColor);
        colorPanel.add(filledBox);
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(whiteColor);
        colorGroup.add(yellowColor);
        colorGroup.add(redColor);
        whiteColor.setSelected(true);

        sizePanel.setBorder(BorderFactory.createTitledBorder("Size"));
        sizePanel.add(smallSize);
        sizePanel.add(mediumSize);
        sizePanel.add(largeSize);
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallSize);
        sizeGroup.add(mediumSize);
        sizeGroup.add(largeSize);
        smallSize.setSelected(true);

        buttonPanel.setBorder(BorderFactory.createTitledBorder("Button"));
        buttonPanel.add(sortXButton);
        buttonPanel.add(sortYButton);
        buttonPanel.add(showAllButton);
        buttonPanel.add(showOrderButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);

    }

    public JRadioButton getCircleButton() {
        return circleButton;
    }
    public JRadioButton getRectangleButton() {
        return rectangleButton;
    }
    public JRadioButton getTriangleButton() {
        return triangleButton;
    }
    public JCheckBox getFilledBox() {
        return filledBox;
    }
    public JRadioButton getSmallSize() {
        return smallSize;
    }
    public JRadioButton getMediumSize() {
        return mediumSize;
    }
    public JRadioButton getLargeSize() {
        return largeSize;
    }
    public JButton getSortXButton() {
        return sortXButton;
    }
    public JButton getSortYButton() {
        return sortYButton;
    }
    public JButton getShowAllButton() {
        return showAllButton;
    }
    public JButton getShowOrderButton() {
        return showOrderButton;
    }
    public JButton getClearButton() {
        return clearButton;
    }
    public JButton getExitButton() {
        return exitButton;
    }
    public JRadioButton getRedColor() {
        return redColor;
    }
    public JRadioButton getWhiteColor() {
        return whiteColor;
    }
    public JRadioButton getYellowColor() {
        return yellowColor;
    }
    public DrawingDemoCanvas getCanvas() {
        return canvas;
    }
    public JFrame getWindow() {
        return window;
    }
}
