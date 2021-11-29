package Homework.education;

import java.util.Objects;

public class Lesson {
    private String name;
    private int duration;
    private String lecturerName;
    private int price;

    public Lesson(String name, int duration, String lecturerName, int price) {
        this.name = name;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.price = price;
    }

    public Lesson() {
    }

    public String getNameame() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName() {
        this.lecturerName = lecturerName;
    }

    public int getPrice() {
        return getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return duration == lesson.duration && price == lesson.price && Objects.equals(name, lesson.name) && Objects.equals(lecturerName, lesson.lecturerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, lecturerName, price);
    }

    public void setPrice() {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", lecturerName='" + lecturerName + '\'' +
                ", price=" + price +
                '}';
    }
}
