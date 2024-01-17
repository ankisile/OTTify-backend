package tavebalak.OTTify.user.dto.Request;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@NoArgsConstructor
public class UserOttUpdateDTO {

    @NotNull
    private List<Long> ottList;
}
