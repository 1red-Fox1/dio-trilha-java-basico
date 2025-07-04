import br.com.dio.dao.UserDAO;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private final static UserDAO dao = new UserDAO();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Bem-Vindo ao cadastro de usuários! Selecione a operação desejada!");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Atualizar");
            System.out.println("[3] - Excluir");
            System.out.println("[4] - Buscar por id");
            System.out.println("[5] - Listar");
            System.out.println("[6] - Sair");

            var userInput = scanner.nextInt();

            var selectedOption = MenuOption.values()[userInput - 1];

            switch (selectedOption) {
                case SAVE -> {
                    var user = dao.save(requestToSave());
                    System.out.printf("Usuário cadastrado com sucesso %s", user);
                }
                case UPDATE -> {
                    var user = dao.update(requestToUpdate());
                    System.out.printf("Usuário atualizado com sucesso %s", user);
                }
                case DELETE -> {
                    dao.delete(requestId());
                    System.out.printf("Usuário excluido");
                }
                case FIND_BY_ID -> {
                    var id = requestId();
                    var user = dao.findById(id);
                    System.out.printf("Usuário com id %s: ", id);
                    System.out.println(user);
                }
                case FIND_ALL -> {
                    var users = dao.findAll();
                    System.out.println("Usuários cadastrados");
                    System.out.println("====================");
                    users.forEach(System.out::println);
                    System.out.println("========fim=========");
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    private static long requestId() {
        System.out.println("Informe o identificador do usuário: ");
        return scanner.nextLong();
    }

    private static UserModel requestToSave() {
        System.out.println("Informe o nome do usuário: ");
        var name = scanner.next();
        System.out.println("Informe o email do usuário: ");
        var email = scanner.next();
        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
        var birthDayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthDay = OffsetDateTime.parse(birthDayString, formatter);
        return new UserModel(0, name, email, birthDay);
    }

    private static UserModel requestToUpdate() {
        System.out.println("Informe o identificador do usuário: ");
        var id = scanner.nextLong();
        System.out.println("Informe o nome do usuário: ");
        var name = scanner.next();
        System.out.println("Informe o email do usuário: ");
        var email = scanner.next();
        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
        var birthDayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthDay = OffsetDateTime.parse(birthDayString, formatter);
        return new UserModel(id, name, email, birthDay);
    }


}
