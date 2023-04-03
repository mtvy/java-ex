public class UserController {
    public static void main(String[] args) {
        // Создаем модель и представление
        User user = new User("Иван", "Иванов");
        UserView userView = new UserView();

        // Создаем ViewModel и связываем ее с моделью и представлением
        UserViewModel userViewModel = new UserViewModel(user, userView);

        // Обновляем модель через ViewModel
        userViewModel.setFirstName("Петр");
        userViewModel.setLastName("Петров");
    }
}
