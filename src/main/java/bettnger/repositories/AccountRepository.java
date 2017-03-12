package bettnger.repositories;

import bettnger.models.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kapila on 2/26/2017.
 */
public interface AccountRepository extends CrudRepository<Account, String> {
    Account findByUsername(String username);
}
