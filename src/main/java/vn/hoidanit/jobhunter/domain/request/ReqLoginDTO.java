package vn.hoidanit.jobhunter.domain.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReqLoginDTO {
    @NotBlank(message = "username khong duoc der trong")
    private String username;
    @NotBlank(message = "password khong duoc der trong")
    private String password;

}
