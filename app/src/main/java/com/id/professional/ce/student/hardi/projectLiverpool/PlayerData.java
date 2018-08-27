package com.id.professional.ce.student.hardi.projectLiverpool;

import java.util.ArrayList;

public class PlayerData {

            public static String[][] data = new String[][]{

                    {"Allison Becker",
                            "Liverpool Player",
                            "https://upload.wikimedia.org/wikipedia/commons/1/12/Russia-Brazil_23_March_2018_%28cropped%29.jpg",
                            "Alisson Becker lahir di Novo Hamburgo, 2 Oktober 1992; umur 25 tahun adalah seorang pemain sepak bola berkewarganegaraan Brasil yang bermain untuk klub Liverpool",
                            "2 Oktober 1992,Novo Hamburgo,Brasil",
                            "Goalkeeper"},

                    {"Virgil Van Dijk",
                            "Liverpool Player",
                            "https://upload.wikimedia.org/wikipedia/commons/3/3d/20160604_AUT_NED_8876.jpg",
                            "Virgil van Dijk (lahir di Breda, 8 Juli 1991; umur 27 tahun) adalah seorang pemain sepak bola berkewarganegaraan Belanda yang bermain untuk klub Liverpool",
                            "8 Juli 1991, Breda, Belanda",
                            "Centre Back"},
                    {"Jordan Henderson",
                            "Liverpool Player",
                            "https://upload.wikimedia.org/wikipedia/commons/a/ae/Jordan_Henderson_-_2.jpg",
                            "Jordan Brian Henderson (lahir di Sunderland, Tyne and Wear, Inggris, 17 Juni 1990; umur 28 tahun) merupakan seorang pemain sepak bola Inggris. Ia berposisi sebagai gelandang. Saat ini ia bermain untuk Liverpool dan untuk tim nasional Inggris.",
                            "17 Juni 1990, Sunderland, Tyne and Wear, Inggris",
                            "Midfielder"},
                    {"Mohamed Salah",
                            "Liverpool Player",
                            "https://upload.wikimedia.org/wikipedia/commons/4/4a/Mohamed_Salah_2018.jpg",
                            "Mohamed Salah Ghaly (lahir 15 Juni 1992; umur 26 tahun) adalah seorang pemain sepak bola Mesir yang bermain sebagai penyerang sayap untuk klub Inggris, Liverpool F.C. dengan nilai transfer £39 juta dari A.S. Roma, dan Tim nasional Mesir. Ia juga pernah tampil mewakili Mesir pada Piala Dunia FIFA U-20 2011 dan Olimpiade 2012. Ia memenangkan Liga Super Swiss di musim pertamanya dengan Basel, + dan dianugerahi Pemain Muda Afrika Terbaik tahun 2012 dan Pemain Terbaik Afrika tahun 2017.",
                            "15 Juni 1992, El Gharbia, Mesir",
                            "Wing Midfielder"},
                    {"Sadio Mane",
                            "Liverpool Player",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Sadio_Man%C3%A913.JPG/274px-Sadio_Man%C3%A913.JPG",
                            "Sadio Mané (lahir di Sédhiou, 10 April 1992; umur 26 tahun) adalah seorang pemain sepak bola berkewarganegaraan Senegal yang bermain untuk klub Liverpool biasa bermain pada posisi gelandang.",
                            "10 April 1992, Sedhiou, Senegal",
                            "Wing Midfielder"},
                    {"Roberto Firmino",
                            "Liverpool Player",
                            "https://upload.wikimedia.org/wikipedia/commons/9/91/20141118_1838_AUTBRA_4936.jpg",
                            "Roberto Firmino Barbosa de Oliveira (lahir di Maceió, 2 Oktober 1991; umur 26 tahun) adalah pemain profesional Brasil yang bermain untuk klub Inggris Liverpool dan tim nasional Brasil biasa bermain pada posisi Gelandang serang.",
                            "2 Oktober 1991, Maceio, Brasil",
                            "Attacking Midfileder or Striker"  }
            };



    public static ArrayList<Player> getListData() {
        Player player = null;
        ArrayList<Player> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            player = new Player();
            player.setName(data[i][0]);
            player.setClub(data[i][1]);
            player.setPhoto(data[i][2]);
            player.setDeskripsi(data[i][3]);
            player.setLahir(data[i][4]);
            player.setPosisi(data[i][5]);

            list.add(player);
        }

        return list;
    }

}
