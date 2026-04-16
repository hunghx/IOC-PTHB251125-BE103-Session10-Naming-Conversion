package re.edu.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import re.edu.repository.IRoleRepository;
import re.edu.repository.IUserRepository;
import re.edu.service.IUserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
    private final IRoleRepository iRoleRepository;
    private final IUserRepository iUserRepository;


}
