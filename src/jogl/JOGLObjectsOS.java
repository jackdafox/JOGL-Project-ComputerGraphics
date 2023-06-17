package jogl;

import com.jogamp.opengl.GL2;

public class JOGLObjectsOS {

	static GL2 gl = JOGLEventListener.gl;

	public static void drawTree() {
		
		gl.glColor3f(0, 0.154f, 0);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(4, 2);
		gl.glVertex2f(4, 2.5f);
		gl.glVertex2f(6, 2.5f);
		gl.glVertex2f(6, 2);
		gl.glEnd();
		
		gl.glColor3f(0.83f, 0.53f, 0.1f);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(4.75f, 2.5f);
		gl.glVertex2f(4.75f, 5);
		gl.glVertex2f(5.25f, 5);
		gl.glVertex2f(5.25f, 2.5f);
		gl.glEnd();

		gl.glColor3f(0.83f, 0.53f, 0.1f);
		gl.glBegin(GL2.GL_TRIANGLES);
		gl.glVertex2f(5, 8);
		gl.glVertex2f(4, 5);
		gl.glVertex2f(6, 5);
		gl.glEnd();

		gl.glColor3f(0.83f, 0.53f, 0.1f);
		gl.glBegin(GL2.GL_TRIANGLES);
		gl.glVertex2f(5, 9);
		gl.glVertex2f(4, 6);
		gl.glVertex2f(6, 6);
		gl.glEnd();

		gl.glBegin(GL2.GL_TRIANGLES);
		gl.glColor3f(0.83f, 0.53f, 0.1f);
		gl.glVertex2f(5, 10);
		gl.glVertex2f(4, 7);
		gl.glVertex2f(6, 7);
		gl.glEnd();
	}

	public static void drawHydrant() {
		gl.glPushMatrix();
		gl.glScalef(0.1f, 0.1f, 0);

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.55f, 0, 0);
		gl.glVertex2f(1.25f, 2);
		gl.glVertex2f(1.25f, 3);
		gl.glVertex2f(2.75f, 3);
		gl.glVertex2f(2.75f, 2);
		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.55f, 0, 0);
		gl.glVertex2f(1.5f, 3);
		gl.glVertex2f(1.5f, 4);
		gl.glVertex2f(2.5f, 4);

		gl.glVertex2f(2.5f, 3);
		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.55f, 0, 0);
		gl.glVertex2f(1, 4.5f);

		gl.glVertex2f(1, 5);
		gl.glVertex2f(3, 5);

		gl.glVertex2f(3, 4.5f);

		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.55f, 0, 0);
		gl.glVertex2f(1.25f, 4);

		gl.glVertex2f(1.25f, 5.5f);

		gl.glVertex2f(2.75f, 5.5f);

		gl.glVertex2f(2.75f, 4);

		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.55f, 0, 0);
		gl.glVertex2f(1.5f, 5.5f);

		gl.glVertex2f(1.5f, 6.25f);

		gl.glVertex2f(2.5f, 6.25f);

		gl.glVertex2f(2.5f, 5.5f);
		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.55f, 0, 0);
		gl.glVertex2f(1.25f, 6.25f);
		gl.glVertex2f(1.25f, 7.25f);
		gl.glVertex2f(2.75f, 7.25f);
		gl.glVertex2f(2.75f, 6.25f);
		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.55f, 0, 0);
		gl.glVertex2f(1.5f, 7.25f);

		gl.glVertex2f(1.5f, 7.75f);

		gl.glVertex2f(2.5f, 7.75f);

		gl.glVertex2f(2.5f, 7.25f);

		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.55f, 0, 0);
		gl.glVertex2f(1.75f, 7.75f);

		gl.glVertex2f(1.75f, 8.25f);

		gl.glVertex2f(2.25f, 8.25f);

		gl.glVertex2f(2.25f, 7.75f);

		gl.glEnd();
		gl.glPopMatrix();
	}

	public static void drawLampPost() {
		gl.glPushMatrix();
		gl.glScalef(0.3f, 0.3f, 0);
		
		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.5f, 0.5f, 0.5f);
		gl.glVertex2f(7, 2);

		gl.glVertex2f(7, 2.25f);

		gl.glVertex2f(8, 2.25f);

		gl.glVertex2f(8, 2);

		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(0.4f, 0.4f, 0.4f);
		gl.glVertex2f(7.15f, 2.25f);

		gl.glVertex2f(7.15f, 4);

		gl.glVertex2f(7.85f, 4);

		gl.glVertex2f(7.85f, 2.25f);

		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(7.4f, 4);

		gl.glVertex2f(7.4f, 8);

		gl.glVertex2f(7.6f, 8);

		gl.glVertex2f(7.6f, 4);

		gl.glEnd();

		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(6.8f, 7.4f);

		gl.glVertex2f(6.8f, 7.7f);

		gl.glVertex2f(7.6f, 7.7f);

		gl.glVertex2f(7.6f, 7.4f);

		gl.glEnd();
		gl.glPopMatrix();
	}
	
}
