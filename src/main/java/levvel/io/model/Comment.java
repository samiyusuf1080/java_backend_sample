package levvel.io.model;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class Comment {

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    //Only need two other Parameters: Author and Text
    String author;
    String text;
}

