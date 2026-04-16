package re.edu.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PageResponse <T>{
    private List<T> items;
    private int size;
    private int pageNumber;
    private int totalPages;
    private int totalElements;
}
