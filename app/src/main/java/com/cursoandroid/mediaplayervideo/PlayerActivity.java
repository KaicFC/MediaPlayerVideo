package com.cursoandroid.mediaplayervideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        //Esconde a statusBar e a barra de navegação
        //FullScreen
        View decorView = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOpcoes);

        //Esconder a ActionBar
        getSupportActionBar().hide();

        //Configurar os controles do vídeo
        videoView.setMediaController(new MediaController(this));
        //Definir o caminho do vídeo
        //Path("android.resource") - Interno do Android
        //uri para WEB
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        //Executar o vídeo
        videoView.start();
    }

}
