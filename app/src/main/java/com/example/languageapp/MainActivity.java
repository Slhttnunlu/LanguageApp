package com.example.languageapp;

import static android.view.View.INVISIBLE;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //view elamanlarının tanımlanması
    Button kirmizi, sari, mavi, turuncu, siyah, beyaz, yesil, mor;
    Button red, yellow, blue, orange, black, white, green, purple;
    LinearLayout linearlayout1, linearlayout2;
    //programda kullanılan değişlenlerin tanımlanması
    String[] trueWord = new String[2];
    String[] userWord = new String[2];
    //Renkleri tutacak liste objesini oluşturma
    List<String> color = new ArrayList<>();
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);*/
        setContentView(R.layout.activity_main);
        kirmizi = findViewById(R.id.kirmizi); red = findViewById(R.id.red);
        sari = findViewById(R.id.sari); yellow = findViewById(R.id.yellow);
        mavi = findViewById(R.id.mavi); blue = findViewById(R.id.blue);
        turuncu = findViewById(R.id.turuncu); orange = findViewById(R.id.orange);
        siyah = findViewById(R.id.siyah); black = findViewById(R.id.black);
        beyaz = findViewById(R.id.beyaz); white = findViewById(R.id.white);
        yesil = findViewById(R.id.yesil); green = findViewById(R.id.green);
        mor = findViewById(R.id.mor); purple = findViewById(R.id.purple);

        linearlayout1 = findViewById(R.id.linearlayout1);
        linearlayout2 = findViewById(R.id.linearlayout2);
        //renkler listesine atamaları yapıyoruz
        color.add("kirmizi red");
        color.add("mavi blue");
        color.add("sari yellow");
        color.add("yesil green");
        color.add("siyah black");
        color.add("beyaz white");
        color.add("turuncu orange");
        color.add("mor purple");
    }

    //randomarray-onstart-randombuttonadd ilişkili methotlar
    //onstart sayfa yüklendiğinde randomarray ile rasgele 8 sayı üretiyoruz
    //8 sayıyıda randombuttonadd e gönderiyoruz ve rasgele butonların yerleri değişiyor
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Sayfa yüklendi" , Toast.LENGTH_SHORT).show();

        linearlayout1.removeAllViews();
        linearlayout2.removeAllViews();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        randomarray(arrayList);
        //randomarray(arrayList2);

    }

    public void randomarray(ArrayList b) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println(" araylist boyutu " + arrayList.size());
        int c = 0 , h=0;
        while (arrayList.size() < 8) {
            c++;
            System.out.println("döngü" + c);
            int a = random.nextInt(8)+1;

            if (!arrayList.contains(a)) {
                arrayList.add(a);
                int num = arrayList.get(h);
                randombuttonadd(num, num);
                h++;
                System.out.println("üretilen sayı" + a);
                System.out.println(" araylist boyutu " + arrayList.size());
            }
        }
        System.out.println(arrayList);

        //----------------------------------------------------------------------------------------------
        /* Burası benim yazdığım rasgele benzersiz 8 sayı üreten algoritma, silmeye gönlüm el vermedi :)
        //----------------------------------------------------------------------------------------------
        int randomf=0, f=0;
        //int[] a = new int[8];
        Random rnd = new Random();
        boolean state = true;
        System.out.println("dizi: " + Arrays.toString(a));

        while(state){
            randomf = rnd.nextInt(8)+1;
            if(f==0) {
                a[f] = randomf;
                randombuttonadd(a[f], a[f]);
            }else {
                for (int i = 0; i < f; i++) {
                    //System.out.println("döngünün " + i + ". dönüşü f: " + f);
                    if(a[i] == randomf){
                        //System.out.println(i + " indexli dizi elemanı :  "+ a[i] + " random ile (" + randomf + ") aynı o yüzden döngü başa döndü i: " + i);
                        randomf = rnd.nextInt(8)+1;
                        i=-1;
                    }else{
                        if(i == f-1){
                            a[f] = randomf;
                            randombuttonadd(a[f], a[f]);
                            //System.out.println(f + ".indexli atanan random sayı : " + a[f]);
                        }
                    }
                }
            }
            f++;
            if(f==8){
                state = false;
            }

        }
        System.out.println("dizi: " + Arrays.toString(a));
        //System.out.println("döngü " +  " kere döndü:(");
        */
    }

    public void randombuttonadd(int e, int c) {
        if (e == 1) {
            linearlayout1.addView(sari);
        } else if (e == 2) {
            linearlayout1.addView(kirmizi);
        } else if (e == 3) {
            linearlayout1.addView(mavi);
        } else if (e == 4) {
            linearlayout1.addView(yesil);
        } else if (e == 5) {
            linearlayout1.addView(beyaz);
        } else if (e == 6) {
            linearlayout1.addView(siyah);
        } else if (e == 7) {
            linearlayout1.addView(mor);
        } else if (e == 8) {
            linearlayout1.addView(turuncu);
        }
        if (c == 1) {
            linearlayout2.addView(red);
        } else if (c == 2) {
            linearlayout2.addView(white);
        } else if (c == 3) {
            linearlayout2.addView(yellow);
        } else if (c == 4) {
            linearlayout2.addView(blue);
        } else if (c == 5) {
            linearlayout2.addView(black);
        } else if (c == 6) {
            linearlayout2.addView(purple);
        } else if (c == 7) {
            linearlayout2.addView(orange);
        } else if (c == 8) {
            linearlayout2.addView(green);
        }
    }

    public void btnenable(String e) {
        String a="tr";
        String b="en";
        if(e.equals(a)){
            kirmizi.setEnabled(true);
            siyah.setEnabled(true);
            sari.setEnabled(true);
            mor.setEnabled(true);
            yesil.setEnabled(true);
            turuncu.setEnabled(true);
            beyaz.setEnabled(true);
            mavi.setEnabled(true);
        }else if (e.equals(b)){
            red.setEnabled(true);
            white.setEnabled(true);
            yellow.setEnabled(true);
            black.setEnabled(true);
            blue.setEnabled(true);
            orange.setEnabled(true);
            green.setEnabled(true);
            purple.setEnabled(true);
        }
    }

    public void wordClick(View view) {
        btnenable("tr");

        if(view.getId()==R.id.kirmizi){
            Toast.makeText(getApplicationContext(),"Kırmızı seçtiniz",Toast.LENGTH_SHORT).show();
            kirmizi.setEnabled(false);
            userWord[0]="kirmizi";
            searchTrueWord("kirmizi red");
        }else if(view.getId()==R.id.sari){
            Toast.makeText(getApplicationContext(),"Sarı seçtiniz",Toast.LENGTH_SHORT).show();
            sari.setEnabled(false);
            userWord[0]="sari";
            searchTrueWord("sari yellow");
        }else if(view.getId()==R.id.mavi){
            Toast.makeText(getApplicationContext(),"Mavi seçtiniz",Toast.LENGTH_SHORT).show();
            mavi.setEnabled(false);
            userWord[0]="mavi";
            searchTrueWord("mavi blue");
        }else if(view.getId()==R.id.yesil){
            Toast.makeText(getApplicationContext(),"Yeşil seçtiniz",Toast.LENGTH_SHORT).show();
            yesil.setEnabled(false);
            userWord[0]="yesil";
            searchTrueWord("yesil green");
        }else if(view.getId()==R.id.turuncu){
            Toast.makeText(getApplicationContext(),"Turuncu seçtiniz",Toast.LENGTH_SHORT).show();
            turuncu.setEnabled(false);
            userWord[0]="turuncu";
            searchTrueWord("turuncu orange");
        }else if(view.getId()==R.id.mor){
            Toast.makeText(getApplicationContext(),"Mor seçtiniz",Toast.LENGTH_SHORT).show();
            mor.setEnabled(false);
            userWord[0]="mor";
            searchTrueWord("mor purple");
        }else if(view.getId()==R.id.beyaz){
            Toast.makeText(getApplicationContext(),"Beyaz seçtiniz",Toast.LENGTH_SHORT).show();
            beyaz.setEnabled(false);
            userWord[0]="beyaz";
            searchTrueWord("beyaz white");
        }else if(view.getId()==R.id.siyah){
            Toast.makeText(getApplicationContext(),"Siyah seçtiniz",Toast.LENGTH_SHORT).show();
            siyah.setEnabled(false);
            userWord[0]="siyah";
            searchTrueWord("siyah black");
        }

        result();
    }

    public void answerClick(View view) {
        btnenable("en");

        if(view.getId()==R.id.red){
            //Toast.makeText(getApplicationContext(),"Red seçtiniz",Toast.LENGTH_SHORT).show();
            red.setEnabled(false);
            userWord[1]="red";
        }else if(view.getId()==R.id.yellow){
            //Toast.makeText(getApplicationContext(),"Yellow seçtiniz",Toast.LENGTH_SHORT).show();
            yellow.setEnabled(false);
            userWord[1]="yellow";
        }else if(view.getId()==R.id.blue){
            //Toast.makeText(getApplicationContext(),"Blue seçtiniz",Toast.LENGTH_SHORT).show();
            blue.setEnabled(false);
            userWord[1]="blue";
        }else if(view.getId()==R.id.green){
            //Toast.makeText(getApplicationContext(),"Green seçtiniz",Toast.LENGTH_SHORT).show();
            green.setEnabled(false);
            userWord[1]="green";
        }else if(view.getId()==R.id.orange){
            //Toast.makeText(getApplicationContext(),"Orange seçtiniz",Toast.LENGTH_SHORT).show();
            orange.setEnabled(false);
            userWord[1]="orange";
        }else if(view.getId()==R.id.purple){
            //Toast.makeText(getApplicationContext(),"Purple seçtiniz",Toast.LENGTH_SHORT).show();
            purple.setEnabled(false);
            userWord[1]="purple";
        }else if(view.getId()==R.id.white){
            //Toast.makeText(getApplicationContext(),"White seçtiniz",Toast.LENGTH_SHORT).show();
            white.setEnabled(false);
            userWord[1]="white";
        }else if(view.getId()==R.id.black){
            //Toast.makeText(getApplicationContext(),"Black seçtiniz",Toast.LENGTH_SHORT).show();
            black.setEnabled(false);
            userWord[1]="black";
        }

        result();
    }

    public void btnInvisible() {
        //butonların ismini diziden alıp invisible yapamadım o yüzden bu metodu yazdım.
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(!kirmizi.isEnabled()){
            kirmizi.setVisibility(INVISIBLE);
        }else if(!sari.isEnabled()){
            sari.setVisibility(INVISIBLE);
        }else if(!yesil.isEnabled()){
            yesil.setVisibility(INVISIBLE);
        }else if(!mavi.isEnabled()){
            mavi.setVisibility(INVISIBLE);
        }else if(!beyaz.isEnabled()){
            beyaz.setVisibility(INVISIBLE);
        }else if(!siyah.isEnabled()){
            siyah.setVisibility(INVISIBLE);
        }else if(!turuncu.isEnabled()){
            turuncu.setVisibility(INVISIBLE);
        }else if(!mor.isEnabled()){
            mor.setVisibility(INVISIBLE);
        }

        if(!red.isEnabled()){
            red.setVisibility(INVISIBLE);
        }else if(!green.isEnabled()){
            green.setVisibility(INVISIBLE);
        }else if(!yellow.isEnabled()){
            yellow.setVisibility(INVISIBLE);
        }else if(!blue.isEnabled()){
            blue.setVisibility(INVISIBLE);
        }else if(!orange.isEnabled()){
            orange.setVisibility(INVISIBLE);
        }else if(!white.isEnabled()){
            white.setVisibility(INVISIBLE);
        }else if(!black.isEnabled()){
            black.setVisibility(INVISIBLE);
        }else if(!purple.isEnabled()){
            purple.setVisibility(INVISIBLE);
        }
    }

    public void isitfinish() {
        if(kirmizi.getVisibility()==INVISIBLE && sari.getVisibility()==INVISIBLE && yesil.getVisibility()==INVISIBLE && mavi.getVisibility()==INVISIBLE && turuncu.getVisibility()==INVISIBLE && mor.getVisibility()==INVISIBLE && beyaz.getVisibility()==INVISIBLE && siyah.getVisibility()==INVISIBLE){
            if(red.getVisibility()==INVISIBLE && yellow.getVisibility()==INVISIBLE && green.getVisibility()==INVISIBLE && blue.getVisibility()==INVISIBLE && orange.getVisibility()==INVISIBLE && purple.getVisibility()==INVISIBLE && white.getVisibility()==INVISIBLE && black.getVisibility()==INVISIBLE){
                Toast.makeText(getApplicationContext(),"TEBRİKLER HEPSİ DOĞRU, (ALKIŞ EMOJİSİ)",Toast.LENGTH_LONG).show();
                System.out.println("hepsi invisible oldu");

                Intent intent = new Intent(context, HomeActivity.class);
                startActivity(intent);
            }
        }
    }

    public void result(){
        if(userWord[0] != null && userWord[1] != null){   //veye "TextUtils.isEmty(değişken)"
            if (userWord[1].equals(trueWord[1])){         //userWord[1] == trueWord[1] bu ifade çalışmadı neden anlamadım
                userWord[0]=null;
                userWord[1]=null;
                trueWord[0]=null;
                trueWord[1]=null;
                System.out.println("result()/Tebrikler");
                Toast.makeText(getApplicationContext(), "Tebrikler doğru",Toast.LENGTH_LONG).show();
                btnInvisible();
                isitfinish();
            }else{
                userWord[0]=null;
                userWord[1]=null;
                trueWord[0]=null;
                trueWord[1]=null;
                System.out.println("result()/yanlış seçim");
                Toast.makeText(getApplicationContext(), "Yanlış",Toast.LENGTH_LONG).show();
                btnenable("tr");
                btnenable("en");
            }
        }else{
            System.out.println("userWordler dolu değil");//bişey yapmıcaz yada şimdilik bilmiyorum
        }
    }

    public void searchTrueWord(String e) {
        System.out.println(" "+color.indexOf(e));
        trueWord = color.get(color.indexOf(e)).split(" ");

    }

}

//1-şimdi butonların ikisi seçilince sonuç yazıcak ve butonlar tekrar aktif olucak yada doğruysa ikiside pasif +

//2-butonlar doğruysa yeşil ve pasif olacak +

//3-görselleştirme mesajlar ve butonlar renkler falan +

//4-en son homeactivity yapıcaz sayılar, renkler, aylar, hayvanlar, eşyalar araba ev ağaç... falan fişman +

//5-ve homeactivity den geçiş yapılan diğer benzer sayfalar yapılcak +

//6-activityler default olarak yan dönmücek hep dikey olucak onu kapatmam gerek +

//7-sayfa her yüklendğinde random butonların yeri değişecek

//sonrada yapabilirsin yada diğer benzer sayfaları oluştururkende deneyebilirsin (en zoru bu)
//-bir class olucak içinde string ifadelerin olduğu yapılan seçime göre(renk,sayılar,organlar vb)arrayliste o değerleri atıyacak
//-ama burdaki asıl problem butonları nasıl kontrol edicez onu araştırmak gerekiyor istersen dene yada sonradan güncellemede dene