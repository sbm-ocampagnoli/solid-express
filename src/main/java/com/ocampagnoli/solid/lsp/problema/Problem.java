package com.ocampagnoli.solid.lsp.problema;

public class Problem {
    abstract class Movie {
        abstract void play();

        abstract void increaseVolume();
    }

    class LionKing extends Movie {

        @Override
        void play() {
            // play movie
        }

        @Override
        void increaseVolume() {
            // increase volume
        }
    }

    // Meu filho não está atendendo ao LSP ou seja, ele não é um substituto ao pai
    class OldMovie extends Movie {

        @Override
        void play() {
            // play movie
        }

        @Override
        void increaseVolume() {
            throw new UnsupportedOperationException("Old movies do not support volume control");
        }
    }
}