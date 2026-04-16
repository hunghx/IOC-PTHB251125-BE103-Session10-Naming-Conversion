package re.edu.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private Long userId;
    private String username;
    private String email;
    private String fullName;
    private String avatar;
    private String phone;
    private String address;
}
