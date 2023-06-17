package jogl;

import com.jogamp.opengl.GL2;

public class JOGLGraphics {
	static GL2 gl = JOGLEventListener.gl;
	public static void house(float r, float g, float b) {
		
		gl.glColor3f(0.5f, 0.5f, 0.5f);
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex2f(-0.5f, -0.5f);
        gl.glVertex2f(-0.5f, 0.0f);
        gl.glVertex2f(0.5f, 0.0f);
        gl.glVertex2f(0.5f, -0.5f);
        gl.glEnd();

        // Draw the base
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex2f(-0.5f, -0.5f);
        gl.glVertex2f(-0.5f, 0.0f);
        gl.glVertex2f(0.5f, 0.0f);
        gl.glVertex2f(0.5f, -0.5f);
        gl.glEnd();
         
        // Draw the roof (blue)
        gl.glColor3f(0.0f, 0.0f, 1.0f);
        gl.glBegin(GL2.GL_TRIANGLES);
        gl.glVertex2f(-0.6f, 0.0f);
        gl.glVertex2f(0.6f, 0.0f);
        gl.glVertex2f(0.0f, 0.4f);
        gl.glEnd();

        // Draw the door (brown)
        gl.glColor3f(0.54f, 0.27f, 0.07f);
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex2f(-0.1f, -0.5f);
        gl.glVertex2f(-0.1f, -0.3f);
        gl.glVertex2f(0.1f, -0.3f);
        gl.glVertex2f(0.1f, -0.5f);
        gl.glEnd();
        
        // Draw the windows (white)
        gl.glColor3f(r, g, b);
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex2f(-0.4f, -0.2f);
        gl.glVertex2f(-0.4f, -0.1f);
        gl.glVertex2f(-0.3f, -0.1f);
        gl.glVertex2f(-0.3f, -0.2f);

        gl.glVertex2f(0.3f, -0.2f);
        gl.glVertex2f(0.3f, -0.1f);
        gl.glVertex2f(0.4f, -0.1f);
        gl.glVertex2f(0.4f, -0.2f);
        gl.glEnd();
	}
}
