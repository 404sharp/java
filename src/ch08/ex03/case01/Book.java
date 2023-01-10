package ch08.ex03.case01;

import java.time.LocalDate;
import java.util.Objects;

// domain과는 달리 record는 setter로 데이터를 바꿀 수 없다.
public record Book(String title, int price, LocalDate printedDate) {
	public Book {
		Objects.requireNonNull(title);
		Objects.requireNonNull(printedDate);
	}
}
