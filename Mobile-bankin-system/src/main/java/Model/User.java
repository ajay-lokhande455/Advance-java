package Model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder

public class User {
    private String Username;
    private String Password;
    private String fullName;
    private String Email;
}
