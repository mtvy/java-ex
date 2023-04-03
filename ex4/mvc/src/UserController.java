public class UserController {
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;

        // Подписываемся на изменения в представлении
        view.setController(this);
        updateView();
    }

    public void updateModel() {
        model.setFirstName(view.getFirstName());
        model.setLastName(view.getLastName());
    }

    public void updateView() {
        view.setFirstName(model.getFirstName());
        view.setLastName(model.getLastName());
    }

    public static void main(String[] args) {
        // Создаем модель и представление
        UserModel model = new UserModel("Григорий", "Антонов");
        UserView view = new UserView();

        // Создаем контроллер и связываем его с моделью и представлением
        UserController controller = new UserController(model, view);

        // Обновляем модель через контроллер
        controller.updateModel();

        // Обновляем представление через контроллер
        controller.updateView();
    }
}
