public class AfishaManager {
    protected int afisha;
    private String[] films = new String[0];

    public AfishaManager(int limit) {

    }

    public AfishaManager() {
        this.afisha = 10;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultlength = Math.min(films.length, afisha);

        String[] tmp = new String[resultlength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
