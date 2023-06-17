package jogl;

import java.util.Random;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.util.texture.Texture;

public class JOGLHouse {
//	public static void house() {
//		GL2 gl = JOGLEventListener.gl;
//		
//		gl.glColor3f(0.5f, 0.5f, 0.5f);
//        gl.glBegin(GL2.GL_QUADS);
//        gl.glVertex2f(4.5f, 4.5f);
//        gl.glVertex2f(4.5f, 5f);
//        gl.glVertex2f(5.5f, 5f);
//        gl.glVertex2f(5.5f, 4.5f);
//        gl.glEnd();
//
//        // Draw the base
//        gl.glBegin(GL2.GL_QUADS);
//        gl.glVertex2f(4.5f, 4.5f);
//        gl.glVertex2f(4.5f, 5f);
//        gl.glVertex2f(5.5f, 5f);
//        gl.glVertex2f(5.5f, 4.5f);
//        gl.glEnd();
//        
//        
//        // Draw the roof (blue)
//        gl.glColor3f(1f, 0.75f, 0.79f);
//        gl.glBegin(GL2.GL_TRIANGLES);
//        gl.glVertex2f(4.4f, 5f);
//        gl.glVertex2f(5.6f, 5f);
//        gl.glVertex2f(5f, 5.4f);
//        gl.glEnd();
//
//        // Draw the door (brown)
//        gl.glColor3f(0.54f, 0.27f, 0.07f);
//        gl.glBegin(GL2.GL_QUADS);
//        gl.glVertex2f(4.9f, 4.9f);
//        gl.glVertex2f(4.9f, 4.9f);
//        gl.glVertex2f(5.1f, 4.7f);
//        gl.glVertex2f(5.1f, 4.5f);
//        gl.glEnd();
//        
//        // Draw the windows (white)
//        gl.glColor3f(1.0f, 1.0f, 1.0f);
//        gl.glBegin(GL2.GL_QUADS);
//        gl.glVertex2f(4.6f, 4.8f);
//        gl.glVertex2f(4.6f, 4.9f);
//        gl.glVertex2f(4.7f, 4.9f);
//        gl.glVertex2f(4.7f, 4.7f);
//
//        gl.glVertex2f(5.3f, 4.8f);
//        gl.glVertex2f(5.3f, 4.9f);
//        gl.glVertex2f(5.4f, 4.9f);
//        gl.glVertex2f(5.4f, 4.8f);
//        gl.glEnd();
//	}
//	

	public static void background(JOGLImageResource image) {
		GL2 gl = JOGLEventListener.gl;
		
		Texture tex = image.getTexture();
		
		if (tex != null)
			gl.glBindTexture(GL2.GL_TEXTURE_2D, tex.getTextureObject());

		gl.glBegin(GL2.GL_QUADS);

		gl.glTexCoord2f(0, 0);
		gl.glVertex2f(0, 10);

		gl.glTexCoord2f(1, 0);
		gl.glVertex2f(10, 10);

		gl.glTexCoord2f(1, 1);
		gl.glVertex2f(10, 0);

		gl.glTexCoord2f(0, 1);
		gl.glVertex2f(0, 0);
		gl.glEnd();
		gl.glFlush();
		gl.glBindTexture(GL2.GL_TEXTURE_2D, 0);

	}

	public static void building(float a, float b, float c) {
		GL2 gl = JOGLEventListener.gl;

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(a, b, c);
		gl.glVertex2f(2, 8);
		gl.glVertex2f(4f, 8);
		gl.glVertex2f(4f, 2);
		gl.glVertex2f(2, 2);
		gl.glEnd();

		gl.glPushMatrix();
		for (int i = 0; i < 5; i++) {
			buildingWindows();
		}
		gl.glPopMatrix();

	}

	public static void buildingWindows() {
		GL2 gl = JOGLEventListener.gl;

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(1, 1, 1);
		gl.glVertex2f(2.2f, 7.8f);
		gl.glVertex2f(3.8f, 7.8f);
		gl.glVertex2f(3.8f, 7.5f);
		gl.glVertex2f(2.2f, 7.5f);
		gl.glEnd();

		gl.glTranslatef(0, -0.8f, 0);
	}

	public static void road(JOGLImageResource image, JOGLImageResource image2) {
		GL2 gl = JOGLEventListener.gl;

		Texture tex = image.getTexture();
		Texture tex2 = image2.getTexture();

		if (tex != null)
			gl.glBindTexture(GL2.GL_TEXTURE_2D, tex.getTextureObject());

		gl.glBegin(GL2.GL_QUADS);

		gl.glTexCoord2f(0, 0);
		gl.glVertex2f(0, 2);

		gl.glTexCoord2f(1, 0);
		gl.glVertex2f(10, 2);

		gl.glTexCoord2f(1, 1);
		gl.glVertex2f(10, 0);

		gl.glTexCoord2f(0, 1);
		gl.glVertex2f(0, 0);
		gl.glEnd();
		gl.glFlush();

		gl.glBindTexture(GL2.GL_TEXTURE_2D, 0);

		if (tex != null)
			gl.glBindTexture(GL2.GL_TEXTURE_2D, tex2.getTextureObject());

		gl.glBegin(GL2.GL_QUADS);

		gl.glTexCoord2f(0, 0);
		gl.glVertex2f(0, 2.5f);

		gl.glTexCoord2f(1, 0);
		gl.glVertex2f(10, 2.5f);

		gl.glTexCoord2f(1, 1);
		gl.glVertex2f(10, 2);

		gl.glTexCoord2f(0, 1);
		gl.glVertex2f(0, 2);
		gl.glEnd();

		gl.glFlush();

		gl.glBindTexture(GL2.GL_TEXTURE_2D, 0);

	}

}