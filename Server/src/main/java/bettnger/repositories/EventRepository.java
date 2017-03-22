package bettnger.repositories;

import bettnger.models.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kapila on 3/11/2017.
 */
public interface EventRepository extends CrudRepository<Event, String> {
//    List<Event> findAllEvents();
}
