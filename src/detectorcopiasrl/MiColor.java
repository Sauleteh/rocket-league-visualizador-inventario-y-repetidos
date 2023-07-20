/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package detectorcopiasrl;

import java.awt.Color;

/**
 *
 * @author Saulete
 */
public class MiColor
{
    private static Color miColor = new Color(0,255,0);
    private static int iteraciones = 0;
    private static final int VELOCIDAD_CAMBIO = 51;
    
    private MiColor(){}
    
    public static Color getColor() {return miColor;}
    
    public static void cambiaColorRainbow()
    {
        if (iteraciones >= 0 && iteraciones < 5) miColor = new Color(miColor.getRed() + VELOCIDAD_CAMBIO, miColor.getGreen(), miColor.getBlue());
        else if (iteraciones >= 5 && iteraciones < 10) miColor = new Color(miColor.getRed(), miColor.getGreen() - VELOCIDAD_CAMBIO, miColor.getBlue());
        else if (iteraciones >= 10 && iteraciones < 15) miColor = new Color(miColor.getRed(), miColor.getGreen(), miColor.getBlue() + VELOCIDAD_CAMBIO);
        else if (iteraciones >= 15 && iteraciones < 20) miColor = new Color(miColor.getRed() - VELOCIDAD_CAMBIO, miColor.getGreen(), miColor.getBlue());
        else if (iteraciones >= 20 && iteraciones < 25) miColor = new Color(miColor.getRed(), miColor.getGreen() + VELOCIDAD_CAMBIO, miColor.getBlue());
        else if (iteraciones >= 25 && iteraciones < 30) miColor = new Color(miColor.getRed(), miColor.getGreen(), miColor.getBlue() - VELOCIDAD_CAMBIO);
        else iteraciones = -1;
        
        iteraciones++;
        //System.out.println(iteraciones);
    }
    
    public static void cambiaColorPrincipales()
    {
        if (iteraciones == 0) miColor = Color.RED;
        else if (iteraciones == 1) miColor = Color.BLUE;
        else if (iteraciones == 2) miColor = new Color(0, 102, 0);
        else if (iteraciones == 3) miColor = new Color(204, 102, 0);
        else if (iteraciones == 4) 
        {
            miColor = new Color(165, 18, 116);
            iteraciones = -1;
        }
        
        iteraciones++;
        //System.out.println(iteraciones);
    }
    
    public static void resetColor()
    {
        miColor = new Color(0, 255, 0);
        iteraciones = 0;
    }
}
