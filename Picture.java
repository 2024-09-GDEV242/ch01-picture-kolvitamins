/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * This picture depicts a person visiting a museum to see Piet Mondrain's
 * Composition II in Red, Blue, and Yellow, 1930. They are giving a thumbs
 * up because they are a connoisseur of Bauhaus.
 * 
 * @author  Jeffrey Kolvites
 * @version 2024.09.10
 * 
 */
public class Picture
{
    private Square background;
    private Square red;
    private Square white1;
    private Square yellow;
    private Square white2;
    private Square white3;
    private Square white4;
    private Square white5;
    private Square white6;
    private Square white7;
    private Square white8;
    private Square blue;
    private Square backgroundBlack;
    private Person person;
    private Circle hand;
    private Triangle thumb;
    private Circle head;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square();
        red = new Square();
        white1 = new Square();
        yellow = new Square();
        white2 = new Square();
        white3 = new Square();
        white4 = new Square();
        white5 = new Square();
        white6 = new Square();
        white7 = new Square();
        white8 = new Square();
        blue = new Square();
        backgroundBlack = new Square();
        person = new Person();
        hand = new Circle();
        thumb = new Triangle();
        head = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            backgroundBlack.changeColor("black");
            backgroundBlack.moveHorizontal(150);
            backgroundBlack.moveVertical(10);
            backgroundBlack.changeSize(270);
            backgroundBlack.makeVisible();
            
            background.changeColor("black");
            background.moveHorizontal(160);
            background.moveVertical(20);
            background.changeSize(250);
            background.makeVisible();
            
            red.moveHorizontal(230);
            red.moveVertical(20);
            red.changeSize(180);
            red.makeVisible();
    
            white1.changeColor("white");
            white1.moveHorizontal(385);
            white1.moveVertical(210);
            white1.changeSize(25);
            white1.makeVisible();
    
            white2.changeColor("white");
            white2.moveHorizontal(230);
            white2.moveVertical(210);
            white2.changeSize(60);
            white2.makeVisible();
            
            white3.changeColor("white");
            white3.moveHorizontal(290);
            white3.moveVertical(210);
            white3.changeSize(60);
            white3.makeVisible();
            
            white4.changeColor("white");
            white4.moveHorizontal(315);
            white4.moveVertical(210);
            white4.changeSize(60);
            white4.makeVisible();
            
            white5.changeColor("white");
            white5.moveHorizontal(160);
            white5.moveVertical(40);
            white5.changeSize(60);
            white5.makeVisible();
            
            white6.changeColor("white");
            white6.moveHorizontal(160);
            white6.moveVertical(20);
            white6.changeSize(60);
            white6.makeVisible();
            
            white7.changeColor("white");
            white7.moveHorizontal(160);
            white7.moveVertical(120);
            white7.changeSize(60);
            white7.makeVisible();
            
            white8.changeColor("white");
            white8.moveHorizontal(160);
            white8.moveVertical(140);
            white8.changeSize(60);
            white8.makeVisible();
            
            blue.changeColor("blue");
            blue.moveHorizontal(160);
            blue.moveVertical(210);
            blue.changeSize(60);
            blue.makeVisible();
            
            yellow.changeColor("yellow");
            yellow.moveHorizontal(385);
            yellow.moveVertical(245);
            yellow.changeSize(25);
            yellow.makeVisible();
            
            person.changeColor("black");
            person.moveHorizontal(80);
            person.moveVertical(210);
            person.changeSize(100,60);
            person.makeVisible();
            
            hand.changeColor("black");
            hand.moveHorizontal(102);
            hand.moveVertical(218);
            hand.changeSize(20);
            hand.makeVisible();
            
            thumb.changeColor("black");
            thumb.moveHorizontal(107);
            thumb.moveVertical(210);
            thumb.changeSize(12,10);
            thumb.makeVisible();
            
            head.changeColor("black");
            head.moveHorizontal(60);
            head.moveVertical(175);
            head.changeSize(40);
            head.makeVisible();
            drawn = true;
        
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        backgroundBlack.changeColor("black");
        background.changeColor("black");
        white1.changeColor("white");
        white2.changeColor("white");
        white3.changeColor("white");
        white4.changeColor("white");
        white5.changeColor("white");
        white6.changeColor("white");
        white7.changeColor("white");
        white8.changeColor("white");
        red.changeColor("white");
        blue.changeColor("white");
        yellow.changeColor("white");
        person.changeColor("black");
        hand.changeColor("black");
        thumb.changeColor("black");
        head.changeColor("black");        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        backgroundBlack.changeColor("black");
        background.changeColor("black");
        white1.changeColor("white");
        white2.changeColor("white");
        white3.changeColor("white");
        white4.changeColor("white");
        white5.changeColor("white");
        white6.changeColor("white");
        white7.changeColor("white");
        white8.changeColor("white");
        red.changeColor("red");
        blue.changeColor("blue");
        yellow.changeColor("yellow");
        person.changeColor("black");
        hand.changeColor("black");
        thumb.changeColor("black");
        head.changeColor("black"); 
    }
    
}
