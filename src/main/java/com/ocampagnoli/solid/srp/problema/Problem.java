package com.ocampagnoli.solid.srp.problema;

import java.sql.Connection;

public class Problem {
    class Video {
        private String title;
        private String description;
        private String type;
        private String url;

        Video(Connection conn) {

        }

        void createVideo() {
            // create video
        }

        void updateVideo() {
            // update video
        }

        void deleteVideo() {
            // delete video
        }

        void evaluatePublic() {
            if (type != null && !type.isEmpty()) {
                if (type.equalsIgnoreCase("youtube")) {
                    // do something....
                } else if (type.equalsIgnoreCase("tvshow")) {
                    // do something....
                }
            }
        }
    }
}