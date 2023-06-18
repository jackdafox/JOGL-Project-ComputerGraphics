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
    
    @Override
    public void init(GLAutoDrawable drawable) {
    	gl = drawable.getGL().getGL2();
        
        //change background color
        gl.glClearColor(0, 0, 0.3f, 1);
        
        gl.glEnable(GL2.GL_TEXTURE_2D);
        
        RoadTex = new JOGLImageResource("/res/road texture.png");
        SidewalkTex = new JOGLImageResource("/res/sidewalk texture.png");
        Background = new JOGLImageResource("/res/Star.png");
        Moon = new JOGLImageResource("/res/Moon.png");
        
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
        
        JOGLHouse.moon(Moon);
        
//      buildings
        gl.glPushMatrix();
        gl.glTranslatef(-2, 0, 0);
        JOGLHouse.building(0.3f, 0.3f, 0.3f);
        gl.glTranslatef(2, -1, 0);
        JOGLHouse.building(0.32f, 0.32f, 0.32f);
        gl.glTranslatef(2, 0.5f, 0);
        JOGLHouse.building(0.31f, 0.31f, 0.31f);
        gl.glTranslatef(2, -0.1f, 0);
        JOGLHouse.building(0.35f, 0.35f, 0.35f);
        gl.glTranslatef(2, 0.5f, 0);
        JOGLHouse.building(0.37f, 0.37f, 0.37f);
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
