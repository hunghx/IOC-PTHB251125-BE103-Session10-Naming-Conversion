package re.edu.dto.response;

import java.util.List;

public class PageResponse <T>{
    private List<T> items;
    private int size;
    private int pageNumber;
    private int totalPages;
    private int totalElements;
}
