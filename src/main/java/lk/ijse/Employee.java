package lk.ijse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee  implements Serializable {
    private String id;
    private String name;
    private int age;
}
