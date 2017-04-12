package br.com.timberforest.ratd.utilitarios;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.model.relatorioAssitenciaTecnica.RelatorioAssistenciaTecnica;

import java.io.File;

public class CameraActivity extends ActionBarActivity {

    private static final int TAKE_PICTURE0 = 1;
    private static final int TAKE_PICTURE1 = 2;
    private static final int TAKE_PICTURE2 = 3;
    private static final int TAKE_PICTURE3 = 4;
    private static final int TAKE_PICTURE4 = 5;
    private static final int TAKE_PICTURE5 = 6;

    private ImageView imageViewHorimetro;
    private ImageView imageViewChassi;
    private ImageView imageViewDefeito;
    private ImageView imageViewDefeito1;
    private ImageView imageViewDefeito2;
    private ImageView imageViewDefeito3;

    private RelatorioAssistenciaTecnica relatorioAssistenciaTecnica;

    private Uri outputFileUri;

    public static final String PREF_ID_RATD = "idRatd";
    public TextView ratdId;
    public String idRatd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos);


/*        SharedPreferences settings = getSharedPreferences(PREF_ID_RATD, 0);
        ratdId.setText(settings.getString("idRatd", ""));
        idRatd=ratdId.toString();*/

        imageViewChassi = (ImageView) findViewById(R.id.image_chassi);
        TextView btnChassi = (TextView) findViewById(R.id.btn_foto_chassi);
        btnChassi.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String nomePasta = Environment.getExternalStorageDirectory()+"/relatorios";

                File pasta = new File(nomePasta);
                pasta.mkdirs();
                if(pasta.exists()==true) {
                    pasta.mkdirs();
                }

                File file = new File(nomePasta,"chassi.jpg");
                outputFileUri = Uri.fromFile(file);
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
                startActivityForResult(intent, TAKE_PICTURE0);
            }
        });
        imageViewHorimetro = (ImageView) findViewById(R.id.image_horimetro);
        TextView btnFotoHorimetro = (TextView) findViewById(R.id.btn_foto_horimetro);
        btnFotoHorimetro.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String nomePasta = Environment.getExternalStorageDirectory()+"/relatorios";

                File pasta = new File(nomePasta);
                pasta.mkdirs();
                if(pasta.exists()==true) {
                    pasta.mkdirs();
                }
                File file = new File(nomePasta, "horimetro.jpg");
                outputFileUri = Uri.fromFile(file);
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
                startActivityForResult(intent, TAKE_PICTURE1);
            }
        });
        imageViewDefeito = (ImageView) findViewById(R.id.image_defeito);
        TextView btnDefeito = (TextView) findViewById(R.id.btn_defeito);
        btnDefeito.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String nomePasta = Environment.getExternalStorageDirectory()+"/relatorios";

                File pasta = new File(nomePasta);
                pasta.mkdirs();
                if(pasta.exists()==true) {
                    pasta.mkdirs();
                }
                File file = new File(nomePasta, "defeito.jpg");
                outputFileUri = Uri.fromFile(file);
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
                startActivityForResult(intent, TAKE_PICTURE2);
            }
        });
        imageViewDefeito1 = (ImageView) findViewById(R.id.image_defeito1);
        TextView btnDefeito1 = (TextView) findViewById(R.id.btn_defeito1);
        btnDefeito1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String nomePasta = Environment.getExternalStorageDirectory()+"/relatorios";

                File pasta = new File(nomePasta);
                pasta.mkdirs();
                if(pasta.exists()==true) {
                    pasta.mkdirs();
                }
                File file = new File(nomePasta, "defeito1.jpg");
                outputFileUri = Uri.fromFile(file);
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
                startActivityForResult(intent, TAKE_PICTURE3);
            }
        });
        imageViewDefeito2 = (ImageView) findViewById(R.id.image_defeito2);
        TextView btnDefeito2 = (TextView) findViewById(R.id.btn_defeito2);
        btnDefeito2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String nomePasta = Environment.getExternalStorageDirectory()+"/relatorios";

                File pasta = new File(nomePasta);
                pasta.mkdirs();
                if(pasta.exists()==true) {
                    pasta.mkdirs();
                }
                File file = new File(nomePasta, "defeito2.jpg");
                outputFileUri = Uri.fromFile(file);
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
                startActivityForResult(intent, TAKE_PICTURE4);
            }
        });
        imageViewDefeito3 = (ImageView) findViewById(R.id.image_defeito3);
        TextView btnDefeito3 = (TextView) findViewById(R.id.btn_defeito3);
        btnDefeito3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String nomePasta = Environment.getExternalStorageDirectory()+"/relatorios";

                File pasta = new File(nomePasta);
                pasta.mkdirs();
                if(pasta.exists()==true) {
                    pasta.mkdirs();
                }
                // Arquivo onde ser� armazenada a foto.
                File file = new File(nomePasta, "defeito3.jpg");
                outputFileUri = Uri.fromFile(file);
                // Gera um intent para abrir a activity de camera padr�o do android.
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);
                // Inicia a activity de camera padr�o do android.
                startActivityForResult(intent, TAKE_PICTURE5);
            }
        });
    }

