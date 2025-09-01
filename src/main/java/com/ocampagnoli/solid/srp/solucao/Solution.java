package com.ocampagnoli.solid.srp.solucao;

public class Solution {
    public class Video {
        private String title;
        private String description;
        private String type;
        private String url;

        Video() {

        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        // getters and setters...
    }

    public class ConnectionFactory {
        public ConnectionFactory() {
            // create connection
        }
    }

    public class VideoRepository {

        VideoRepository(ConnectionFactory connectionFactory) {
            // use connection
        }

        public void createVideo(Video video) {
            // create video
        }

        public void updateVideo(Video video) {
            // update video
        }

        public void deleteVideo(Video video) {
            // delete video
        }
    }
}
