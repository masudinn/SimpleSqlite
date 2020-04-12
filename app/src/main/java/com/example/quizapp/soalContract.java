package com.example.quizapp;

import android.provider.BaseColumns;

public final class soalContract {
    private soalContract(){

    }

    public static class tabelSoal implements BaseColumns {
        public static final String Table_name = "soal_quiz";
        public static final String Colum_soal = "soal";
        public static final String Colum_opsi1 = "opsi1";
        public static final String Colum_opsi2 = "opsi2";
        public static final String Colum_opsi3 = "opsi3";
        public static final String Colum_jawaban = "jawaban";
    }
}
