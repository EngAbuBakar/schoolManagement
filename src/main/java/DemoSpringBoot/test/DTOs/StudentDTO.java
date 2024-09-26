package DemoSpringBoot.test.DTOs;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import com.sun.jdi.PathSearchingVirtualMachine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {

    private Long id;
    private String name;

    public static void main(String[] args) {
        HashMap<String,String> names = new HashMap<>();

        names.put("India","Javelin");
        names.put("Pakistan","Jakarta");
        names.put("Sydney","Jacquard");
        names.put("Australia","Ghost");
        System.out.println(names);
    }
}


