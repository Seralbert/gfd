package ys.project.r;

import org.springframework.data.repository.CrudRepository;
import ys.project.m.User;

/**
 * Created by User on 21.10.2019.
 */
public interface BaseRepo extends CrudRepository<User, Integer> {
}
