package com.juaracoding.Drivers.Strategies;

//Jika kita mengumpulkan bilangan asli dibawah 15 yang merupakan kelipatan 3 atau 7 kita
// mendapatkan angka 3,6,7,9,12,14 yang ketika dijumlahkan menjadi 3+6+7+9+12+14 = 51.
// Dengan cara yang sama, berapakah nilai dari penjumlahan tersebut jika bilangan aslinya dibawah 2021?
//
//Buat jawaban dalam bentuk kode dengan bahasa pemrograman apapun


import java.util.ArrayList;

public class test {

    public static void main(String[] args) {

        int n = 15;

        ArrayList<Integer> hasil = new ArrayList<>();

        for (int i = 1; i < n; i++){
        if(i % 3 == 0){
            hasil.add(i);
        }
        if(i % 7 == 0){
            hasil.add(i);
        }
        }
        int total = 0;
        for (int angka : hasil){
            total += angka;
        }
        System.out.println(total);
    }



}