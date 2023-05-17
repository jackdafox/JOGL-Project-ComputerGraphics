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

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        
        //change background color
        gl.glClearColor(1, 1, 1, 1);
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        gl = drawable.getGL().getGL2();

        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        
        //put your shapes here
        
        gl.glBegin(GL2.GL_TRIANGLES);
            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(5, 8);
            gl.glColor3f(0, 1, 0);
            gl.glVertex2f(3, 2);
            gl.glColor3f(0, 0, 1);
            gl.glVertex2f(7, 2);
        gl.glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();

        gl.glOrtho(0, JOGLRenderer.unitsWide, 0,JOGLRenderer.unitsTall, -1, 1);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
    }

    
}
