package io.github.BoberCoder0.TarafficGo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/** First screen of the application. Displayed after the application is created. */
public class FirstScreen implements Screen {
    private OrthographicCamera camera;
    private Viewport viewport;
    private SpriteBatch batch;
    private Texture backgroundTexture;
    private Stage stage;
    private Skin skin;

    // Размеры виртуального экрана (соотношение 16:9)
    private static final float VIRTUAL_WIDTH = 1920;
    private static final float VIRTUAL_HEIGHT = 1080;

    @Override
    public void show() {
        // Создаем камеру и вьюпорт
        camera = new OrthographicCamera();
        viewport = new FitViewport(VIRTUAL_WIDTH, VIRTUAL_HEIGHT, camera);
        viewport.apply();

        // Центрируем камеру
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);

        // Инициализируем SpriteBatch
        batch = new SpriteBatch();

        // Загружаем фоновое изображение
        backgroundTexture = new Texture(Gdx.files.internal("background_menu.jpg"));

        // Создаем Stage для UI
        stage = new Stage(viewport); // Используем тот же вьюпорт
        Gdx.input.setInputProcessor(stage);

        // Загружаем скин
        skin = new Skin(Gdx.files.internal("uiskin.json"));

        // Создаем кнопку "Начать игру"
        TextButton startButton = new TextButton("Play", skin);
        startButton.getLabel().setFontScale(3f); // Увеличиваем размер текста в x.x раза
        startButton.setSize(400, 150); // Ширина: 400, Высота: 150
        startButton.setColor(Color.LIME); // Устанавливаем цвет кнопки
        startButton.setPosition(
            VIRTUAL_WIDTH / 20 - startButton.getWidth() / 20, // Центрируем по горизонтали
            VIRTUAL_HEIGHT / 20 - startButton.getHeight() / 20 // Центрируем по вертикали
        );
        stage.addActor(startButton);
    }

    @Override
    public void render(float delta) {
        // Очищаем экран
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Устанавливаем проекционную матрицу для SpriteBatch
        batch.setProjectionMatrix(camera.combined);

        // Отрисовываем фон
        batch.begin();
        batch.draw(backgroundTexture, 0, 0, VIRTUAL_WIDTH, VIRTUAL_HEIGHT);
        batch.end();

        // Отрисовываем UI
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        // Обновляем вьюпорт при изменении размера окна
        viewport.update(width, height);
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
    }

    @Override
    public void dispose() {
        // Освобождаем ресурсы
        batch.dispose();
        backgroundTexture.dispose();
        stage.dispose();
        skin.dispose();
    }

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {} //commit 0.0.0(FirstScreen update) [p[p
}
