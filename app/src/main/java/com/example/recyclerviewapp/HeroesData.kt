package com.example.recyclerviewapp

class HeroesData {
    public val data = arrayOf(
        arrayOf(
            "Ahmad Dahlan",
            "Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. KH. Ahmad Dahlan telah mempelopori kebangkitan ummat Islam untuk menyadari nasibnya sebagai bangsa terjajah yang masih harus belajar dan berbuat.",
            "https://upload.wikimedia.org/wikipedia/commons/8/87/Ahmad_Dahlan.jpg"
        ),
        arrayOf(
            "Ahmad Yani",
            "Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922 – meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43 tahun) adalah komandan Tentara Nasional Indonesia Angkatan Darat, dan dibunuh oleh anggota Gerakan 30 September saat mencoba untuk menculik dia dari rumahnya.",
            "https://upload.wikimedia.org/wikipedia/commons/3/3f/Ahmad_Yani.jpg"
        ),
        arrayOf(
            "Sutomo",
            "Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Padang Arafah, Arab Saudi, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda melalui tentara NICA, yang berakhir dengan pertempuran 10 November 1945 yang hingga kini diperingati sebagai Hari Pahlawan.",
            "https://upload.wikimedia.org/wikipedia/commons/e/ed/Bung_Tomo.jpg"
        ),
        arrayOf(
            "Gatot Soebroto",
            "Jenderal TNI (Purn.) Gatot Soebroto (lahir di Sumpiuh, Banyumas, Jawa Tengah, 10 Oktober 1907 – meninggal di Jakarta, 11 Juni 1962 pada umur 54 tahun) adalah tokoh perjuangan militer Indonesia dalam merebut kemerdekaan dan juga pahlawan nasional Indonesia. Ia dimakamkan  di Ungaran, kabupaten Semarang.",
            "https://upload.wikimedia.org/wikipedia/commons/b/be/Col_Gatot_Subroto%2C_Kenang-Kenangan_Pada_Panglima_Besar_Letnan_Djenderal_Soedirman%2C_p27.jpg"
        ),
        arrayOf(
            "Ki Hadjar Dewantara",
            "Raden Mas Soewardi Soerjaningrat (EBI: Suwardi Suryaningrat, sejak 1922 menjadi Ki Hadjar Dewantara, EBI: Ki Hajar Dewantara, beberapa menuliskan bunyi bahasa Jawanya dengan Ki Hajar Dewantoro; lahir di Pakualaman, 2 Mei 1889 – meninggal di Yogyakarta, 26 April 1959 pada umur 69 tahun; selanjutnya disingkat sebagai Soewardi atau KHD adalah aktivis pergerakan kemerdekaan Indonesia, ",
            "https://upload.wikimedia.org/wikipedia/commons/3/3a/Ki_Hadjar_Dewantara_Mimbar_Umum_18_October_1949_p2.jpg"
        )
    )

    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (aData in data){
                val hero = Hero()
                hero.name = aData[0] as String
                hero.from = aData[1] as String
                hero.photo = aData[2] as String

                list.add(hero)
            }
            return list
        }
}