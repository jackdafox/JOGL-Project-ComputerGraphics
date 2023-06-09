package jogl;

import java.util.Random;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.util.texture.Texture;

public class JOGLHouse {
	
	static float carXValue = 0;
	static float carXValue2 = 0;

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

	public static void building(float a, float b, float c, JOGLImageResource image, JOGLImageResource window) {
		GL2 gl = JOGLEventListener.gl;


		Texture tex = image.getTexture();
		Texture tex2 = window.getTexture();

		if (tex != null)
			gl.glBindTexture(GL2.GL_TEXTURE_2D, tex.getTextureObject());

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(a, b, c);
		gl.glTexCoord2f(0, 0);
		gl.glVertex2f(2, 8);

		gl.glTexCoord2f(1, 0);
		gl.glVertex2f(4f, 8);

		gl.glTexCoord2f(1, 1);
		gl.glVertex2f(4f, 2);

		gl.glTexCoord2f(0, 1);
		gl.glVertex2f(2, 2);
		gl.glEnd();
		gl.glFlush();

		gl.glBindTexture(GL2.GL_TEXTURE_2D, 0);

		gl.glPushMatrix();
		for (int i = 0; i < 5; i++) {
			buildingWindows(window);
		}
		gl.glPopMatrix();

	}

	public static void buildingWindows(JOGLImageResource image) {
		GL2 gl = JOGLEventListener.gl;
		Texture tex = image.getTexture();

		if (tex != null)
			gl.glBindTexture(GL2.GL_TEXTURE_2D, tex.getTextureObject());

		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3f(1, 1, 1);
		gl.glTexCoord2f(0, 0);
		gl.glVertex2f(2.2f, 7.8f);

		gl.glTexCoord2f(1, 0);
		gl.glVertex2f(3.8f, 7.8f);

		gl.glTexCoord2f(1, 1);
		gl.glVertex2f(3.8f, 7.5f);

		gl.glTexCoord2f(0, 1);
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

	public static void car(float speed) {
		GL2 gl = JOGLEventListener.gl;

		gl.glPushMatrix();
		gl.glTranslatef(carXValue, 0, 0);

		carXValue += speed;

		if (carXValue > 11)
			carXValue = 0;

		gl.glPushMatrix();
		gl.glTranslatef(1, 2, 0);
		gl.glScalef(0.5f, 0.5f, 0);

		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(1, 0, 0);
		gl.glVertex2f(3, 4.7f);
		gl.glVertex2f(5, 4.7f);
		gl.glVertex2f(5.2f, 4.3f);
		gl.glVertex2f(5.2f, 3.5f);
		gl.glVertex2f(3, 3.5f);
		gl.glVertex2f(3, 3.6f);
		gl.glEnd();

		// Car window
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(3.5f, 5.8f);
		gl.glVertex2f(4.5f, 5.8f);
		gl.glVertex2f(4.7f, 4.7f);
		gl.glVertex2f(3.3f, 4.7f);
		gl.glEnd();

		gl.glPushMatrix();
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(3.2f, 3.7f);
		gl.glVertex2f(3.7f, 3.7f);
		gl.glVertex2f(3.7f, 2.9f);
		gl.glVertex2f(3.2f, 2.9f);
		gl.glEnd();

		gl.glPushMatrix();

		//Back tyre
		gl.glColor3f(1, 1, 1);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(3.5f, 3.4f);
		gl.glVertex2f(3.4f, 3.4f);
		gl.glVertex2f(3.4f, 3.2f);
		gl.glVertex2f(3.5f, 3.2f);
		gl.glEnd();

		gl.glPopMatrix();

		gl.glTranslatef(1.1f, 0, 0);
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(3.2f, 3.7f);
		gl.glVertex2f(3.7f, 3.7f);
		gl.glVertex2f(3.7f, 2.9f);
		gl.glVertex2f(3.2f, 2.9f);
		gl.glEnd();

		//Inner front tyre
		gl.glColor3f(1, 1, 1);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(3.5f, 3.4f);
		gl.glVertex2f(3.4f, 3.4f);
		gl.glVertex2f(3.4f, 3.2f);
		gl.glVertex2f(3.5f, 3.2f);
		gl.glEnd();

		gl.glPopMatrix();
		
		gl.glPopMatrix();
	}
	
	public static void car2(float speed) {
		GL2 gl = JOGLEventListener.gl;

		gl.glPushMatrix();
		gl.glTranslatef(carXValue2, 0, 0);

		carXValue2 += speed;

		if (carXValue2 > 11)
			carXValue2 = 0;

		gl.glPushMatrix();
		gl.glTranslatef(1, 2, 0);
		gl.glScalef(0.5f, 0.5f, 0);

		//car body
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(0, 1, 0);
		gl.glVertex2f(3, 4.6f);
		gl.glVertex2f(5, 4.6f);
		gl.glVertex2f(5.3f, 4.1f);
		gl.glVertex2f(5.3f, 3.5f);
		gl.glVertex2f(5, 3.5f);
		gl.glVertex2f(3, 3.5f);
		gl.glEnd();
		
		//car window
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(3.5f, 5.5f);
		gl.glVertex2f(4.5f, 5.5f);
		gl.glVertex2f(4.7f, 4.6f);
		gl.glVertex2f(3.3f, 4.6f);
		gl.glEnd();
		
		//tire
		gl.glPushMatrix();
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(3.2f, 3.7f);
		gl.glVertex2f(3.7f, 3.7f);
		gl.glVertex2f(3.7f, 2.9f);
		gl.glVertex2f(3.2f, 2.9f);
		gl.glEnd();

		gl.glPushMatrix();
		
		//rim
		gl.glColor3f(1, 1, 1);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(3.5f, 3.4f);
		gl.glVertex2f(3.4f, 3.4f);
		gl.glVertex2f(3.4f, 3.2f);
		gl.glVertex2f(3.5f, 3.2f);
		gl.glEnd();

		gl.glPopMatrix();
		
		//tire
		gl.glTranslatef(1.1f, 0, 0);
		gl.glColor3f(0, 0, 0);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(3.2f, 3.7f);
		gl.glVertex2f(3.7f, 3.7f);
		gl.glVertex2f(3.7f, 2.9f);
		gl.glVertex2f(3.2f, 2.9f);
		gl.glEnd();
		
		//rim
		gl.glColor3f(1, 1, 1);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(3.5f, 3.4f);
		gl.glVertex2f(3.4f, 3.4f);
		gl.glVertex2f(3.4f, 3.2f);
		gl.glVertex2f(3.5f, 3.2f);
		gl.glEnd();

		gl.glPopMatrix();
		
		gl.glPopMatrix();
	}
	
	public static void moon(JOGLImageResource image) {
		
		GL2 gl = JOGLEventListener.gl;
		
		Texture tex = image.getTexture();
		
		if (tex != null)
			gl.glBindTexture(GL2.GL_TEXTURE_2D, tex.getTextureObject());
		
		gl.glColor3f(1, 1, 1);
		gl.glBegin(GL2.GL_QUADS);
		gl.glTexCoord2f(0, 0);
		gl.glVertex2f(8, 9);
		
		gl.glTexCoord2f(1, 0);
		gl.glVertex2f(9, 9);
		
		gl.glTexCoord2f(1, 1);
		gl.glVertex2f(9, 7.2f);
		
		gl.glTexCoord2f(0, 1);
		gl.glVertex2f(8, 7.2f);
		gl.glEnd();
		gl.glFlush();
		
		gl.glBindTexture(GL2.GL_TEXTURE_2D, 0);
	}

}
