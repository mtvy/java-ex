public class UserViewModel {
    private User user;
    private UserView userView;

    public UserViewModel(User user, UserView userView) {
        this.user = user;
        this.userView = userView;

        // Подписываемся на изменения модели
        userView.setFirstName(user.getFirstName());
        userView.setLastName(user.getLastName());
    }

    public void setFirstName(String firstName) {
        user.setFirstName(firstName);
        userView.setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        user.setLastName(lastName);
        userView.setLastName(lastName);
    }
}
