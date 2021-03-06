package cz.muni.fi.pv260.presentation.awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Window;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

/**
 * @author <a href="mailto:xstefank122@gmail.com">Martin Stefanko</a>
 */
public class AWTWindowManager {

    private static final int DEFAULT_SIZE = 0;

    private Window window;

    public AWTWindowManager(Window window) {
        this.window = window;

        window.setFont(new Font("Arial", Font.PLAIN, 20));
        window.setBackground(Color.WHITE);
        window.setForeground(Color.RED);
        window.setCursor(window.getToolkit().createCustomCursor(new BufferedImage(3, 3,
                BufferedImage.TYPE_INT_ARGB), new Point(0, 0), "null"));

    }

    public Window getWindow() {
        return window;
    }

    public int getWindowWidth() {
        return (window != null) ? window.getWidth() : DEFAULT_SIZE;
    }

    public int getWindowHeight() {
        return (window != null) ? window.getHeight() : DEFAULT_SIZE;
    }

    public void renderWindow() {
        if (window != null) {
            BufferStrategy bufferStrategy = window.getBufferStrategy();
            if (!bufferStrategy.contentsLost()) {
                bufferStrategy.show();
            }
        }
    }

    public void restoreWindow() {
        if (window != null) {
            window.dispose();
        }
    }
}
