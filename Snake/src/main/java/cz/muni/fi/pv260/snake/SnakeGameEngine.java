package cz.muni.fi.pv260.snake;

import cz.muni.fi.pv260.engine.AbstractInfiniteLoopGameEngine;
import cz.muni.fi.pv260.snake.listener.KeyboardListener;
import cz.muni.fi.pv260.snake.model.GameData;
import cz.muni.fi.pv260.snake.presentation.SnakeScreenManager;

/**
 * @author <a href="mailto:xstefank122@gmail.com">Martin Stefanko</a>
 */
public class SnakeGameEngine extends AbstractInfiniteLoopGameEngine {

    private GameData gameData;
    private SnakeScreenManager screenManager = new SnakeScreenManager();

    public static void main(String[] args) {
        new SnakeGameEngine().run();
    }

    @Override
    public void run() {
        try {
            super.run();
        } finally {
            screenManager.restoreUserEnvironment();
        }
    }

    @Override
    public void init() {
        gameData = new GameData(screenManager.getWindow());
        screenManager.getWindow().addKeyListener(new KeyboardListener(gameData));
    }

    @Override
    public void update() {
        gameData.getSnakeController().moveSnake();
    }

    @Override
    public void redrawWindow() {
        screenManager.updateWindow(gameData);
    }
}