/*    public void atualizarImagens(){
        String nomePasta = Environment.getExternalStorageDirectory()+"/relatorios";
        File pasta = new File(nomePasta);
        pasta.mkdirs();
        if(pasta.exists()==true) {
            pasta.mkdirs();
        }
        File file = new File(nomePasta+"chassi.jpg");
        ImageView iv = (ImageView) findViewById(R.id.image_chassi);
        iv.setImageBitmap(file);
    }*/

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == TAKE_PICTURE0) {

            if (data != null) { //Thumb da imagem
                if (data.hasExtra("data")) {
                    Bitmap thumbnail = data.getParcelableExtra("data");
                    imageViewChassi.setImageBitmap(thumbnail);
                }
            } else {//Imagem full
                // Redimensiona a imagem para o tamanho da imageView.
                int width = imageViewChassi.getWidth();
                int height = imageViewChassi.getHeight();
                BitmapFactory.Options factoryOptions = new BitmapFactory.Options();
                factoryOptions.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(outputFileUri.getPath(),
                        factoryOptions);
                int imageWidth = factoryOptions.outWidth;
                int imageHeight = factoryOptions.outHeight;
                int scaleFactor = Math.min(imageWidth / width, imageHeight
                        / height);
                factoryOptions.inJustDecodeBounds = false;
                factoryOptions.inSampleSize = scaleFactor;
                factoryOptions.inPurgeable = true;
                //Pega o bitmap do arquivo que foi salva a foto
                Bitmap bitmap = BitmapFactory.decodeFile(
                        outputFileUri.getPath(), factoryOptions);

                imageViewChassi.setImageBitmap(bitmap);
            }
        }
        if (requestCode == TAKE_PICTURE1) {

            if (data != null) { //Thumb da imagem
                if (data.hasExtra("data")) {
                    Bitmap thumbnail = data.getParcelableExtra("data");
                    imageViewHorimetro.setImageBitmap(thumbnail);
                }
            } else {//Imagem full
                // Redimensiona a imagem para o tamanho da imageView.
                int width = imageViewHorimetro.getWidth();
                int height = imageViewHorimetro.getHeight();
                BitmapFactory.Options factoryOptions = new BitmapFactory.Options();
                factoryOptions.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(outputFileUri.getPath(),
                        factoryOptions);
                int imageWidth = factoryOptions.outWidth;
                int imageHeight = factoryOptions.outHeight;
                int scaleFactor = Math.min(imageWidth / width, imageHeight
                        / height);
                factoryOptions.inJustDecodeBounds = false;
                factoryOptions.inSampleSize = scaleFactor;
                factoryOptions.inPurgeable = true;

                //Pega o bitmap do arquivo que foi salva a foto
                Bitmap bitmap = BitmapFactory.decodeFile(
                        outputFileUri.getPath(), factoryOptions);

                imageViewHorimetro.setImageBitmap(bitmap);
            }
        }
        if (requestCode == TAKE_PICTURE2) {

            if (data != null) { //Thumb da imagem
                if (data.hasExtra("data")) {
                    Bitmap thumbnail = data.getParcelableExtra("data");
                    imageViewDefeito.setImageBitmap(thumbnail);
                }
            } else {//Imagem full
                // Redimensiona a imagem para o tamanho da imageView.
                int width = imageViewDefeito.getWidth();
                int height = imageViewDefeito.getHeight();
                BitmapFactory.Options factoryOptions = new BitmapFactory.Options();
                factoryOptions.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(outputFileUri.getPath(),
                        factoryOptions);
                int imageWidth = factoryOptions.outWidth;
                int imageHeight = factoryOptions.outHeight;
                int scaleFactor = Math.min(imageWidth / width, imageHeight
                        / height);
                factoryOptions.inJustDecodeBounds = false;
                factoryOptions.inSampleSize = scaleFactor;
                factoryOptions.inPurgeable = true;

                //Pega o bitmap do arquivo que foi salva a foto
                Bitmap bitmap = BitmapFactory.decodeFile(
                        outputFileUri.getPath(), factoryOptions);

                imageViewDefeito.setImageBitmap(bitmap);
            }
        }
        if (requestCode == TAKE_PICTURE3) {

            if (data != null) { //Thumb da imagem
                if (data.hasExtra("data")) {
                    Bitmap thumbnail = data.getParcelableExtra("data");
                    imageViewDefeito1.setImageBitmap(thumbnail);
                }
            } else {//Imagem full
                // Redimensiona a imagem para o tamanho da imageView.
                int width = imageViewDefeito1.getWidth();
                int height = imageViewDefeito1.getHeight();
                BitmapFactory.Options factoryOptions = new BitmapFactory.Options();
                factoryOptions.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(outputFileUri.getPath(),
                        factoryOptions);
                int imageWidth = factoryOptions.outWidth;
                int imageHeight = factoryOptions.outHeight;
                int scaleFactor = Math.min(imageWidth / width, imageHeight
                        / height);
                factoryOptions.inJustDecodeBounds = false;
                factoryOptions.inSampleSize = scaleFactor;
                factoryOptions.inPurgeable = true;

                //Pega o bitmap do arquivo que foi salva a foto
                Bitmap bitmap = BitmapFactory.decodeFile(
                        outputFileUri.getPath(), factoryOptions);

                imageViewDefeito1.setImageBitmap(bitmap);
            }
        }
        if (requestCode == TAKE_PICTURE4) {

            if (data != null) { //Thumb da imagem
                if (data.hasExtra("data")) {
                    Bitmap thumbnail = data.getParcelableExtra("data");
                    imageViewDefeito2.setImageBitmap(thumbnail);
                }
            } else {//Imagem full
                // Redimensiona a imagem para o tamanho da imageView.
                int width = imageViewDefeito2.getWidth();
                int height = imageViewDefeito2.getHeight();
                BitmapFactory.Options factoryOptions = new BitmapFactory.Options();
                factoryOptions.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(outputFileUri.getPath(),
                        factoryOptions);
                int imageWidth = factoryOptions.outWidth;
                int imageHeight = factoryOptions.outHeight;
                int scaleFactor = Math.min(imageWidth / width, imageHeight
                        / height);
                factoryOptions.inJustDecodeBounds = false;
                factoryOptions.inSampleSize = scaleFactor;
                factoryOptions.inPurgeable = true;

                //Pega o bitmap do arquivo que foi salva a foto
                Bitmap bitmap = BitmapFactory.decodeFile(
                        outputFileUri.getPath(), factoryOptions);

                imageViewDefeito2.setImageBitmap(bitmap);
            }
        }
        if (requestCode == TAKE_PICTURE5) {

            if (data != null) { //Thumb da imagem
                if (data.hasExtra("data")) {
                    Bitmap thumbnail = data.getParcelableExtra("data");
                    imageViewDefeito3.setImageBitmap(thumbnail);
                }
            } else {//Imagem full
                // Redimensiona a imagem para o tamanho da imageView.
                int width = imageViewDefeito3.getWidth();
                int height = imageViewDefeito3.getHeight();
                BitmapFactory.Options factoryOptions = new BitmapFactory.Options();
                factoryOptions.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(outputFileUri.getPath(),
                        factoryOptions);
                int imageWidth = factoryOptions.outWidth;
                int imageHeight = factoryOptions.outHeight;
                int scaleFactor = Math.min(imageWidth / width, imageHeight
                        / height);
                factoryOptions.inJustDecodeBounds = false;
                factoryOptions.inSampleSize = scaleFactor;
                factoryOptions.inPurgeable = true;

                //Pega o bitmap do arquivo que foi salva a foto
                Bitmap bitmap = BitmapFactory.decodeFile(
                        outputFileUri.getPath(), factoryOptions);

                imageViewDefeito3.setImageBitmap(bitmap);
            }
        }
    }

}