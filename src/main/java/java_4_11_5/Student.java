package java_4_11_5;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Student {

    @NotBlank
    private String name;
    @NotEmpty
    private String surname;
    @NotNull
    private String clas;

}
