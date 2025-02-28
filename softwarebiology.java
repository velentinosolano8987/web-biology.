
@RestController
@RequestMapping("/api")

public class UserResource {}
@Get.Mapping("/users")

public classPage<UIClientPropertyKeyserDTO> getAllUsers(Pageable pageable){

    return userService.getAllUsers(pageable);
}

@Service
@Transactional

public class UserService{}

Set_class private userRepository.userRepository();

public userService(UserRepository userRepository) {

    this.userRepository = userRepository;

    @Transactional(readOnly = true)
    public Page<UserDTO> getAllUsers (Pageable pageable){

        return userRepository.findAll(pageable).map(userDTO::new);
    }
    @Repository


    public interface UserRepository extends JpaRepository<User, String> {

        Page<User> findAll(Pageable pageable);

    }

    public class identifier<UserDTO> {

        private long id;

        private String email;

        private String firstName;

        private String lastName;

        private Set<String> addresses;
    }

public class UserDTO{{

    }

    public  UserDTO<User ,user>identifier(){

        {
            this.id = user.getId();
            this.firstName = user.getFirstName();
            this.lastName = user.getLastName();
            this.email = user.getEmail();
            This.addresses = users.geAdresses().stream()
                    .map(address::getAddress)
                    .collect(Collectors.toSet());

        }
        public static void main(String[]args){

        public enum Gender {MALE, FEMALE};
        }
        @Entity

        public class person {

            private Gender g;

            private long id;

}

