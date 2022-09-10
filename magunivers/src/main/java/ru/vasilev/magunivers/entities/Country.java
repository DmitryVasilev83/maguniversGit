package ru.vasilev.magunivers.entities;


import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;


@Entity
@Table(name = "countries")
@Data
public class Country implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name_rus")
    @Size(min = 1, max = 50, message = "требуется от 1 до 50 символов")
    @NotNull(message = "название не выбрано")
    private String nameRus;

    @Column(name = "name_eng")
    @Size(min = 1, max = 50, message = "требуется от 1 до 50 символов")
    @NotNull(message = "название не выбрано")
    private String nameEng;

    @Column(name = "description")
    private String description;

    @Column(name = "money")
    @NotNull(message = "должно быть больше 0")
    @DecimalMin(value = "0", message = "минимальное значение 0")
    private String money;

    @Override
    public String toString() {
        return "Название = '" + nameRus + "'";
    }
}
