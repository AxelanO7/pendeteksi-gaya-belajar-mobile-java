package com.putri.aplikasipendeteksigayabesar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "gayabelajar.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table soal(no integer primary key autoincrement, no_urut text null, pertanyaan text null, opt1 text null, opt2 text null, dimen text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        String sql2 = "create table hasil(no integer primary key autoincrement, hasil_aktif text null, hasil_sensorik text null, hasil_visual text null, hasil_sekuensial text null, nama text null);";
        Log.d("Data2", "onCreate: " + sql2);
        db.execSQL(sql2);
        sql = "INSERT INTO soal(no, no_urut, pertanyaan, opt1, opt2, dimen) VALUES (1, '1', '1. Saya memahami sesuatu dengan lebih baik setelah saya ...', 'Mencobanya', 'Berpikir secara teliti', 'Aktif'), " +
                "(2, '2', '2. Saya cenderung dipandang sebagai orang yang ...', 'Realistis', 'Kreatif', 'Aktif'), " +
                "(3, '3', '3. Ketika saya memikirkan tentang apa yang saya lakukan kemarin, saya cenderung mendapatkannya dalam bentuk ...', 'Gambar', 'Kata-kata', 'Aktif'), " +
                "(4, '4', '4. Saya cenderung untuk ...', 'Memahami secara detail, tetapi kurang memahami keseluruhan', 'Memahami keseluruhan, tetapi kurang memahami secara detail', 'Aktif'), " +
                "(5, '5', '5. Ketika belajar suatu yang baru, hal tersebut membantu saya untuk ...', 'Berbicara tentang hal itu', 'Berpikir tentang hal itu', 'Aktif'), " +
                "(6, '6', '6. Jika saya menjadi dosen, saya lebih suka mengajarkan mata kuliah ...', 'Yang berhubungan dengan fakta dan situasi kehidupan nyata', 'Yang berhubungan dengan ide-ide dan teori', 'Aktif'), " +
                "(7, '7', '7. Saya lebih suka mendapatkan informasi baru dalam bentuk ...', 'Gambar, diagram, grafik, atau peta', 'Petunjuk tertulis atau informasi berupa kalimat', 'Aktif'), " +
                "(8, '8', '8. Sekali saya memahami ...', 'Bagian-bagian/detail dari suatu hal, maka saya dapat memahami keseluruhan', 'Secara keseluruhan, maka saya dapat memahami bagianbagian/detail dari suatu hal', 'Aktif'), " +
                "(9, '9', '9. Ketika kelompok belajar menghadapi materi yang sulit saya cenderung ...', 'Segera mengajukan ide-ide', 'Duduk dan mendengarkan dulu', 'Aktif'), " +
                "(10, '10', '10. Saya merasa lebih mudah dalam ...', 'Mempelajari fakta-fakta', 'Mempelajari konsep-konsep', 'Aktif'), " +
                "(11, '11', '11. Ketika membaca sebuah gambar dan grafik saya cenderung ...', 'Memperhatikan gambar-gambar dan grafik dengan seksama', 'Memfokuskan perhatian pada teks tertulis', 'Aktif'), " +
                "(12, '12', '12. Ketika menyelesaikan soal matematika ...', 'Saya biasanya menggunakan cara saya sendiri untuk memecahkan soal tersebut langkah demi langkah', 'Saya sering melihat penyelesaian soal matematika tersebut kemudian berusaha memahami langkah-langkah untuk mendapatkan jawaban tersebut', 'Sensorik'), " +
                "(13, '13', '13. Di kelas yang saya ikuti ...', 'Saya selalu mengenal sebagian besar mahasiswa', 'Saya jarang mengenal Sebagian besar mahasiswa', 'Sensorik'), " +
                "(14, '14', '14. Dalam membaca buku non fiksi (tulisan berdasarkan data atau fakta), saya lebih suka ...', 'Sesuatu yang mengajarkan saya fakta-fakta baru atau menjelaskan tentang bagaimana melakukan sesuatu', 'Sesuatu yang memberi saya ide-ide baru untuk dipikirkan', 'Sensorik'), " +
                "(15, '15', '15. Saya menyukai dosen-dosen yang', 'Menggunakan banyak gambaran untuk menjelaskan materinya', 'Menggunakan banyak kalimat untuk menjelaskan materinya', 'Sensorik'), " +
                "(16, '16', '16. Ketika saya menganalisa cerita atau novel', 'Saya memikirkan tentang konfliknya dan mencoba untuk menempatkan mereka bersama-sama untuk mencari tahu tema dari novel tersebut', 'Saya hanya perlu tahu apa temanya ketika saya selesai membaca harus kembali dan mencari konflik-konflik yang terlihat', 'Sensorik'), " +
                "(17, '17', '17. Ketika saya memulai masalah pekerjaan rumah, saya lebih cenderung', 'Langsung berpikir pada penyelesaian masalah', 'Mencoba untuk memahami terlebih dahulu permasalahan dengan baik', 'Sensorik'), " +
                "(18, '18', '18. Saya lebih suka pemahaman secara', 'Pasti', 'Teori', 'Sensorik'), " +
                "(19, '19', '19. Saya dapat mengingat dengan baik', 'Hal-hal yang saya lihat', 'Hal-hal yang saya dengar', 'Sensorik'), " +
                "(20, '20', '20. Bagi saya hal penting yang harus dilakukan seorang dosen adalah', 'Menyampaikan materi dengan menggunakan langkah-langkah yang berurutan secara jelas', 'Memberikan gambaran keseluruhan, kemudian menghubungkan materi satu dengan yang lain', 'Sensorik'), " +
                "(21, '21', '21. Saya lebih suka untuk belajar', 'Dalam kelompok', 'Sendiri', 'Sensorik'), " +
                "(22, '22', '22. Dalam bekerja, saya cenderung', 'Berhati-hati terhadap detail dari pekerjaan saya', 'Kreatif dalam mengerjakan pekerjaan saya', 'Sensorik'), " +
                "(23, '23', '23. Untuk memahami arah suatu tempat, saya lebih suka menggunakan', 'Peta', 'Petunjuk tertulis', 'Visual'), " +
                "(24, '24', '24. Saya belajar secara', 'Teratur. Jika saya tekun, maka saya akan mendapatkan yang saya inginkan', 'Tidak teratur. Pertama-tama saya tidak paham, namun kemudian tiba-tiba semua terasa paham', 'Visual'), " +
                "(25, '25', '25. Ketika mengerjakan suatu tugas, terlebih dahulu saya akan', 'Mencoba langsung mengerjakan tugas tersebut', 'Memikirkan terlebih dahulu bagaimana saya akan mengerjakan tugas tersebut', 'Visual'), " +
                "(26, '26', '26. Saya menikmati bacaan yang ditulis oleh penulis yang', 'Secara jelas dan langsung mengungkapkan apa yang dimaksud', 'Mengungkapkan hal-hal yang mereka sampaikan secara kreatif dan menarik', 'Visual'), " +
                "(27, '27', '27. Ketika melihat diagram atau sketsa di kelas, saya paling mudah untuk mengingat', 'Gambarnya', 'Apa yang dikatakan oleh dosen mengenai hal itu', 'Visual'), " +
                "(28, '28', '28. Ketika mempertimbangkan isi suatu informasi, saya cenderung untuk', 'Berfokus pada detail dan melewatkan gambaran keseluruhannya', 'Memperhatikan gambaran keseluruhan sebelum masuk ke detail', 'Visual'), " +
                "(29, '29', '29. Saya lebih mudah mengingat', 'Sesuatu yang telah saya lakukan', 'Sesuatu yang telah banyak saya pikirkan', 'Visual'), " +
                "(30, '30', '30. Ketika Saya mengerjakan tugas, saya lebih memilih untuk', 'Menguasai salah satu cara untuk megerjakannya', 'Mencoba cara-cara baru untuk mengerjakan tugas tersebut', 'Visual'), " +
                "(31, '31', '31. Ketika seseorang menunjukkan kepada saya suatu informasi, saya lebih suka', 'Diagram atau grafik', 'Tulisan yang meringkas hasil tersebut', 'Visual'), " +
                "(32, '32', '32. Ketika menulis sebuah karangan, saya lebih cenderung untuk', 'Mengerjakan karangan tersebut secara berurutan dari awal sampai akhir', 'Mengerjakan karangan tersebut secara acak baru kemudian mengurutkannya', 'Visual'), " +
                "(33, '33', '33. Ketika mengerjakan tugas kelompok, hal pertama yang ingin saya lakukan adalah', 'Mendengarkan gagasan setiap orang dalam kelompok', 'Mencari gagasan secara individual, kemudian membandingkan dalam kelompok', 'Visual'), " +
                "(34, '34', '34. Saya menganggapnya sebagai pujian yang tinggi ketika memanggil seseorang secara', 'Masuk akal', 'Imajinatif', 'Sekuensial'), " +
                "(35, '35', '35. Ketika bertemu orang-orang di sebuah pesta, saya lebih cenderung', 'Penampilan mereka', 'Apa yang mereka katakan tentang dirinya', 'Sekuensial'), " +
                "(36, '36', '36. Ketika saya belajar materi baru, saya lebih suka', 'Fokus pada materi tersebut', 'Mengaitkan materi tersebut dengan materi lain yang sesuai', 'Sekuensial'), " +
                "(37, '37', '37. Saya lebih cenderung dianggap sebagai orang yang', 'Mudah begaul', 'Pendiam, tertutup', 'Sekuensial'), " +
                "(38, '38', '38. Saya lebih suka mata kuliah yang menekankan pada', 'Materi nyata (fakta dan data)', 'Materi abstrak (konsep dan teori)', 'Sekuensial'), " +
                "(39, '39', '39. Untuk hiburan, saya lebih menyukai', 'Menonton televisi', 'Membaca buku', 'Sekuensial'), " +
                "(40, '40', '40. Beberapa dosen memulai mata kuliah dengan garis besar materi yang akan dicakup. Garis besar materi tersebut', 'Sedikit membantu bagi saya', 'Sangat membantu bagi saya', 'Sekuensial'), " +
                "(41, '41', '41. Ide melakukan tugas secara berkelompok, yang melibatkan seluruh anggota kelas dalam kelompok', 'Menarik bagi saya', 'Tidak menarik bagi saya', 'Sekuensial'), " +
                "(42, '42', '42. Ketika saya mengerjakan soal matematika yang panjang', 'Saya cenderung untuk mengulang semua Langkah, kemudian memeriksa pekerjaan saya dengan hati-hati', 'Saya merasa lelah memeriksa pekerjaan saya, sehingga saya memaksakan diri untuk melakukannya', 'Sekuensial'), " +
                "(43, '43', '43. Saya cenderung untuk menggambarkan tempat yang pernah saya kunjungi', 'Dengan mudah dan cukup akurat', 'Dengan susah payah dan tanpa banyak detail', 'Sekuensial'), " +
                "(44, '44', '44. Ketika memecahkan masalah dalam kelompok, saya cenderung', 'Memikirkan langkah-langkah untuk mencapai solusi', 'Memikirkan kemungkinan konsekuensi dari pelaksanaan solusi tersebut', 'Sekuensial')" +
                "";
        db.execSQL(sql);
        sql2 = "INSERT INTO hasil (no, hasil_aktif, hasil_sensorik, hasil_visual, hasil_sekuensial, nama) VALUES (1, '25%', '25%', '25%', '25%', 'user'), " +
                "(2, '25%', '25%', '25%', '25%', 'user');";
        db.execSQL(sql2);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}