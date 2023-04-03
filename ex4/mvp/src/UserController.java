public class UserController {
    public static void main(String[] args) {
        // Создаем модель и представление
        User user = new User("Иван", "Иванов");
        UserView userView = new UserView();

        // Создаем Presenter и связываем его с моделью и представлением
        UserPresenter userPresenter = new UserPresenter(user, userView);

        // Обновляем модель через Presenter
        userPresenter.updateModel();

        // Обновляем представление через Presenter
        userPresenter.updateView();
    }
}
