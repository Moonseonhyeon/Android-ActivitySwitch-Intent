package org.linda.activityex01;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private  int id;
    private  String username;
    private  String password;
}
