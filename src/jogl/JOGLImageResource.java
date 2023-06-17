package jogl;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.awt.AWTTextureIO;

public class JOGLImageResource {
	
	private Texture texture = null;
	
	private BufferedImage image = null;
	
	public JOGLImageResource (String path) {
		URL url = JOGLImageResource.class.getResource(path);
		
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (image != null) {
			image.flush();
		}
		
	}
	
	public Texture getTexture() {
		if (image == null) {
			return null;
		}
		
		if (texture == null) {
			texture = AWTTextureIO.newTexture(JOGLRenderer.getProfile(), image, true);
		}
		
		return texture;
	}
}
 