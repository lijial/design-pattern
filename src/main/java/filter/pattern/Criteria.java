package filter.pattern;

/**
 * Created by lijialiang on 2017/8/11.
 */
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
