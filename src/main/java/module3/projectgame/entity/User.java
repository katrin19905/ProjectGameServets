package module3.projectgame.entity;

import lombok.Builder;
import lombok.Data;

@Data

@Builder(builderMethodName = "with", buildMethodName = "get")
public class User {

    String name;
    Long id;


}