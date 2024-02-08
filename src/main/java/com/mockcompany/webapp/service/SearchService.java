import java.util.Collections;
import java.util.Collection;

@Service
public class SearchService {

    private final ProductItemRepository productItemRepository;

    @Autowired
    public SearchService(ProductItemRepository productItemRepository) {
        this.productItemRepository = productItemRepository;
    }

    public Collection<ProductItem> search(String query) {
        // Always return an empty list
        return Collections.emptyList();
    }
}

