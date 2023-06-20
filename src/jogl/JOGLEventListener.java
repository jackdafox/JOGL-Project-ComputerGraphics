/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogl;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;


/**
 *
 * @author USER
 */
public class JOGLEventListener implements GLEventListener {
    
    public static GL2 gl = null;
    public static JOGLImageResource RoadTex = null;
    public static JOGLImageResource SidewalkTex = null;
    public static JOGLImageResource Background = null;
    public static JOGLImageResource Moon = null;
    public static JOGLImageResource Building1 = null;
    public static JOGLImageResource Building2 = null;
    public static JOGLImageResource Window = null;

    @Override
    public void init(GLAutoDrawable drawable) {
    	gl = drawable.getGL().getGL2();
        
        //change background color
        gl.glClearColor(1, 1, 1, 1);
        
        gl.glEnable(GL2.GL_TEXTURE_2D);
        
        RoadTex = new JOGLImageResource("/res/road texture.png");
        SidewalkTex = new JOGLImageResource("/res/sidewalk texture.png");
        Background = new JOGLImageResource("/res/skybackground.png");
        Moon = new JOGLImageResource("/res/Moon.png");
        Building1 = new JOGLImageResource("/res/building1.png");
        Building2 = new JOGLImageResource("/res/building2.png");
        Window = new JOGLImageResource("/res/windows.png");
        
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        gl = drawable.getGL().getGL2();



        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();

        JOGLHouse.background(Background);

        gl.glPushMatrix();
        gl.glTranslatef(-1.5f, 0.5f, 0);
        JOGLHouse.moon(Moon);
        gl.glPopMatrix();

//      buildings
        gl.glPushMatrix();
        gl.glTranslatef(-2, 0, 0);
        JOGLHouse.building(0.7f, 0.7f, 0.7f, Building1, Window);
        gl.glTranslatef(2, -1, 0);
        JOGLHouse.building(0.7f, 0.7f, 0.7f, Building1, Window);
        gl.glTranslatef(2, 0.5f, 0);
        JOGLHouse.building(0.7f, 0.7f, 0.7f, Building2, Window);
        gl.glTranslatef(2, -0.1f, 0);
        JOGLHouse.building(0.7f, 0.7f, 0.7f, Building1, Window);
        gl.glTranslatef(2, 0.5f, 0);
        JOGLHouse.building(0.7f, 0.7f, 0.7f, Building1, Window);
        gl.glPopMatrix();

        //road
        JOGLHouse.road(RoadTex, SidewalkTex);

        //fire hydrant
        gl.glPushMatrix();
        gl.glTranslatef(0, 2.25f, 0);
        JOGLObjectsOS.drawHydrant();
        gl.glTranslatef(2.5f, 0, 0);
        JOGLObjectsOS.drawHydrant();
        gl.glTranslatef(4.5f, 0, 0);
        JOGLObjectsOS.drawHydrant();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(0, 1.8f, 0);
        JOGLObjectsOS.drawLampPost();
        gl.glTranslatef(3, 0, 0);
        JOGLObjectsOS.drawLampPost();
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(-3, -1.9f, 0);
        JOGLHouse.car(0.03f);
        gl.glTranslatef(0, -1f, 0);
        JOGLHouse.car2(0.05f);
        gl.glPopMatrix();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    	gl = drawable.getGL().getGL2();

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();

        gl.glOrtho(0, JOGLRenderer.unitsWide, 0,JOGLRenderer.unitsTall, -1, 1);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
    }

    
}
