package com.erkin.listetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetayActivity extends AppCompatActivity {
    private TextView detayText;
    private ImageView detayImage;
    private String[] detayList;
    private int[] detayImageList;
    private String[] detayUrlList;

    private String pozisyonAnahtari = "pozisyonAnahtari";

    private int detayPozisyon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);
        detayText = (TextView) findViewById(R.id.metin);
        detayImage = (ImageView) findViewById(R.id.gorsel);
        detayList = new String[] { "Ispanaklı Tepsi Böreği Tarifi İçin Malzemeler\n" +
                "\n"+
                "32 cm çapında tepsi içi;\n" +
                "\n" +
                "4 adet yufka\n" +
                "400 gram lor\n" +
                "2 küçük demet ıspanak\n" +
                "1 büyük kuru soğan\n" +
                "1 tatlı kaşığı biber salçası\n" +
                "1/2 çay bardağı sıvı yağ (soğanı kavurmak için)\n" +
                "Tuz\n" +
                "\n" +
                "sos için:\n" +
                "1 su bardağı süt\n" +
                "1 çay bardağı sıvı yağ\n" +
                "2 küçük yumurta\n" +
                "\n" +
                "Üzeri için:\n" +
                "2 yemek kaşığı yoğurt\n" +
                "1 yumurta sarısı\n" +
                "4 yemek kaşığı sıvı yağ\n" +
                "Susam\n" +
                "Çörek otu",
                "Fırında Patlıcan Kebabı Tarifi İçin Malzemeler\n" +
                        "\n" +
                        "4 adet orta boy patlıcan\n" +
                        "\n" +
                        "Köfte için:\n" +
                        "\n" +
                        "500 gr orta yağlı kıyma\n" +
                        "Yarım çay bardağı zeytinyağı\n" +
                        "1 çay kaşığı karabiber\n" +
                        "1 çay kaşığı pulbiber\n" +
                        "Tuz\n" +
                        "\n" +
                        "Sosu için:\n" +
                        "1 yemek kaşığı salça\n" +
                        "2 su bardağı sıcak su\n" +
                        "Tuz\n" +
                        "\n" +
                        "Üzeri için\n" +
                        "4 adet domates\n" +
                        "4-5 adet biber\n" +
                        "10 adet arpacık soğan\n" +
                        "6-7 diş sarımsak",
                "İrmik Helvası Tarifi İçin Malzemeler\n" +
                        "\n" +
                        "1 su bardağı irmik,\n" +
                        "1 su bardağından 2-3 yemek kaşığı fazla toz şeker,\n" +
                        "1 su bardağı süt,\n" +
                        "1 su bardağı su,\n" +
                        "1 paket vanilya,\n" +
                        "1 paket çam fıstığı, (dolmalık fıstık)\n" +
                        "2 yemek kaşığı tereyağ,\n" +
                        "1 kahve fincanı sıvı yağ,"};
        // detayList = new int[] {R.string.metin_1, R.string.metin_2,R.string.metin_3};
         detayImageList = new int[] {R.drawable.bir, R.drawable.iki, R.drawable.uc};
        detayUrlList = new String[] {"https://www.youtube.com/watch?v=c35cZ-IZAfY", "https://www.youtube.com/watch?v=QdX2_gwbVmo\",", "https://www.youtube.com/watch?v=v_RYmS0zWhc"};
        detayPozisyon = getIntent().getIntExtra(pozisyonAnahtari, -1);

        if (detayPozisyon == -1) {
            Toast.makeText(DetayActivity.this, "Hata Var!", Toast.LENGTH_LONG).show();
        } else {
            detayText.setText(detayList[detayPozisyon]);
            detayImage.setImageResource(detayImageList[detayPozisyon]);
        }
        detayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (detayPozisyon == -1) {
                    Toast.makeText(DetayActivity.this, "Hata Var!", Toast.LENGTH_LONG).show();
                } else {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(detayUrlList[detayPozisyon]));
                    startActivity(i);
                }

            }
        });

    }
}
