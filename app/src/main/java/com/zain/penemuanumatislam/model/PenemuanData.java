package com.zain.penemuanumatislam.model;

import com.zain.penemuanumatislam.R;

import java.util.ArrayList;

public class PenemuanData {
    private static String[] penemuanNama = {
            "Kamera",
            "Kopi",
            "Gitar",
            "Peta Dunia",
            "Peralatan Bedah Medis",
            "Angka Nol",
            "Pesawat Terbang",
            "Sabun dan Shampoo",
            "Cek Bank",
            "Vaksinasi"
    };

    private static String[] penemuanDetails={
            "Ilmuwan terbesar dunia di abad pertengahan adalah seorang muslim bernama Ibnu Al-Haytam. Beliau menggunakan dasar optik yang ditemukan di China untuk menjelaskan secara detail dan benar tentang bagaimana penglihatan bekerja. Ia juga menciptakan Camera Obsecura (Pinhole Camera). Dari dasar pemikiran inilah, manusia kemudian menciptakan teropong dan kamera modern. Bahkan kata Camera sendiri berasal dari bahasa arab ‘Qamara’ yang berarti ‘kamar gelap’. Buat yang suka Selfie rasanya harus berterima kasih kepada beliau.  ",
            "Siapa yang tidak kenal kopi? Hampir seluruh orang di dunia mengenal kopi, dan pernah meminumnya. Ternyata kopi pertama kali digunakan di Yaman pada abad 15 oleh para rahib sufi untuk membantu mereka agar tetap terjaga saat beribadah di malam hari. Dari Yaman, penyebaran kopi ini kemudian menyebar ke Mesir, Afrika, lalu ke Turki. Kemudian penyebarannya mencapai Eropa lalu ke Asia dan Amerika.",
            "Gitar menjadi slaah satu instrumen yang banyak dipilih manusia. Kaum tua, muda, pria dan wanita bisa memainkannya. Alat musik yang terkenal ini awalnya terinspirasi dari alat musik arab bernama ‘Oud’. Kaum Moor membawa instrumen ini ke Andalusia-Spanyol. Setelah dikembangkan, instrumen ini kemudian diberi nama ‘guitarra moresca’. So, para rockstar sebenarnya terlahir dari sini?",
            "Kalau tidak ada peta, entah bagaiman akita melihat dunia. Namun bisa bayangkan tidak bagaimana orang dulu membuat peta pertama kalinya? Sebuah peta dunia yang dianggap sangat detail dan lengkap, dibuat di abad 12 oleh seorang cartographer muslim bernama Al-Idrisi. Peta itu kemudian menjadi patokan banyak penjelajah dunia selama beberapa abad. Tanpa peta ini perkembangan dunia mungkin tidak akan seperti sekarang ini.",
            "Kaum muslim dulu dikenal sebagai kaum yang sangat memperhatikan kebersihan dan kesehatan, sehingga banyak sekali penemuan medis yang dilakukan oleh umat Islam. Salah satunya adalah peralatan bedah medis yang diciptakan oleh Al-Zahrawi pada abad ke 10 di Cordoba. Peralatan ini bahkan sampai sekarang masih digunakan oleh kedokteran modern, seperti: jarum suntik, pemotong tulang, dan pisau scalpel.",
            "Kontribusi umat Islam dalam hal matematika sungguh tak dapat dipungkiri. Dengan adanya angka ‘0’ yang ditemukan ini, maka segala rumus matematika mulai dapat dikembangkan. Bahkan penggunaan angka 0 sampai 9 ini pun adalah ciptaan umat Islam. Tidak bisa kita bayangkan dunia tanpa pengembangan matematika ini. Aljabar dan Algoritma adalah salah satu kontribusi umat Islam yang paling penting. Tanpa hal ini, kita tidak akan menikmati komputer atau smartphone seperti sekarang ini.",
            "Seribu tahun sebelum Wright Bersaudara menciptakan pesawat terbang, seorang penyair Islam bernama Abbas Ibn-Firnas telah beberapa kali berusaha menciptakannya. Pada usia 65 tahun, ia melompat dari menara mesjid agung di Cordoba dengan menggunakan mantel kain yang diikatkan pada beberapa rangka kayu. Walaupun tidak berhasil terbang, alat sederhananya ini membuat laju jatuhnya melambat sehingga ia mendarat dengan selamat. Hal ini membuktikan bahwa ia bisa dianggap sebagai pencipta parasut pertama kali. Pada percobaan berikutnya di usia 70 tahun, ia mengembangkan alat buatannya itu dan melompat dari sebuah gunung. Usahanya ini berhasil membuatnya bertahan selama 10 menit di angkasa dengan ketinggian yang cukup signifikan. Upaya penderatannya berlangsung kurang mulus sehingga membuat beliau cidera. Berdasarkan pendaratan yang gagal ini, beliau menyimpulkan bahwa peralatannya ini membutuhkan ekor agar mempermudah pengendalian. Kesimpulan ini benar, dan dipakai di dunia penerbangan modern sampai sekarang. Saking berpengaruhnya, nama beliau digunakan sebagai nama bandara di Baghdad, dan bahkan juga untuk sebuah kawah di bulan.",
            "Mandi dan membersihkan diri adalah sebuah kewajiban muslim yang menjadi bagian dari ibadahnya. Satu hal yang sangat mengganggu orang Arab ketika para tentara salib menyerang mereka adalah bau tubuh tentara-tentara itu yang tidak pernah mandi. Memang sebelumnya sabun dan cairan untuk berendam sudah ditemukan di Mesir dan Romawi. Tetapi kaum muslim lah yang mengembangkan sabun menjadi serupa dengan yang kita pakai sekarang. Mereka mencampurkan minyak rempah dengan sodium hydroxyde serta aroma wewangian. Shampoo kemudian menjadi terkenal di Inggris di tahun 1975, setelah seorang muslim membuka pemandian khusus di sana. Ia bahkan ditunjuk sebagai ahli keramas Raja George IV dan William IV.",
            "Kata Cek, dalam bahasa inggris ‘Cheque’ sendiri berasal dari bahasa arab ‘Saqq’. Di dunia Islam jaman dulu sebuah kertas yang bertuliskan janji pembayaran digunakan oleh para saudagar agar mereka tidak perlu membawa uang dalam jumlah banyak. Pada abad ke 9, seorang saudagar muslim asal Baghdad bahkan dapat menguangkan ceknya di China!",
            "Anak-anak di Turki sudah divaksinasi kekebalan cacar air, 50 tahun sebelum kedokteran barat  menemukan hal ini. Kedokteran Islam memang sudah sangat maju saat itu sehingga membuat tingkat kehidupan umat Islam saat ini sampai ke taraf yang cukup mengagumkan. Demikianlah daftar beberapa penemuan ‘sederhana’ umat Islam di masa lampau. Sebenarnya ada ribuan penemuan lain yang sangat bermanfaat, hanya saja kami memilihkan penemuan-penemuan yang dipakai secara langsung di dalam kehidupan sehari-hari. "

    };

    private static int[] penemuanImages = {
            R.drawable.kamera,
            R.drawable.kopi,
            R.drawable.gitar,
            R.drawable.petadunia,
            R.drawable.alatbedah,
            R.drawable.angkanol,
            R.drawable.pesawatterbang,
            R.drawable.sabun,
            R.drawable.cekbank,
            R.drawable.vaksinasi
    };


    public static ArrayList<Penemuan> getListData(){
        ArrayList<Penemuan> list = new ArrayList<>();
        for (int position = 0; position < penemuanNama.length; position++){
            Penemuan penemuan = new Penemuan();
            penemuan.setNamapenemuan(penemuanNama[position]);
            penemuan.setDetailpenemuan(penemuanDetails[position]);
            penemuan.setPhotopenemuan(penemuanImages[position]);
            list.add(penemuan);
        }
        return list;
    }
}
