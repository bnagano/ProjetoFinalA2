package com.nagano.appgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class games extends AppCompatActivity {

    ImageButton img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16, img17, img18,
                img19, img20, img21, img22, img23, img24, img25, img26, img27, img28, img29, img30, img31, img32, img33,img34,img35,
                img36, img37, img38, img39, img40, img41, img42, img43, img44, img45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        img1 = (ImageButton) findViewById(R.id.imageView1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, amongus.class);
                startActivity(intent);
            }
        });

        img2 = (ImageButton) findViewById(R.id.imageView2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, bloodborne.class);
                startActivity(intent);
            }
        });

        img3 = (ImageButton) findViewById(R.id.imageView3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, bf4.class);
                startActivity(intent);
            }
        });

        img4 = (ImageButton) findViewById(R.id.imageView4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, bully.class);
                startActivity(intent);
            }
        });

        img5 = (ImageButton) findViewById(R.id.imageView5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, cod.class);
                startActivity(intent);
            }
        });

        img6 = (ImageButton) findViewById(R.id.imageView6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, crash.class);
                startActivity(intent);
            }
        });

        img7 = (ImageButton) findViewById(R.id.imageView7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, csgo.class);
                startActivity(intent);
            }
        });

        img8 = (ImageButton) findViewById(R.id.imageView8);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, cup.class);
                startActivity(intent);
            }
        });

        img9 = (ImageButton) findViewById(R.id.imageView9);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, cyber.class);
                startActivity(intent);
            }
        });

        img10 = (ImageButton) findViewById(R.id.imageView10);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, dayz.class);
                startActivity(intent);
            }
        });

        img11 = (ImageButton) findViewById(R.id.imageView11);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, dbd.class);
                startActivity(intent);
            }
        });

        img12 = (ImageButton) findViewById(R.id.imageView12);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, diablo.class);
                startActivity(intent);
            }
        });

        img13 = (ImageButton) findViewById(R.id.imageView13);
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, doom.class);
                startActivity(intent);
            }
        });

        img14 = (ImageButton) findViewById(R.id.imageView14);
        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, ds.class);
                startActivity(intent);
            }
        });

        img15 = (ImageButton) findViewById(R.id.imageView15);
        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, fallout4.class);
                startActivity(intent);
            }
        });

        img16 = (ImageButton) findViewById(R.id.imageView16);
        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, ff.class);
                startActivity(intent);
            }
        });

        img17 = (ImageButton) findViewById(R.id.imageView17);
        img17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, fifa.class);
                startActivity(intent);
            }
        });

        img18 = (ImageButton) findViewById(R.id.imageView18);
        img18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, fortnite.class);
                startActivity(intent);
            }
        });

        img19 = (ImageButton) findViewById(R.id.imageView19);
        img19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, forza.class);
                startActivity(intent);
            }
        });

        img20 = (ImageButton) findViewById(R.id.imageView20);
        img20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, gow.class);
                startActivity(intent);
            }
        });

        img21 = (ImageButton) findViewById(R.id.imageView21);
        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, gtasa.class);
                startActivity(intent);
            }
        });

        img22 = (ImageButton) findViewById(R.id.imageView22);
        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, gtav.class);
                startActivity(intent);
            }
        });

        img23 = (ImageButton) findViewById(R.id.imageView23);
        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, hk.class);
                startActivity(intent);
            }
        });

        img24 = (ImageButton) findViewById(R.id.imageView24);
        img24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, horizon.class);
                startActivity(intent);
            }
        });

        img25 = (ImageButton) findViewById(R.id.imageView25);
        img25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, isaac.class);
                startActivity(intent);
            }
        });

        img26 = (ImageButton) findViewById(R.id.imageView26);
        img26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, lastus.class);
                startActivity(intent);
            }
        });

        img27 = (ImageButton) findViewById(R.id.imageView27);
        img27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, lol.class);
                startActivity(intent);
            }
        });

        img28 = (ImageButton) findViewById(R.id.imageView28);
        img28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, mine.class);
                startActivity(intent);
            }
        });

        img29 = (ImageButton) findViewById(R.id.imageView29);
        img29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, outlast.class);
                startActivity(intent);
            }
        });

        img30 = (ImageButton) findViewById(R.id.imageView30);
        img30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, pubg.class);
                startActivity(intent);
            }
        });

        img31 = (ImageButton) findViewById(R.id.imageView31);
        img31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, r6.class);
                startActivity(intent);
            }
        });

        img32 = (ImageButton) findViewById(R.id.imageView32);
        img32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, rdr2.class);
                startActivity(intent);
            }
        });

        img33 = (ImageButton) findViewById(R.id.imageView33);
        img33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, re4.class);
                startActivity(intent);
            }
        });

        img34 = (ImageButton) findViewById(R.id.imageView34);
        img34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, re8.class);
                startActivity(intent);
            }
        });

        img35 = (ImageButton) findViewById(R.id.imageView35);
        img35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, sekiro.class);
                startActivity(intent);
            }
        });

        img36 = (ImageButton) findViewById(R.id.imageView36);
        img36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, sims4.class);
                startActivity(intent);
            }
        });

        img37 = (ImageButton) findViewById(R.id.imageView37);
        img37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, skyrim.class);
                startActivity(intent);
            }
        });

        img38 = (ImageButton) findViewById(R.id.imageView38);
        img38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, sot.class);
                startActivity(intent);
            }
        });

        img39 = (ImageButton) findViewById(R.id.imageView39);
        img39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, spiderman.class);
                startActivity(intent);
            }
        });

        img40 = (ImageButton) findViewById(R.id.imageView40);
        img40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, tk7.class);
                startActivity(intent);
            }
        });

        img41 = (ImageButton) findViewById(R.id.imageView41);
        img41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, tr.class);
                startActivity(intent);
            }
        });

        img42 = (ImageButton) findViewById(R.id.imageView42);
        img42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, warzone.class);
                startActivity(intent);
            }
        });

        img43 = (ImageButton) findViewById(R.id.imageView43);
        img43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, witcher.class);
                startActivity(intent);
            }
        });

        img44 = (ImageButton) findViewById(R.id.imageView44);
        img44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, zelda.class);
                startActivity(intent);
            }
        });

        img45 = (ImageButton) findViewById(R.id.imageView45);
        img45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(games.this, hades.class);
                startActivity(intent);
            }
        });

    }

}