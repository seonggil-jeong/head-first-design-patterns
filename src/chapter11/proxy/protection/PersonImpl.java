package chapter11.proxy.protection;

public class PersonImpl implements Person {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    public PersonImpl(String name, String gender, String interests, int rating) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.rating = rating;

    }

    @Override
    public int getGeekRating() {
        if (ratingCount == 0) return 0;

        return (rating / ratingCount);
    }

    @Override
    public void setGeekRating(int rating) {
        this.rating += rating;
        this.ratingCount++;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    public int getRating() {
        return rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }
}
