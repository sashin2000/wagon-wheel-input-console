package MCG;
import javax.swing.*;
import java.awt.event.*;
public class WWheal extends JFrame
{
	JFrame j1;
	static int pid,psession,sshot;
	static String pTeam=" ";
	static float xScore,YScore;
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(pid+" "+pTeam+" "+xScore);

	}
	public void cordinput()
	{
		
	}

}
/*public class GraphicsSet extends JFrame{

Font f ;

BufferedImage baseImage ;

File file ;

String Gimage;

JFrame imageFrame;

public GraphicsSet(String Image)
{
   super("Frame") ;
  // imageFrame = new JFrame("Click on to select points");
   file = new File(Image) ;
   Gimage = Image;
   try
   {
       baseImage = ImageIO.read(file) ;
   }
   catch(IOException e)
   {
       System.out.println(e) ; 
   }
   int imageWidth = baseImage.getWidth();
   int imageHeight = baseImage.getHeight();
   System.out.println(imageWidth);

   setBounds(0,0,imageWidth,imageHeight) ;
   setVisible(true) ;
   //setDefaultCloseOperation (EXIT_ON_CLOSE) ;
}

public void paint(Graphics g)
{
   g.drawImage(baseImage, 0, 0, null) ;

   String[] coordsText = new String[]{ 
     "264.33,329.94","244.24,382.57","243.00,328.88",
     "264.33,329.94","272.06,331.59","278.30,341.00",
     "284.28,350.02","282.18,367.78","275.24,375.79",
     "272.89,378.50","269.26,380.27","266.00,381.66",
     "259.36,384.50","258.52,383.52","252.00,383.09",
     "244.24,382.57","238.62,383.56","232.21,377.61",
     "228.01,373.71","225.52,365.66","226.13,360.00",
     "226.13,360.00","227.55,354.00","227.55,354.00",
     "228.20,350.96","227.74,347.67","228.74,345.00",
     "230.78,339.55","237.90,331.81","243.00,328.88",
     "248.10,327.42","249.02,328.30","254.00,328.88"
     };
// The polygons will be stored in instances of Path2D.Float. After we create an instance 
 // of Path2D.Float we must set its vertices -- the easiest way to do this is through the
// moveTo(x,y) and lineTo(x,y) methods.
Path2D.Float regionOfInterest = new Path2D.Float();
// We must store the first X,Y coordinates so we can close the path, by creating a line
// to the last point to the first one.
boolean isFirst = true;
double firstX=0,firstY=0;
// For each of the X,Y coordinates, parse and store them on the Path2D.Float.    
for(String s:coordsText)
  {
  String[] xy = s.split(",");
  double x = Double.parseDouble(xy[0]);
  double y = Double.parseDouble(xy[1]);
  if (isFirst) 
    { 
    regionOfInterest.moveTo(x,y); 
    firstX = x;
    firstY = y;
    isFirst = false; 
    }
  else { regionOfInterest.lineTo(x,y); }
  }
// Close the path.
regionOfInterest.lineTo(firstX,firstY);
// We have the path that define the region of interest. In order to dim the image regions
// outside of this path we must create another path that contains everything but the 
// region of interest.
// First we create a path for the whole image -- a rectangle with the image's coordinates.
Path2D.Float pathForWholeImage = new Path2D.Float();
pathForWholeImage.moveTo(0,0);
pathForWholeImage.lineTo(baseImage.getWidth(),0);
pathForWholeImage.lineTo(baseImage.getWidth(),baseImage.getHeight());
pathForWholeImage.lineTo(0,baseImage.getHeight());
pathForWholeImage.lineTo(0,0);
// In order to use Constructive Area Geometry (CAG) operations we must use the Area class.
// First we create an Area with the path for the whole image...
Area wholeImage = new Area(pathForWholeImage);
// .. then we subtract the region of interest from this Area.
wholeImage.subtract(new Area(regionOfInterest));
// Now we have a Path2D.Float for the region of interest and an Area for the rest of the image.    
// To draw and paint them we need a graphic context, which we will get from the image itself. 
Graphics2D g2d = (Graphics2D)baseImage.getGraphics();
// We want antialiasing!
g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
// Fill the rest of the image with a transparent (100/255) white.
g2d.setColor(new Color(255,255,255,100));
g2d.fill(wholeImage);
// Draw the region of interest with a thick, almost opaque red line.    
g2d.setStroke(new BasicStroke(5f));
g2d.setColor(new Color(255,0,0,200));
g2d.draw(regionOfInterest);
// Create a new Frame to show the results.
JFrame frame = new JFrame();
//imageFrame.setTitle("Highlighting image regions");
// Create an ImageIcon/Label to show the image.
ImageIcon icon = new ImageIcon(baseImage);
JLabel label = new JLabel(icon);
// Add it to the content pane.
imageFrame.getContentPane().add(new JScrollPane(label));
//Set some GUI parameters.
//imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
imageFrame.pack();  
//frame.setVisible(true); 

*/