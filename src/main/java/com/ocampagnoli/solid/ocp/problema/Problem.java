package com.ocampagnoli.solid.ocp.problema;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Problem {
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
class Video {
    private String title;
    private String description;
    private String type;
    private String url;

    void evaluatePublic() {
        if (Objects.nonNull(type) && !type.isEmpty()) {
            if (type.equalsIgnoreCase("youtube")) {
                // do something....
            } else if (type.equalsIgnoreCase("tvshow")) {
                // do something....
            }
        }
    }
}
