package Spring.home5.Home5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**\
 * - ID (автоинкрементное)
 * - Описание (не может быть пустым)
 * - Статус (одно из значений: "не начата", "в процессе", "завершена")
 * - Дата создания (автоматически устанавливается при создании задачи)
 * Задача: Используя SPRING >
 * Реализовать:
 * Класс задач(TASK)
 * Добавление задач в БД
 * Методы просмотра задач:
 * 				1) простотр всех задач
 * 				2)Просмотр задач по статусу
 * Имененеие статуса задач.
 * Удалеие задач.
 *
 */
@SpringBootApplication
public class Home5Application {

	public static void main(String[] args) {
		SpringApplication.run(Home5Application.class, args);
	}

}
