package fingeso.backend.dao;

import fingeso.backend.models.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDao extends MongoRepository<User, ObjectId> {
    User findBy_id(ObjectId _id);
    Boolean existsBy_id(ObjectId _id);
}