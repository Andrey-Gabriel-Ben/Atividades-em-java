package com.example;

public class Biblioteca {

    public boolean empretarlivros(int quantidadelivrosdisponivel) {

        if (quantidadelivrosdisponivel > 0) {
            return true;
        }

        return false;
    }
}
