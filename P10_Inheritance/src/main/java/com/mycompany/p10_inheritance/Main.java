/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p10_inheritance;

/**
 *
 * @author lenovo
 */

public class Main {
    public static void main(String[] args) {
        // Contoh Game Tebak Angka
        NumberGuessingGame numberGame = new NumberGuessingGame(7);
        numberGame.play();
        // Contoh Game Tebak Kata
        String[] words = {"apel", "pisang", "mangga"};
        wordGuessingGame wordGame = new wordGuessingGame(5, words);
        wordGame.play();
    }
    
}
