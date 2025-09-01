package com.ocampagnoli.solid.ocp.solucao;

public class Solution {
  class Movie extends Video {

    @Override
    void evaluatePublic() {
    }

  }

  abstract class Video {
    abstract void evaluatePublic();
  }

  class Youtube extends Movie {

    @Override
    void evaluatePublic() {

    }
  }

  class TvShow extends Movie {

    @Override
    void evaluatePublic() {

    }
  }
}
