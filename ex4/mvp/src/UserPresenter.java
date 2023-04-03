public class UserPresenter {
    private User user;
    private UserView userView;

    public UserPresenter(User user, UserView userView) {
        this.user = user;
        this.userView = userView;

        // Подписываемся на изменения в представлении
        userView.setPresenter(this);
        userView.setFirstName(user.getFirstName());
        userView.setLastName(user.getLastName());
    }

    public void updateModel() {
        user.setFirstName(userView.getFirstName());
        user.setLastName(userView.getLastName());
    }

    public void updateView() {
        userView.setFirstName(user.getFirstName());
        userView.setLastName(user.getLastName());
    }
}
