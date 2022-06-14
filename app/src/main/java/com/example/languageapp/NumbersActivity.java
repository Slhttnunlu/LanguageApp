package com.example.languageapp;

import static android.view.View.INVISIBLE;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
// !!! Henüz yapılmadı ama Mainactivity sayfası mimairisinde olacak
public class NumbersActivity extends AppCompatActivity {

    //view elamanlarının tanımlanması
    Button kirmizi, sari, mavi, turuncu, siyah, beyaz, yesil, mor;
    Button red, yellow, blue, orange, black, white, green, purple;
    //programda kullanılan değişlenlerin tanımlanması
    String[] trueWord = new String[2];
    String[] userWord = new String[2];
    //Renkleri tutacak liste objesini oluşturma
    List<String> color = new ArrayList<>();
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        kirmizi = findViewById(R.id.kirmizi); red = findViewById(R.id.red);
        sari = findViewById(R.id.sari); yellow = findViewById(R.id.yellow);
        mavi = findViewById(R.id.mavi); blue = findViewById(R.id.blue);
        turuncu = findViewById(R.id.turuncu); orange = findViewById(R.id.orange);
        siyah = findViewById(R.id.siyah); black = findViewById(R.id.black);
        beyaz = findViewById(R.id.beyaz); white = findViewById(R.id.white);
        yesil = findViewById(R.id.yesil); green = findViewById(R.id.green);
        mor = findViewById(R.id.mor); purple = findViewById(R.id.purple);
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

    public void result (){
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