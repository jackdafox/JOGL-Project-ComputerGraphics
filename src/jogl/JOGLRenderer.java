/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogl;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;

/**
 *
 * @author USER
 */
public class JOGLRenderer {
    private static GLProfile profile = null;
    private static GLWindow window = null;

    public static int screenWidth = 640;
    public static int screenHeight = 360;

    public static float unitsWide = 10;
    public static float unitsTall = unitsWide;

    public static void init() {
        GLProfile.initSingleton();
        profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities caps = new GLCapabilities(profile);

        window = GLWindow.create(caps);
        window.setSize(screenWidth, screenHeight);
        window.addGLEventListener(new JOGLEventListener());
        window.setResizable(false);

        FPSAnimator animator = new FPSAnimator(window, 60);
        animator.start();
        
        window.setVisible(true);
    }
    
    public static void main(String[] args) {
        init();
    }
    public static int getWindowWidth() {
        return window.getWidth();
    }

    public static int getWindowHeight() {
        return window.getHeight();
    }
}
