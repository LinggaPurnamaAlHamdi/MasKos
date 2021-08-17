package com.lingga.maskos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListResep extends AppCompatActivity {
    RecyclerView myRecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Reseps> reseps1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reseps1 = new ArrayList<>();
        reseps1.add(new Reseps("Bakso Manis Pedas", "Bahan-bahan : \n" +
                "- 300 gram bakso\n" +
                "- 1 buah bawang bombai, cincang-cincang\n" +
                "- 4 sdm saus pedas\n" +
                "- 2 sdm kecap manis\n" +
                "- 2 sdm saus tiram\n" +
                "- 5 buah jeruk kunci, ambil airnya\n" +
                "- Garam, gula secukupnya\n" +
                "- 200 ml air\n" +
                "- 2 sdm margarine\n \n" +
                "Bumbu halus:\n" +
                "- 10 buah cabai rawit atau sesuai selera\n" +
                "- 4 siung bawang putih", "Cara Membuat :", "1. Panaskan margarine lalu tumis bumbu halus dan bombai sampai harum, masukkan bakso, aduk-aduk\n" +
                "2. Masukkan saus pedas, saus tiram, kecap manis dan air jeruk kunci, aduk rata lalu tuang air\n" +
                "3. Masak sampai air menyusut masukkan gula dan sedikit garam, masak sampai air habis test rasa lalu angkat\n" +
                "4. Sajikan.", R.drawable.bakso_manis_pedas));

        reseps1.add(new Reseps("Jamur Crispy", "Bahan-bahan :\n" +
                "- Jamur tiram\n" +
                "- 250 gr tepung serba guna\n" +
                "- 3 sdm tepung meizena\n \n" +
                "Bumbu:\n" +
                "- 4 siung bawang putih (haluskan)\n" +
                "- 1 sdt merica bubuk\n" +
                "- 1 sdt garam\n" +
                "- 1 sdt kaldu bubuk", "Cara Membuat :", "1. Cuci bersih jamur (peras sampai airnya hilang)\n" +
                "2. Masukkan bumbu ke dalam wadah yang berisi jamur (aduk-aduk hingga merata), kemudian marinasi sampai 10 menit\n" +
                "3. Masukkan jamur ke dalam tepung kering (mix tepung serba guna dan meizena) balut hingga merata\n" +
                "4. Goreng jamur hingga golden brown\n" +
                "5. Sajikan dengan saus tomat atau cabai.", R.drawable.jamur_crispy));

        reseps1.add(new Reseps("Orak Arik Telur", "Bahan-bahan :\n" +
                "- Telur\n" +
                "- Bakso (potong sesuai selera)\n" +
                "- Garam secukupnya, saori saus tiram, gula pasir, merica bubuk dan kaldu bubuk\n \n" +
                "Bumbu iris :\n" +
                "- 1/2 bawang bombai potong besar\n" +
                "- 3 siung bawang putih\n" +
                "- 6 cabai rawit merah", "Cara Membuat :", "1. Goreng bakso sisihkan\n" +
                "2. Goreng telur kemudian orak arik\n" +
                "3. Tumis bumbu yang sudah diiris sampai harum dan layu\n" +
                "4. Masukkan semua bahan aduk-aduk sampai rata dan jangan lupa tambahkan sedikit air\n" +
                "5. Masukkan garam, gula, merica bubuk, saori dan kaldu bubuk. Aduk sampai merata\n" +
                "6. Angkat dan sajikan.", R.drawable.orak_arik_telur));

        reseps1.add(new Reseps("Oseng Sawi Putih Dengan Jagung Manis", "Bahan-bahan : \n" +
                "- 1 buah/bonggol sawi putih potong-potong\n" +
                "- 1 buah jagung manis, serut\n" +
                "- 3 siung bawang putih cincang\n" +
                "- Secukupnya cabai\n" +
                "- Gula garam kaldu bubuk secukupnya\n" +
                "- Air secukupnya", "Cara Membuat :", "1. Tumis bawang putih sampai harum, masukkan cabai uleg, jagung, dan air\n" +
                "2. Tunggu sampai jagung empuk/cukup matang\n" +
                "3. Masukkan sawi putih, tambah garam gula dan kaldu bubuk\n" +
                "4. Aduk rata tunggu sawi layu, matikan kompor\n" +
                "5. Sajikan pada mangkuk.", R.drawable.oseng_sawi_putih_dengan_jagung_manis));

        reseps1.add(new Reseps("Telur Geprek", "Bahan-bahan :\n" +
                "- 1 butir telur dan garam secukupnya\n \n" +
                "Adonan basah :\n" +
                "- 2 sdm tepung bumbu sajiku\n" +
                "- Air secukupnya\n \n" +
                "Adonan kering :\n" +
                "- 7 sdm tepung bumbu sajiku\n" +
                "- 2-3 sdm tepung maizena\n \n" +
                "Sambal bawang :\n" +
                "- 15 cabai rawit merah\n" +
                "- 5 cabai rawit hijau\n" +
                "- 3 butir bawang merah\n" +
                "- 1 siung bawang putih\n" +
                "- Garam secukupnya\n" +
                "- Minyak goreng panas", "Cara Membuat :", "1. Dadar telur seperti biasa, potong sesuai selera, sisihkan\n" +
                "2. Siapkan adonan kering dan adonan basah. (Adonan basah kekentalan sedang)\n" +
                "3. Masukkan telur ke adonan basah, lalu ke adonan kering. Goreng hingga kecokelatan.\n" +
                "4. Uleg kasar semua bumbu sambal bawang beri sedikit garam lalu siram dengan minyak panas\n" +
                "5. Geprek/penyet telur diatas cobek, lalu sajikan.", R.drawable.telur_geprek));

        reseps1.add(new Reseps("Sosis Gulung Mie",
                "Bahan-bahan :\n" +
                        "- 2 bungkus mi instan\n" +
                        "- 5 buah sosis(sesuaikan dengan kebutuhan) \n" +
                        "- Minyak sayur secukupnya\n" +
                        "- Air untuk merebus", "Cara Membuat :", "1. Didihkan air, rebus mi hingga matang, angkat\n" +
                "2. Campur mie dengan bumbunya, aduk rata, sisihkan\n" +
                "3. Potong sosis menjadi 2 bagian dan kerat ujungnya\n" +
                "4. Ambil mie secukupnya kemudian gulungkan ke sosis, lakukan sampai habis\n" +
                "5. Panaskan minyak, kemudian goreng hingga matang dan angkat\n" +
                "6. Sajikan (dengan saos tomat atau sambal lebih mantap).", R.drawable.sosis_mie_gulung));

        reseps1.add(new Reseps("Telur Ceplok Kecap", "Bahan-bahan :\n" +
                "- telur sesuai kebutuhan\n" +
                "- bawang putih secukupnya\n" +
                "- bawang merah secukupnya\n" +
                "- cabai rawit secukupnya\n" +
                "- kecap asin atau manis\n" +
                "- daun bawang\n" +
                "- merica secukupnya", "Cara Membuat :", "1. Goreng telur lalu sisihkan.\n" +
                "2. Tumis bawang putih dan bawang merah. Masukkan irisan daun bawang dan cabai rawit.\n" +
                "3. Beri kecap manis, kecap asin, dan merica, bisa tambahkan air sedikit. Aduk dan masak hingga mendidih dan kental\n" +
                "4. Masukkan telur dan aduk rata.", R.drawable.telur_ceplok_kecap));

        reseps1.add(new Reseps("Kentang Goreng", "Bahan-bahan : \n" +
                "4 buah kentang besar\n" +
                "4 sdm tepung maizena\n" +
                "1 sdt garam\n" +
                "1 sdt lada bubuk\n" +
                "500 ml air mineral\n" +
                "500 ml air dingin /es", "Cara Membuat :", "1. Kupas, cuci bersih lalu potong kentang memanjang dan tebal. Untuk ukuran sesuai selera.\n" +
                "2. Ambil wadah, isi dengan air mineral, kentang, garam dan lada. Rendam hingga bumbu meresap, dan tiriskan.\n" +
                "3. Ambil panci, masukkan air mineral baru, lalu masukkan kentang dan rebus hingga setengah matang sekitar 5-10 menit.\n" +
                "4. Tiriskan kentang rebusan tadi, lalu masukkan kedalam air dingin/es. Tunggu beberapa menit sampai kentang dingin.\n" +
                "5. Kentang dalam wadah, tambahkan tepung maizena, aduk hingga merata sampai tepung menempel tipis di permukaan kentang.\n" +
                "6. Panaskan minyak goreng dalam wajan yang cukup banyak. Setelah mendidih masukkan kentang kedalamnya hingga terendam. Goreng hingga berubah warna dan busanya hilang. \n" +
                "7. Angkat lalu sajikan (dengan saus tomat dan sambal lebih mantap).", R.drawable.kentang_goreng));

        reseps1.add(new Reseps("Telur Balado", "Bahan-bahan :\n" +
                "- 6 butir telur, rebus dan kupas\n" +
                "- 2 lembar daun jeruk\n" +
                "- minyak untuk menumis secukupnya\n" +
                "- 2 lembar daun salam\n" +
                "- 1 sdm air asam jawa\n" +
                "- 2 cm lengkuas, memarkan\n" +
                "- garam, gula dan penyedap rasa secukupnya\n" +
                "- air secukupnya\n \n" +
                "Bumbu halus:\n" +
                "- 10 buah cabai merah keriting\n" +
                "- 6 buah bawang merah\n" +
                "- 2 butir kemiri\n" +
                "- 7 buah cabai rawit merah\n" +
                "- 4 buah bawang putih\n" +
                "- 1 buah tomat ukuran kecil", "Cara Membuat :", "1. Goreng telur. Sisihkan.\n" +
                "2. Tumis bumbu halus, daun salam, daun jeruk, dan lengkuas sampai wangi dan matang. Masukkan air asam jawa dan sedikit air, aduk.\n" +
                "3. Beri garam, gula, dan penyedap rasa. Aduk rata. Masak sampai bumbu meresap dan air menyusut.", R.drawable.telur_balado));

        reseps1.add(new Reseps("Tumis Cah Tauge dan Tahu", "Bahan-bahan:\n" +
                "- 1/4 Tauge (cuci bersih)\n" +
                "- 3 buah tahu putih (potong dadu)\n" +
                "- 5 buah bakso sapi (belah dua)\n \n" +
                "Bumbu iris:\n" +
                "- 5 buah cabai rawit merah\n" +
                "- 2 buah cabai merah kriting\n" +
                "- 3 buah bawang merah\n" +
                "- 2 siung bawang putih\n" +
                "- Garam secukupnya\n" +
                "- Gula pasir secukupnya\n" +
                "- Kaldu bubuk secukupnya\n" +
                "- 1 sdm Saori", "Cara Membuat : ","1. Goreng tahu dan bakso (jangan terlalu kering). Tiriskan\n" +
                "2. Tumis bumbu yang sudah di rajang sampai harum\n" +
                "3. Tambahkan saori, garam, gula dan kaldu bubuk\n" +
                "4. Masukkan tauge tahu dan bakso, aduk sebentar sampai rata. Koreksi rasa (jangan ditambah air)\n" +
                "5. Angkat dan sajikan.", R.drawable.tumis_cah_tauge_dan_tahu));

        reseps1.add(new Reseps("Sosis Asam Manis", "Bahan-bahan : \n" +
                "- 5 buah sosis sapi, potong setengah panjang\n" +
                "- 2 siung bawang putih, cincang\n" +
                "- ½ butir bawang bombay, potong dadu\n" +
                "- 2 sdm saus tomat\n" +
                "- garam secukupnya\n" +
                "- 1 sdt gula pasir\n" +
                "- ½ sdt lada putih bubuk\n" +
                "- 100 ml air\n" +
                "- 1 sdm margarin\n" +
                "- 100ml minyak goreng", "Cara Membuat : ", "1. Panaskan wajan dan minyak. Goreng sosis hingga merekah tapi jaga agar tidak terlalu kering. Angkat kemudian sisihkan.\n" +
                "2. Panaskan margarin, lalu tumis bawang putih dan bawang bombay hingga layu dan matang. Setelah itu, masukkan semua bahan lainnya, kemudian masak hingga mendidih.\n" +
                "3. Masukkan sosis ke dalam tumisan bahan lainnya. Masak selama sekitar 2 menit lalu angkat.\n" +
                "4. Sajikan selagi hangat.", R.drawable.sosis_asam_manis));

        reseps1.add(new Reseps("Telur Dadar Crispy", "Bahan-bahan : \n" +
                "- minyak goreng secukupnya\n" +
                "- 5 butir telur ayam (kocok lepas)\n" +
                "- 3 bungkus KOBE Tepung Kentucky SuperCrispy (75gr)\n" +
                "- 140ml air", "Cara Membuat : ", "1. Panaskan teflon yang sudah diolesi dengan sedikit minyak. Buat telur dadar hingga matang.\n" +
                "2. Angkat, biarkan dingin dan potong-potong. Sisihkan.\n" +
                "3. Campurkan 1 bungkus KOBE Tepung Kentucky Super Crispy dengan air. Aduk-aduk sampai tidak ada yang menggumpal.\n" +
                "4. Masukkan telur dadar yang sudah dipotong-potong ke dalam adonan basah. Gulingkan ke dalam tepung kering 2 bungkus KOBE Tepung Kentucky Super Crispy.\n" +
                "5. Goreng dalam minyak panas dengan api sedang hingga berwarna kuning kecoklatan. Angkat dan siap disajikan.", R.drawable.telur_dadar_crispy));

        reseps1.add(new Reseps("Tumis Kangkung", "Bahan-bahan :\n" +
                "- 3 ikat kangkung, cuci bersih\n" +
                "- 3 cabai merah, iris serong (banyaknya sesuai selera)\n" +
                "- 1 buah tomat merah, potong-potong\n" +
                "- 1/2 sdt gula pasir\n" +
                "- 1 sdt garam\n" +
                "- 50 ml air\n" +
                "- 3 sdm minyak goreng\n \n" +
                "Bumbu halus :\n" +
                "- 5 siung bawang merah \n" +
                "- 2 siung bawang putih \n" +
                "- 5 cabe merah keriting \n" +
                "- 1 sdt terasi bakar", "Cara Membuat :", "1. Haluskan bahan bumbu halus, lalu tumis di wajan hingga harum.\n" +
                "2. Setelah tumisan harum, masukkan cabe merah, tomat, gula, dan garam. Aduk hingga rata.\n" +
                "3. Masukkan kangkung. Gunakan api besar, aduk-aduk hingga layu.\n" +
                "4. Setelah kangkung layu tuang air, aduk rata dan masak sebentar. Lalu angkat dan sajikan.", R.drawable.tumis_kangkung));

        reseps1.add(new Reseps("Oseng Buncis", "Bahan-bahan :\n" +
                "- 10 buah buncis iris serong\n" +
                "- 1 buah wortel kecil, potong\n" +
                "- 2 butir telur\n" +
                "- 2 siung bawang putih iris\n" +
                "- 2 siung bawang merah iris\n" +
                "- 1 sdm saus tiram\n" +
                "- 1 sdm kecap ikan\n" +
                "- garam secukupnya\n" +
                "- merica secukupnya", "Cara Membuat :", "1. Orak arik telur, sisihkan di pinggir wajan.\n" +
                "2. Tumis bawang merah dan putih. Masukkan wortel lalu masak sebentar.\n" +
                "3. Masukkan buncis dan bumbu. Tuang 2 sdm air.\n" +
                "4. Aduk rata, masak sampai matang. Lalu sajikan.", R.drawable.oseng_buncis));

        reseps1.add(new Reseps("Terong Balado", "Bahan-bahan :\n" +
                "- 2 buah terong, cuci bersih dan potong-potong\n" +
                "- Garam secukupnya\n" +
                "- Gula merah\n" +
                "- Kaldu jamur\n" +
                "- Air\n" +
                "- Minyak\n \n" +
                "Bumbu halus :\n" +
                "- 8 siung bawang merah\n" +
                "- 2 siung bawang putih\n" +
                "- 1 buah tomat ukuran sedang\n" +
                "- 4 buah cabai merah keriting\n" +
                "- 7 buah cabai rawit merah.", "Cara Membuat :", "1. Goreng terong yang sudah dipotong-potong sampai matang. Setelah itu, angkat dan sisihkan.\n" +
                "2. Tumis bumbu halus hingga harum, lalu tambahkan garam, gula, kaldu jamur, dan air secukupnya. Kemudian aduk hingga merata.\n" +
                "3. Masak bumbu sampai matang. Kemudian tambahkan sedikit minyak sayur dan aduk hingga merata.\n" +
                "4. Setelah matang, terong balado siap disajikan", R.drawable.terong_balado));

        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this, reseps1);

        myRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        myRecyclerView.setAdapter(myAdapter);

    }
}
