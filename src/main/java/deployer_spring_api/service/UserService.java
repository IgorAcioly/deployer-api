package deployer_spring_api.service;

import deployer_spring_api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
	
}
